package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInterfaceType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9aa83a3b-878f-11e9-a61b-279ebde48b48");
  
  public static interface IValueVoidVisitor {
    
    public void visitINT();
    
    public void visitEXT();
    
    public void visitMGMT();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitINT();
    
    public R visitEXT();
    
    public R visitMGMT();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isINT();
  
  public boolean isEXT();
  
  public boolean isMGMT();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9aa83a3b-878f-11e9-a61b-279ebde48b48,R5tnHQz8ZWin2mpriU692cQtqkw=] */
