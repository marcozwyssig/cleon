package cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InterfaceService extends DynamicResource implements IInterfaceService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInterfaceService>() {
    
    @Override
    public IInterfaceService create() {
      return new InterfaceService();
    }
    
    @Override
    public IInterfaceService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InterfaceService(resourceRepository, resource);
    }
  
  };

  public InterfaceService() {
    super(IInterfaceService.TYPE_ID);
  }
  
  public InterfaceService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInterfaceService.TYPE_ID);
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
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData> selectData() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.conception.uml.spec.uml.structural.classes.interfaces.InterfacesPackage.InterfaceService_data);
  }

  public InterfaceService setData(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData> data) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, data);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public InterfaceService setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public InterfaceService setMethods(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InterfaceService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.conception.uml.spec.uml.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceService> selectToMeData(cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData object) {
    return _getToMeList(object.getRepository(), cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceService.class, cleon.conception.uml.spec.uml.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b626174f-26c1-11e3-a71a-b71d2dda9f8e,yjK2fAxO1QIcGYA+U9NbSU3/GEI=] */
