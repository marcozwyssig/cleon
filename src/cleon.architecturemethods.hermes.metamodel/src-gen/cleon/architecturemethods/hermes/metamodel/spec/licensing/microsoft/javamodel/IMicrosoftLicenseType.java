package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMicrosoftLicenseType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("30588f8a-dfcb-11ef-b0be-9b4cac321140");
  
  public static interface IValueVoidVisitor {
    
    public void visitMicrosoft__F_SQL__F_Server__F_License__F_Terms();
    
    public void visitMicrosoftSoftwareLicenseTerms();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitMicrosoft__F_SQL__F_Server__F_License__F_Terms();
    
    public R visitMicrosoftSoftwareLicenseTerms();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isMicrosoft__F_SQL__F_Server__F_License__F_Terms();
  
  public boolean isMicrosoftSoftwareLicenseTerms();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,30588f8a-dfcb-11ef-b0be-9b4cac321140,N+lw3jvT1IP5m+BhfhlK8TSP8Ho=] */
