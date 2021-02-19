package cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ILicenseType extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3ed0e011-29a9-11eb-8baa-95d9107006e8");
  
  public static interface IValueVoidVisitor {
    
    public void visitFree__F_Software__F_and__F_Open__F_Source();
    
    public void visitCore__S_Based();
    
    public void visitSocket__S_based();
    
    public void visitMachine__S_based();
    
    public void visitConcurrent__S_User();
    
    public void visitNamed__S_User();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitFree__F_Software__F_and__F_Open__F_Source();
    
    public R visitCore__S_Based();
    
    public R visitSocket__S_based();
    
    public R visitMachine__S_based();
    
    public R visitConcurrent__S_User();
    
    public R visitNamed__S_User();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isFree__F_Software__F_and__F_Open__F_Source();
  
  public boolean isCore__S_Based();
  
  public boolean isSocket__S_based();
  
  public boolean isMachine__S_based();
  
  public boolean isConcurrent__S_User();
  
  public boolean isNamed__S_User();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3ed0e011-29a9-11eb-8baa-95d9107006e8,2bxe5azh/fKXmDiva7XFt7oAhJs=] */
