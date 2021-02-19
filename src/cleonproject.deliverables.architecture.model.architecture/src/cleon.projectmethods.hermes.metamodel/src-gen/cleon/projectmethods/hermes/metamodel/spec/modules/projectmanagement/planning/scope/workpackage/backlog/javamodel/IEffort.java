package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEffort extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("604db26f-c4d9-11e5-b41d-5d67443850a2");
  
  public static interface IValueVoidVisitor {
    
    public void visit__V_();
    
    public void visit__V___T_5();
    
    public void visit__W_();
    
    public void visit__X_();
    
    public void visit__Y_();
    
    public void visit__0_();
    
    public void visit__3_();
    
    public void visit__W_3();
    
    public void visit__X_0();
    
    public void visit__Z_0();
    
    public void visit__W_00();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__V_();
    
    public R visit__V___T_5();
    
    public R visit__W_();
    
    public R visit__X_();
    
    public R visit__Y_();
    
    public R visit__0_();
    
    public R visit__3_();
    
    public R visit__W_3();
    
    public R visit__X_0();
    
    public R visit__Z_0();
    
    public R visit__W_00();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__V_();
  
  public boolean is__V___T_5();
  
  public boolean is__W_();
  
  public boolean is__X_();
  
  public boolean is__Y_();
  
  public boolean is__0_();
  
  public boolean is__3_();
  
  public boolean is__W_3();
  
  public boolean is__X_0();
  
  public boolean is__Z_0();
  
  public boolean is__W_00();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,604db26f-c4d9-11e5-b41d-5d67443850a2,OSTf7vqT9UHKgcgqFU6AjbBql3E=] */
