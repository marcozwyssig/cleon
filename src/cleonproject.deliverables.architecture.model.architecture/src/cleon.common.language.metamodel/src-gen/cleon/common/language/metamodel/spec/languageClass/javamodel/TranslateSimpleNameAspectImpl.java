package cleon.common.language.metamodel.spec.languageClass.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.ILinkSelectorRelationAspectFactory;
import ch.actifsource.core.model.aspects.impl.NameBySelectorAspectImpl;
import ch.actifsource.core.selector.element.ILinkSelector;

public class TranslateSimpleNameAspectImpl extends NameBySelectorAspectImpl implements ITranslateSimpleNameAspect {


	public final static ILinkSelectorRelationAspectFactory<TranslateSimpleNameAspectImpl> FACTORY;

	static {
		FACTORY = new ILinkSelectorRelationAspectFactory<>() {

			@Override
			public Class<TranslateSimpleNameAspectImpl> getAspectClass() {
				return TranslateSimpleNameAspectImpl.class;
			}

			@Override
			public TranslateSimpleNameAspectImpl create(final ILinkSelector selector) {
				return new TranslateSimpleNameAspectImpl(selector);
			}
		};
	}

	public TranslateSimpleNameAspectImpl(final ILinkSelector linkSelector) {
		super(linkSelector);
	}

	@Override
	public String translateSimpleName(final IReadJobExecutor executor, final INode node) {
		return super.getSimpleName(executor, node);
	}

}
