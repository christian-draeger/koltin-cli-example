# kotlin-cli-example

This example project demonstrates how to build a CLI (command line interface) application with Kotlin


#### Artifacts
The gradle build will produce a fatjar (jar that includes all its dependencies) and a **native-image**.

To build the artifacts run:

    ./gradlew build

The fatjar can be found und `build/libs`-folder. 
To execute the fat-jar run:

    java -jar ./build/libs/koltin-cli-example-all.jar

The native-image (binary) can be found und `build/native-image`-folder.
To execute the native binary

    ./mycli

## Run from Jar

    java -jar kotlin-cli-example-all.jar
    
