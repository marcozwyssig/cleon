package cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbsenseReason extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9314d460-c4c7-11e5-8558-4b8affb7767c");
  
  public static interface IValueVoidVisitor {
    
    public void visitVacation();
    
    public void visitEducation();
    
    public void visitFree();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitVacation();
    
    public R visitEducation();
    
    public R visitFree();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isVacation();
  
  public boolean isEducation();
  
  public boolean isFree();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9314d460-c4c7-11e5-8558-4b8affb7767c,4HtVL503+B2wzy2Wt2NWvJ/G1jo=] */
