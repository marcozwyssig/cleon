package cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Stakeholders extends DynamicResource implements IStakeholders {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStakeholders> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStakeholders>() {
    
    @Override
    public IStakeholders create() {
      return new Stakeholders();
    }
    
    @Override
    public IStakeholders create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Stakeholders(resourceRepository, resource);
    }
  
  };

  public Stakeholders() {
    super(IStakeholders.TYPE_ID);
  }
  
  public Stakeholders(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStakeholders.TYPE_ID);
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

  public Stakeholders setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> selectStakeholders() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.Stakeholders_stakeholders);
  }

  public Stakeholders setStakeholders(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> stakeholders) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.Stakeholders_stakeholders, stakeholders);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Stakeholders setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.Stakeholders_stakeholders, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders selectToMeStakeholders(cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders.class, cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.Stakeholders_stakeholders, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,256574f0-06d7-11e6-8d3e-13e5be4bd43b,NxDY3fkDNPE94EA/mdw0cbyNHt0=] */
