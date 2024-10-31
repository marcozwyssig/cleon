package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISchedule extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("68bd338d-1e44-11e9-865e-41ef48a95f70");
  
  public static interface IValueVoidVisitor {
    
    public void visitDaily();
    
    public void visitWeekly();
    
    public void visitMonthly();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitDaily();
    
    public R visitWeekly();
    
    public R visitMonthly();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isDaily();
  
  public boolean isWeekly();
  
  public boolean isMonthly();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,68bd338d-1e44-11e9-865e-41ef48a95f70,v/u6XJqFOE9g/HK6yUEWvMQIM/Y=] */
