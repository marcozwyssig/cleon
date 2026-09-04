package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_operations.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IKeyUsage extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f3a668cb-4d10-11f0-954b-b579526ae084");
  
  public static interface IValueVoidVisitor {
    
    public void visitDigitalSignature();
    
    public void visitNonRepudiation();
    
    public void visitKeyEncipherment();
    
    public void visitDataEncipherment();
    
    public void visitKeyAgreement();
    
    public void visitKeyCertSign();
    
    public void visitCRLSign();
    
    public void visitEncipherOnly();
    
    public void visitDecipherOnly();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitDigitalSignature();
    
    public R visitNonRepudiation();
    
    public R visitKeyEncipherment();
    
    public R visitDataEncipherment();
    
    public R visitKeyAgreement();
    
    public R visitKeyCertSign();
    
    public R visitCRLSign();
    
    public R visitEncipherOnly();
    
    public R visitDecipherOnly();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isDigitalSignature();
  
  public boolean isNonRepudiation();
  
  public boolean isKeyEncipherment();
  
  public boolean isDataEncipherment();
  
  public boolean isKeyAgreement();
  
  public boolean isKeyCertSign();
  
  public boolean isCRLSign();
  
  public boolean isEncipherOnly();
  
  public boolean isDecipherOnly();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f3a668cb-4d10-11f0-954b-b579526ae084,T2V3VWkTZrfEUgIQfzJ5uaGELAM=] */
