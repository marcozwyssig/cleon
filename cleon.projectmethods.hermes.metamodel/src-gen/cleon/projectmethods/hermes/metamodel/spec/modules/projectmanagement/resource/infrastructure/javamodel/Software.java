package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Software extends DynamicResource implements ISoftware {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftware> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftware>() {
    
    @Override
    public ISoftware create() {
      return new Software();
    }
    
    @Override
    public ISoftware create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Software(resourceRepository, resource);
    }
  
  };

  public Software() {
    super(ISoftware.TYPE_ID);
  }
  
  public Software(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftware.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.common.calendar.metamodel.spec.javamodel.IDay selectPurchaseDate() {
    return _getSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.Software_purchaseDate);
  }

  public Software setPurchaseDate(cleon.common.calendar.metamodel.spec.javamodel.IDay purchaseDate) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.Software_purchaseDate, purchaseDate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Software setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.common.calendar.metamodel.spec.javamodel.IDay.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.Software_purchaseDate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.ISoftware> selectToMePurchaseDate(cleon.common.calendar.metamodel.spec.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.ISoftware.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.Software_purchaseDate, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,052b13bf-a7e0-11e5-82dd-3b995d9c840c,IlP/i44FG68A8Ichk5iJqCBdtYY=] */
