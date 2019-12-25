package cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementsDocument extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware, cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4bcb71bd-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.about.javamodel.IEAMod_About selectAbout();
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.introduction.javamodel.IIntroduction selectIntroduction();
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.javamodel.IMotivation selectMotivation();
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.javamodel.IProjectSubjectArea selectRequirements();
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.javamodel.IDistinctions selectDestinctions();
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.sources.javamodel.ISources selectSources();
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues selectIssues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,7edKML/o/pA5XSx4rZyHoFMS6P4=] */
