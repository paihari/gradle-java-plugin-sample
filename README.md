![Gundi](https://paihari.github.io/repo/gundi-logo.png)

# Gradle Java Plugin Sample

Step by step guide to create a Custom Gradle Plugin in Java and sample project for usagae

##Structure

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
 7. Execute ./gradle clean build uploadArchives command
 8. local maven repo folder created, which in this case is used in plugin-sample

## plugin-sample
 1. Create a sample gradle project
 2. Apply the buildScript plugin, which resolves the plugin dependencies(refer the build.gradle)
 3. Apply the custom plugin, the name refers to the point mentioned in the point 5 of gradle-java-pluin
 4. Provide the custom plugin extension properties
 5. Execute ./gradlew build customGradleJavaPluginTask
 6. Verify the output intended
 
 
