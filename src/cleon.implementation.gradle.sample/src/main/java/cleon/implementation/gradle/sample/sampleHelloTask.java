package cleon.implementation.gradle.sample;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class sampleHelloTask extends DefaultTask {
	
	@TaskAction
	void sayGreeting() {
		System.out.printf("Hello");
	}
}
/* Actifsource ID=[c8d0bed7-c0b0-11e7-9af7-bb81e9802ff6,cb6927e5-c0b1-11e7-9af7-bb81e9802ff6,3zZ3xqAQoo3cXFqz9lpgyjuUkC4=] */
