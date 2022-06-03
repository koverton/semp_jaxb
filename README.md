# Legacy JAXB v1 Build

JAXB has been moved out of Java-EE and been taken over by the Eclipse foundation.
This has changed namespaces so to build schemas compliant with JAXB v1, it's necessary 
to use a JDK 1.8 or earlier.

## Updated JAXB build

To build via JAXB v2 you need new tools and dependencies to continue building JAXB serializers.
I'm still trying to get v2 to work, the below documentation is incomplete.

## Installing jaxb
** package version from https://javaee.github.io/jaxb-v2/ does not work

Build it from source:
```bash
~/working/git/ $ git clone git@github.com:eclipse-ee4j/jaxb-ri.git
~/working/git/ $ cd jaxb-ri/jaxb-ri/
~/working/git/ $ mvn clean install
~/working/git/ $ cd bundles/ri/target/
~/working/git/ $ unzip jaxb-ri.zip
~/working/git/ $ cd jaxb-ri
~/working/git/ $ export JAXB_HOME=`pwd`
~/working/git/ $ export PATH=$PATH:$JAXB_HOME/bin
```

## NO LONGER NEEDED:
Include the javax.activation module:
Download https://mvnrepository.com/artifact/com.sun.activation/javax.activation/1.2.0
Copy it to the jaxb "mod" folder and add it to the JAXB_PATH.

## Using the new toolchain

Our JAXB bindings XSD files from the old J2EE spec do not match the new tools 
namespace and version. It is necessary to update those with the following changes:

* Change the XMLNS from `http://java.sun.com/xml/ns/jaxb` to `https://jakarta.ee/xml/ns/jaxb`
* Change the JAXB version from 2.x to 3.0

For example:

```git diff my-jaxb-bindings.xsd
-<jaxb:bindings xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:jaxb="http://java.sun.com/xml/ns/jaxb" version="2.1">
+<jaxb:bindings xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:jaxb="https://jakarta.ee/xml/ns/jaxb" version="3.0">
```
