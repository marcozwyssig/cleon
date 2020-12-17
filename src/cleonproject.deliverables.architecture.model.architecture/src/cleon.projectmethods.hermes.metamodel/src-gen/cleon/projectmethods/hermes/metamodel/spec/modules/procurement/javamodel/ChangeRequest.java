package cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ChangeRequest extends DynamicResource implements IChangeRequest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChangeRequest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChangeRequest>() {
    
    @Override
    public IChangeRequest create() {
      return new ChangeRequest();
    }
    
    @Override
    public IChangeRequest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ChangeRequest(resourceRepository, resource);
    }
  
  };

  public ChangeRequest() {
    super(IChangeRequest.TYPE_ID);
  }
  
  public ChangeRequest(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChangeRequest.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IMainContract selectMainContract() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IMainContract.class, cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.ChangeRequest_mainContract);
  }

  public ChangeRequest setMainContract(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IMainContract mainContract) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.ChangeRequest_mainContract, mainContract);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ChangeRequest setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IMainContract.class, cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.ChangeRequest_mainContract, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IChangeRequest> selectToMeMainContract(cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IMainContract object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.procurement.javamodel.IChangeRequest.class, cleon.projectmethods.hermes.metamodel.spec.modules.procurement.ProcurementPackage.ChangeRequest_mainContract, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,80ae052c-4058-11eb-aaa9-61838d129c8c,F+4l9vIdr3Z/aLuVnwih+md41oY=] */
