package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUserLicenseValidity extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("de4f3129-dfd3-11ef-b0be-9b4cac321140");
  
  public static interface IValueVoidVisitor {
    
    public void visitPerpetual();
    
    public void visitSubscription__S_Based();
    
    public void visitTime__S_Limited__F___N_Trial__U_Demo__O_();
    
    public void visitPay__S_Per__S_Use();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitPerpetual();
    
    public R visitSubscription__S_Based();
    
    public R visitTime__S_Limited__F___N_Trial__U_Demo__O_();
    
    public R visitPay__S_Per__S_Use();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isPerpetual();
  
  public boolean isSubscription__S_Based();
  
  public boolean isTime__S_Limited__F___N_Trial__U_Demo__O_();
  
  public boolean isPay__S_Per__S_Use();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,de4f3129-dfd3-11ef-b0be-9b4cac321140,76mM452gvUBKH9xYIzQIa2oiXec=] */
