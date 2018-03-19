package com.gundi.gradle.java.plugin;

import org.gradle.api.Project;

import java.io.File;

/**
 * Created by pai on 15.03.18.
 */
public class CustomGradleJavaPluginExtensions {


    File sourceDir;
    String headingMessage;

    public CustomGradleJavaPluginExtensions(Project project) {
        sourceDir = new File(project.getProjectDir(), "src");
        headingMessage = "Default Message from the Extension";
    }


}
