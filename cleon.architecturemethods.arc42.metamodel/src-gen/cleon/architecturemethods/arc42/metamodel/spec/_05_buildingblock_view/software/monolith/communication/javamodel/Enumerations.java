package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Enumerations extends DynamicResource implements IEnumerations {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumerations> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumerations>() {
    
    @Override
    public IEnumerations create() {
      return new Enumerations();
    }
    
    @Override
    public IEnumerations create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Enumerations(resourceRepository, resource);
    }
  
  };

  public Enumerations() {
    super(IEnumerations.TYPE_ID);
  }
  
  public Enumerations(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnumerations.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration> selectEnumerations() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Enumerations_enumerations);
  }

  public Enumerations setEnumerations(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration> enumerations) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Enumerations_enumerations, enumerations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Enumerations setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Enumerations_enumerations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerations selectToMeEnumerations(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumeration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IEnumerations.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.CommunicationPackage.Enumerations_enumerations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2329e276-cf1e-11ee-8c06-a5102392725a,s6FjHIGHyRievIb5XBfzsWi0uvA=] */
