package cleon.common.resources.metamodel.spec.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemStage extends DynamicResource implements ISystemStage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemStage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemStage>() {
    
    @Override
    public ISystemStage create() {
      return new SystemStage();
    }
    
    @Override
    public ISystemStage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemStage(resourceRepository, resource);
    }
  
  };

  public SystemStage() {
    super(ISystemStage.TYPE_ID);
  }
  
  public SystemStage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemStage.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectShortName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName);
  }
    
  public void setShortName(java.lang.String shortName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.naming.NamingPackage.ShortName_shortName, shortName);
  }

  @Override
  public java.lang.String selectShortSystemName() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_shortSystemName);
  }
    
  public void setShortSystemName(java.lang.String shortSystemName) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_shortSystemName, shortSystemName);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemStage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_shortSystemName, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isPre__S_alpha__F___N_PA__O_()) return visitor.visitPre__S_alpha__F___N_PA__O_();
    if (isAlpha__F___N_A__O_()) return visitor.visitAlpha__F___N_A__O_();
    if (isBeta__F___N_B__O_()) return visitor.visitBeta__F___N_B__O_();
    if (isRelease__F_candidate__F___N_RC__O_()) return visitor.visitRelease__F_candidate__F___N_RC__O_();
    if (isRelease__F_to__F_manufacturing__F___N_RTM__O_()) return visitor.visitRelease__F_to__F_manufacturing__F___N_RTM__O_();
    if (isGeneral__F_availability__F___N_GA__O___F___N_GA__O_()) return visitor.visitGeneral__F_availability__F___N_GA__O___F___N_GA__O_();
    if (isEnd__S_of__S_life__F___N_EOL__O_()) return visitor.visitEnd__S_of__S_life__F___N_EOL__O_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isPre__S_alpha__F___N_PA__O_()) {
      visitor.visitPre__S_alpha__F___N_PA__O_();
      return;
    }
    if (isAlpha__F___N_A__O_()) {
      visitor.visitAlpha__F___N_A__O_();
      return;
    }
    if (isBeta__F___N_B__O_()) {
      visitor.visitBeta__F___N_B__O_();
      return;
    }
    if (isRelease__F_candidate__F___N_RC__O_()) {
      visitor.visitRelease__F_candidate__F___N_RC__O_();
      return;
    }
    if (isRelease__F_to__F_manufacturing__F___N_RTM__O_()) {
      visitor.visitRelease__F_to__F_manufacturing__F___N_RTM__O_();
      return;
    }
    if (isGeneral__F_availability__F___N_GA__O___F___N_GA__O_()) {
      visitor.visitGeneral__F_availability__F___N_GA__O___F___N_GA__O_();
      return;
    }
    if (isEnd__S_of__S_life__F___N_EOL__O_()) {
      visitor.visitEnd__S_of__S_life__F___N_EOL__O_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isPre__S_alpha__F___N_PA__O_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_Pre__S_alpha__F___N_PA__O_);
  }
  
  @Override
  public boolean isAlpha__F___N_A__O_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_Alpha__F___N_A__O_);
  }
  
  @Override
  public boolean isBeta__F___N_B__O_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_Beta__F___N_B__O_);
  }
  
  @Override
  public boolean isRelease__F_candidate__F___N_RC__O_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_Release__F_candidate__F___N_RC__O_);
  }
  
  @Override
  public boolean isRelease__F_to__F_manufacturing__F___N_RTM__O_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_Release__F_to__F_manufacturing__F___N_RTM__O_);
  }
  
  @Override
  public boolean isGeneral__F_availability__F___N_GA__O___F___N_GA__O_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_General__F_availability__F___N_GA__O___F___N_GA__O_);
  }
  
  @Override
  public boolean isEnd__S_of__S_life__F___N_EOL__O_() {
    return getResource().equals(cleon.common.resources.metamodel.spec.versions.VersionsPackage.SystemStage_End__S_of__S_life__F___N_EOL__O_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,21bbfa64-bfea-11e8-a3d0-5394fd9291a1,mP6hk+Bk3dmEpMvbkaft71ndj9w=] */
