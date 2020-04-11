package cleon.common.actifsource.metamodel.refactoring;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.util.log.Logger;

public class RefactorDisableRoot extends AbstractAllInstancesRefactorerAspect {

	public RefactorDisableRoot() {
		super("1.0", 2019, 11, 29, "Disable root resource", CorePackage.Class);
	}

	@Override
	protected void refactor(IModifiable executor, Package _package, INode clazz) {
		INode modifier = Select.objectForRelationOrNull(executor, CorePackage.Class_modifier, clazz);
		if (modifier != null) {
			Logger.instance().logInfo("modifier guid " + modifier.toString());
			if (CorePackage.InheritanceModifier_Abstract.equals(modifier)) {
				return;
			}
		}

		INode allowRoot = Select.objectForAttributeOrNull(executor, CorePackage.Class_allowRoot, clazz);
		if (allowRoot != null) {
			boolean boolValue = LiteralUtil.getBooleanValue(allowRoot);
			if (boolValue == false) {
				return;
			}
		}
		Update.createOrModifyStatement(executor, _package, clazz, CorePackage.Class_allowRoot,
				LiteralUtil.create(false));
	}
}
