package cleon.common.modularity.metamodel.spec;

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
import ch.actifsource.core.set.IPackageSet;
import ch.actifsource.core.set.IStatementSet;
import ch.actifsource.core.update.FixOwnership;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.util.log.Logger;

public class RefactorDecomposeBuildingBlock extends AbstractAllInstancesRefactorerAspect {
	
	public static final Resource AggregateDecomposite_intoBuildingBlock = new Resource("bad604bb-7a39-11e4-a6e2-23d949480f96");	

	public RefactorDecomposeBuildingBlock() {
		super("1.0", 2019, 11, 23, "Move decomposing objects", SpecPackage.DecompositionBuildingBlock);
	}

	@Override
	protected void refactor(IModifiable executor, Package _package, INode buildingBlock) {	
		refactorRelationShip(executor, buildingBlock);
		refactorBuildingBlock(executor, buildingBlock);				
	}

	private void refactorBuildingBlock(IModifiable executor, INode buildingBlock) {
		IStatementSet nodes = Select.statementsForRelation(executor, SpecPackage.DecompositionBuildingBlock_decompose, buildingBlock);
		for( ch.actifsource.core.Statement nested : nodes ) {			
			if(Select.isTypeOf(executor, nested.object(), SpecPackage.BuildingBlock) ) {
				continue;
			}
			
			Logger.instance().logInfo("invalid type found on subject " + Select.simpleName(executor, nested.subject()));						
			ch.actifsource.core.Statement currentBuildingBlock = Select.statementForRelationOrNull(executor, AggregateDecomposite_intoBuildingBlock, nested.object());
			if(currentBuildingBlock == null ) {
				Logger.instance().logInfo("statement for " + Select.simpleName(executor, nested.subject()) + " not found. Searching for possible statements...");
				IPackageSet packageSet = Select.statements(executor, nested.object());
				for( ch.actifsource.core.Statement findStatement : packageSet) {
					if( Select.isTypeOf(executor, findStatement.object(), SpecPackage.BuildingBlock) ) {
						currentBuildingBlock = findStatement;
						break;
					}					
				}				
			}
			
			if( currentBuildingBlock == null) {
				Logger.instance().logInfo("statement for " + Select.simpleName(executor, nested.subject()) + " not found. Continues.");
				continue;
			}
			
			
			ch.actifsource.core.Statement newBuildingBlock = currentBuildingBlock.replaceNode(currentBuildingBlock.subject(), buildingBlock);						
			newBuildingBlock = newBuildingBlock.replaceNode(currentBuildingBlock.predicate(), SpecPackage.DecompositionBuildingBlock_decompose);						
			executor.remove(currentBuildingBlock);
			executor.add(newBuildingBlock, IStatementPosition.AT_END);			
			Update.disposeStatement(executor, nested);			
		}
	}

	private void refactorRelationShip(IModifiable executor, INode buildingBlock) {
		IStatementSet nodes = Select.statementsForRelation(executor, SpecPackage.DecompositionBuildingBlock_decompose, buildingBlock);
		
		for( ch.actifsource.core.Statement nested : nodes ) {
			Logger.instance().logInfo("verify relationship statement " + nested.toString() + " on subject " + Select.simpleName(executor, nested.subject()));
			if( nested.isComposition() ) {
				try {
					executor.modify(nested, nested.createModificationStatement(Relationship.ASSOCIATION));
					Update.modify(executor, nested, Relationship.AGGREGATION);
				} catch( Exception e) {
					Logger.instance().logWarning("modify statement " + nested.toString() + " failed with exception " + e.getMessage());
				}
			}		
		}		
	}
}
