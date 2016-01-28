package cleon.sda.spec.requirementsmanagement.motivation.drivers.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Chance extends DynamicResource implements IChance {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChance> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IChance>() {
    
    @Override
    public IChance create() {
      return new Chance();
    }
    
    @Override
    public IChance create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Chance(resourceRepository, resource);
    }
  
  };

  public Chance() {
    super(IChance.TYPE_ID);
  }
  
  public Chance(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IChance.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, notes);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> selectOriginatesFromPrinciple() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple.class, cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromPrinciple);
  }

  public Chance setOriginatesFromPrinciple(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple> originatesFromPrinciple) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromPrinciple, originatesFromPrinciple);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromSource);
  }

  public Chance setOriginatesFromSource(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Chance setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.Notes_notes, visitor);
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple.class, cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromPrinciple, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.drivers.DriversPackage.Driver_originatesFromSource, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0d2aaed7-a95a-11e5-bda2-a7fc3bd7c783,FUcoF5dG1gmBdsH2a4XNI7mkQ8A=] */
