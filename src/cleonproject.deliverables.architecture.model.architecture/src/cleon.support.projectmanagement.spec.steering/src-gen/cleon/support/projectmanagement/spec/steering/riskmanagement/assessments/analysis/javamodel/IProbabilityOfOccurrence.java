package cleon.support.projectmanagement.spec.steering.riskmanagement.assessments.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProbabilityOfOccurrence extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9957e084-2eff-11e6-8bd9-a77b8d2a3a0e");
  
  public static interface IValueVoidVisitor {
    
    public void visit__W_();
    
    public void visit__X_();
    
    public void visit__Y_();
    
    public void visit__Z_();
    
    public void visit__0_();
    
    public void visit__1_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__W_();
    
    public R visit__X_();
    
    public R visit__Y_();
    
    public R visit__Z_();
    
    public R visit__0_();
    
    public R visit__1_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__W_();
  
  public boolean is__X_();
  
  public boolean is__Y_();
  
  public boolean is__Z_();
  
  public boolean is__0_();
  
  public boolean is__1_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9957e084-2eff-11e6-8bd9-a77b8d2a3a0e,lv+OfPrqHv5lemte4BiJgBLT7Ng=] */
