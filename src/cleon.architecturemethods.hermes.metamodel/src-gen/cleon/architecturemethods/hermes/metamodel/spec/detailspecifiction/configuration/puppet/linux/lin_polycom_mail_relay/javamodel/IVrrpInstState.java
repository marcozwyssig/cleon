package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_mail_relay.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IVrrpInstState extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d7c84576-57ec-11f0-b941-05f03c57551d");
  
  public static interface IValueVoidVisitor {
    
    public void visitMaster();
    
    public void visitBackup();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitMaster();
    
    public R visitBackup();
    
  }
  
  // attributes
  
  public java.lang.Integer selectPrio();
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isMaster();
  
  public boolean isBackup();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d7c84576-57ec-11f0-b941-05f03c57551d,V+kFHDGuhLdjITv9Vh1Eq3rx5P8=] */
