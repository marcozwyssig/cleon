package cleon.conception.eamod.spec.nsov.v1.lifetime.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceLifetime extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription, cleon.common.resources.spec.resources.naming.javamodel.IShortName {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8710140c-c149-11e6-8f58-ad3c6ee7602f");
  
  public static interface IValueVoidVisitor {
    
    public void visitNA__F___S___F_NotAvailable();
    
    public void visitPL__F___S___F_Planned();
    
    public void visitGA__F___S___F_General__F_Availability();
    
    public void visitEOL__F___S___F_EndOfLife();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitNA__F___S___F_NotAvailable();
    
    public R visitPL__F___S___F_Planned();
    
    public R visitGA__F___S___F_General__F_Availability();
    
    public R visitEOL__F___S___F_EndOfLife();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isNA__F___S___F_NotAvailable();
  
  public boolean isPL__F___S___F_Planned();
  
  public boolean isGA__F___S___F_General__F_Availability();
  
  public boolean isEOL__F___S___F_EndOfLife();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8710140c-c149-11e6-8f58-ad3c6ee7602f,RriHWLpRozJcE3ZjSiUJ4+bre4Y=] */
