package cleon.conception.uml.template.plantuml;

import java.io.IOException;

import ch.actifsource.generator.console.IGeneratorConsole;
import ch.actifsource.util.ICancelStatus;

public class ErrorStreamReader implements Runnable {
	private final Process fProcess;
	private byte[] fBuf;
	private volatile boolean fTerminate = false;

	private final IGeneratorConsole fConsole;
	private final ICancelStatus fCancelStatus;

	public ErrorStreamReader(Process process, IGeneratorConsole console, ICancelStatus cancelStatus) {
		fProcess = process;
		fBuf = new byte['È'];
		fConsole = console;
		fCancelStatus = cancelStatus;
	}

	public void run() {
		while (!fTerminate) {
			if (fCancelStatus.isCanceled()) {
				interruptProcess();
			}
			drainErrorStream();
			try {
				Thread.sleep(10L);
			} catch (InterruptedException localInterruptedException) {
			}
		}
		drainErrorStream();
	}

	private void drainErrorStream() {
		try {
			int available;
			while ((available = fProcess.getErrorStream().available()) > 0) {
				byte[] buf = getBuf(available);
				int size = fProcess.getErrorStream().read(buf, 0, available);
				fConsole.warning().print(new String(buf, 0, size));
			}
		} catch (IOException localIOException) {
		}
	}

	private byte[] getBuf(int length) {
		if (fBuf.length < length) {
			fBuf = new byte[Math.max(length, fBuf.length * 2)];
		}
		return fBuf;
	}

	public void terminate() {
		fTerminate = true;
	}

	private void interruptProcess() {
		fProcess.destroy();
	}
}
