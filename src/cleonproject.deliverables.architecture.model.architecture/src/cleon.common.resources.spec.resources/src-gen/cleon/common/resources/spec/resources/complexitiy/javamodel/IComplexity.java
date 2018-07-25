package cleon.common.resources.spec.resources.complexitiy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComplexity extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("323a29b7-8fe7-11e8-a5b5-191902fe097a");
  
  public static interface IValueVoidVisitor {
    
    public void visitLow();
    
    public void visitMedium();
    
    public void visitHigh();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitLow();
    
    public R visitMedium();
    
    public R visitHigh();
    
  }
  
  // attributes
  
  public java.lang.Integer selectNumber();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isLow();
  
  public boolean isMedium();
  
  public boolean isHigh();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,323a29b7-8fe7-11e8-a5b5-191902fe097a,3cY/RRpBsGEbnBM/V00kXdoDstM=] */
