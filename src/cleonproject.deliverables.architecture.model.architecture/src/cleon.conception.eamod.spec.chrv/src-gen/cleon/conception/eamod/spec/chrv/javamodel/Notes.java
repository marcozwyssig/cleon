package cleon.conception.eamod.spec.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Notes extends DynamicResource implements INotes {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INotes> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INotes>() {
    
    @Override
    public INotes create() {
      return new Notes();
    }
    
    @Override
    public INotes create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Notes(resourceRepository, resource);
    }
  
  };

  public Notes() {
    super(INotes.TYPE_ID);
  }
  
  public Notes(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INotes.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes, notes);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Notes setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb4ba841-bb82-11e5-b2f7-f515c847fa35,FgvztlMkfIrctUjsAm2TADbqj4A=] */
