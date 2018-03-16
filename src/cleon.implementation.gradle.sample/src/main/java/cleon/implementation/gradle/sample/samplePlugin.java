package cleon.implementation.gradle.sample;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class samplePlugin implements Plugin<Project> {
	public void apply(Project project) {
	
	        project.getTasks().create("hello", sampleHelloTask.class, (task) -> { // <1>
	        });	
	}
}

/* Actifsource ID=[1d5e3672-c0b0-11e7-9af7-bb81e9802ff6,ea530f41-c0a8-11e7-a130-7198de5ddf3f,23j88q+UgzSBjlBrsLgoS4EjSog=] */
