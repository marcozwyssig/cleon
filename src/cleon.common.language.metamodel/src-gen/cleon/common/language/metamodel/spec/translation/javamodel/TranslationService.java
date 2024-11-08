package cleon.common.language.metamodel.spec.translation.javamodel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;

public class TranslationService {
	
	private static final String UTF_8 = "UTF-8";

	public static TranslationService INSTANCE = new TranslationService();
	
	private TranslationService() 
	{}
	
	public String translate(String langFrom, String langTo, String text) throws IOException {
		final var urlStr = "https://script.google.com/macros/s/AKfycby_k95UjogH_lhEjy6CGYUW6wZg2ELAKQIp3uB5Iw2PExxRx1RV/exec" + "?q=" + URLEncoder.encode(text, UTF_8) + "&target="
				+ langTo + "&source=" + langFrom;
		final var url =  URL.of(URI.create(urlStr), null);
		final var con = url.openConnection();
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		try (var in = new BufferedReader(new InputStreamReader(con.getInputStream(), UTF_8)))
		{
			final var response = new StringBuilder();
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			return response.toString();
		}
	}	
	
	

}
