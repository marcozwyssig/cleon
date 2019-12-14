package cleon.common.doc.doc.template.asciidoc;

import ch.actifsource.core.INode;
import ch.actifsource.generator.IBuildTask;
import ch.actifsource.generator.IBuildTaskFactory;
import ch.actifsource.util.ICancelStatus;

public class AsciidocBuildTaskFactory implements IBuildTaskFactory {

	public INode getAcceptedBuildTaskType() {
		return AsciidocPackage.AsciiDocBuildTask;
	}

	public IBuildTask createTask(INode buildTask, ICancelStatus status) {
		return new AsciidocBuildTask(buildTask, status);
	}
}