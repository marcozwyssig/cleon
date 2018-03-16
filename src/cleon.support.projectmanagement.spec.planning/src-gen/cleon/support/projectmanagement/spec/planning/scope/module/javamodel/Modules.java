package cleon.support.projectmanagement.spec.planning.scope.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Modules extends DynamicResource implements IModules {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModules> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IModules>() {
    
    @Override
    public IModules create() {
      return new Modules();
    }
    
    @Override
    public IModules create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Modules(resourceRepository, resource);
    }
  
  };

  public Modules() {
    super(IModules.TYPE_ID);
  }
  
  public Modules(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IModules.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Modules setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule> selectModules() {
    return _getList(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Modules_modules);
  }

  public Modules setModules(java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule> modules) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Modules_modules, modules);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Modules setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Modules_modules, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModules selectToMeModules(cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModules.class, cleon.support.projectmanagement.spec.planning.scope.module.ModulePackage.Modules_modules, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fdf40175-b53c-11e5-bc0c-f35b68c3609a,BkMbm3R0yh/8T/wiqiN4Bb034IE=] */
