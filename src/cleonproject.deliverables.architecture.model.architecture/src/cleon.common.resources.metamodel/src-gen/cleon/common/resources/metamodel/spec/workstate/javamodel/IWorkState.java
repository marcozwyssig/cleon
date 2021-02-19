package cleon.common.resources.metamodel.spec.workstate.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8f138d00-c58a-11e5-aeea-1db9268c0ee9");
  
  public static interface IValueVoidVisitor {
    
    public void visitOpen();
    
    public void visitIn__F_Progress();
    
    public void visitDone();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitOpen();
    
    public R visitIn__F_Progress();
    
    public R visitDone();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isOpen();
  
  public boolean isIn__F_Progress();
  
  public boolean isDone();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8f138d00-c58a-11e5-aeea-1db9268c0ee9,3nB2w2WDss9eoHChf5F0GhHeA9w=] */
