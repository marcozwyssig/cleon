package cleon.common.language.metamodel.spec.languageClass.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.job.IReadJobExecutor;

public interface ITranslateSimpleNameAspect {

	String translateSimpleName(IReadJobExecutor executor, INode node);
}
