package cleon.common.modularity.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DecompositionBuildingBlock extends DynamicResource implements IDecompositionBuildingBlock {

  // abstract implementation, only used for static method calls
  private DecompositionBuildingBlock() {
    super(IDecompositionBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock selectToMeDecompose(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.common.modularity.metamodel.spec.javamodel.IDecompositionBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b62f1413-174c-11e5-9ca7-d1bb57b73459,Gl0vALUVlIA1S+ZuyNUNRrpVVao=] */
