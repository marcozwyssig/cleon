package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DfsRootShare extends DynamicResource implements IDfsRootShare {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDfsRootShare> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDfsRootShare>() {
    
    @Override
    public IDfsRootShare create() {
      return new DfsRootShare();
    }
    
    @Override
    public IDfsRootShare create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DfsRootShare(resourceRepository, resource);
    }
  
  };

  public DfsRootShare() {
    super(IDfsRootShare.TYPE_ID);
  }
  
  public DfsRootShare(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDfsRootShare.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDfsrootPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_dfsrootPath);
  }
    
  public void setDfsrootPath(java.lang.String dfsrootPath) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_dfsrootPath, dfsrootPath);
  }

  @Override
  public java.lang.String selectFullPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_fullPath);
  }
    
  public void setFullPath(java.lang.String fullPath) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_fullPath, fullPath);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IAcl> selectAcls() {
    return _getMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IAcl.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_acls);
  }

  public DfsRootShare setAcls(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IAcl> acls) {
    _setMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_acls, acls);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember> selectChangeAccess() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_changeAccess);
  }

  public DfsRootShare setChangeAccess(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember> changeAccess) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_changeAccess, changeAccess);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfs selectDfs() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfs.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_dfs);
  }

  public DfsRootShare setDfs(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfs dfs) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_dfs, dfs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember> selectFullAccess() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_fullAccess);
  }

  public DfsRootShare setFullAccess(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember> fullAccess) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_fullAccess, fullAccess);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember> selectReadAccess() {
    return _getList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_readAccess);
  }

  public DfsRootShare setReadAccess(java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember> readAccess) {
    _setList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_readAccess, readAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DfsRootShare setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DfsRootShare setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_dfsrootPath, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_fullPath, visitor);
    // relations
    _acceptMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IAcl.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_acls, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_changeAccess, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfs.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_dfs, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_fullAccess, visitor);
    _acceptList(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractMember.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.AbstractShare_readAccess, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfsRootShare> selectToMeDfs(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfs object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IDfsRootShare.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.Win_polycom_manage_netdrivesPackage.DfsRootShare_dfs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1d65c58f-07fb-11f0-bc12-1bbda1d7028e,TKqdkRseXUnG8mnoOVyY/mJfDqk=] */
