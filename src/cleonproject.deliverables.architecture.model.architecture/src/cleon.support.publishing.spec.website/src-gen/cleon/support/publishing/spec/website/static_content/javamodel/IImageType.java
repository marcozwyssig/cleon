package cleon.support.publishing.spec.website.static_content.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImageType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("afb720af-afdf-11e5-a548-13e054f2d74f");
  
  public static interface IValueVoidVisitor {
    
    public void visitBMP();
    
    public void visitJPG();
    
    public void visitGIF();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitBMP();
    
    public R visitJPG();
    
    public R visitGIF();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isBMP();
  
  public boolean isJPG();
  
  public boolean isGIF();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,afb720af-afdf-11e5-a548-13e054f2d74f,tJVkuXtZjCsZX4xtrAib674fhzc=] */
