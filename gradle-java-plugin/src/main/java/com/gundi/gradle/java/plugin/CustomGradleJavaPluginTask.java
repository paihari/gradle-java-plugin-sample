package com.gundi.gradle.java.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by pai on 15.03.18.
 */
public class CustomGradleJavaPluginTask extends DefaultTask {

    @TaskAction
    public void action() {



        CustomGradleJavaPluginExtensions extensions = (CustomGradleJavaPluginExtensions) getProject()
                .getExtensions().findByName("customGradleJavaPluginName");

        File sourceDir = extensions.sourceDir;
        System.out.println("Task Heading Message: " + extensions.headingMessage);
        try {

            Files.list(Paths.get(sourceDir.getAbsolutePath()))
                    .forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
