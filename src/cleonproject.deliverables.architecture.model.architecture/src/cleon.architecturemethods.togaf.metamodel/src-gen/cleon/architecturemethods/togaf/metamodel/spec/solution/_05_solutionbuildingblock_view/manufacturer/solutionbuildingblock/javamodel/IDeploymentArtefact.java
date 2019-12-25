package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentArtefact extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("07531352-2d74-11e6-959f-d1cef44ff5fd");
  
  public static interface IValueVoidVisitor {
    
    public void visitExe();
    
    public void visitMsi();
    
    public void visitZip();
    
    public void visitEar();
    
    public void visitWar();
    
    public void visitWim();
    
    public void visitUnknown();
    
    public void visitRpm();
    
    public void visitTar();
    
    public void visitVmdk();
    
    public void visitIso__F___N_Bootable__O_();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitExe();
    
    public R visitMsi();
    
    public R visitZip();
    
    public R visitEar();
    
    public R visitWar();
    
    public R visitWim();
    
    public R visitUnknown();
    
    public R visitRpm();
    
    public R visitTar();
    
    public R visitVmdk();
    
    public R visitIso__F___N_Bootable__O_();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isExe();
  
  public boolean isMsi();
  
  public boolean isZip();
  
  public boolean isEar();
  
  public boolean isWar();
  
  public boolean isWim();
  
  public boolean isUnknown();
  
  public boolean isRpm();
  
  public boolean isTar();
  
  public boolean isVmdk();
  
  public boolean isIso__F___N_Bootable__O_();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,07531352-2d74-11e6-959f-d1cef44ff5fd,3P/tjTZbazS12UDC+Oib7md7ZWc=] */
