# p20-jade-fipa: <br>JADE-FIPA enhancement request to allow compilation with OpenJDK-18, JDK-17 LTS and earlier versions of Java

- [Spanish version here...](README.md)

### Based on Official Trunk: JADE-v4.5.4-r6868

- The description of this request can be found at: [dpsFramework - p20-jade-fipa](https://dpsframework.org/proposals/P20-JADE-FIPA_en.html)


## 1. Background

1. This is the exact version of JADE-4.5.4-6868, copied from JADE Trunk, which has been prepared to be compiled with Maven.

1. This proposal is a simple organization of the JADE code, which uses the sources of the CORBA and Apache Commons Codec libraries. This version of JADE (jade-4.5.4-6868.jar) is a perfect starting point to start deeper analyzes of the JADE Platform and its evolution in the next 5 years.

1. Of course, this is all thanks to the efforts of the TILAB.com Team. And also, it is thanks to the proposed evolution in Java for the use of the Java Platform Module System.


### 1.1. How to get the version of JADE-4.5.4-r6868

- **Use Maven to get the library using:**

```shell
git clone https://github.com/dpsframework/p20-jade-fipa.git
cd p20-jade-fipa

mvn package

```

- That is all!
- The result, in the `./target/` directory, is the self-contained, ready-to-use JADE `jade-4.5.4-6868.jar` file.

### 1.2 A starting point for new proposals:

#### 1.2.1. Take a look at the file: `module-info.java`

- It is located in the /src/main/java/jade/ directory.


```java
/**
 * JADE Revision 6868 version 4.5.4. by, Enrico Scagliotti and Giovanni Caire.
 * Source:   https://jade.tilab.com/svn/jade/trunk
 * Revision: 6868
 * Author: caire
 * Date: jueves, 14 de julio de 2022 11:06:20
 * Message: Properly logged the stack-trace when an unexpected error occurs creating an agent.
 * Modified : /trunk/src/jade/core/management/AgentManagementService.java
 * ---
 * Revision: 6867
 * Author: scagliotti
 * Date: viernes, 29 de abril de 2022 12:07:55
 * Message: Upgraded version to 4.5.4
 * Modified : /trunk/build.properties
 * ---
 * This proposal: P20-JADE-FIPA    https://dpsframework.org/proposals/P20-JADE-FIPA_en.html
 * Source at:     GitHub           https://github.com/dpsframework/p20-jade-fipa
 * Commons-Codec: https://archive.apache.org/dist/commons/codec/binaries/commons-codec-1.3.tar.gz
 *            
 */
module com.tilab.jade {
	exports jade;
    
	requires org.fipa;
    
	requires java.logging;
	requires java.desktop;
	requires java.rmi;
	requires java.management;
	requires java.sql;
	requires java.net.http;
}

```


#### 1.2.2. To get the previous version .JAR file compiled manually, it can be done from the console with:


- **On Windows console**:

```shell
 robocopy src\main\java\        target\classes\    /XF *.java /E /NFL
 dir      src\main\java\*.java   /s/b    >  sources-jade.list
```


- **On GNU-Linux or OS-X**:

```shell
 rsync   -av --exclude=*java  src/main/java/   target/classes/
 find    src/main/java/.  -iname  *java  -type f   > sources-jade.list
```



- **Compile and package by hand with:**:
- 
```shell
 javac   -d   target/classes    @sources-jade.list
 jar     --create --file  jade-4.5.4-6868.jar  -C target/classes  .
 jar     --update --file jade-4.5.4-6868.jar --manifest=src/main/resources/META-INF/MANIFEST.MF
```
```

- **Check the result again with:**:


```shell 
 java -jar jade-4.5.4-6868.jar -gui
```

- **If you need to access the JADE platform from listening port 7778**, you must use:**



```shell

 java --add-opens java.xml/com.sun.org.apache.xerces.internal.jaxp=ALL-UNNAMED -jar jade-4.5.4-6868.jar -gui
```



- **And you can check it with**:

```shell
 http://localhost:7778/acc/
 
```


- If you have received a warning of the type: `WARNING: Malformed POST` then everything has been correct and the format of the POST statement has not been correct although it has been processed by JADE.





**Fig. 1**: From the JADE RMA Agent Actions menu, an agent of type `jade.tools.testagent.TestAgent` called **Test22** has been created. It is visible in the lower left corner. Using the "Start-DummigAgent" button, the agent named "da0@local-ip-address/JADE" has been created. And between these entities, an INFORM type message has been sent with the "fipa-request" Interaction Protocol. The message is received and displayed by the Test22 agent.

![Test results with JADE-4.5.4-r6868 compiled with OpenJDK-18](./images/test-jade-rma-agent-454-6868-Java-JDK-17.png)

