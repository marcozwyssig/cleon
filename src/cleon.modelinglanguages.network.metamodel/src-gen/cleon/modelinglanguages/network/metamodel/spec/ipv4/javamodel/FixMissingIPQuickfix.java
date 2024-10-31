package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.core.undo.GlobalEditContext;
import ch.actifsource.core.undo.IEditContext;
import ch.actifsource.core.update.IModifiable;
import ch.actifsource.core.validation.quickfix.AbstractQuickFix;
import ch.actifsource.core.validation.quickfix.IInconsistencyEnablement;


public class FixMissingIPQuickfix extends AbstractQuickFix {
	private final IIPRange range;
	private final SubnetUtils subnet;

	public FixMissingIPQuickfix(final SubnetUtils subnet, final IIPRange range, final IInconsistencyEnablement enablement) {
		super(String.format("add IP address to IP range"), "TODO", enablement);
		this.subnet = subnet;
		this.range = range;

	}


	@Override
	protected IEditContext getEditContext() {
		return GlobalEditContext.DEFAULT;
	}

	@Override
	protected void doApply(final IModifiable modifiable) {
		final var ipManager = new IPManager(subnet, range);
		ipManager.apply(modifiable);
	}
}
