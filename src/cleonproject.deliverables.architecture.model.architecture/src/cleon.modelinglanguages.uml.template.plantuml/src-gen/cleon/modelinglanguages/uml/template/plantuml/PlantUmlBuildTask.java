package cleon.modelinglanguages.uml.template.plantuml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ch.actifsource.generator.AbstractBuildTaskSingleThread;
import ch.actifsource.generator.console.IGeneratorConsole;
import ch.actifsource.generator.target.ISingleThreadBuildTargetInfo;
import ch.actifsource.util.ICancelStatus;
import ch.actifsource.util.file.IAsFile;
import ch.actifsource.util.file.IAsFolder;
import ch.actifsource.util.io.ReaderInputStream;

public class PlantUmlBuildTask extends AbstractBuildTaskSingleThread {
	private static final ExecutorService _executer = Executors.newFixedThreadPool(8);
	
	private final List<String> _commands = new ArrayList<String>();
	@javax.annotation.CheckForNull

	
	public PlantUmlBuildTask(ch.actifsource.core.INode buildTask, ICancelStatus status) {
		super(buildTask, status);
		
	}

	protected ch.actifsource.core.dependency.IDependency internalGenerate(ISingleThreadBuildTargetInfo targetInfo)
			throws ch.actifsource.generator.GenerationException {

		if(_commands.isEmpty())
		{
			_commands.add("java");
			_commands.add("-jar");
			_commands.add("\"C:\\ProgramData\\chocolatey\\lib\\plantuml\\tools\\plantuml.jar\"");
			_commands.add("-tpng");
			_commands.add("-duration");
			_commands.add("-progress");
		}
			
	
		IAsFolder targetFolder = targetInfo.getOutputScope().getFolder(targetInfo.getOutputPath());
		try {
			processFolder(targetFolder, targetInfo.getBuildContext().console());
		} catch (IOException e) {
			throw new ch.actifsource.generator.GenerationException(e);
		}
		return null;
	}
	
	private static String read(InputStream input) throws IOException {
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(input))) {
            return buffer.readLine();
        }
    }	
	
	private void processFolder(IAsFolder folder, IGeneratorConsole generatorConsole) throws IOException {
		if(folder == null)
			return;
		
		
		for (IAsFile plantAsUmlFile : folder.getFiles()) {
			if (plantAsUmlFile.getName().endsWith(".puml")) {
				if (isCanceled())
					return;
				
				String plantUmlFileName = plantAsUmlFile.getName();
				String pumlFilename = plantUmlFileName.substring(0, plantUmlFileName.length() - ".puml".length())
						+ ".puml";
				
				
				IAsFile pumlFile = folder.getFile(pumlFilename);				
				IAsFile hashCodeFile = folder.getFile(pumlFilename + ".hash");
				generatorConsole.info().print("Processing plantuml ");
				generatorConsole.info().print(plantAsUmlFile, 0, 0, plantUmlFileName);
				generatorConsole.info().print(" -> ");
				generatorConsole.info().print(pumlFile, 0, 0, pumlFilename);
				generatorConsole.info().print(": Hashcode " + pumlFile.hashCode());

				String hashCodeofFile = String.valueOf(pumlFile.hashCode());
				if(hashCodeFile.exists())
				{
					String hashCode = read(hashCodeFile.getContents());
					if(hashCodeofFile.equals(hashCode))
					{
						generatorConsole.info().print("skipping");
						continue;
					}
					hashCodeFile.delete();
				}
				try( ReaderInputStream inputStream = new ReaderInputStream(new StringReader(hashCodeofFile), Charset.defaultCharset()))
				{
					hashCodeFile.write(inputStream);					
				}
				
				generatorConsole.info().println();

				List<String> command = new ArrayList<String>(_commands);
				command.add(plantUmlFileName);

				ProcessBuilder pb = new ProcessBuilder(command);
				File adapter = folder.getAdapter(File.class);
				pb = pb.directory(adapter);

				ProcessRunnable interruptOnCancel = new ProcessRunnable(pb, console(), getCancelStatus());
				_executer.submit(interruptOnCancel);
			}
		}

		for (IAsFolder subFolder : folder.getSubFolders()) {
			processFolder(subFolder, generatorConsole);
		}
	}
}