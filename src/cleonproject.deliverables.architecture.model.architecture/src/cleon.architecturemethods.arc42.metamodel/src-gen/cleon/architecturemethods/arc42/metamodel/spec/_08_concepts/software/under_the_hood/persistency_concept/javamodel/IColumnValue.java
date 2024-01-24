package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IColumnValue extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f46c2d4f-ba0f-11ee-876d-0f01c87670c8");
  
  public static interface IValueVoidVisitor {
    
    public void visit__W___F___S___F_2_aD_12();
    
    public void visit__W___F___S___F_2_aD_32();
    
    public void visit__W___F___S___F_2_aD_64();
    
    public void visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
    
    public void visitJSON();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visit__W___F___S___F_2_aD_12();
    
    public R visit__W___F___S___F_2_aD_32();
    
    public R visit__W___F___S___F_2_aD_64();
    
    public R visit__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
    
    public R visitJSON();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean is__W___F___S___F_2_aD_12();
  
  public boolean is__W___F___S___F_2_aD_32();
  
  public boolean is__W___F___S___F_2_aD_64();
  
  public boolean is__V___F___8___F_FALSE__6___F_1__F___8___F_TRUE();
  
  public boolean isJSON();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f46c2d4f-ba0f-11ee-876d-0f01c87670c8,65KAeTDk7qyf8fKX/wBnhXHVAxE=] */
