package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwarePackage extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f2dd69fc-112e-11f0-a4f9-b5f995a9e0fe");
  
  public java.lang.String selectProductName();
  
  public java.lang.String selectProductVersion();
  
  public java.lang.String selectProductDisplayName();
  
  public java.lang.String selectSetupPath();
  
  public java.lang.String selectSetupFullPath();
  
  public java.util.List<java.lang.String> selectSetupParams();
  
  public java.lang.String selectEnsureProcessNotRunning();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductVariant selectUsedProduct();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f2dd69fc-112e-11f0-a4f9-b5f995a9e0fe,VHJeAtTNVKE57NAOfoiwWPCdXqg=] */
