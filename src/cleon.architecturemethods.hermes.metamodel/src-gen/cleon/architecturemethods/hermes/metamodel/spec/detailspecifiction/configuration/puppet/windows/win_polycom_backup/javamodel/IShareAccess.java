package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IShareAccess extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("eb4222c0-688e-11f0-a9ba-bb94c358e981");
  
  public static interface IValueVoidVisitor {
    
    public void visitCluster();
    
    public void visitMember();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitCluster();
    
    public R visitMember();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isCluster();
  
  public boolean isMember();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,eb4222c0-688e-11f0-a9ba-bb94c358e981,uDcwF1zdpdQD2LXjjt8iNQrgNrM=] */
