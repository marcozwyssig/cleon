package cleon.projectmethods.hermes.spec.hermes5.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Phases extends DynamicResource implements IPhases {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPhases> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPhases>() {
    
    @Override
    public IPhases create() {
      return new Phases();
    }
    
    @Override
    public IPhases create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Phases(resourceRepository, resource);
    }
  
  };

  public Phases() {
    super(IPhases.TYPE_ID);
  }
  
  public Phases(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPhases.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhase> selectPhases() {
    return _getList(cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhase.class, cleon.projectmethods.hermes.spec.hermes5.Hermes5Package.Phases_phases);
  }

  public Phases setPhases(java.util.List<? extends cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhase> phases) {
    _setList(cleon.projectmethods.hermes.spec.hermes5.Hermes5Package.Phases_phases, phases);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Phases setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhase.class, cleon.projectmethods.hermes.spec.hermes5.Hermes5Package.Phases_phases, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhases selectToMePhases(cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhase object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.hermes5.javamodel.IPhases.class, cleon.projectmethods.hermes.spec.hermes5.Hermes5Package.Phases_phases, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7412bd4b-31ca-11e8-8a84-6f139e67278b,jgcznFfoZe+f8ufKDISB5Vq0Qzw=] */
