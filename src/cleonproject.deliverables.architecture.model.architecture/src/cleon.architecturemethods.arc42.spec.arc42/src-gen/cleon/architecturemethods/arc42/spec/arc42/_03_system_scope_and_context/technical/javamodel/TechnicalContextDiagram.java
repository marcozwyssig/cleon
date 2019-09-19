package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TechnicalContextDiagram extends DynamicResource implements ITechnicalContextDiagram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalContextDiagram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITechnicalContextDiagram>() {
    
    @Override
    public ITechnicalContextDiagram create() {
      return new TechnicalContextDiagram();
    }
    
    @Override
    public ITechnicalContextDiagram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TechnicalContextDiagram(resourceRepository, resource);
    }
  
  };

  public TechnicalContextDiagram() {
    super(ITechnicalContextDiagram.TYPE_ID);
  }
  
  public TechnicalContextDiagram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITechnicalContextDiagram.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectLeftToRight() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight);
  }
    
  public void setLeftToRight(java.lang.Boolean leftToRight) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight, leftToRight);
  }

  @Override
  public java.lang.String selectPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path);
  }
    
  public void setPath(java.lang.String path) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, path);
  }

  @Override
  public java.lang.String selectScale() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale);
  }
    
  public void setScale(java.lang.String scale) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale, scale);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements);
  }

  public TechnicalContextDiagram setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext selectTechnicalContext() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalContextDiagram_technicalContext);
  }

  public TechnicalContextDiagram setTechnicalContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext technicalContext) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalContextDiagram_technicalContext, technicalContext);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TechnicalContextDiagram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_leftToRight, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_path, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.uml.spec.uml2.Uml2Package.UmlDiagram_scale, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalContextDiagram_technicalContext, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContextDiagram> selectToMeTechnicalContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContextDiagram.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.TechnicalPackage.TechnicalContextDiagram_technicalContext, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0f023427-fa45-11e8-af47-e5bdd8100025,NTz4aI1Ry91qjwEapTbJgE/+zXk=] */
