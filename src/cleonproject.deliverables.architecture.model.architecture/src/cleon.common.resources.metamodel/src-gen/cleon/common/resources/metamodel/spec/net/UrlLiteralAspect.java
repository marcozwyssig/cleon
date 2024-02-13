package cleon.common.resources.metamodel.spec.net;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import ch.actifsource.core.INode;
import ch.actifsource.core.Literal;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.impl.AbstractStatelessAspectImpl;
import ch.actifsource.core.model.aspects.impl.IGenericLiteralAspect;
import ch.actifsource.core.scope.IResourceScope;
import ch.actifsource.util.character.StringUtil;

public class UrlLiteralAspect extends AbstractStatelessAspectImpl implements IGenericLiteralAspect<URL> {
	@Override
	public boolean allowMultiline() {
		return false;
	}

	@Override
	public String isValid(IReadJobExecutor readJobExecutor, IResourceScope paramIResourceScope, String value) {
		return doValidate(value);
	}

	@Override
	public Class<URL> getValueType() {
		return URL.class;
	}

	@Override
	public URL getValue(IReadJobExecutor paramIReadJobExecutor, IResourceScope paramIResourceScope, INode literal) {
		final var url = getValue(literal);
		try {
			return URL.of(URI.create(url), null);
		} catch (final MalformedURLException e) {
			return null;
		}
	}

	@Override
	public Literal create(URL value) {
		return new Literal(value.toString());
	}

	@Override
	public String getJavaConstructionExpression(IReadJobExecutor paramIReadJobExecutor,
			IResourceScope paramIResourceScope, INode literal) {
		final var url = getValue(literal);
		if (url == null) {
			return null;
		}
		return "\"" + StringUtil.encodeStringForJava(url) + "\"";
	}

	public static String getValue(INode literal) {
		if (!(literal instanceof Literal)) {
			return null;
		}
		return ((Literal) literal).getValue();
	}

	protected String doValidate(String value) {
		try {
			final var urlObj = URL.of(URI.create(value), null);
			return DoIsUrlValid(urlObj);
		} catch (final MalformedURLException e) {
			return "Uri is not well formatted";
		}
	}

	protected String DoIsUrlValid(URL urlObj) {
		return null;
	}
}