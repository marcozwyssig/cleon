package cleon.common.modularity.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class InteractiveBuildingBlock extends DynamicResource implements IInteractiveBuildingBlock {

  // abstract implementation, only used for static method calls
  private InteractiveBuildingBlock() {
    super(IInteractiveBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.modularity.metamodel.spec.javamodel.IInteractiveBuildingBlock selectToMeInteracts(cleon.common.modularity.metamodel.spec.javamodel.IInteraction object) {
    return _getToMeSingle(object.getRepository(), cleon.common.modularity.metamodel.spec.javamodel.IInteractiveBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4a80d1f2-0511-11e9-87b8-094c52ae4c98,t2ovuNEMYJiyNRcUO9T8qBDgaaU=] */
