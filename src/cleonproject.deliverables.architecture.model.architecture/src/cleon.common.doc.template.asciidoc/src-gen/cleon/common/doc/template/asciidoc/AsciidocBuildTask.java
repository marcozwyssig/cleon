package cleon.common.doc.template.asciidoc;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import ch.actifsource.generator.AbstractBuildTaskSingleThread;
import ch.actifsource.generator.console.IGeneratorConsole;
import ch.actifsource.generator.target.ISingleThreadBuildTargetInfo;
import ch.actifsource.util.ICancelStatus;
import ch.actifsource.util.file.IAsFile;
import ch.actifsource.util.file.IAsFolder;

public class AsciidocBuildTask extends AbstractBuildTaskSingleThread {
	private final List<String> _commands = new ArrayList<String>();
	private boolean fAdaptSize;
	@javax.annotation.CheckForNull
	private String fStylesheet;

	public AsciidocBuildTask(ch.actifsource.core.INode buildTask, ICancelStatus status) {
		super(buildTask, status);

		_commands.add("cmd");
		_commands.add("/c");		
		_commands.add("bundle");
		_commands.add("exec asciidoctor");
		_commands.add("-r asciidoctor-diagram");
		_commands.add("-a data-uri");
	}

	protected ch.actifsource.core.dependency.IDependency internalGenerate(ISingleThreadBuildTargetInfo targetInfo)
			throws ch.actifsource.generator.GenerationException {

		IAsFolder targetFolder = targetInfo.getOutputScope().getFolder(targetInfo.getOutputPath());
		try {
			processFolder(targetFolder, targetInfo.getBuildContext().console());
		} catch (IOException e) {
			throw new ch.actifsource.generator.GenerationException(e);
		}
		return null;
	}

	private void processFolder(IAsFolder folder, IGeneratorConsole generatorConsole) throws IOException {
		for (IAsFile dotFile : folder.getFiles()) {
			if (dotFile.getName().endsWith(".adoc")) {
				if (isCanceled())
					return;
				String adocFileName = dotFile.getName();
				String svgFilename = adocFileName.substring(0, adocFileName.length() - ".adoc".length()) + ".adoc";
				IAsFile svgFile = folder.getFile(svgFilename);

				generatorConsole.info().print("Processing asciidoc ");
				generatorConsole.info().print(dotFile, 0, 0, adocFileName);
				generatorConsole.info().print(" -> ");
				generatorConsole.info().print(svgFile, 0, 0, svgFilename);
				generatorConsole.info().println();

				List<String> command = new ArrayList<String>(_commands);
				command.add(adocFileName);
				
				ProcessBuilder pb = new ProcessBuilder(command);
				File adapter = (File) folder.getAdapter(File.class);
				pb = pb.directory(adapter);

				Process process = pb.start();
				ErrorStreamReader interruptOnCancel = new ErrorStreamReader(process, console(), getCancelStatus());
				Thread thread = new Thread(interruptOnCancel);
				thread.start();
				try {
					InputStream input = postProcess(process.getInputStream());
					if (isCanceled())
						return;
					svgFile.write(input);
				} finally {
					interruptOnCancel.terminate();
					try {
						thread.join();
					} catch (InterruptedException localInterruptedException1) {
					}
				}
				interruptOnCancel.terminate();
				try {
					thread.join();
				} catch (InterruptedException localInterruptedException2) {
				}
			}
		}

		for (IAsFolder subFolder : folder.getSubFolders()) {
			processFolder(subFolder, generatorConsole);
		}
	}

	private InputStream postProcess(InputStream input) throws IOException {
		BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(input));

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PrintWriter writer = new PrintWriter(out);
		String line;
		if ((line = reader.readLine()) != null) {
			writer.println(line);
			if (fStylesheet != null) {
				writer.println("<?xml-stylesheet type=\"text/css\" href=\"" + fStylesheet + "\" ?>");
			}
		}
		while ((line = reader.readLine()) != null) {
			if ((fAdaptSize) && (line.startsWith("<svg"))) {
				writer.println("<svg width=\"100%\" height=\"100%\"");
			} else
				writer.println(line);
		}
		writer.flush();
		return new java.io.ByteArrayInputStream(out.toByteArray());
	}
}