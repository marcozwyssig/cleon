package cleon.common.language.metamodel.spec.javamodel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.Package;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.model.aspects.AbstractInitializationAspect;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;

public abstract class AbstractMultiLanguageInitializationAspect extends AbstractInitializationAspect {
	private static final String UTF_8 = "UTF-8";

	private static String translate(String langFrom, String langTo, String text) throws IOException {
		final String urlStr = "https://script.google.com/macros/s/AKfycby_k95UjogH_lhEjy6CGYUW6wZg2ELAKQIp3uB5Iw2PExxRx1RV/exec" + "?q=" + URLEncoder.encode(text, UTF_8) + "&target="
				+ langTo + "&source=" + langFrom;
		final URL url = new URL(urlStr);
		final URLConnection con = url.openConnection();
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream(), UTF_8)))
		{
			final StringBuilder response = new StringBuilder();			
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			return response.toString();		
		}
	}

	protected abstract String getTargetLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance);
	protected abstract String getSourceLanguage(IDynamicResourceRepository dynamicResourceRepository, INode newInstance);
	protected abstract Iterable<String> getSourceText(IDynamicResourceRepository dynamicResourceRepository, INode newInstance);
	protected abstract void setTargetText(IModifiable modifiable, Package pkg, INode newInstance, Literal literal);

	@Override
	public void initialize(IModifiable modifiable, INode clazz, Package pkg, INode newInstance) {

		try {
			final ITypeSystem typeSystem = TypeSystem.create(modifiable); 
			final IDynamicResourceRepository resourceRepository = typeSystem.getResourceRepository();

			final String targetLanguage = getTargetLanguage(resourceRepository, newInstance);
			final String sourceLanguage = getSourceLanguage(resourceRepository, newInstance);

			getSourceText(resourceRepository, newInstance).forEach(sourceText -> {
				String targetText;
				try {
					targetText = translate(sourceLanguage, targetLanguage, sourceText);
					ch.actifsource.util.log.Logger.instance().logInfo(String.format("Source Language: %s; Target Language: %s; Source Text: %s; Target Text: %s;", sourceLanguage, targetLanguage, sourceText, targetText));
					setTargetText(modifiable, pkg, newInstance, LiteralUtil.create(targetText));				
				} catch (final IOException e) {
					throw new RuntimeException(e);
				}
			});
		} catch (final Exception e) {
			if( e != null)
			{
				final StringWriter sw = new StringWriter();
				final PrintWriter pw = new PrintWriter(sw);
				e.printStackTrace(pw);			
				ch.actifsource.util.log.Logger.instance().logError("Exception: " + e.getMessage() + " StackTrace: " + sw);				
			}

		}
	}
}