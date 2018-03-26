package cleon.conception.applications.spec.ddd.exceptions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ExceptionDekomposition extends DynamicResource implements IExceptionDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExceptionDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExceptionDekomposition>() {
    
    @Override
    public IExceptionDekomposition create() {
      return new ExceptionDekomposition();
    }
    
    @Override
    public IExceptionDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ExceptionDekomposition(resourceRepository, resource);
    }
  
  };

  public ExceptionDekomposition() {
    super(IExceptionDekomposition.TYPE_ID);
  }
  
  public ExceptionDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExceptionDekomposition.TYPE_ID);
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

  public ExceptionDekomposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException selectInto() {
    return _getSingle(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException.class, cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into);
  }

  public ExceptionDekomposition setInto(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException into) {
    _setSingle(cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ExceptionDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException.class, cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.applications.spec.ddd.exceptions.javamodel.IExceptionDekomposition selectToMeInto(cleon.conception.applications.spec.ddd.exceptions.javamodel.IDomainException object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.ddd.exceptions.javamodel.IExceptionDekomposition.class, cleon.conception.applications.spec.ddd.exceptions.ExceptionsPackage.ExceptionDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,510327f6-266d-11e5-95dc-8f1cdbd9db54,fxy40o7MDL0EV6vHH9+oN5bmfoc=] */
