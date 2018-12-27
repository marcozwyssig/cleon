package cleon.common.resources.spec.resources.image.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IImageType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("afb720af-afdf-11e5-a548-13e054f2d74f");
  
  public static interface IValueVoidVisitor {
    
    public void visitGIF();
    
    public void visitSVG();
    
    public void visitPNG();
    
    public void visitJPG();
    
    public void visitBMP();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitGIF();
    
    public R visitSVG();
    
    public R visitPNG();
    
    public R visitJPG();
    
    public R visitBMP();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isGIF();
  
  public boolean isSVG();
  
  public boolean isPNG();
  
  public boolean isJPG();
  
  public boolean isBMP();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,afb720af-afdf-11e5-a548-13e054f2d74f,CxWPyO7dHrFIoyjUb651WdQz3yY=] */
