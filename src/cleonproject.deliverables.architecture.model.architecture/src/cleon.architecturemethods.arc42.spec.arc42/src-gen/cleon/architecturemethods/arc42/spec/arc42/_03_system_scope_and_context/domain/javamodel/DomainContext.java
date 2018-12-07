package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DomainContext extends DynamicResource implements IDomainContext {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainContext> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainContext>() {
    
    @Override
    public IDomainContext create() {
      return new DomainContext();
    }
    
    @Override
    public IDomainContext create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DomainContext(resourceRepository, resource);
    }
  
  };

  public DomainContext() {
    super(IDomainContext.TYPE_ID);
  }
  
  public DomainContext(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDomainContext.TYPE_ID);
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
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor> selectActors() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_actors);
  }

  public DomainContext setActors(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor> actors) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_actors, actors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public DomainContext setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow> selectFlows() {
    return _getList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_flows);
  }

  public DomainContext setFlows(java.util.List<? extends cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow> flows) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_flows, flows);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DomainContext setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_actors, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_flows, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext selectToMeActors(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IActor object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_actors, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext selectToMeFlows(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainFlow object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.DomainPackage.DomainContext_flows, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,98021cfc-2660-11e6-ae54-e50d44645ae7,mzRkPi9CjKHZOpELp1ckp30G7PM=] */
