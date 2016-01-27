package cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Absences extends DynamicResource implements IAbsences {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsences> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAbsences>() {
    
    @Override
    public IAbsences create() {
      return new Absences();
    }
    
    @Override
    public IAbsences create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Absences(resourceRepository, resource);
    }
  
  };

  public Absences() {
    super(IAbsences.TYPE_ID);
  }
  
  public Absences(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAbsences.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear> selectAbsenseYear() {
    return _getMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.Absences_absenseYear);
  }

  public Absences setAbsenseYear(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear> absenseYear) {
    _setMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.Absences_absenseYear, absenseYear);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Absences setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.Absences_absenseYear, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences selectToMeAbsenseYear(cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsenseYear object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.javamodel.IAbsences.class, cleon.sda.spec.projectmanagement.resourcemanagement.persons.absence.AbsencePackage.Absences_absenseYear, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8e22ec09-c4c6-11e5-8558-4b8affb7767c,fzhz1zPv5HhsDNG2EHmeIJr4thk=] */
