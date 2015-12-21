package cleon.sdp.spec.projectmanagement.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sprint extends DynamicResource implements ISprint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint>() {
    
    @Override
    public ISprint create() {
      return new Sprint();
    }
    
    @Override
    public ISprint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sprint(resourceRepository, resource);
    }
  
  };

  public Sprint() {
    super(ISprint.TYPE_ID);
  }
  
  public Sprint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprint.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectNumber() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sdp.spec.projectmanagement.release.ReleasePackage.Sprint_number);
  }
    
  public void setNumber(java.lang.Integer number) {
     _setSingleAttribute(cleon.sdp.spec.projectmanagement.release.ReleasePackage.Sprint_number, number);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sprint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sdp.spec.projectmanagement.release.ReleasePackage.Sprint_number, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46c6145c-3761-11e5-95d9-2b04d7ab02d9,6p8WTriET1PFgD65vDmLh668K10=] */
