package cleon.doc.spec.chapter.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TextParagraph extends DynamicResource implements ITextParagraph {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITextParagraph> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITextParagraph>() {
    
    @Override
    public ITextParagraph create() {
      return new TextParagraph();
    }
    
    @Override
    public ITextParagraph create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TextParagraph(resourceRepository, resource);
    }
  
  };

  public TextParagraph() {
    super(ITextParagraph.TYPE_ID);
  }
  
  public TextParagraph(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITextParagraph.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectText() {
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.TextParagraph_text);
  }
    
  public void setText(java.lang.String text) {
     _setSingleAttribute(cleon.doc.spec.chapter.paragraph.ParagraphPackage.TextParagraph_text, text);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TextParagraph setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.TextParagraph_text, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0e3ff7cb-d86f-11e4-aa2f-c11242a92b60,C14BxHGOiSuN9M3xmwYhM6YxbZY=] */
