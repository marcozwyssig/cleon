package cleon.architecturemethods.hermes.metamodel.spec.licensing.vmware.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVMwarevSphereLicense extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4257c37f-e4a1-11ef-a6bd-497168f25adc");
  
  public static interface IValueVoidVisitor {
    
    public void visitFree();
    
    public void visitEssentials();
    
    public void visitStandard();
    
    public void visitEssentials__F_Plus();
    
    public void visitEnterprise__F_Plus();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitFree();
    
    public R visitEssentials();
    
    public R visitStandard();
    
    public R visitEssentials__F_Plus();
    
    public R visitEnterprise__F_Plus();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isFree();
  
  public boolean isEssentials();
  
  public boolean isStandard();
  
  public boolean isEssentials__F_Plus();
  
  public boolean isEnterprise__F_Plus();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4257c37f-e4a1-11ef-a6bd-497168f25adc,Y4tLF11lJNjnvFPdtYJBrY4ge+g=] */
