package javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Cleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution extends DynamicResource implements ICleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution>() {
    
    @Override
    public ICleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution create() {
      return new Cleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution();
    }
    
    @Override
    public ICleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Cleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution(resourceRepository, resource);
    }
  
  };

  public Cleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution() {
    super(ICleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution.TYPE_ID);
  }
  
  public Cleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Cleon__T_sda__T_template__T_asciidoc__T_analysis__T_solution setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e295116a-a233-11e5-8804-4da212ae945c,Rf1so4dhgg6cEM1PPk8hPwbKwAA=] */
