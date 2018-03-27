package cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Phase extends DynamicResource implements IPhase {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPhase> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPhase>() {
    
    @Override
    public IPhase create() {
      return new Phase();
    }
    
    @Override
    public IPhase create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Phase(resourceRepository, resource);
    }
  
  };

  public Phase() {
    super(IPhase.TYPE_ID);
  }
  
  public Phase(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPhase.TYPE_ID);
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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Phase setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease> selectReleases() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease.class, cleon.initialization.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Phase_releases);
  }

  public Phase setReleases(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease> releases) {
    _setList(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Phase_releases, releases);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Phase setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Phase setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease.class, cleon.initialization.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Phase_releases, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase selectToMeReleases(cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase.class, cleon.initialization.projectmanagement.spec.planning.schedule.milestones.MilestonesPackage.Phase_releases, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bcd1f820-d719-11e6-a422-8b5491da3f30,5AEk+FFLdCcmZXatTPHvMAiH5Gk=] */
