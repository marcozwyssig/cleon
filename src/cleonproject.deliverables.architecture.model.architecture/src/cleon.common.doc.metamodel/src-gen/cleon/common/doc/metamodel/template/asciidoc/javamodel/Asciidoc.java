package cleon.common.doc.metamodel.template.asciidoc.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Asciidoc extends DynamicResource implements IAsciidoc {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsciidoc> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAsciidoc>() {
    
    @Override
    public IAsciidoc create() {
      return new Asciidoc();
    }
    
    @Override
    public IAsciidoc create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Asciidoc(resourceRepository, resource);
    }
  
  };

  public Asciidoc() {
    super(IAsciidoc.TYPE_ID);
  }
  
  public Asciidoc(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAsciidoc.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Asciidoc setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b1f0d77d-2236-11e9-a054-db6d80fba790,yNo6MEKvTPd0coSrkAisDqsFnsg=] */
