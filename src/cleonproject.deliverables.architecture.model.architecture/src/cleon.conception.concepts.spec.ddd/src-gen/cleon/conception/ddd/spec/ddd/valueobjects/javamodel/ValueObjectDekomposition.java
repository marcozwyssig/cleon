package cleon.conception.ddd.spec.ddd.valueobjects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ValueObjectDekomposition extends DynamicResource implements IValueObjectDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IValueObjectDekomposition>() {
    
    @Override
    public IValueObjectDekomposition create() {
      return new ValueObjectDekomposition();
    }
    
    @Override
    public IValueObjectDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ValueObjectDekomposition(resourceRepository, resource);
    }
  
  };

  public ValueObjectDekomposition() {
    super(IValueObjectDekomposition.TYPE_ID);
  }
  
  public ValueObjectDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IValueObjectDekomposition.TYPE_ID);
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

  public ValueObjectDekomposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.ddd.spec.ddd.valueobjects.javamodel.IValueObject selectInto() {
    return _getSingle(cleon.conception.ddd.spec.ddd.valueobjects.javamodel.IValueObject.class, cleon.conception.ddd.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_into);
  }

  public ValueObjectDekomposition setInto(cleon.conception.ddd.spec.ddd.valueobjects.javamodel.IValueObject into) {
    _setSingle(cleon.conception.ddd.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ValueObjectDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.ddd.spec.ddd.valueobjects.javamodel.IValueObject.class, cleon.conception.ddd.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.ddd.spec.ddd.valueobjects.javamodel.IValueObjectDekomposition selectToMeInto(cleon.conception.ddd.spec.ddd.valueobjects.javamodel.IValueObject object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.ddd.spec.ddd.valueobjects.javamodel.IValueObjectDekomposition.class, cleon.conception.ddd.spec.ddd.valueobjects.ValueobjectsPackage.ValueObjectDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,172528f4-266d-11e5-95dc-8f1cdbd9db54,NjW2L7N49U2z2kpZvGiOH8GPxeU=] */
