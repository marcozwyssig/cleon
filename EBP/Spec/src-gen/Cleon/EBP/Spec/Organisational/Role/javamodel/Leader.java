package Cleon.EBP.Spec.Organisational.Role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Leader extends DynamicResource implements ILeader {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILeader> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ILeader>() {
    
    @Override
    public ILeader create() {
      return new Leader();
    }
    
    @Override
    public ILeader create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Leader(resourceRepository, resource);
    }
  
  };

  public Leader() {
    super(ILeader.TYPE_ID);
  }
  
  public Leader(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ILeader.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Leader setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d52e4237-bb6b-11e3-bf59-6b10d9dd6d36,qvDyTnSJHf1mmrkR/NgKLSNy5oU=] */
