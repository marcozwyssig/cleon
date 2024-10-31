package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IReadJobExecutor;
import ch.actifsource.core.model.aspects.AspectImplementationDecorator;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.set.INodeSet;
import ch.actifsource.core.set.NodeSet;
import ch.actifsource.core.util.LiteralUtil;

public class IPAddressRangeDecorator extends AspectImplementationDecorator {


	public INodeSet getDecoratableNodes(IReadJobExecutor executor, INode subject, INode decoratingRelation) {
		NodeSet ipNodeSet = new NodeSet();
		ipNodeSet.add(LiteralUtil.create(1));
		return ipNodeSet;
	}
}
