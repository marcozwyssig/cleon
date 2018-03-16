package cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Releases extends DynamicResource implements IReleases {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReleases> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReleases>() {
    
    @Override
    public IReleases create() {
      return new Releases();
    }
    
    @Override
    public IReleases create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Releases(resourceRepository, resource);
    }
  
  };

  public Releases() {
    super(IReleases.TYPE_ID);
  }
  
  public Releases(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IReleases.TYPE_ID);
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
  public java.lang.Integer selectDaysPerSprint() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Releases_daysPerSprint);
  }
    
  public void setDaysPerSprint(java.lang.Integer daysPerSprint) {
     _setSingleAttribute(cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Releases_daysPerSprint, daysPerSprint);
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

  public Releases setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectEnd() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.TimePlan_end);
  }

  public Releases setEnd(cleon.common.resources.spec.calendar.javamodel.IDay end) {
    _setSingle(cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.TimePlan_end, end);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase> selectPhases() {
    return _getList(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Releases_phases);
  }

  public Releases setPhases(java.util.List<? extends cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase> phases) {
    _setList(cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Releases_phases, phases);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.calendar.javamodel.IDay selectStart() {
    return _getSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.TimePlan_start);
  }

  public Releases setStart(cleon.common.resources.spec.calendar.javamodel.IDay start) {
    _setSingle(cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.TimePlan_start, start);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Releases setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Releases setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Releases_daysPerSprint, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.TimePlan_end, visitor);
    _acceptList(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Releases_phases, visitor);
    _acceptSingle(cleon.common.resources.spec.calendar.javamodel.IDay.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.TimePlan_start, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases selectToMePhases(cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases.class, cleon.support.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Releases_phases, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3161251a-a7d9-11e5-82dd-3b995d9c840c,yG7A7UiHo2l+ZdQqnCW3UjLtAuw=] */
