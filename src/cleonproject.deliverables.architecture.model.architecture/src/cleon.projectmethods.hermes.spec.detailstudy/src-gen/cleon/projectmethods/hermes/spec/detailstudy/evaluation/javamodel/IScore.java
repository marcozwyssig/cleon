package cleon.projectmethods.hermes.spec.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScore extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b606e74b-3c1a-11e5-9962-cf3035adb922");
  
  public static interface IValueVoidVisitor {
    
    public void visit__V_();
    
    public void visit__X_();
    
    public void visit__Y_();
    
    public void visit__0_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__V_();
    
    public R visit__X_();
    
    public R visit__Y_();
    
    public R visit__0_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__V_();
  
  public boolean is__X_();
  
  public boolean is__Y_();
  
  public boolean is__0_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b606e74b-3c1a-11e5-9962-cf3035adb922,pKgtrM3xkrdom37itp2K/GKy3TQ=] */
