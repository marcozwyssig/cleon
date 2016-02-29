package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import cleon.doc.spec.SpecPackage;
import cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage;
import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Statement;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.set.IStatementSet;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;

public class MoveToReqDescriptions extends AbstractAllInstancesRefactorerAspect {

	public MoveToReqDescriptions() {
		super("1.0", 2016, 2, 29, "Move Description to ReqDescription", RequirementPackage.Requirement);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void refactor(IModifiable executor, Package paramPackage, INode paramINode) {
		IStatementSet descriptions = Select.statementsForAttribute(executor, SpecPackage.SimpleDescription_descriptions, paramINode);
		if(descriptions == null)
			return;
		
		for(Statement statement : descriptions)
		{
			String value = LiteralUtil.getStringValue(statement.object());
			if( value != null)
			{
				Update.createStatement(executor, paramPackage, paramINode, RequirementPackage.Requirement_reqdescriptions, LiteralUtil.create(value));
			}
			Update.removeStatement(executor, statement);
			
		}
		
		// TODO Auto-generated method stub
		
	}

}
