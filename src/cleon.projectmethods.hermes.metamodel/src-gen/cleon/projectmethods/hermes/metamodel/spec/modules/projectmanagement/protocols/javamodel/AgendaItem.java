package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AgendaItem extends DynamicResource implements IAgendaItem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAgendaItem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAgendaItem>() {
    
    @Override
    public IAgendaItem create() {
      return new AgendaItem();
    }
    
    @Override
    public IAgendaItem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AgendaItem(resourceRepository, resource);
    }
  
  };

  public AgendaItem() {
    super(IAgendaItem.TYPE_ID);
  }
  
  public AgendaItem(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAgendaItem.TYPE_ID);
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
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem> selectSubItems() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.AgendaItem_subItems);
  }

  public AgendaItem setSubItems(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem> subItems) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.AgendaItem_subItems, subItems);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AgendaItem setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.AgendaItem_subItems, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem selectToMeSubItems(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IAgendaItem.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.ProtocolsPackage.AgendaItem_subItems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cf7dbe8a-b461-11e5-a3f4-497fd75158dc,Hx74vqm3prgFcp86uFrYUX4NTk8=] */
