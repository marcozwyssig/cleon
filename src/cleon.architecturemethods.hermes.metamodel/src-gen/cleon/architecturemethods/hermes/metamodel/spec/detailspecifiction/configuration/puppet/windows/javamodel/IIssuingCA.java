package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssuingCA extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b086d6cf-04af-11f0-8e81-9be04e08660a");
  
  // attributes
  
  public java.lang.String selectCaCADistinguishedNameSuffix();
  
  public java.lang.String selectCaCryptoProviderName();
  
  public java.lang.Integer selectCaValidityPeriodUnits_aE__aA_Year_aC_();
  
  public java.lang.Integer selectCaKeyLength();
  
  public java.lang.String selectCaHashAlgorithmName();
  
  public java.lang.Integer selectCaCRLDeltaPeriodUnits_aE__aA_Days_aC_();
  
  public java.lang.Integer selectCaCRLPeriodUnits();
  
  public java.lang.Integer selectCaAuditFilter();
  
  public java.lang.String selectGmsa();
  
  public java.lang.String selectRepeatinterval();
  
  public java.lang.String selectExportToUncPathCer();
  
  public java.lang.String selectExportToUncPathCrl();
  
  public java.lang.String selectExportToUncPathCsr();
  
  public java.lang.String selectTemplateUncPath();
  
  public java.lang.Boolean selectCaExplicitIssuing();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b086d6cf-04af-11f0-8e81-9be04e08660a,txulNTnUrq99jlislHqwCFusEEc=] */
