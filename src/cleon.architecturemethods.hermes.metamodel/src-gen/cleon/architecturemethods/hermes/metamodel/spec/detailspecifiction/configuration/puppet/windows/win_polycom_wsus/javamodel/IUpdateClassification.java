package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUpdateClassification extends ch.actifsource.core.javamodel.IEnumValue, cleon.common.resources.metamodel.spec.id.javamodel.IStringBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c5fbc60e-5331-11f0-9301-032f11813eba");
  
  public static interface IValueVoidVisitor {
    
    public void visitAnwendungen();
    
    public void visitDefinitionsupdates();
    
    public void visitFeature__F_Packs();
    
    public void visitService__F_Packs();
    
    public void visitSicherheitsupdates__F___U___F_Security__F_Updates();
    
    public void visitTools();
    
    public void visitTreiber();
    
    public void visitTreibersätze();
    
    public void visitUpdate__S_Rollups();
    
    public void visitUpdates();
    
    public void visitUpgrades();
    
    public void visitWichtige__F_Updates__F___U___F_Critical__F_Updates();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitAnwendungen();
    
    public R visitDefinitionsupdates();
    
    public R visitFeature__F_Packs();
    
    public R visitService__F_Packs();
    
    public R visitSicherheitsupdates__F___U___F_Security__F_Updates();
    
    public R visitTools();
    
    public R visitTreiber();
    
    public R visitTreibersätze();
    
    public R visitUpdate__S_Rollups();
    
    public R visitUpdates();
    
    public R visitUpgrades();
    
    public R visitWichtige__F_Updates__F___U___F_Critical__F_Updates();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isAnwendungen();
  
  public boolean isDefinitionsupdates();
  
  public boolean isFeature__F_Packs();
  
  public boolean isService__F_Packs();
  
  public boolean isSicherheitsupdates__F___U___F_Security__F_Updates();
  
  public boolean isTools();
  
  public boolean isTreiber();
  
  public boolean isTreibersätze();
  
  public boolean isUpdate__S_Rollups();
  
  public boolean isUpdates();
  
  public boolean isUpgrades();
  
  public boolean isWichtige__F_Updates__F___U___F_Critical__F_Updates();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c5fbc60e-5331-11f0-9301-032f11813eba,zOELMUgz4nMEGzmt9kq8Jgf24Tg=] */
