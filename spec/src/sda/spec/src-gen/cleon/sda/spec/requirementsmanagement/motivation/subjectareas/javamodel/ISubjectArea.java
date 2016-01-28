package cleon.sda.spec.requirementsmanagement.motivation.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubjectArea extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.javamodel.ISimpleDescription, cleon.sda.spec.requirementsmanagement.javamodel.INotes, cleon.sda.spec.javamodel.IBusinessObjectId, cleon.doc.spec.autor.javamodel.IAutors {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("010e5bac-bf5d-11e5-a56a-35b34376b412");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.goals.javamodel.IGoal> selectAppliesTo();
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel.IDriver> selectAdresses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,010e5bac-bf5d-11e5-a56a-35b34376b412,QkCTJBLQFyji3nH1eY+uxdJyzo0=] */
