package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWhitebox extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1551fb66-2857-11e8-9af4-b7d7a3bbddc1");
  
  // relations
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectWhitebox();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality selectFunctionality();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment selectDeployment();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailability selectAvailability();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthentication selectAuthn();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorization selectAuthz();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IConfidentiality selectConfidentialy();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IIntegrity selectIntegrity();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.INonRepudiation selectNonRepudiation();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IMonitoring> selectMonitoring();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBackup_and_Recovery> selectBackup();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAccess selectAccess();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IUsedProduct> selectUsedProducts();
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IChapter> selectChapters();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox> selectBlackboxes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1551fb66-2857-11e8-9af4-b7d7a3bbddc1,K/8mc8+lXKR1H0KRuCACQTvyV+k=] */
