package cleon.common.actifsource.metamodel.refactoring;

import java.util.Date;

import ch.actifsource.core.CorePackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Relationship;
import ch.actifsource.core.Resource;
import ch.actifsource.core.javamodel.IStatement;
import ch.actifsource.core.javamodel.InheritanceModifier;
import ch.actifsource.core.javamodel.Statement;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.set.INodeList;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.IPackageSet;
import ch.actifsource.core.set.IStatementSet;
import ch.actifsource.core.update.FixOwnership;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.util.log.Logger;

public class RefactorDisableRoot extends AbstractAllInstancesRefactorerAspect {

	public RefactorDisableRoot() {
		super("1.0", 2019, 11, 28, "Disable root resource", CorePackage.Class);
	}

	@Override
	protected void refactor(IModifiable executor, Package _package, INode clazz) {
		INode modifier = Select.objectForRelationOrNull(executor, CorePackage.Class_modifier, clazz);
		if (modifier != null) {
			if (modifier == CorePackage.InheritanceModifier_Abstract) {
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
