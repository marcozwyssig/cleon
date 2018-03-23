package cleon.support.projectmanagement.spec.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Management extends DynamicResource implements IManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagement>() {
    
    @Override
    public IManagement create() {
      return new Management();
    }
    
    @Override
    public IManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Management(resourceRepository, resource);
    }
  
  };

  public Management() {
    super(IManagement.TYPE_ID);
  }
  
  public Management(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManagement.TYPE_ID);
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
  public cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocols selectProtocols() {
    return _getSingle(cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocols.class, cleon.support.projectmanagement.spec.projectmanagement.ProjectmanagementPackage.Management_protocols);
  }

  public Management setProtocols(cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocols protocols) {
    _setSingle(cleon.support.projectmanagement.spec.projectmanagement.ProjectmanagementPackage.Management_protocols, protocols);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Management setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocols.class, cleon.support.projectmanagement.spec.projectmanagement.ProjectmanagementPackage.Management_protocols, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.projectmanagement.javamodel.IManagement selectToMeProtocols(cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocols object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.projectmanagement.javamodel.IManagement.class, cleon.support.projectmanagement.spec.projectmanagement.ProjectmanagementPackage.Management_protocols, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1ee9b306-bdf8-11e6-a3f0-c7681ee45a3f,IWX8v5nDZb7VQqzuJsAPYQ/lgtM=] */
