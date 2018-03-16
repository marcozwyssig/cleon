package cleon.support.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ModuleLamp extends DynamicResource implements IModuleLamp {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleLamp> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModuleLamp>() {
    
    @Override
    public IModuleLamp create() {
      return new ModuleLamp();
    }
    
    @Override
    public IModuleLamp create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ModuleLamp(resourceRepository, resource);
    }
  
  };

  public ModuleLamp() {
    super(IModuleLamp.TYPE_ID);
  }
  
  public ModuleLamp(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModuleLamp.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState selectState() {
    return _getSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleLamp_state);
  }

  public ModuleLamp setState(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState state) {
    _setSingle(cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleLamp_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ModuleLamp setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleLamp_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp> selectToMeState(cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLampState object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.steering.controlling.module.javamodel.IModuleLamp.class, cleon.support.projectmanagement.spec.steering.controlling.module.ModulePackage.ModuleLamp_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,779caf13-3386-11e6-b251-57783f5929b3,AAiilBKTNALMYnz1q4gSreBMORU=] */
