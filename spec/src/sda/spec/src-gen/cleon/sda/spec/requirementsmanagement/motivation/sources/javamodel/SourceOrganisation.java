package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SourceOrganisation extends DynamicResource implements ISourceOrganisation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceOrganisation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISourceOrganisation>() {
    
    @Override
    public ISourceOrganisation create() {
      return new SourceOrganisation();
    }
    
    @Override
    public ISourceOrganisation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SourceOrganisation(resourceRepository, resource);
    }
  
  };

  public SourceOrganisation() {
    super(ISourceOrganisation.TYPE_ID);
  }
  
  public SourceOrganisation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISourceOrganisation.TYPE_ID);
  }

  // attributes
  
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors() {
    return _getList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors);
  }

  public SourceOrganisation setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> selectComposites() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Source_composites);
  }

  public SourceOrganisation setComposites(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource> composites) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Source_composites, composites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceDocument> selectDocuments() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceDocument.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_documents);
  }

  public SourceOrganisation setDocuments(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceDocument> documents) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourcePerson> selectPersons() {
    return _getList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourcePerson.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_persons);
  }

  public SourceOrganisation setPersons(java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourcePerson> persons) {
    _setList(cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_persons, persons);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SourceOrganisation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.Source_composites, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceDocument.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_documents, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourcePerson.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_persons, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceOrganisation selectToMePersons(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourcePerson object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceOrganisation.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_persons, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceOrganisation selectToMeDocuments(cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceOrganisation.class, cleon.sda.spec.requirementsmanagement.motivation.sources.SourcesPackage.SourceOrganisation_documents, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1b0ca733-bb80-11e5-b2f7-f515c847fa35,+kTYHo8XaHKvxT/4u6CUaHrAU5E=] */
