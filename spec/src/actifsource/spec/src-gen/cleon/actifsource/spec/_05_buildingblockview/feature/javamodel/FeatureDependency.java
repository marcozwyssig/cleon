package cleon.actifsource.spec._05_buildingblockview.feature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FeatureDependency extends DynamicResource implements IFeatureDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeatureDependency>() {
    
    @Override
    public IFeatureDependency create() {
      return new FeatureDependency();
    }
    
    @Override
    public IFeatureDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FeatureDependency(resourceRepository, resource);
    }
  
  };

  public FeatureDependency() {
    super(IFeatureDependency.TYPE_ID);
  }
  
  public FeatureDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFeatureDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.javamodel.IFeature> selectTo() {
    return _getList(cleon.actifsource.spec._05_buildingblockview.feature.javamodel.IFeature.class, cleon.actifsource.spec._05_buildingblockview.feature.FeaturePackage.FeatureDependency_to);
  }

  public FeatureDependency setTo(java.util.List<? extends cleon.actifsource.spec._05_buildingblockview.feature.javamodel.IFeature> to) {
    _setList(cleon.actifsource.spec._05_buildingblockview.feature.FeaturePackage.FeatureDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FeatureDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.resources.spec.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.resources.spec.versions.javamodel.ISemanticVersion.class, cleon.resources.spec.versions.VersionsPackage.WithVersion_version);
  }

  public FeatureDependency setVersion(cleon.resources.spec.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.resources.spec.versions.VersionsPackage.WithVersion_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.actifsource.spec._05_buildingblockview.feature.javamodel.IFeature.class, cleon.actifsource.spec._05_buildingblockview.feature.FeaturePackage.FeatureDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.resources.spec.versions.javamodel.ISemanticVersion.class, cleon.resources.spec.versions.VersionsPackage.WithVersion_version, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.actifsource.spec._05_buildingblockview.feature.javamodel.IFeatureDependency> selectToMeTo(cleon.actifsource.spec._05_buildingblockview.feature.javamodel.IFeature object) {
    return _getToMeList(object.getRepository(), cleon.actifsource.spec._05_buildingblockview.feature.javamodel.IFeatureDependency.class, cleon.actifsource.spec._05_buildingblockview.feature.FeaturePackage.FeatureDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c76b9cee-d40d-11e5-8556-8f55ceb91287,GRuAs05JC7EffJQWnA5JyORXtGk=] */
