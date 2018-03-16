package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ComponentOfSubjectMatter extends DynamicResource implements IComponentOfSubjectMatter {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentOfSubjectMatter> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComponentOfSubjectMatter>() {
    
    @Override
    public IComponentOfSubjectMatter create() {
      return new ComponentOfSubjectMatter();
    }
    
    @Override
    public IComponentOfSubjectMatter create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ComponentOfSubjectMatter(resourceRepository, resource);
    }
  
  };

  public ComponentOfSubjectMatter() {
    super(IComponentOfSubjectMatter.TYPE_ID);
  }
  
  public ComponentOfSubjectMatter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComponentOfSubjectMatter.TYPE_ID);
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
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter selectSubjectMatter() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter);
  }

  public ComponentOfSubjectMatter setSubjectMatter(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter subjectMatter) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, subjectMatter);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ComponentOfSubjectMatter setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.javamodel.ISubjectMatter.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.subjectmatter.SubjectmatterPackage.SubjectMatterAware_subjectMatter, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0fd84ed2-d650-11e5-beff-c5494779b7d9,R3x8cTbaECobCCwh5Xt2K+1HIjw=] */
