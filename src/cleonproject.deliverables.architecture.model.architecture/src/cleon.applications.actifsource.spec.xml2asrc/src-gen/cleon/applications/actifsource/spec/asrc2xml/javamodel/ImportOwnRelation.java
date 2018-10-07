package cleon.applications.actifsource.spec.asrc2xml.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImportOwnRelation extends DynamicResource implements IImportOwnRelation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportOwnRelation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImportOwnRelation>() {
    
    @Override
    public IImportOwnRelation create() {
      return new ImportOwnRelation();
    }
    
    @Override
    public IImportOwnRelation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImportOwnRelation(resourceRepository, resource);
    }
  
  };

  public ImportOwnRelation() {
    super(IImportOwnRelation.TYPE_ID);
  }
  
  public ImportOwnRelation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImportOwnRelation.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IAttribute selectDiscriminator() {
    return _getSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_discriminator);
  }

  public ImportOwnRelation setDiscriminator(ch.actifsource.core.javamodel.IAttribute discriminator) {
    _setSingle(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_discriminator, discriminator);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass> selectMapCls() {
    return _getMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_mapCls);
  }

  public ImportOwnRelation setMapCls(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass> mapCls) {
    _setMap(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_mapCls, mapCls);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IOwnRelation selectRelation() {
    return _getSingle(ch.actifsource.core.javamodel.IOwnRelation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_relation);
  }

  public ImportOwnRelation setRelation(ch.actifsource.core.javamodel.IOwnRelation relation) {
    _setSingle(cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_relation, relation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ImportOwnRelation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImportOwnRelation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IAttribute.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_discriminator, visitor);
    _acceptMap(cleon.applications.actifsource.spec.asrc2xml.javamodel.IImportClass.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_mapCls, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IOwnRelation.class, cleon.applications.actifsource.spec.asrc2xml.Asrc2xmlPackage.AbstractOwnImportRelation_relation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8fb64e63-221f-11e8-8749-cb7f4d6924d3,4a/09/87nsM+5EyKPbu5Iq8y8fM=] */
