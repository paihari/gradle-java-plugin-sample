package com.gundi.gradle.java.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pai on 15.03.18.
 */
public class CustomGradleJavaPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        Map<String,Object> taskInfo = new HashMap<String,Object>();
        taskInfo.put("type", CustomGradleJavaPluginTask.class);
        taskInfo.put("description", "Generates Custom Java Plugin Task.");
        taskInfo.put("group", "com.gundi.gradle.java.plugin");
        Task customGradleJavaPluginTask = project.task(taskInfo, "customGradleJavaPluginTask");


        CustomGradleJavaPluginExtensions extensions = new CustomGradleJavaPluginExtensions(project);


        project.getExtensions().add("customGradleJavaPluginName", extensions);

    }
}