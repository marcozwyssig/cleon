package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallationState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("73a91148-f18e-11e8-b3e7-15e2dd8d9b05");
  
  public static interface IValueVoidVisitor {
    
    public void visitPresent();
    
    public void visitAbsent();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitPresent();
    
    public R visitAbsent();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isPresent();
  
  public boolean isAbsent();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,73a91148-f18e-11e8-b3e7-15e2dd8d9b05,b/H8EJfpHlaUM2Occz3h040n+KU=] */
