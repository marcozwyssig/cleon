package cleon.modelinglanguages.uml.template.plantuml;

import ch.actifsource.core.INode;
import ch.actifsource.generator.IBuildTask;
import ch.actifsource.generator.IBuildTaskFactory;
import ch.actifsource.util.ICancelStatus;

public class PlantUmlBuildTaskFactory implements IBuildTaskFactory {

	public INode getAcceptedBuildTaskType() {
		return PlantumlPackage.PlantUmlBuildTask;
	}

	public IBuildTask createTask(INode buildTask, ICancelStatus status) {
		return new PlantUmlBuildTask(buildTask, status);
	}
}