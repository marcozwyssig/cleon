package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Principles extends DynamicResource implements IPrinciples {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrinciples> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPrinciples>() {
    
    @Override
    public IPrinciples create() {
      return new Principles();
    }
    
    @Override
    public IPrinciples create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Principles(resourceRepository, resource);
    }
  
  };

  public Principles() {
    super(IPrinciples.TYPE_ID);
  }
  
  public Principles(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPrinciples.TYPE_ID);
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

  public Principles setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple> selectPrinciples() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.PrinciplesPackage.Principles_principles);
  }

  public Principles setPrinciples(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple> principles) {
    _setList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.PrinciplesPackage.Principles_principles, principles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Principles setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.PrinciplesPackage.Principles_principles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples selectToMePrinciples(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.PrinciplesPackage.Principles_principles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5d54c5db-a951-11e5-bda2-a7fc3bd7c783,RFDl3O1G4/CHAdQLWeEFipPErlc=] */
