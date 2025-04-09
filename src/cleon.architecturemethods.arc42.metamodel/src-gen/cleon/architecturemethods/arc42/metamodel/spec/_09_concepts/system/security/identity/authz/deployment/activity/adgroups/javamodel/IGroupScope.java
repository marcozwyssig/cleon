package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGroupScope extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e6ff7994-1125-11f0-a4f9-b5f995a9e0fe");
  
  public static interface IValueVoidVisitor {
    
    public void visitGlobal();
    
    public void visitUniversal();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitGlobal();
    
    public R visitUniversal();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isGlobal();
  
  public boolean isUniversal();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e6ff7994-1125-11f0-a4f9-b5f995a9e0fe,DUKkMWTWmsAKKDreA1xOK0Ks5Ic=] */
