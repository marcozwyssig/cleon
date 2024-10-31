package cleon.common.language.metamodel.spec.language.javamodel;

import java.util.Locale;

public class CurrentLanguage {
	// Private constructor so no other class can instantiate this class
	private CurrentLanguage() { }


	private static final CurrentLanguage INSTANCE = new CurrentLanguage();

	public static CurrentLanguage getInstance() {
		return INSTANCE;
	}

	public String LanguageCode() {
		// Try to get the language and country from an environment variable
		final var userLang = System.getenv("CLEON_USER_LANG");
		Locale locale;

		if (userLang != null && !userLang.isEmpty()) {
			// Expecting environment variable in the form of language_country (e.g., en_US)
			final var parts = userLang.split("_");
			final var language = parts[0];
			final var country = parts.length > 1 ? parts[1] : "";
			locale = Locale.of(language, country);
		} else {
			// Use the default locale if no environment variable is set
			locale = Locale.getDefault();
		}

		return locale.getLanguage();
	}

}
