package cleon.common.doc.spec.doc.document.properties.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IClassification extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d92db665-47f5-11e6-b388-8539f6ff7310");
  
  public static interface IValueVoidVisitor {
    
    public void visitINTERN();
    
    public void visitVERTRAULICH();
    
    public void visitGEHEIM();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitINTERN();
    
    public R visitVERTRAULICH();
    
    public R visitGEHEIM();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isINTERN();
  
  public boolean isVERTRAULICH();
  
  public boolean isGEHEIM();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d92db665-47f5-11e6-b388-8539f6ff7310,FAdjygJoal07HTfKwbFBQMO4+Uk=] */
