package cleon.common.modularity.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildingBlockWithName extends DynamicResource implements IBuildingBlockWithName {

  // abstract implementation, only used for static method calls
  private BuildingBlockWithName() {
    super(IBuildingBlockWithName.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cae890e4-52c5-11f1-b29c-1766e5efe1b4,Au7taiBjCB6SJdlvlqaGFYLqH4s=] */
