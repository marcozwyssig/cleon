package cleon.support.projectmanagement.spec.steering.controlling.module.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleLampState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("60427122-3386-11e6-b251-57783f5929b3");
  
  public static interface IValueVoidVisitor {
    
    public void visitRed();
    
    public void visitYellow();
    
    public void visitGreen();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitRed();
    
    public R visitYellow();
    
    public R visitGreen();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isRed();
  
  public boolean isYellow();
  
  public boolean isGreen();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,60427122-3386-11e6-b251-57783f5929b3,2MFzuD7ws56GoamT9fNDEPxiy44=] */
