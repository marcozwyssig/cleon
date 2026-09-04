package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMicrosoftServerLicense extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bce9f151-dfce-11ef-b0be-9b4cac321140");
  
  public static interface IValueVoidVisitor {
    
    public void visitDatacenter();
    
    public void visitStandard();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitDatacenter();
    
    public R visitStandard();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isDatacenter();
  
  public boolean isStandard();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bce9f151-dfce-11ef-b0be-9b4cac321140,jksiRJY2tDSUXMha8nG4ab6TJtM=] */
