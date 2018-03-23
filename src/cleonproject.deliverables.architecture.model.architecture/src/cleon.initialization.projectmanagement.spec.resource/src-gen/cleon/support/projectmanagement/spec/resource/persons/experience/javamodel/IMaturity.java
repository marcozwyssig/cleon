package cleon.support.projectmanagement.spec.resource.persons.experience.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMaturity extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b802c383-b509-11e5-aa95-235930e9af3d");
  
  public static interface IValueVoidVisitor {
    
    public void visit__0___F___S___F_Senior();
    
    public void visit__Y___F___S___F_Professional();
    
    public void visit__W___F___S___F_Junior();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__0___F___S___F_Senior();
    
    public R visit__Y___F___S___F_Professional();
    
    public R visit__W___F___S___F_Junior();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__0___F___S___F_Senior();
  
  public boolean is__Y___F___S___F_Professional();
  
  public boolean is__W___F___S___F_Junior();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b802c383-b509-11e5-aa95-235930e9af3d,fwdzSeAmyBtw7+YS8rxbcLtIybw=] */
