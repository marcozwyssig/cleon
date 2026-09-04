package cleon.common.modularity.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildingBlockWithShortName extends DynamicResource implements IBuildingBlockWithShortName {

  // abstract implementation, only used for static method calls
  private BuildingBlockWithShortName() {
    super(IBuildingBlockWithShortName.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,24ecf2de-ca09-11f0-b6b1-417d09924fae,hBasJX702o2VoYoCVlH8gDcTEdc=] */
