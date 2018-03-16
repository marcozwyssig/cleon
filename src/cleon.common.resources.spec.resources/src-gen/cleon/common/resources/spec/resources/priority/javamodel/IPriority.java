package cleon.common.resources.spec.resources.priority.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPriority extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("43a964fa-c4f3-11e5-b41d-5d67443850a2");
  
  public static interface IValueVoidVisitor {
    
    public void visitMust__F_have();
    
    public void visitShould__F_have();
    
    public void visitNice__F_to__F_have();
    
    public void visitWon__M_t__F_have();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitMust__F_have();
    
    public R visitShould__F_have();
    
    public R visitNice__F_to__F_have();
    
    public R visitWon__M_t__F_have();
    
  }
  
  // attributes
  
  public java.lang.Integer selectNumber();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isMust__F_have();
  
  public boolean isShould__F_have();
  
  public boolean isNice__F_to__F_have();
  
  public boolean isWon__M_t__F_have();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,43a964fa-c4f3-11e5-b41d-5d67443850a2,cCv8SpyY/B6LhMM586ytg2pCl00=] */
