package cleon.zoo.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Specification extends DynamicResource implements ISpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISpecification>() {
    
    @Override
    public ISpecification create() {
      return new Specification();
    }
    
    @Override
    public ISpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Specification(resourceRepository, resource);
    }
  
  };

  public Specification() {
    super(ISpecification.TYPE_ID);
  }
  
  public Specification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISpecification.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectVersion() {
    return _getSingleAttribute(java.lang.String.class, cleon.zoo.spec.SpecPackage.Project_version);
  }
    
  public void setVersion(java.lang.String version) {
     _setSingleAttribute(cleon.zoo.spec.SpecPackage.Project_version, version);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.zoo.spec.javamodel.IProject> selectDependsOn() {
    return _getList(cleon.zoo.spec.javamodel.IProject.class, cleon.zoo.spec.SpecPackage.Project_dependsOn);
  }

  public Specification setDependsOn(java.util.List<? extends cleon.zoo.spec.javamodel.IProject> dependsOn) {
    _setList(cleon.zoo.spec.SpecPackage.Project_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.zoo.spec.javamodel.IModel> selectModel() {
    return _getList(cleon.zoo.spec.javamodel.IModel.class, cleon.zoo.spec.SpecPackage.Specification_model);
  }

  public Specification setModel(java.util.List<? extends cleon.zoo.spec.javamodel.IModel> model) {
    _setList(cleon.zoo.spec.SpecPackage.Specification_model, model);
    return this;
  }
    
  @Override
  public cleon.zoo.spec.javamodel.ISample selectSample() {
    return _getSingle(cleon.zoo.spec.javamodel.ISample.class, cleon.zoo.spec.SpecPackage.Specification_sample);
  }

  public Specification setSample(cleon.zoo.spec.javamodel.ISample sample) {
    _setSingle(cleon.zoo.spec.SpecPackage.Specification_sample, sample);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.zoo.spec.javamodel.ITemplate> selectTemplates() {
    return _getList(cleon.zoo.spec.javamodel.ITemplate.class, cleon.zoo.spec.SpecPackage.Specification_templates);
  }

  public Specification setTemplates(java.util.List<? extends cleon.zoo.spec.javamodel.ITemplate> templates) {
    _setList(cleon.zoo.spec.SpecPackage.Specification_templates, templates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Specification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.zoo.spec.SpecPackage.Project_version, visitor);
    // relations
    _acceptList(cleon.zoo.spec.javamodel.IProject.class, cleon.zoo.spec.SpecPackage.Project_dependsOn, visitor);
    _acceptList(cleon.zoo.spec.javamodel.IModel.class, cleon.zoo.spec.SpecPackage.Specification_model, visitor);
    _acceptSingle(cleon.zoo.spec.javamodel.ISample.class, cleon.zoo.spec.SpecPackage.Specification_sample, visitor);
    _acceptList(cleon.zoo.spec.javamodel.ITemplate.class, cleon.zoo.spec.SpecPackage.Specification_templates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.zoo.spec.javamodel.ISpecification selectToMeTemplates(cleon.zoo.spec.javamodel.ITemplate object) {
    return _getToMeSingle(object.getRepository(), cleon.zoo.spec.javamodel.ISpecification.class, cleon.zoo.spec.SpecPackage.Specification_templates, object.getResource());
  }
  
  public static cleon.zoo.spec.javamodel.ISpecification selectToMeSample(cleon.zoo.spec.javamodel.ISample object) {
    return _getToMeSingle(object.getRepository(), cleon.zoo.spec.javamodel.ISpecification.class, cleon.zoo.spec.SpecPackage.Specification_sample, object.getResource());
  }
  
  public static cleon.zoo.spec.javamodel.ISpecification selectToMeModel(cleon.zoo.spec.javamodel.IModel object) {
    return _getToMeSingle(object.getRepository(), cleon.zoo.spec.javamodel.ISpecification.class, cleon.zoo.spec.SpecPackage.Specification_model, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2cdf0732-e9ba-11e4-848b-0509e3792151,6qdQc1R9lvzjuy8HyeB1S0hWsv4=] */
