package cleon.common.doc.doc.spec.paragraph.remarks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Caution extends DynamicResource implements ICaution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICaution>() {
    
    @Override
    public ICaution create() {
      return new Caution();
    }
    
    @Override
    public ICaution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Caution(resourceRepository, resource);
    }
  
  };

  public Caution() {
    super(ICaution.TYPE_ID);
  }
  
  public Caution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICaution.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectRemark() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark);
  }
    
  public void setRemark(java.lang.String remark) {
     _setSingleAttribute(cleon.common.doc.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark, remark);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Caution setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Caution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.doc.spec.paragraph.remarks.RemarksPackage.Remark_remark, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ad29dedd-466d-11e5-ba74-cb2e95044e1c,KqtnhB+XRRB0S++0tdyoMgPuibk=] */
