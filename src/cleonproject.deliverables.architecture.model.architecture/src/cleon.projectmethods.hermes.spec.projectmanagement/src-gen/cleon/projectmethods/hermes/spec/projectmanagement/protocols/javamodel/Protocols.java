package cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Protocols extends DynamicResource implements IProtocols {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocols> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocols>() {
    
    @Override
    public IProtocols create() {
      return new Protocols();
    }
    
    @Override
    public IProtocols create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Protocols(resourceRepository, resource);
    }
  
  };

  public Protocols() {
    super(IProtocols.TYPE_ID);
  }
  
  public Protocols(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProtocols.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.doc.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.doc.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public Protocols setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Protocols setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_documentLanguage);
  }

  public Protocols setDocumentLanguage(java.util.List<? extends cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.doc.spec.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.doc.doc.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.doc.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_properties);
  }

  public Protocols setProperties(cleon.common.doc.doc.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.doc.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocol> selectProtocols() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols);
  }

  public Protocols setProtocols(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocol> protocols) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols, protocols);
    return this;
  }
    
  @Override
  public cleon.common.doc.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.doc.spec.document.style.javamodel.IStyle.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_style);
  }

  public Protocols setStyle(cleon.common.doc.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Protocols setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.doc.doc.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocol.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols, visitor);
    _acceptSingle(cleon.common.doc.doc.spec.document.style.javamodel.IStyle.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocols selectToMeProtocols(cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocol object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IProtocols.class, cleon.projectmethods.hermes.spec.projectmanagement.protocols.ProtocolsPackage.Protocols_protocols, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9251a72-a7d8-11e5-82dd-3b995d9c840c,Bf6QNNVGQzKNzssVDb5raEi/vuo=] */
