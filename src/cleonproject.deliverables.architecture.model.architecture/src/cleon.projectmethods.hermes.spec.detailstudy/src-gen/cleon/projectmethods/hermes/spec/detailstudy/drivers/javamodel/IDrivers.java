package cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDrivers extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("877f094b-3c14-11e5-9962-cf3035adb922");
  
  // relations
  
  public cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.IContext selectContext();
  
  public cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriterias selectKnockoutCriterias();
  
  public cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriterias selectWeightingCriterias();
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.detailstudy.drivers.javamodel.ISource> selectSources();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,877f094b-3c14-11e5-9962-cf3035adb922,ExJ7E/KWpsWSrjdm5K5FAgD6Uyg=] */
