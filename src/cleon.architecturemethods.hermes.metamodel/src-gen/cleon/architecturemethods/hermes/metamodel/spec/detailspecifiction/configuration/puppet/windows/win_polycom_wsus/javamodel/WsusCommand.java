package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WsusCommand extends DynamicResource implements IWsusCommand {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWsusCommand> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWsusCommand>() {
    
    @Override
    public IWsusCommand create() {
      return new WsusCommand();
    }
    
    @Override
    public IWsusCommand create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WsusCommand(resourceRepository, resource);
    }
  
  };

  public WsusCommand() {
    super(IWsusCommand.TYPE_ID);
  }
  
  public WsusCommand(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWsusCommand.TYPE_ID);
  }

  // attributes
  
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

  public WsusCommand setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isUninstall()) return visitor.visitUninstall();
    if (isNotApproved()) return visitor.visitNotApproved();
    if (isDenied()) return visitor.visitDenied();
    if (isInstall()) return visitor.visitInstall();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isUninstall()) {
      visitor.visitUninstall();
      return;
    }
    if (isNotApproved()) {
      visitor.visitNotApproved();
      return;
    }
    if (isDenied()) {
      visitor.visitDenied();
      return;
    }
    if (isInstall()) {
      visitor.visitInstall();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isUninstall() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.WsusCommand_Uninstall);
  }
  
  @Override
  public boolean isNotApproved() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.WsusCommand_NotApproved);
  }
  
  @Override
  public boolean isDenied() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.WsusCommand_Denied);
  }
  
  @Override
  public boolean isInstall() {
    return getResource().equals(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.Win_polycom_wsusPackage.WsusCommand_Install);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,65ed808f-8a6c-11f0-af5e-cd5d044ab02b,7OsSyN4gEfhSxHAh438AvFLrwIk=] */
