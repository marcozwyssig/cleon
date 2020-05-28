package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractServiceGroup extends DynamicResource implements IAbstractServiceGroup {

  // abstract implementation, only used for static method calls
  private AbstractServiceGroup() {
    super(IAbstractServiceGroup.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractServiceGroup> selectToMeServices(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractServiceGroup.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.ServicesPackage.AbstractServiceGroup_services, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,15738651-a0ec-11ea-8daa-afb4679c3497,SyO47gKdABH61FxJ3Fhk8ipEPJ4=] */
