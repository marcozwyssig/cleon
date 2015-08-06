package cleon.epm.spec.organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Organigram extends DynamicResource implements IOrganigram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganigram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOrganigram>() {
    
    @Override
    public IOrganigram create() {
      return new Organigram();
    }
    
    @Override
    public IOrganigram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Organigram(resourceRepository, resource);
    }
  
  };

  public Organigram() {
    super(IOrganigram.TYPE_ID);
  }
  
  public Organigram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOrganigram.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.epm.spec.organigram.javamodel.IEnterpriseOrganigram> selectEnterpriseOrganigram() {
    return _getMap(cleon.epm.spec.organigram.javamodel.IEnterpriseOrganigram.class, cleon.epm.spec.organigram.OrganigramPackage.Organigram_enterpriseOrganigram);
  }

  public Organigram setEnterpriseOrganigram(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.epm.spec.organigram.javamodel.IEnterpriseOrganigram> enterpriseOrganigram) {
    _setMap(cleon.epm.spec.organigram.OrganigramPackage.Organigram_enterpriseOrganigram, enterpriseOrganigram);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.epm.spec.organigram.javamodel.IPerson> selectPeoples() {
    return _getList(cleon.epm.spec.organigram.javamodel.IPerson.class, cleon.epm.spec.organigram.OrganigramPackage.Organigram_peoples);
  }

  public Organigram setPeoples(java.util.List<? extends cleon.epm.spec.organigram.javamodel.IPerson> peoples) {
    _setList(cleon.epm.spec.organigram.OrganigramPackage.Organigram_peoples, peoples);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Organigram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.epm.spec.organigram.javamodel.IEnterpriseOrganigram.class, cleon.epm.spec.organigram.OrganigramPackage.Organigram_enterpriseOrganigram, visitor);
    _acceptList(cleon.epm.spec.organigram.javamodel.IPerson.class, cleon.epm.spec.organigram.OrganigramPackage.Organigram_peoples, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.epm.spec.organigram.javamodel.IOrganigram selectToMePeoples(cleon.epm.spec.organigram.javamodel.IPerson object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.organigram.javamodel.IOrganigram.class, cleon.epm.spec.organigram.OrganigramPackage.Organigram_peoples, object.getResource());
  }
  
  public static cleon.epm.spec.organigram.javamodel.IOrganigram selectToMeEnterpriseOrganigram(cleon.epm.spec.organigram.javamodel.IEnterpriseOrganigram object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.organigram.javamodel.IOrganigram.class, cleon.epm.spec.organigram.OrganigramPackage.Organigram_enterpriseOrganigram, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,45b76892-daaa-11e3-ae07-89aa80d5ec3d,/kKPNFjfpNVQhWjj+WE9kLvouJ8=] */
