package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IKeyType extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("31a1ccf7-4d13-11f0-954b-b579526ae084");
  
  public static interface IValueVoidVisitor {
    
    public void visitRSA();
    
    public void visitEC();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitRSA();
    
    public R visitEC();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isRSA();
  
  public boolean isEC();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,31a1ccf7-4d13-11f0-954b-b579526ae084,sz61ZaDMfP05fMDJW6yeC3VLIpM=] */
