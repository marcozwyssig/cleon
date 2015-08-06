package cleon.sdp.spec.project.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Defect extends DynamicResource implements IDefect {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefect> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDefect>() {
    
    @Override
    public IDefect create() {
      return new Defect();
    }
    
    @Override
    public IDefect create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Defect(resourceRepository, resource);
    }
  
  };

  public Defect() {
    super(IDefect.TYPE_ID);
  }
  
  public Defect(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDefect.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectEnvironment() {
    return _getSingleAttribute(java.lang.String.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_environment);
  }
    
  public void setEnvironment(java.lang.String environment) {
     _setSingleAttribute(cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_environment, environment);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectReference() {
    return _getSingleAttribute(java.lang.String.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_reference);
  }
    
  public void setReference(java.lang.String reference) {
     _setSingleAttribute(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_reference, reference);
  }

  // relations
  
  @Override
  public cleon.sdp.spec.project.backlog.javamodel.IText selectAnalysis() {
    return _getSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_analysis);
  }

  public Defect setAnalysis(cleon.sdp.spec.project.backlog.javamodel.IText analysis) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_analysis, analysis);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.backlog.defect.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.sdp.spec.project.backlog.defect.javamodel.IClassification.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_classification);
  }

  public Defect setClassification(cleon.sdp.spec.project.backlog.defect.javamodel.IClassification classification) {
    _setSingle(cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_classification, classification);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.backlog.javamodel.IText selectDescription() {
    return _getSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_description);
  }

  public Defect setDescription(cleon.sdp.spec.project.backlog.javamodel.IText description) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_description, description);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.javamodel.IPerson selectFoundBy() {
    return _getSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_foundBy);
  }

  public Defect setFoundBy(cleon.sdp.spec.project.javamodel.IPerson foundBy) {
    _setSingle(cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_foundBy, foundBy);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.backlog.defect.javamodel.IObservation selectObservation() {
    return _getSingle(cleon.sdp.spec.project.backlog.defect.javamodel.IObservation.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_observation);
  }

  public Defect setObservation(cleon.sdp.spec.project.backlog.defect.javamodel.IObservation observation) {
    _setSingle(cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_observation, observation);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_owner);
  }

  public Defect setOwner(cleon.sdp.spec.project.javamodel.IPerson owner) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_owner, owner);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility selectReproducibility() {
    return _getSingle(cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_reproducibility);
  }

  public Defect setReproducibility(cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility reproducibility) {
    _setSingle(cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_reproducibility, reproducibility);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.backlog.javamodel.IText selectResolution() {
    return _getSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_resolution);
  }

  public Defect setResolution(cleon.sdp.spec.project.backlog.javamodel.IText resolution) {
    _setSingle(cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_resolution, resolution);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.project.release.javamodel.ISprint selectSprint() {
    return _getSingle(cleon.sdp.spec.project.release.javamodel.ISprint.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_sprint);
  }

  public Defect setSprint(cleon.sdp.spec.project.release.javamodel.ISprint sprint) {
    _setSingle(cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_sprint, sprint);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Defect setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_environment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_reference, visitor);
    // relations
    _acceptSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_analysis, visitor);
    _acceptSingle(cleon.sdp.spec.project.backlog.defect.javamodel.IClassification.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_classification, visitor);
    _acceptSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_description, visitor);
    _acceptSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_foundBy, visitor);
    _acceptSingle(cleon.sdp.spec.project.backlog.defect.javamodel.IObservation.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_observation, visitor);
    _acceptSingle(cleon.sdp.spec.project.javamodel.IPerson.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_owner, visitor);
    _acceptSingle(cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_reproducibility, visitor);
    _acceptSingle(cleon.sdp.spec.project.backlog.javamodel.IText.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_resolution, visitor);
    _acceptSingle(cleon.sdp.spec.project.release.javamodel.ISprint.class, cleon.sdp.spec.project.backlog.BacklogPackage.WorkItem_sprint, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.project.backlog.defect.javamodel.IDefect selectToMeReproducibility(cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.project.backlog.defect.javamodel.IDefect.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_reproducibility, object.getResource());
  }
  
  public static cleon.sdp.spec.project.backlog.defect.javamodel.IDefect selectToMeResolution(cleon.sdp.spec.project.backlog.javamodel.IText object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.project.backlog.defect.javamodel.IDefect.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_resolution, object.getResource());
  }
  
  public static java.util.List<cleon.sdp.spec.project.backlog.defect.javamodel.IDefect> selectToMeFoundBy(cleon.sdp.spec.project.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.project.backlog.defect.javamodel.IDefect.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_foundBy, object.getResource());
  }
  
  public static java.util.List<cleon.sdp.spec.project.backlog.defect.javamodel.IDefect> selectToMeClassification(cleon.sdp.spec.project.backlog.defect.javamodel.IClassification object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.project.backlog.defect.javamodel.IDefect.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_classification, object.getResource());
  }
  
  public static java.util.List<cleon.sdp.spec.project.backlog.defect.javamodel.IDefect> selectToMeObservation(cleon.sdp.spec.project.backlog.defect.javamodel.IObservation object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.project.backlog.defect.javamodel.IDefect.class, cleon.sdp.spec.project.backlog.defect.DefectPackage.Defect_observation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,484dda11-ff9c-11e4-ac0a-959b440f987f,L4SG/xpZQqcGkirHHQUmOb/xJ/M=] */
