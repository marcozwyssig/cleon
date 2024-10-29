package cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssue extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.INotes, cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IAuthors, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISourceAware, cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d0da468c-bdee-11e5-965a-07bc81ea9ca9");
  
  public java.lang.String selectResolution();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcerns();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.ICategory> selectCategory();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d0da468c-bdee-11e5-965a-07bc81ea9ca9,TjL7J21zQqaX6Ls6vOU3zW27Xno=] */
