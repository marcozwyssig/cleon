package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILicensingDocument extends cleon.common.doc.metamodel.spec.document.javamodel.IDocument, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9f694817-dfbb-11ef-b0be-9b4cac321140");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document selectSystemArchitecture();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.ILicenseManufactoring> selectLicenseForManufactoring();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9f694817-dfbb-11ef-b0be-9b4cac321140,a9CJgrna7ab04E+VZmplpLVXvWI=] */
