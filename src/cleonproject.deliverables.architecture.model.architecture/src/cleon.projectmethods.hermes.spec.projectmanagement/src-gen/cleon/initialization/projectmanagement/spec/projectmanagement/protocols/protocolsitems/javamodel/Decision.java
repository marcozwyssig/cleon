package cleon.initialization.projectmanagement.spec.projectmanagement.protocols.protocolsitems.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Decision extends DynamicResource implements IDecision {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDecision> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDecision>() {
    
    @Override
    public IDecision create() {
      return new Decision();
    }
    
    @Override
    public IDecision create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Decision(resourceRepository, resource);
    }
  
  };

  public Decision() {
    super(IDecision.TYPE_ID);
  }
  
  public Decision(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDecision.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> selectResponsibles() {
    return _getList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles);
  }

  public Decision setResponsibles(java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> responsibles) {
    _setList(cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, responsibles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Decision setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_name, visitor);
    // relations
    _acceptList(cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson.class, cleon.initialization.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolItem_responsibles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4fb5e22c-b463-11e5-a3f4-497fd75158dc,cqHnH7OlTciWx3I05qILGrSWyNg=] */
