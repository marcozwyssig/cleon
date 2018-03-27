package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDefect extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("484dda11-ff9c-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectEnvironment();
  
  // relations
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IReproducibility selectReproducibility();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IText selectResolution();
  
  public cleon.support.projectmanagement.spec.resource.persons.javamodel.IPerson selectFoundBy();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IClassification selectClassification();
  
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.defect.javamodel.IObservation selectObservation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,484dda11-ff9c-11e4-ac0a-959b440f987f,vE7CDf0GAcZ2vph3M2C4kH/oqAg=] */
