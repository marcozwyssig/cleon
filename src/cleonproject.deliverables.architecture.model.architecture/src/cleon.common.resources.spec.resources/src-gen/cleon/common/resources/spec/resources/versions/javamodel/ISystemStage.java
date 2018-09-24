package cleon.common.resources.spec.resources.versions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemStage extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.common.resources.spec.resources.naming.javamodel.IShortName {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("21bbfa64-bfea-11e8-a3d0-5394fd9291a1");
  
  public static interface IValueVoidVisitor {
    
    public void visitPre__S_alpha__F___N_PA__O_();
    
    public void visitAlpha__F___N_A__O_();
    
    public void visitBeta__F___N_B__O_();
    
    public void visitRelease__F_candidate__F___N_RC__O_();
    
    public void visitRelease__F_to__F_manufacturing__F___N_RTM__O_();
    
    public void visitGeneral__F_availability__F___N_GA__O___F___N_GA__O_();
    
    public void visitEnd__S_of__S_life__F___N_EOL__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitPre__S_alpha__F___N_PA__O_();
    
    public R visitAlpha__F___N_A__O_();
    
    public R visitBeta__F___N_B__O_();
    
    public R visitRelease__F_candidate__F___N_RC__O_();
    
    public R visitRelease__F_to__F_manufacturing__F___N_RTM__O_();
    
    public R visitGeneral__F_availability__F___N_GA__O___F___N_GA__O_();
    
    public R visitEnd__S_of__S_life__F___N_EOL__O_();
    
  }
  
  // attributes
  
  public java.lang.String selectShortSystemName();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isPre__S_alpha__F___N_PA__O_();
  
  public boolean isAlpha__F___N_A__O_();
  
  public boolean isBeta__F___N_B__O_();
  
  public boolean isRelease__F_candidate__F___N_RC__O_();
  
  public boolean isRelease__F_to__F_manufacturing__F___N_RTM__O_();
  
  public boolean isGeneral__F_availability__F___N_GA__O___F___N_GA__O_();
  
  public boolean isEnd__S_of__S_life__F___N_EOL__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,21bbfa64-bfea-11e8-a3d0-5394fd9291a1,dkHbhgBZDgEa7xLrHlRfV5fXX6M=] */
