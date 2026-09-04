package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOperatingManual extends cleon.common.doc.metamodel.spec.document.javamodel.INamedDocument, cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2844dfb3-1a32-11e9-b1cd-355f2e2f05a9");
  
  // relations
  
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.introduction.javamodel.IIntroduction selectIntroduction();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.systemoverview.javamodel.ISystemOverview selectSystemOverview();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.IOperation> selectOperations();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.ISupportOrganization selectSupportOrganizsation();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.safety.javamodel.ISafetyRegulations selectSafetyRegulations();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.coverage.javamodel.IOperationRequirementsCoverages selectRequirementsCoverage();
  
  public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document selectSystemArchitecture();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2844dfb3-1a32-11e9-b1cd-355f2e2f05a9,BE5/un4A4GHeVDRJAZ2tm1y1Zyk=] */
