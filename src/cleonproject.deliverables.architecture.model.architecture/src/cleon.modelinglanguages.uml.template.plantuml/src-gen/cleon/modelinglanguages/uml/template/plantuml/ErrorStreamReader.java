package cleon.modelinglanguages.uml.template.plantuml;

import java.io.IOException;

import ch.actifsource.generator.console.IGeneratorConsole;
import ch.actifsource.util.ICancelStatus;

public class ErrorStreamReader implements Runnable {
	private final ProcessBuilder fProcess;
	private byte[] fBuf;
	private volatile boolean fTerminate = false;

	private final IGeneratorConsole fConsole;
	private final ICancelStatus fCancelStatus;

	public ErrorStreamReader(ProcessBuilder pb, IGeneratorConsole console, ICancelStatus cancelStatus) {
		fProcess = pb;
		fBuf = new byte[0];
		fConsole = console;
		fCancelStatus = cancelStatus;
	}

	public void run() {
		try {
			Process process = fProcess.start();
			while (!fTerminate) {
				if (fCancelStatus.isCanceled()) {
					interruptProcess(process);
				}
				drainErrorStream(process);
				try {
					Thread.sleep(10L);
				} catch (InterruptedException localInterruptedException) {
				}
			}
			drainErrorStream(process);			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

	private void drainErrorStream(Process process) {
		try {
			int available;
			while ((available = process.getErrorStream().available()) > 0) {
				byte[] buf = getBuf(available);
				int size = process.getErrorStream().read(buf, 0, available);
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

	private void interruptProcess(Process process) {
		process.destroy();
	}
}
