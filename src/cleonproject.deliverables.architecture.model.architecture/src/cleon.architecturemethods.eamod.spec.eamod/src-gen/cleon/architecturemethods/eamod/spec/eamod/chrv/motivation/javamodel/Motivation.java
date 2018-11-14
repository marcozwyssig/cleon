package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Motivation extends DynamicResource implements IMotivation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMotivation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMotivation>() {
    
    @Override
    public IMotivation create() {
      return new Motivation();
    }
    
    @Override
    public IMotivation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Motivation(resourceRepository, resource);
    }
  
  };

  public Motivation() {
    super(IMotivation.TYPE_ID);
  }
  
  public Motivation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMotivation.TYPE_ID);
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

  public Motivation setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.drivers.javamodel.IDrivers selectDrivers() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.drivers.javamodel.IDrivers.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_drivers);
  }

  public Motivation setDrivers(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.drivers.javamodel.IDrivers drivers) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_drivers, drivers);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoals selectGoals() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoals.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_goals);
  }

  public Motivation setGoals(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoals goals) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_goals, goals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples selectPrinciples() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_principles);
  }

  public Motivation setPrinciples(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples principles) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_principles, principles);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders selectStakeholders() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_stakeholders);
  }

  public Motivation setStakeholders(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders stakeholders) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_stakeholders, stakeholders);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Motivation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.drivers.javamodel.IDrivers.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_drivers, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoals.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_goals, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_principles, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_stakeholders, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation selectToMeDrivers(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.drivers.javamodel.IDrivers object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_drivers, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation selectToMeGoals(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.goals.javamodel.IGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_goals, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation selectToMePrinciples(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciples object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_principles, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation selectToMeStakeholders(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholders object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.MotivationPackage.Motivation_stakeholders, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c7277d8d-a950-11e5-bda2-a7fc3bd7c783,Nnmw+e3S5i4KYj844Nxejh4G27Q=] */
