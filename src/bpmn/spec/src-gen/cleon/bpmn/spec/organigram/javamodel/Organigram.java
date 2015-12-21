package cleon.bpmn.spec.organigram.javamodel;

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
  public java.util.List<? extends cleon.bpmn.spec.organigram.javamodel.IPerson> selectPeoples() {
    return _getList(cleon.bpmn.spec.organigram.javamodel.IPerson.class, cleon.bpmn.spec.organigram.OrganigramPackage.Organigram_peoples);
  }

  public Organigram setPeoples(java.util.List<? extends cleon.bpmn.spec.organigram.javamodel.IPerson> peoples) {
    _setList(cleon.bpmn.spec.organigram.OrganigramPackage.Organigram_peoples, peoples);
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
    _acceptList(cleon.bpmn.spec.organigram.javamodel.IPerson.class, cleon.bpmn.spec.organigram.OrganigramPackage.Organigram_peoples, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.bpmn.spec.organigram.javamodel.IOrganigram selectToMePeoples(cleon.bpmn.spec.organigram.javamodel.IPerson object) {
    return _getToMeSingle(object.getRepository(), cleon.bpmn.spec.organigram.javamodel.IOrganigram.class, cleon.bpmn.spec.organigram.OrganigramPackage.Organigram_peoples, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,45b76892-daaa-11e3-ae07-89aa80d5ec3d,kY6ky4n2PvnEaQrks1yCaIqEXzY=] */
