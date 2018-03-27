package cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnumDekomposition extends DynamicResource implements IEnumDekomposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumDekomposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnumDekomposition>() {
    
    @Override
    public IEnumDekomposition create() {
      return new EnumDekomposition();
    }
    
    @Override
    public IEnumDekomposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnumDekomposition(resourceRepository, resource);
    }
  
  };

  public EnumDekomposition() {
    super(IEnumDekomposition.TYPE_ID);
  }
  
  public EnumDekomposition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnumDekomposition.TYPE_ID);
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

  public EnumDekomposition setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnum selectInto() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnum.class, cleon.conception.architecture.spec.uml.structural.classes.enums.EnumsPackage.EnumDekomposition_into);
  }

  public EnumDekomposition setInto(cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnum into) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.classes.enums.EnumsPackage.EnumDekomposition_into, into);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnumDekomposition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnum.class, cleon.conception.architecture.spec.uml.structural.classes.enums.EnumsPackage.EnumDekomposition_into, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnumDekomposition selectToMeInto(cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnum object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.uml.structural.classes.enums.javamodel.IEnumDekomposition.class, cleon.conception.architecture.spec.uml.structural.classes.enums.EnumsPackage.EnumDekomposition_into, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,42edd90e-266e-11e5-95dc-8f1cdbd9db54,xyFeHyUwHDjLMOdXrjkv93n61+s=] */
