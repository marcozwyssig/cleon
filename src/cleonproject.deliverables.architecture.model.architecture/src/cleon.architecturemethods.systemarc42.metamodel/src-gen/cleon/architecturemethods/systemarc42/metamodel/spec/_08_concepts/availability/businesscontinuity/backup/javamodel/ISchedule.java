package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISchedule extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8d626043-c93b-11eb-adc4-d18d1353eb6e");
  
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

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8d626043-c93b-11eb-adc4-d18d1353eb6e,BG7cdEJVPsothsuQgmv3CVg0dio=] */
