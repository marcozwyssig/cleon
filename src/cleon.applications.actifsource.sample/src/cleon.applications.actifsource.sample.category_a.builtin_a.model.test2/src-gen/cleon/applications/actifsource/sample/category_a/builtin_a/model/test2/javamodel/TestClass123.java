package cleon.applications.actifsource.sample.category_a.builtin_a.model.test2.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestClass123 extends DynamicResource implements ITestClass123 {

	public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestClass123> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<>() {

		@Override
		public ITestClass123 create() {
			return new TestClass123();
		}

		@Override
		public ITestClass123 create(final IDynamicResourceRepository resourceRepository, final ch.actifsource.core.Resource resource) {
			return new TestClass123(resourceRepository, resource);
		}

	};

	public TestClass123() {
		super(ITestClass123.TYPE_ID);
	}

	public TestClass123(final IDynamicResourceRepository resourceRepository, final ch.actifsource.core.Resource resource) {
		super(resourceRepository, resource, ITestClass123.TYPE_ID);
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

	public TestClass123 setTypeOf(final ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e58da639-bad5-11ee-9b9a-eba49b146468,aZcJ729a88Sx/DIwY0DTbkk2Rx8=] */
