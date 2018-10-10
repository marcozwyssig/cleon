package cleon.architecturemethods.eamod.spec.eamod.nsov.v1.nsov.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Ein Service beschreibt eine Funktionalität, welche einen Beitrag zur
 * Realisierung von Fähigkeiten
 * leisten kann. Services beschränken sich nicht auf implementierte Services (z. B.
 * im Rahmen einer
 * SOA), der Begriff "Service" ist sehr viel allgemeiner zu verstehen: Ein Service
 * muss nicht
 * notwendigerweise von einem Computersystem erbracht werden. Services können
 * durchaus auch
 * von Menschen angeboten und ausgeführt werden.
 * Grundsätzlich können zwei Arten von Services unterschieden werden:
 *  Klassen von Services und Gruppierungen von Services.
 *  Implementierte und implementierbare Services.
 * Die NSOV-1 erlaubt die Erstellung einer Taxonomie von Services. Diese
 * Servicetaxonomie setzt
 * sich ausschliesslich aus Klassen von Services oder Gruppierungen von Services
 * zusammen.
 * Implementierte oder implementierbare Services sind also nicht Teil der
 * Servicetaxonomie. Unter
 * Verwendung von Hilfsdiagrammen können diese jedoch mit den Services der
 * Servicetaxonomie
 * verlinkt werden. Die Servicetaxonomie kann also als Ordnungsrahmen zur
 * Klassifikation von
 * Services angesehen werden.
 */
public interface IService extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("df40cec4-bc84-11e6-b169-a12bde5a1c7c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.ncv.javamodel.ICapability> selectServiceAimsToAchieve();
  
  public java.util.List<? extends cleon.common.resources.spec.resources.availability.javamodel.IAvailabilityClassification> selectAvailabilityClassification();
  
  public java.util.List<? extends cleon.common.resources.spec.resources.confidentiality.javamodel.IConfidentialityClassification> selectConfidentialityClassification();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v1.nsov.javamodel.IService> selectServiceGeneralisation();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v1.nsov.javamodel.IService> selectServiceComposition();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.eamod.nsov.v1.lifetime.javamodel.IAvailabilityLifetime> selectAvailabilityLifetime();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,df40cec4-bc84-11e6-b169-a12bde5a1c7c,+6LEoZAcSttCTfsvPdV1ahNv5d4=] */
