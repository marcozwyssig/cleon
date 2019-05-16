package cleon.modelinglanguages.network.spec.network.ipv4.javamodel;

import ch.actifsource.core.INode;
import ch.actifsource.core.Package;
import ch.actifsource.core.Resource;
import ch.actifsource.core.dynamic.IDynamicResourceRepository;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.job.Update;
import ch.actifsource.core.job.WriteJob;
import ch.actifsource.core.selector.typesystem.ITypeSystem;
import ch.actifsource.core.selector.typesystem.impl.TypeSystem;
import ch.actifsource.core.update.FixOwnership;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.util.NoResult;
import cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package;
import cleon.modelinglanguages.network.spec.network.ipv4.FunctionSpace_IP.IIPv4_MaskFunctions;

public class FixMissingIP extends WriteJob<NoResult>  {
	
	private final Package fpackage;
	
	public FixMissingIP(Package fpkg) {
		fpackage = fpkg;
	}

	protected NoResult doExecuteOn(IModifiable var1) {
		return null;
		
	}
	
	public int hashCode() {
		int result = this.getClass().hashCode();
		result = 31 * result + this.fpackage.hashCode();
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj != null && this.getClass() == obj.getClass()) {
			FixMissingIP other = (FixMissingIP) obj;
			return this.fpackage.equals(other.fpackage);
		} else {
			return false;
		}
	}	
}
