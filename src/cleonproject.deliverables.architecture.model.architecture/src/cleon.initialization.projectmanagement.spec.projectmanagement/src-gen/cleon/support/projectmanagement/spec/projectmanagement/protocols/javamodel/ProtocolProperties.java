package cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProtocolProperties extends DynamicResource implements IProtocolProperties {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocolProperties> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProtocolProperties>() {
    
    @Override
    public IProtocolProperties create() {
      return new ProtocolProperties();
    }
    
    @Override
    public IProtocolProperties create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProtocolProperties(resourceRepository, resource);
    }
  
  };

  public ProtocolProperties() {
    super(IProtocolProperties.TYPE_ID);
  }
  
  public ProtocolProperties(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProtocolProperties.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDocumentType() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_documentType);
  }
    
  public void setDocumentType(java.lang.String documentType) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_documentType, documentType);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public ProtocolProperties setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember selectAutor() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.support.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolProperties_autor);
  }

  public ProtocolProperties setAutor(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember autor) {
    _setSingle(cleon.support.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolProperties_autor, autor);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IClassification selectClassification() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IClassification.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_classification);
  }

  public ProtocolProperties setClassification(cleon.common.doc.spec.doc.document.properties.javamodel.IClassification classification) {
    _setSingle(cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_classification, classification);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.ICustomer selectCustomer() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.ICustomer.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_customer);
  }

  public ProtocolProperties setCustomer(cleon.common.doc.spec.doc.document.properties.javamodel.ICustomer customer) {
    _setSingle(cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_customer, customer);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectDistributers() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Distributers_distributers);
  }

  public ProtocolProperties setDistributers(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> distributers) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Distributers_distributers, distributers);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProject selectProject() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProject.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_project);
  }

  public ProtocolProperties setProject(cleon.common.doc.spec.doc.document.properties.javamodel.IProject project) {
    _setSingle(cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_project, project);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectReviewers() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Reviewers_reviewers);
  }

  public ProtocolProperties setReviewers(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> reviewers) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Reviewers_reviewers, reviewers);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public ProtocolProperties setState(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProtocolProperties setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion selectVersion() {
    return _getSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version);
  }

  public ProtocolProperties setVersion(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion version) {
    _setSingle(cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, version);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_documentType, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.support.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolProperties_autor, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IClassification.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_classification, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.ICustomer.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_customer, visitor);
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Distributers_distributers, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProject.class, cleon.common.doc.spec.doc.document.properties.PropertiesPackage.Properties_project, visitor);
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Reviewers_reviewers, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.workstate.javamodel.IWorkState.class, cleon.common.resources.spec.resources.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion.class, cleon.common.resources.spec.resources.versions.VersionsPackage.SemanticVersionAware_version, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties> selectToMeAutor(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.support.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties.class, cleon.support.projectmanagement.spec.projectmanagement.protocols.ProtocolsPackage.ProtocolProperties_autor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9d8d5f17-47fb-11e6-b388-8539f6ff7310,lu6/beq+eYzPAnSIe4DbGTBbrtU=] */
