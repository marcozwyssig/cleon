package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IYamlType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3ad16077-9538-11ec-9b36-7d300415c806");
  
  public static interface IValueVoidVisitor {
    
    public void visitNMS();
    
    public void visitTN();
    
    public void visitNMSandTN();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitNMS();
    
    public R visitTN();
    
    public R visitNMSandTN();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isNMS();
  
  public boolean isTN();
  
  public boolean isNMSandTN();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3ad16077-9538-11ec-9b36-7d300415c806,h4urmL45hBm0Vo//wil7MrN3GVM=] */
