package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityConfiguration extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8d623900-c93b-11eb-adc4-d18d1353eb6e");
  
  public static interface IValueVoidVisitor {
    
    public void visitNone();
    
    public void visitActive__S_Active();
    
    public void visitActive__S_Passive__F___N_Failover__O_();
    
    public void visitSicherung__F_und__F_Wiederherstellung();
    
    public void visitRedundante__F_Sicherung__F_und__F_Wiederherstellung();
    
    public void visitReplikation();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitNone();
    
    public R visitActive__S_Active();
    
    public R visitActive__S_Passive__F___N_Failover__O_();
    
    public R visitSicherung__F_und__F_Wiederherstellung();
    
    public R visitRedundante__F_Sicherung__F_und__F_Wiederherstellung();
    
    public R visitReplikation();
    
  }
  
  // attributes
  
  public java.util.List<java.lang.String> selectStandardDescription();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isNone();
  
  public boolean isActive__S_Active();
  
  public boolean isActive__S_Passive__F___N_Failover__O_();
  
  public boolean isSicherung__F_und__F_Wiederherstellung();
  
  public boolean isRedundante__F_Sicherung__F_und__F_Wiederherstellung();
  
  public boolean isReplikation();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8d623900-c93b-11eb-adc4-d18d1353eb6e,7RqIaP1vv/tdhZqewnyON8Vh4x0=] */
