package cleon.common.language.metamodel.spec.translation.javamodel;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Translation service backed by a self-owned Google Apps Script (V8 runtime)
 * wrapping LanguageApp.translate.
 *
 * The Apps Script endpoint always responds with HTTP 200, even on failure.
 * Errors are signalled by a response body starting with "ERROR:".
 *
 * Results are cached in-memory per (source, target, text) tuple.
 */
public final class TranslationService {

	public static final TranslationService INSTANCE = new TranslationService();

	private static final String ENDPOINT =
			"https://script.google.com/macros/s/AKfycbz6yhaVRoGzOa4WRyXQEtJSQp5qFsJUH1doVf-_Ig22HjblsPg4Fdlsp0dc9WWTYYhZQA/exec";

	private static final String ERROR_PREFIX = "ERROR:";

	private final HttpClient httpClient;
	private final ConcurrentMap<String, String> cache = new ConcurrentHashMap<>();

	private TranslationService() {
		this.httpClient = HttpClient.newBuilder()
				.followRedirects(HttpClient.Redirect.NORMAL) // Apps Script redirects to googleusercontent.com
				.connectTimeout(Duration.ofSeconds(10))
				.build();
	}

	/**
	 * Translates the given text.
	 *
	 * @param langFrom source language code (e.g. "de"), or empty for auto-detect
	 * @param langTo   target language code (e.g. "en")
	 * @param text     text to translate
	 */
	public String translate(String langFrom, String langTo, String text) throws IOException {
		final var source = langFrom == null ? "" : langFrom;
		final var cacheKey = source + "|" + langTo + "|" + text;

		final var cached = cache.get(cacheKey);
		if (cached != null) {
			return cached;
		}

		final var uri = URI.create(ENDPOINT
				+ "?q=" + encode(text)
				+ "&target=" + encode(langTo)
				+ "&source=" + encode(source));

		final var request = HttpRequest.newBuilder(uri)
				.timeout(Duration.ofSeconds(30))
				.GET()
				.build();

		final HttpResponse<String> response;
		try {
			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new IOException("Translation interrupted", e);
		}

		if (response.statusCode() != 200) {
			throw new IOException("Translation endpoint returned HTTP " + response.statusCode());
		}

		final var body = response.body().trim();
		if (body.startsWith(ERROR_PREFIX)) {
			throw new IOException("Translation failed: " + body);
		}
		// A login page or HTML error indicates a misconfigured deployment
		if (body.startsWith("<")) {
			throw new IOException("Translation endpoint returned HTML instead of text. "
					+ "Check the Apps Script deployment (access must be set to 'Anyone').");
		}

		cache.put(cacheKey, body);
		return body;
	}

	private static String encode(String value) {
		return URLEncoder.encode(value, StandardCharsets.UTF_8);
	}
}