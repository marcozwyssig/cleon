package cleon.common.calendar.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWeekday extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("337972be-4861-11f0-ab73-2116b4504ace");
  
  public static interface IValueVoidVisitor {
    
    public void visitMonday();
    
    public void visitTuesday();
    
    public void visitWednesday();
    
    public void visitThursday();
    
    public void visitFriday();
    
    public void visitSaturday();
    
    public void visitSunday();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitMonday();
    
    public R visitTuesday();
    
    public R visitWednesday();
    
    public R visitThursday();
    
    public R visitFriday();
    
    public R visitSaturday();
    
    public R visitSunday();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isMonday();
  
  public boolean isTuesday();
  
  public boolean isWednesday();
  
  public boolean isThursday();
  
  public boolean isFriday();
  
  public boolean isSaturday();
  
  public boolean isSunday();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,337972be-4861-11f0-ab73-2116b4504ace,SIKVZrC8R79bbGqPgSxeusiA/9I=] */
