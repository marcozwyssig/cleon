package cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentArtefact extends DynamicResource implements IDeploymentArtefact {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentArtefact> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentArtefact>() {
    
    @Override
    public IDeploymentArtefact create() {
      return new DeploymentArtefact();
    }
    
    @Override
    public IDeploymentArtefact create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentArtefact(resourceRepository, resource);
    }
  
  };

  public DeploymentArtefact() {
    super(IDeploymentArtefact.TYPE_ID);
  }
  
  public DeploymentArtefact(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentArtefact.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentArtefact setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isExe()) return visitor.visitExe();
    if (isMsi()) return visitor.visitMsi();
    if (isZip()) return visitor.visitZip();
    if (isEar()) return visitor.visitEar();
    if (isWar()) return visitor.visitWar();
    if (isWim()) return visitor.visitWim();
    if (isUnknown()) return visitor.visitUnknown();
    if (isRpm()) return visitor.visitRpm();
    if (isTar()) return visitor.visitTar();
    if (isVmdk()) return visitor.visitVmdk();
    if (isIso__F___N_Bootable__O_()) return visitor.visitIso__F___N_Bootable__O_();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isExe()) {
      visitor.visitExe();
      return;
    }
    if (isMsi()) {
      visitor.visitMsi();
      return;
    }
    if (isZip()) {
      visitor.visitZip();
      return;
    }
    if (isEar()) {
      visitor.visitEar();
      return;
    }
    if (isWar()) {
      visitor.visitWar();
      return;
    }
    if (isWim()) {
      visitor.visitWim();
      return;
    }
    if (isUnknown()) {
      visitor.visitUnknown();
      return;
    }
    if (isRpm()) {
      visitor.visitRpm();
      return;
    }
    if (isTar()) {
      visitor.visitTar();
      return;
    }
    if (isVmdk()) {
      visitor.visitVmdk();
      return;
    }
    if (isIso__F___N_Bootable__O_()) {
      visitor.visitIso__F___N_Bootable__O_();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isExe() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Exe);
  }
  
  @Override
  public boolean isMsi() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Msi);
  }
  
  @Override
  public boolean isZip() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Zip);
  }
  
  @Override
  public boolean isEar() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Ear);
  }
  
  @Override
  public boolean isWar() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_War);
  }
  
  @Override
  public boolean isWim() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Wim);
  }
  
  @Override
  public boolean isUnknown() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Unknown);
  }
  
  @Override
  public boolean isRpm() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Rpm);
  }
  
  @Override
  public boolean isTar() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Tar);
  }
  
  @Override
  public boolean isVmdk() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Vmdk);
  }
  
  @Override
  public boolean isIso__F___N_Bootable__O_() {
    return getResource().equals(cleon.conception.framework.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.SolutionbuildingblockPackage.DeploymentArtefact_Iso__F___N_Bootable__O_);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,07531352-2d74-11e6-959f-d1cef44ff5fd,i5F1RKMIm77LIwJjoGm4EhJToGc=] */
