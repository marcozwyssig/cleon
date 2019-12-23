package cleon.common.modularity.spec.buildingblock;

import java.util.Date;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Relationship;
import ch.actifsource.core.Resource;
import ch.actifsource.core.javamodel.IStatement;
import ch.actifsource.core.javamodel.Statement;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.model.aspects.impl.AbstractAllInstancesRefactorerAspect;
import ch.actifsource.core.patch.IStatementPosition;
import ch.actifsource.core.set.INodeList;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.IStatementSet;
import ch.actifsource.core.update.IModifiable;

public class RefactorDecomposeBuildingBlock extends AbstractAllInstancesRefactorerAspect {
	
	public static final Resource AggregateDecomposite_intoBuildingBlock = new Resource("bad604bb-7a39-11e4-a6e2-23d949480f96");	

	public RefactorDecomposeBuildingBlock() {
		super("1.0", 2019, 11, 23, "Move decomposing objects", BuildingblockPackage.DecompositionBuildingBlock);
	}

	@Override
	protected void refactor(IModifiable executor, Package _package, INode buildingBlock) {	
		IStatementSet nodes = Select.statementsForRelation(executor, BuildingblockPackage.DecompositionBuildingBlock_decompose, buildingBlock);
		
		for( ch.actifsource.core.Statement nested : nodes ) {
			if(Select.isTypeOf(executor, nested.object(), BuildingblockPackage.BuildingBlock) ) {
				continue;
			}
						
			ch.actifsource.core.Statement currentBuildingBlock = Select.statementForRelationOrNull(executor, AggregateDecomposite_intoBuildingBlock, nested.object());		
			ch.actifsource.core.Statement newBuildingBlock = currentBuildingBlock.replaceNode(currentBuildingBlock.subject(), buildingBlock);						
			newBuildingBlock = newBuildingBlock.replaceNode(currentBuildingBlock.predicate(), BuildingblockPackage.DecompositionBuildingBlock_decompose);						
			executor.remove(currentBuildingBlock);
			executor.add(newBuildingBlock, IStatementPosition.AT_END);			
			Update.disposeStatement(executor, nested);			
		}				
	}

}
