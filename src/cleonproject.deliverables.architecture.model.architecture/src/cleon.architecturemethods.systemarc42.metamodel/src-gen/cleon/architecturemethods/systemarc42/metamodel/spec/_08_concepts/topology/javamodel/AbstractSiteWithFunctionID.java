package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSiteWithFunctionID extends DynamicResource implements IAbstractSiteWithFunctionID {

  // abstract implementation, only used for static method calls
  private AbstractSiteWithFunctionID() {
    super(IAbstractSiteWithFunctionID.TYPE_ID);
  }
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID> selectToMeSkipHostGenerationFor(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithFunctionID_skipHostGenerationFor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bc8dc18d-3633-11ea-b5c2-e3e297a45d39,vHjH9ZTGrBckAG8Zkc5ks2FKYEI=] */
