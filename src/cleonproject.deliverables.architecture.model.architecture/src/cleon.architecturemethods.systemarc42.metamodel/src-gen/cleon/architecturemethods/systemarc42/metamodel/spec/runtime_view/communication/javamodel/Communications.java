package cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Communications extends DynamicResource implements ICommunications {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICommunications> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICommunications>() {
    
    @Override
    public ICommunications create() {
      return new Communications();
    }
    
    @Override
    public ICommunications create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Communications(resourceRepository, resource);
    }
  
  };

  public Communications() {
    super(ICommunications.TYPE_ID);
  }
  
  public Communications(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICommunications.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication> selectSystemCommunications() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communications_systemCommunications);
  }

  public Communications setSystemCommunications(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication> systemCommunications) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communications_systemCommunications, systemCommunications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Communications setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communications_systemCommunications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunications selectToMeSystemCommunications(cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunication object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ICommunications.class, cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.CommunicationPackage.Communications_systemCommunications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6c796bef-8779-11e9-a61b-279ebde48b48,U9aAVIHQzbS/gjEth8twD9OZSxk=] */
