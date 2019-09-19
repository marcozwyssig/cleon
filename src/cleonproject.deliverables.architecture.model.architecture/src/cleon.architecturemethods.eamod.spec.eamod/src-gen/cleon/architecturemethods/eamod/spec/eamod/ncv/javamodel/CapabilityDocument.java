package cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CapabilityDocument extends DynamicResource implements ICapabilityDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapabilityDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapabilityDocument>() {
    
    @Override
    public ICapabilityDocument create() {
      return new CapabilityDocument();
    }
    
    @Override
    public ICapabilityDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CapabilityDocument(resourceRepository, resource);
    }
  
  };

  public CapabilityDocument() {
    super(ICapabilityDocument.TYPE_ID);
  }
  
  public CapabilityDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapabilityDocument.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public CapabilityDocument setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public CapabilityDocument setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public CapabilityDocument setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public CapabilityDocument setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability selectRootCapability() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.CapabilityDocument_rootCapability);
  }

  public CapabilityDocument setRootCapability(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability rootCapability) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.CapabilityDocument_rootCapability, rootCapability);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public CapabilityDocument setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CapabilityDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.CapabilityDocument_rootCapability, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapabilityDocument selectToMeRootCapability(cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapabilityDocument.class, cleon.architecturemethods.eamod.spec.eamod.ncv.NcvPackage.CapabilityDocument_rootCapability, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,40249800-ea1d-11e6-9264-5588938e0d2c,e41QoW0/gaCF72MVlPivQ6lRgIk=] */
