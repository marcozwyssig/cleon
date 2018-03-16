package cleon.conception.desktop.spec.desktop.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class UIService extends DynamicResource implements IUIService {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUIService> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IUIService>() {
    
    @Override
    public IUIService create() {
      return new UIService();
    }
    
    @Override
    public IUIService create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new UIService(resourceRepository, resource);
    }
  
  };

  public UIService() {
    super(IUIService.TYPE_ID);
  }
  
  public UIService(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IUIService.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData> selectData() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.conception.uml.spec.uml.structural.classes.interfaces.InterfacesPackage.InterfaceService_data);
  }

  public UIService setData(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData> data) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, data);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public UIService setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.soa.spec.soa.javamodel.IEvent> selectEvents() {
    return _getList(cleon.conception.soa.spec.soa.javamodel.IEvent.class, cleon.conception.soa.spec.soa.SoaPackage.DataService_events);
  }

  public UIService setEvents(java.util.List<? extends cleon.conception.soa.spec.soa.javamodel.IEvent> events) {
    _setList(cleon.conception.soa.spec.soa.SoaPackage.DataService_events, events);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public UIService setMethods(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public UIService setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.interfaces.javamodel.IInterfaceData.class, cleon.conception.uml.spec.uml.structural.classes.interfaces.InterfacesPackage.InterfaceService_data, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.soa.spec.soa.javamodel.IEvent.class, cleon.conception.soa.spec.soa.SoaPackage.DataService_events, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f4fb9566-a37b-11e3-9113-ffc7f11b0a42,uAwRY/uhUhZgkTpXke2UFNDxL9c=] */
