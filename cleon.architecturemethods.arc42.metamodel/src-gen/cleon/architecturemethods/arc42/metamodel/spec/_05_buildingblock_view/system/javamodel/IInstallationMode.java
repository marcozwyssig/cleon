package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallationMode extends ch.actifsource.core.javamodel.IEnumValue {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e0506385-23fc-11ef-86fc-7d48003eb647");
  
  public static interface IValueVoidVisitor {
    
    public void visitManual();
    
    public void visitAutomatic();
    
    public void visitAutomaticUpdate();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitManual();
    
    public R visitAutomatic();
    
    public R visitAutomaticUpdate();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isManual();
  
  public boolean isAutomatic();
  
  public boolean isAutomaticUpdate();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e0506385-23fc-11ef-86fc-7d48003eb647,1lfF4Kc9yE1qn76kYETMPeaoxBY=] */
