package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QAEnvironment extends DynamicResource implements IQAEnvironment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQAEnvironment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQAEnvironment>() {
    
    @Override
    public IQAEnvironment create() {
      return new QAEnvironment();
    }
    
    @Override
    public IQAEnvironment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QAEnvironment(resourceRepository, resource);
    }
  
  };

  public QAEnvironment() {
    super(IQAEnvironment.TYPE_ID);
  }
  
  public QAEnvironment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQAEnvironment.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectAbbrevation() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.DeployPackage.Environment_abbrevation);
  }
    
  public void setAbbrevation(java.lang.String abbrevation) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.DeployPackage.Environment_abbrevation, abbrevation);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QAEnvironment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.DeployPackage.Environment_abbrevation, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1dfd829-4070-11e5-b5f0-5b1ce9c3de3e,pxQd9H2oRKnmwCNouYZhjGti46Q=] */
