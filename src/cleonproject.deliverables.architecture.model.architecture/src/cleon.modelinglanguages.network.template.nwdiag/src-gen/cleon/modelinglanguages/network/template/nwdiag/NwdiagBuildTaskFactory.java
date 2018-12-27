package cleon.modelinglanguages.network.template.nwdiag;

import ch.actifsource.core.INode;
import ch.actifsource.generator.IBuildTask;
import ch.actifsource.generator.IBuildTaskFactory;
import ch.actifsource.util.ICancelStatus;

public class NwdiagBuildTaskFactory implements IBuildTaskFactory {

	public INode getAcceptedBuildTaskType() {
		return NwdiagPackage.NwdiagBuildTask;
	}

	public IBuildTask createTask(INode buildTask, ICancelStatus status) {
		return new NwdiagBuildTask(buildTask, status);
	}
}