package cleon.modelinglanguages.network.template.nwdiag;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import ch.actifsource.core.INode;
import ch.actifsource.core.job.Select;
import ch.actifsource.core.util.LiteralUtil;
import ch.actifsource.generator.AbstractBuildTaskSingleThread;
import ch.actifsource.generator.console.IGeneratorConsole;
import ch.actifsource.generator.target.ISingleThreadBuildTargetInfo;
import ch.actifsource.util.ICancelStatus;
import ch.actifsource.util.file.IAsFile;
import ch.actifsource.util.file.IAsFolder;
import cleon.common.util.spec.actifsource.generator.GeneratorPackage;

public class NwdiagBuildTask extends AbstractBuildTaskSingleThread {
	private final String EXTENSION = ".ndg";
	
	private final List<String> _commands = new ArrayList<String>();
	
	public NwdiagBuildTask(ch.actifsource.core.INode buildTask, ICancelStatus status) {
		super(buildTask, status);
		
	}

	protected ch.actifsource.core.dependency.IDependency internalGenerate(ISingleThreadBuildTargetInfo targetInfo)
			throws ch.actifsource.generator.GenerationException {
		
		if( _commands.isEmpty())
		{
			INode binNode = Select.objectForAttributeOrNull(targetInfo.getTemplateReadJobExecutor(), GeneratorPackage.ExeBuildTask_bin, this.getBuildTaskNode());
			String binPath = LiteralUtil.getStringValue(binNode);
			
			INode fontNode = Select.objectForAttributeOrNull(targetInfo.getTemplateReadJobExecutor(), NwdiagPackage.NwdiagBuildTask_font, this.getBuildTaskNode());
			String fontPath = LiteralUtil.getStringValue(fontNode);
			
			INode imageNode = Select.objectForAttributeOrNull(targetInfo.getTemplateReadJobExecutor(), GeneratorPackage.ExeBuildTask_imageType, this.getBuildTaskNode());
			String imagePath = LiteralUtil.getStringValue(imageNode);
			
			_commands.add(binPath);
			_commands.add("-f");
			_commands.add(fontPath);
			_commands.add("-T");
			_commands.add(imagePath);
		}
	
		IAsFolder targetFolder = targetInfo.getOutputScope().getFolder(targetInfo.getOutputPath());
		try {
			processFolder(targetFolder, targetInfo.getBuildContext().console());
		} catch (IOException e) {
			throw new ch.actifsource.generator.GenerationException(e);
		}
		return null;
	}

	private void processFolder(IAsFolder folder, IGeneratorConsole generatorConsole) throws IOException {
		if(folder == null)
			return;
		
		for (IAsFile nwdiagAsUmlFile : folder.getFiles()) {
			if (nwdiagAsUmlFile.getName().endsWith(EXTENSION)) {
				if (isCanceled())
					return;
				
				String nwdiagFileName = nwdiagAsUmlFile.getName();
				String nwdiagFilename = nwdiagFileName.substring(0, nwdiagFileName.length() - EXTENSION.length())
						+ EXTENSION;
				IAsFile nwDiagFile = folder.getFile(nwdiagFilename);

				generatorConsole.info().print("Processing nwdiag");			
				generatorConsole.info().print(nwdiagAsUmlFile, 0, 0, nwdiagFileName);
				generatorConsole.info().print(" -> ");
				generatorConsole.info().print(nwDiagFile, 0, 0, nwdiagFilename);
				generatorConsole.info().println();

				List<String> command = new ArrayList<String>(_commands);
				command.add(nwdiagFileName);

				ProcessBuilder pb = new ProcessBuilder(command);
				File adapter = folder.getAdapter(File.class);
				pb = pb.directory(adapter);

				Process process = pb.start();
				ErrorStreamReader interruptOnCancel = new ErrorStreamReader(process, console(), getCancelStatus());
				Thread thread = new Thread(interruptOnCancel);
				thread.start();
				try {
					if (isCanceled())
						return;
				} finally {
					interruptOnCancel.terminate();
					try {
						thread.join();
					}catch (InterruptedException localInterruptedException1) {
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
}