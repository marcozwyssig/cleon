package cleon.conception.architecture.spec.eamod.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssue extends cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.conception.architecture.spec.eamod.chrv.javamodel.INotes, cleon.common.doc.spec.doc.document.properties.member.javamodel.IAuthors, cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISourceAware, cleon.common.resources.spec.resources.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d0da468c-bdee-11e5-965a-07bc81ea9ca9");
  
  public java.lang.String selectResolution();
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcerns();
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.ICategory> selectCategory();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d0da468c-bdee-11e5-965a-07bc81ea9ca9,d9yO+CBDmMkX31gI5NlYVUSqb20=] */
