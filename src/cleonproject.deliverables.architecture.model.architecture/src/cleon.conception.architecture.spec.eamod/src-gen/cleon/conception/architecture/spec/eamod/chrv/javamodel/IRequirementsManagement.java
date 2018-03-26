package cleon.conception.architecture.spec.eamod.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementsManagement extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument, cleon.conception.architecture.spec.eamod.chrv.javamodel.IRequirementDocument, cleon.common.resources.spec.resources.outcomes.javamodel.IDocumentation, cleon.common.glossary.spec.glossary.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4bcb71bd-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public cleon.conception.architecture.spec.eamod.chrv.introduction.javamodel.IIntroduction selectIntroduction();
  
  public cleon.conception.architecture.spec.eamod.chrv.motivation.javamodel.IMotivation selectMotivation();
  
  public cleon.conception.architecture.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea selectRequirements();
  
  public cleon.conception.architecture.spec.eamod.chrv.distinction.javamodel.IDistinctions selectDestinctions();
  
  public cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssues selectIssues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,t2a5xWcbKiJKICkDQdRnysuGpr4=] */
