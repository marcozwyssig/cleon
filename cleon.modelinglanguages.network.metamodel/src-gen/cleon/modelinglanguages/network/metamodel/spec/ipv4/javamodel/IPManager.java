package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.IWriteJobExecutor;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.util.LiteralUtil;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPRangeFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_AFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_BFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.FunctionSpace_IP.IIPv4_CFunctions;
import cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package;

public class IPManager {

	private final IIPRange range;
	private final SubnetUtils subnet;

	public IPManager(final SubnetUtils subnet, final IIPRange range) {
		this.subnet = subnet;
		this.range = range;
	}

	public void apply(final IWriteJobExecutor writeJobExecutor) {
		final var typeSystem = TypeSystem.create(writeJobExecutor);
		final var resourceRepository = typeSystem.getResourceRepository();

		for (final String ip : subnet.getInfo().getAllAddresses()) {
			final var parts = ip.trim().split("\\.");
			final var Ipv4_A = createClassAIP(writeJobExecutor, resourceRepository, range.getPackage(), parts[0]);
			final var Ipv4_B = createClassBIP(writeJobExecutor, resourceRepository, range.getPackage(), Ipv4_A, parts[1]);
			final var Ipv4_C = createClassCIP(writeJobExecutor, resourceRepository, range.getPackage(), Ipv4_B, parts[2]);
			createClassDIP(writeJobExecutor, resourceRepository, range.getPackage(), Ipv4_C, parts[3]);
		}
	}

	private Resource createClassAIP(final IWriteJobExecutor writeJobExecutor, final IDynamicResourceRepository dynamicResource, final Package pkg, final String ip) {
		final var ipv4 = range.extension(IIPRangeFunctions.class).FindIP(ip);
		if (ipv4 != null) {
			return ipv4.getResource();
		}

		return createIPs(writeJobExecutor, pkg, Ipv4Package.IPv4_aE_A, range.getResource(), Ipv4Package.IPRange_iPv4_aE_A, ip);
	}

	private Resource createClassBIP(final IWriteJobExecutor writeJobExecutor, final IDynamicResourceRepository dynamicResource, final Package pkg, final Resource parent, final String ip) {
		final var ipvA = dynamicResource.getResource(IIPv4_A.class, parent);
		final var ipvB = ipvA.extension(IIPv4_AFunctions.class).FindIP(ip);
		if (ipvB != null) {
			return ipvB.getResource();
		}

		return createIPs(writeJobExecutor, pkg, Ipv4Package.IPv4_aE_B, parent, Ipv4Package.IPv4_aE_A_iPv4_aE_B, ip);
	}

	private Resource createClassCIP(final IWriteJobExecutor writeJobExecutor, final IDynamicResourceRepository dynamicResource, final Package pkg, final Resource parent, final String ip) {
		final var ipvB = dynamicResource.getResource(IIPv4_B.class, parent);
		final var ipvC = ipvB.extension(IIPv4_BFunctions.class).FindIP(ip);
		if (ipvC != null) {
			return ipvC.getResource();
		}

		return createIPs(writeJobExecutor, pkg, Ipv4Package.IPv4_aE_C, parent, Ipv4Package.IPv4_aE_B_iPv4_aE_C, ip);
	}

	private Resource createClassDIP(final IWriteJobExecutor writeJobExecutor, final IDynamicResourceRepository dynamicResource, final Package pkg, final Resource parent, final String ip) {
		final var ipvC = dynamicResource.getResource(IIPv4_C.class, parent);
		final var ipvD = ipvC.extension(IIPv4_CFunctions.class).FindIP(ip);
		if (ipvD != null) {
			return ipvD.getResource();
		}
		return createIPs(writeJobExecutor, pkg, Ipv4Package.IPv4_aE_D, parent, Ipv4Package.IPv4_aE_C_iPv4_aE_D, ip);
	}

	private Resource createIPs(final IWriteJobExecutor writeJobExecutor, final Package pkg, final Resource resource, final Resource parent, final Resource relation, final String ip) {
		final var ipObj = Update.createResourceNoDefaults(writeJobExecutor, pkg, resource);
		Update.createStatement(writeJobExecutor, pkg, ipObj, Ipv4Package.AbstractIPv4_ip, LiteralUtil.create(ip));
		Update.createStatement(writeJobExecutor, pkg, parent, relation, ipObj);
		return ipObj;
	}
}
