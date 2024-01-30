package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Comment extends DynamicResource implements IComment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComment>() {
    
    @Override
    public IComment create() {
      return new Comment();
    }
    
    @Override
    public IComment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Comment(resourceRepository, resource);
    }
  
  };

  public Comment() {
    super(IComment.TYPE_ID);
  }
  
  public Comment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComment.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectWhat() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_What);
  }
    
  public void setWhat(java.lang.String what) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_What, what);
  }

  @Override
  public java.util.Date selectWhen() {
    return _getSingleAttribute(java.util.Date.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_When);
  }
    
  public void setWhen(java.util.Date when) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_When, when);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.solution.datatype.generic.datatype.DatatypePackage.Comment_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.solution.datatype.generic.datatype.DatatypePackage.Comment_comment, comment);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectWho() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_Who);
  }

  public Comment setWho(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson who) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_Who, who);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Comment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_What, visitor);
    _acceptSingleAttribute(java.util.Date.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_When, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_Who, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IComment> selectToMeWho(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.javamodel.IComment.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.software.under_the_hood.persistency_concept.Persistency_conceptPackage.Comment_Who, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,dfa83c82-bf44-11ee-ae98-9d32d1b90e58,esaIDBBS/fAVqK1yBsrSwIKlqlE=] */
