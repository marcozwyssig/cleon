package cleon.arc42.spec._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QualityGoals extends DynamicResource implements IQualityGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityGoals>() {
    
    @Override
    public IQualityGoals create() {
      return new QualityGoals();
    }
    
    @Override
    public IQualityGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QualityGoals(resourceRepository, resource);
    }
  
  };

  public QualityGoals() {
    super(IQualityGoals.TYPE_ID);
  }
  
  public QualityGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQualityGoals.TYPE_ID);
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

  public QualityGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f73da048-11fc-11e5-848b-017a3a98ae34,3FD8Yrjgah51b5Pm0MV7GVIXZ1E=] */
