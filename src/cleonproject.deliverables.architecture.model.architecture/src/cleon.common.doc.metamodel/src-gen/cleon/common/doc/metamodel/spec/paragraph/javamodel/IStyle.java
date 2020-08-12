package cleon.common.doc.metamodel.spec.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStyle extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6d04db3c-dcb4-11ea-b5f8-77c3980a1d0a");
  
  public static interface IValueVoidVisitor {
    
    public void visitBold();
    
    public void visitItalic();
    
    public void visitUnderline();
    
    public void visitStriketrough();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitBold();
    
    public R visitItalic();
    
    public R visitUnderline();
    
    public R visitStriketrough();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isBold();
  
  public boolean isItalic();
  
  public boolean isUnderline();
  
  public boolean isStriketrough();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6d04db3c-dcb4-11ea-b5f8-77c3980a1d0a,n97AyZtL0j9b+4OhgKngfrO0MwE=] */
