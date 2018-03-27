package cleon.conception.testing.spec.testing._05_test_constraints._02_failureclass.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFailureClass extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("882921f6-1db2-11e6-974b-630b7f5d3b95");
  
  public static interface IValueVoidVisitor {
    
    public void visit__W___F___S___F_Unwesentlicher__F_Mangel();
    
    public void visit__X___F___S___F_Leichter__F_Mangel();
    
    public void visit__Y___F___S___F_Schwerer__F_Mangel();
    
    public void visit__Z___F___S___F_Kritischer__F_Mangel();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__W___F___S___F_Unwesentlicher__F_Mangel();
    
    public R visit__X___F___S___F_Leichter__F_Mangel();
    
    public R visit__Y___F___S___F_Schwerer__F_Mangel();
    
    public R visit__Z___F___S___F_Kritischer__F_Mangel();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__W___F___S___F_Unwesentlicher__F_Mangel();
  
  public boolean is__X___F___S___F_Leichter__F_Mangel();
  
  public boolean is__Y___F___S___F_Schwerer__F_Mangel();
  
  public boolean is__Z___F___S___F_Kritischer__F_Mangel();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,882921f6-1db2-11e6-974b-630b7f5d3b95,wZ8sDvdfgTEO3iyFw41knZeO384=] */
