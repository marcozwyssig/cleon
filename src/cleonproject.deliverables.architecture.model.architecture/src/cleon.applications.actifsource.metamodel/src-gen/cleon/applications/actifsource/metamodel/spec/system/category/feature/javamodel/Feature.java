package cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Feature extends DynamicResource implements IFeature {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeature> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFeature>() {
    
    @Override
    public IFeature create() {
      return new Feature();
    }
    
    @Override
    public IFeature create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Feature(resourceRepository, resource);
    }
  
  };

  public Feature() {
    super(IFeature.TYPE_ID);
  }
  
  public Feature(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFeature.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectDecompose() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose);
  }

  public Feature setDecompose(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> decompose) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public Feature setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.IAbstractComponent> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IDiagram selectDiagram() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IDiagram.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_diagram);
  }

  public Feature setDiagram(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IDiagram diagram) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_diagram, diagram);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeatureDependency> selectHasDependency() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeatureDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_hasDependency);
  }

  public Feature setHasDependency(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeatureDependency> hasDependency) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IInteraction.class, cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts);
  }

  public Feature setInteracts(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IMetaModel> selectMetamodel() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IMetaModel.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_metamodel);
  }

  public Feature setMetamodel(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IMetaModel> metamodel) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_metamodel, metamodel);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IModel> selectModels() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IModel.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_models);
  }

  public Feature setModels(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IModel> models) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_models, models);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public Feature setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public Feature setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.sample.javamodel.ISample selectSample() {
    return _getSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.sample.javamodel.ISample.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_sample);
  }

  public Feature setSample(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.sample.javamodel.ISample sample) {
    _setSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_sample, sample);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.ITemplate> selectTemplates() {
    return _getList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.ITemplate.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_templates);
  }

  public Feature setTemplates(java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.ITemplate> templates) {
    _setList(cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_templates, templates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Feature setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IDiagram.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_diagram, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeatureDependency.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_hasDependency, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IMetaModel.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_metamodel, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IModel.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_models, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.metamodel.spec.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.sample.javamodel.ISample.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_sample, visitor);
    _acceptList(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.ITemplate.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_templates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature selectToMeHasDependency(cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeatureDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_hasDependency, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature selectToMeMetamodel(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IMetaModel object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_metamodel, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature selectToMeDiagram(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IDiagram object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_diagram, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature selectToMeTemplates(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.ITemplate object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_templates, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature selectToMeSample(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.sample.javamodel.ISample object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_sample, object.getResource());
  }
  
  public static cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature selectToMeModels(cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IModel object) {
    return _getToMeSingle(object.getRepository(), cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeature.class, cleon.applications.actifsource.metamodel.spec.system.category.feature.FeaturePackage.Feature_models, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,98431561-d40b-11e5-8556-8f55ceb91287,43P3uKQrXwKE9C2q2GTjTZurPmw=] */
