package cleon.applications.actifsource.sample.category_a.builtin_a.metamodel.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ClassA extends DynamicResource implements IClassA {

	public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IClassA> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<>() {

		@Override
		public IClassA create() {
			return new ClassA();
		}

		@Override
		public IClassA create(final IDynamicResourceRepository resourceRepository, final ch.actifsource.core.Resource resource) {
			return new ClassA(resourceRepository, resource);
		}

	};

	public ClassA() {
		super(IClassA.TYPE_ID);
	}

	public ClassA(final IDynamicResourceRepository resourceRepository, final ch.actifsource.core.Resource resource) {
		super(resourceRepository, resource, IClassA.TYPE_ID);
	}

	// attributes

	@Override
	public java.lang.String selectName() {
		return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
	}

	public void setName(final java.lang.String name) {
		_setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
	}

	// relations

	@Override
	public ch.actifsource.core.javamodel.IClass selectTypeOf() {
		return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
	}

	public ClassA setTypeOf(final ch.actifsource.core.javamodel.IClass typeOf) {
		_setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
		return this;
	}

	// accept property value visitor
	@Override
	public void accept(final IPropertyValueVisitor visitor) {
		// attributes
		_acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
		// relations
		_acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
	}

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9ea029c2-3486-11ea-8a90-f5372e2e0d45,Uk9YbM7Fe8ROkT8Qj2W2v+8D18w=] */
