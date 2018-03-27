package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkItemState extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b27abc8f-cb92-11e5-b911-69bd21f5af67");
  
  public static interface IValueVoidVisitor {
    
    public void visitInput();
    
    public void visitUnderstanding();
    
    public void visitImplementing();
    
    public void visitConfirming();
    
    public void visitDone();
    
    public void visitReadyForImplement();
    
    public void visitReadyForConfirm();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitInput();
    
    public R visitUnderstanding();
    
    public R visitImplementing();
    
    public R visitConfirming();
    
    public R visitDone();
    
    public R visitReadyForImplement();
    
    public R visitReadyForConfirm();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isInput();
  
  public boolean isUnderstanding();
  
  public boolean isImplementing();
  
  public boolean isConfirming();
  
  public boolean isDone();
  
  public boolean isReadyForImplement();
  
  public boolean isReadyForConfirm();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b27abc8f-cb92-11e5-b911-69bd21f5af67,iaqXTtmXAO8StJurxWhlcOZUJFc=] */
