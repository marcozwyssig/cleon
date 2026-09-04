package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPuppetState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("01b33e55-1b6b-11f0-9c3a-8502b2fb88fb");
  
  public static interface IValueVoidVisitor {
    
    public void visitAbsent();
    
    public void visitPresent();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitAbsent();
    
    public R visitPresent();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isAbsent();
  
  public boolean isPresent();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,01b33e55-1b6b-11f0-9c3a-8502b2fb88fb,sxAIh+ZBU+JuKl3yIhBL75EK+Dg=] */
