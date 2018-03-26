package cleon.conception.ddd.spec.ddd.services.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceDekomposition extends DynamicResource implements IServiceDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceDekomposition>() {
    
    @Override
    public IServiceDekomposition create() {
      return new ServiceDekomposition();
    }
    
    @Override
    public IServiceDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceDekomposition(resourceRepository, resource);
    }
  
  };

  public ServiceDekomposition() {
    super(IServiceDekomposition.TYPE_ID);
  }
  
  public ServiceDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceDekomposition.TYPE_ID);
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

  public ServiceDekomposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.ddd.spec.ddd.services.javamodel.IDomainService selectInto() {
    return _getSingle(cleon.conception.ddd.spec.ddd.services.javamodel.IDomainService.class, cleon.conception.ddd.spec.ddd.services.ServicesPackage.ServiceDekomposition_into);
  }

  public ServiceDekomposition setInto(cleon.conception.ddd.spec.ddd.services.javamodel.IDomainService into) {
    _setSingle(cleon.conception.ddd.spec.ddd.services.ServicesPackage.ServiceDekomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.ddd.spec.ddd.services.javamodel.IDomainService.class, cleon.conception.ddd.spec.ddd.services.ServicesPackage.ServiceDekomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.ddd.spec.ddd.services.javamodel.IServiceDekomposition selectToMeInto(cleon.conception.ddd.spec.ddd.services.javamodel.IDomainService object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.ddd.spec.ddd.services.javamodel.IServiceDekomposition.class, cleon.conception.ddd.spec.ddd.services.ServicesPackage.ServiceDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f97926d2-266f-11e5-95dc-8f1cdbd9db54,hGekvq2ig2lo2LFYmHH3nBKNmWs=] */
