package cleon.common.resources.spec.resources.importance.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImportance extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("948ee30d-3cfe-11e5-871f-6beac6a7c24b");
  
  public static interface IValueVoidVisitor {
    
    public void visit__0_();
    
    public void visit__Y_();
    
    public void visit__W_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__0_();
    
    public R visit__Y_();
    
    public R visit__W_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__0_();
  
  public boolean is__Y_();
  
  public boolean is__W_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,948ee30d-3cfe-11e5-871f-6beac6a7c24b,MqIypfKAGO/TumKUzeiLQZdJimg=] */
