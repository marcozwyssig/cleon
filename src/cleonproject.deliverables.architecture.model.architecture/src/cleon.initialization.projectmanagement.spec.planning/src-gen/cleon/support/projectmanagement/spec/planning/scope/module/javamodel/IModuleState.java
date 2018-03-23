package cleon.support.projectmanagement.spec.planning.scope.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5b3641a5-c767-11e6-9515-3d3c9e104ed6");
  
  public static interface IValueVoidVisitor {
    
    public void visitOpen();
    
    public void visitIn__F_Progress();
    
    public void visitDone();
    
    public void visitOnHold();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitOpen();
    
    public R visitIn__F_Progress();
    
    public R visitDone();
    
    public R visitOnHold();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isOpen();
  
  public boolean isIn__F_Progress();
  
  public boolean isDone();
  
  public boolean isOnHold();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5b3641a5-c767-11e6-9515-3d3c9e104ed6,D3LE9V56xHzyjaCVMwZ6saBZx3E=] */
