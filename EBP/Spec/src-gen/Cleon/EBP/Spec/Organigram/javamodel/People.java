package Cleon.EBP.Spec.Organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class People extends DynamicResource implements IPeople {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPeople> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPeople>() {
    
    @Override
    public IPeople create() {
      return new People();
    }
    
    @Override
    public IPeople create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new People(resourceRepository, resource);
    }
  
  };

  public People() {
    super(IPeople.TYPE_ID);
  }
  
  public People(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPeople.TYPE_ID);
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
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IRole> selectRoles() {
    return _getList(Cleon.EBP.Spec.Organisational.Role.javamodel.IRole.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.People_roles);
  }

  public People setRoles(java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IRole> roles) {
    _setList(Cleon.EBP.Spec.Organigram.OrganigramPackage.People_roles, roles);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public People setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(Cleon.EBP.Spec.Organisational.Role.javamodel.IRole.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.People_roles, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<Cleon.EBP.Spec.Organigram.javamodel.IPeople> selectToMeRoles(Cleon.EBP.Spec.Organisational.Role.javamodel.IRole object) {
    return _getToMeList(object.getRepository(), Cleon.EBP.Spec.Organigram.javamodel.IPeople.class, Cleon.EBP.Spec.Organigram.OrganigramPackage.People_roles, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e4ce5b3-daac-11e3-ae07-89aa80d5ec3d,TV12AYFLu77dv1OH3O96FUstsf4=] */
