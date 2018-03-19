# Gradle Java Plugin Sample

Step by step guide to create a Custom Gradle Plugin in Java and sample project for usagae

#Structure

This project has three sections
 * gradle-java-plugin : Simple gradle java plugin projcet
 * plugin-sample : Simple usage of the above plugin
 * repo : Maven local repository
 
## gradle-java-plugin
 1. Create a new gradle project
 2. Apply 'java-gradle-plugin'
 3. Apply 'maven' plugin to distribute the libs
 4. Create CustomGradleJavaPlugin, CustonGradleJavaPluginExtension and CustomGradleJavaPluginTask classes in %PROJECT%/src/main/java
 5. Create META-INF/gradle-plugins folder at %PROJECT_FOLDER%/src/main/resources folder
 6. Create a properties file, the name should represent the name of the plugin, which will be represented in other projects
 
 
 
 

