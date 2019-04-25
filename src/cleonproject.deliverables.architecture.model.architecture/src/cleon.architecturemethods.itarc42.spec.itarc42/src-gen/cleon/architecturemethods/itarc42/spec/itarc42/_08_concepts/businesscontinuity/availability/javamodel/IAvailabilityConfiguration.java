package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityConfiguration extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("21408953-1e38-11e9-865e-41ef48a95f70");
  
  public static interface IValueVoidVisitor {
    
    public void visitNone();
    
    public void visitActive__S_Active();
    
    public void visitActive__S_Passive__F___N_Failover__O_();
    
    public void visitN__Q_1();
    
    public void visitN__Q_M();
    
    public void visitN__S_to__S_1__F___N_Fallback__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitNone();
    
    public R visitActive__S_Active();
    
    public R visitActive__S_Passive__F___N_Failover__O_();
    
    public R visitN__Q_1();
    
    public R visitN__Q_M();
    
    public R visitN__S_to__S_1__F___N_Fallback__O_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isNone();
  
  public boolean isActive__S_Active();
  
  public boolean isActive__S_Passive__F___N_Failover__O_();
  
  public boolean isN__Q_1();
  
  public boolean isN__Q_M();
  
  public boolean isN__S_to__S_1__F___N_Fallback__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,21408953-1e38-11e9-865e-41ef48a95f70,kxMH08MVL0H1ZZZPcadIZl8U7Ww=] */
