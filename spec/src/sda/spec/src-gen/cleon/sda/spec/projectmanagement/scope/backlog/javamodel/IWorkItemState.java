package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkItemState extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b27abc8f-cb92-11e5-b911-69bd21f5af67");
  
  public static interface IValueVoidVisitor {
    
    public void visitInput();
    
    public void visitUnderstand();
    
    public void visitImplement();
    
    public void visitConfirm();
    
    public void visitDone();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitInput();
    
    public R visitUnderstand();
    
    public R visitImplement();
    
    public R visitConfirm();
    
    public R visitDone();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isInput();
  
  public boolean isUnderstand();
  
  public boolean isImplement();
  
  public boolean isConfirm();
  
  public boolean isDone();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b27abc8f-cb92-11e5-b911-69bd21f5af67,c/0I2IscW3RiWXSpAVvWuc0o9d0=] */
