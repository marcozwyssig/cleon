package cleon.zoo.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Model extends DynamicResource implements IModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModel>() {
    
    @Override
    public IModel create() {
      return new Model();
    }
    
    @Override
    public IModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Model(resourceRepository, resource);
    }
  
  };

  public Model() {
    super(IModel.TYPE_ID);
  }
  
  public Model(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModel.TYPE_ID);
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

  public Model setDependsOn(java.util.List<? extends cleon.zoo.spec.javamodel.IProject> dependsOn) {
    _setList(cleon.zoo.spec.SpecPackage.Project_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Model setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.zoo.spec.SpecPackage.Project_version, visitor);
    // relations
    _acceptList(cleon.zoo.spec.javamodel.IProject.class, cleon.zoo.spec.SpecPackage.Project_dependsOn, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eab1ce0a-1005-11e5-865e-55f33dbc76dc,1HcTVNIQDLXKF+dpapK5OOMER54=] */
