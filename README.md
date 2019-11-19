# kotlin-cli-example

This example project demonstrates how to build a CLI (command line interface) application with Kotlin


### Artifacts
The gradle build will produce a fatjar (jar that includes all its dependencies) and a native-image.

#### Jar

To **build the fat-jar** run:

    ./gradlew build

Afterwards the fat-jar can be found und `build/libs`-folder. 

To **execute the fat-jar** run:

    java -jar koltin-cli-example-all.jar

#### Native Binary

##### Prerequisites
* GraalVM installed
    * e.g. via [sdk-man](https://sdkman.io/install): `sdk use java 19.2.1-grl`
* native-image installed
    * simply run `gu install native-image`

To **build the native binary** run:

    ./gradlew nativeImage

The native-image (binary) can be found und `build/native-image`-folder.
To execute the native binary

    ./mycli
