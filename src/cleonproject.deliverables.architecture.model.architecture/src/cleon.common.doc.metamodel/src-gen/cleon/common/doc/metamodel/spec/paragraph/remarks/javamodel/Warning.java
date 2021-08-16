package cleon.common.doc.metamodel.spec.paragraph.remarks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Warning extends DynamicResource implements IWarning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWarning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWarning>() {
    
    @Override
    public IWarning create() {
      return new Warning();
    }
    
    @Override
    public IWarning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Warning(resourceRepository, resource);
    }
  
  };

  public Warning() {
    super(IWarning.TYPE_ID);
  }
  
  public Warning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWarning.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.String selectRemark() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.remarks.RemarksPackage.Remark_remark);
  }
    
  public void setRemark(java.lang.String remark) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.remarks.RemarksPackage.Remark_remark, remark);
  }

  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_text, text);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public Warning setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_style);
  }

  public Warning setStyle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Warning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.paragraph.remarks.RemarksPackage.Remark_remark, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.paragraph.ParagraphPackage.Text_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aad9acec-466d-11e5-ba74-cb2e95044e1c,rF7OK1V7M2S5Kv6wDZZ4GaXpUIY=] */
