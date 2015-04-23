package Cleon.EBP.Spec.Organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Organisation extends DynamicResource implements IOrganisation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganisation>() {
    
    @Override
    public IOrganisation create() {
      return new Organisation();
    }
    
    @Override
    public IOrganisation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Organisation(resourceRepository, resource);
    }
  
  };

  public Organisation() {
    super(IOrganisation.TYPE_ID);
  }
  
  public Organisation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganisation.TYPE_ID);
  }

  // relations
  
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit selectOrganisationUnit() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_organisationUnit);
  }

  public Organisation setOrganisationUnit(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit organisationUnit) {
    _setSingle(Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_organisationUnit, organisationUnit);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends Cleon.EBP.Spec.Organigram.javamodel.IOrganisation> selectSubOrganisation() {
    return _getMultiMap(Cleon.EBP.Spec.Organigram.javamodel.IOrganisation.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_subOrganisation);
  }

  public Organisation setSubOrganisation(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends Cleon.EBP.Spec.Organigram.javamodel.IOrganisation> subOrganisation) {
    _setMultiMap(Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_subOrganisation, subOrganisation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Organisation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Organisation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_organisationUnit, visitor);
    _acceptMultiMap(Cleon.EBP.Spec.Organigram.javamodel.IOrganisation.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_subOrganisation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<Cleon.EBP.Spec.Organigram.javamodel.IOrganisation> selectToMeOrganisationUnit(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit object) {
    return _getToMeList(object.getRepository(), Cleon.EBP.Spec.Organigram.javamodel.IOrganisation.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_organisationUnit, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organigram.javamodel.IOrganisation selectToMeSubOrganisation(Cleon.EBP.Spec.Organigram.javamodel.IOrganisation object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organigram.javamodel.IOrganisation.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.Organisation_subOrganisation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8700f148-daad-11e3-ae07-89aa80d5ec3d,bVh1Bvps6bWu15EaozmxgrNbOew=] */
