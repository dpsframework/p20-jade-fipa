# p20-jade-fipa: a proposal for upgrade JADE v4.5.4-r6868

The full description of this update proposal can be found at:
-  <https://dpsframework.org/proposals/P20-JADE-FIPA_en.html>


## 1. Introduction

### 1.1. Description


-  It is proposed to use the Java Module System on top of the JADE 4.5.4 (2022) platform core. And connect JADE to the FIPA module internally through the declaration of the file module-info.java on `com.tilab.jade` to the file module-info.java on `org.fipa`.

-  Once the unification with the FIPA module with the JADE 4.5.4 has been carried out, it will be possible to know the scope of the necessary changes in the JADE kernel; know what are the additional necessary libraries required by JADE 4.5.4 and allow JADE to be compiled with OpenJDK-17 or higher.


## 1.2 An example of the proposed module: `module-info.java`

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

### 1.3. Compilation and packaging test


```shell
 Clone and move to directory:  p20-jade-fipa   

Windows:    
--------------
mkdir    builded
robocopy src\main\java\  builded\    /XF *.java /E /NFL
dir      src\*.java   /s/b    >  sources.txt
javac --module-path ../p10-fipa-corba/org.fipa-2002.jar @sources.txt -d builded/com.tilab.jade
jar --create --file  com.tilab.jade-4.5.4-6868.jar --manifest=MANIFEST.MF  -C builded/com.tilab.jade .


GNU and OS-X:
--------------
mkdir   builded
rsync   -av --exclude=*java  src/main/java/   builded/
find    .  -iname *java > sources.txt

javac --module-path ../p10-fipa-corba/org.fipa-2002.jar @sources.txt -d builded/com.tilab.jade
jar --create --file  com.tilab.jade-4.5.4-6868.jar --manifest=MANIFEST.MF  -C builded/com.tilab.jade .
 


  
Testing:
----------------------------------------
java  -cp   com.tilab.jade-4.5.4-6868.jar   jade.Boot -gui -port 4455
  
  
```


**Fig. 1**: From the JADE RMA Agent Actions menu, an agent of type `jade.tools.testagent.TestAgent` named **Test22** has been created. It is visible in the lower left corner. With the "Start-DummigAgent" button, the agent named "da0@local-ip-address/JADE" has been created. And an INFORM type message with "fipa-request" Interaction Protocol has been sent between these entities. The message is received and displayed by the Test22 agent.
![Results of test](./images/test-jade-rma-agent-454-6868-Java-JDK-17.png)



## OpenJDK-17  Detected Java Problems in JADE v4.5.4-r6868

First 80 problems detected by the JDK-17 compiler. They are not important, and that is why the  `master` branch contains the original source-code of JADE-4.5.4-6868, and the `p20-JADE` branch contains the corrections and performance tests.

| Nord. |  Description  |  Resource  |  Path  |  Location  |  Type  |  
| :---: |  :---         |  :---      |  :---  |  :---      |  :---  |  
| 1       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  APDescriptionPanel.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 107  |  Java Problem  |  
| 2       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  APServicePanel.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 105  |  Java Problem  |  
| 3       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  APServicePanel.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 105  |  Java Problem  |  
| 4       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 172  |  Java Problem  |  
| 5       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 219  |  Java Problem  |  
| 6       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 297  |  Java Problem  |  
| 7       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 308  |  Java Problem  |  
| 8       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 610  |  Java Problem  |  
| 9       |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 610  |  Java Problem  |  
| 10      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 674  |  Java Problem  |  
| 11      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 791  |  Java Problem  |  
| 12      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 1196  |  Java Problem  |  
| 13      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AclGui.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 1196  |  Java Problem  |  
| 14      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AgentList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/sniffer  |  line 54  |  Java Problem  |  
| 15      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AgentTree.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 910  |  Java Problem  |  
| 16      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  AggregateHelper.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 171  |  Java Problem  |  
| 17      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ArrayList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util/leap  |  line 54  |  Java Problem  |  
| 18      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ArrayList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util/leap  |  line 61  |  Java Problem  |  
| 19      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ArrayList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util/leap  |  line 67  |  Java Problem  |  
| 20      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ArrayList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util/leap  |  line 250  |  Java Problem  |  
| 21      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  BEManagementService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/imtp/leap/nio  |  line 1346  |  Java Problem  |  
| 22      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  CFReflectiveIntrospector.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 67  |  Java Problem  |  
| 23      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ClassFinder.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util  |  line 61  |  Java Problem  |  
| 24      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ClassFinder.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util  |  line 113  |  Java Problem  |  
| 25      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ClassFinder.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util  |  line 143  |  Java Problem  |  
| 26      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ClassFinder.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/util  |  line 344  |  Java Problem  |  
| 27      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ClassSelectionDialog.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 116  |  Java Problem  |  
| 28      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  ExtendedSLParser.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/lang/sl  |  line 1124  |  Java Problem  |  
| 29      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  JavaLoggingLogManagerImpl.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/logging  |  line 59  |  Java Problem  |  
| 30      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  JavaLoggingLogManagerImpl.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/logging  |  line 86  |  Java Problem  |  
| 31      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MMCanvas.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/sniffer  |  line 101  |  Java Problem  |  
| 32      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MainDetectionManager.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core  |  line 275  |  Java Problem  |  
| 33      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MainPanel.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/rma  |  line 232  |  Java Problem  |  
| 34      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MainPanel.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/rma  |  line 232  |  Java Problem  |  
| 35      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MessageList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/sniffer  |  line 45  |  Java Problem  |  
| 36      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MessageTransportProtocol.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/mtp/iiop  |  line 246  |  Java Problem  |  
| 37      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MessageTransportProtocol.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/mtp/iiop  |  line 264  |  Java Problem  |  
| 38      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MessageTransportProtocol.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/mtp/iiop  |  line 301  |  Java Problem  |  
| 39      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  MessageTransportProtocol.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/mtp/iiop  |  line 572  |  Java Problem  |  
| 40      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  Ontology.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 872  |  Java Problem  |  
| 41      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  Ontology.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 897  |  Java Problem  |  
| 42      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  Ontology.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 922  |  Java Problem  |  
| 43      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  Ontology.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 928  |  Java Problem  |  
| 44      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  RequestFIPAServiceBehaviour.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/domain  |  line 292  |  Java Problem  |  
| 45      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  SLParser.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/lang/sl  |  line 1058  |  Java Problem  |  
| 46      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  StartDialog.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/tools/rma  |  line 300  |  Java Problem  |  
| 47      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  TopicTable.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/messaging  |  line 88  |  Java Problem  |  
| 48      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  TopicTable.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/messaging  |  line 97  |  Java Problem  |  
| 49      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  VisualPropertiesList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 59  |  Java Problem  |  
| 50      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  VisualPropertiesList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 65  |  Java Problem  |  
| 51      |  ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized  |  VisualPropertiesList.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 65  |  Java Problem  |  
| 52      |  Boolean is a value-based type which is a discouraged argument for the synchronized statement  |  GuiAgent.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 94  |  Java Problem  |  
| 53      |  Boolean is a value-based type which is a discouraged argument for the synchronized statement  |  GuiAgent.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/gui  |  line 153  |  Java Problem  |  
| 54      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsAgentAction.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 60  |  Java Problem  |  
| 55      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsAgentAction.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 61  |  Java Problem  |  
| 56      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsConcept.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 68  |  Java Problem  |  
| 57      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsConcept.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 69  |  Java Problem  |  
| 58      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsHelper.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 753  |  Java Problem  |  
| 59      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsIRE.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 135  |  Java Problem  |  
| 60      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsIRE.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 136  |  Java Problem  |  
| 61      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsPredicate.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 79  |  Java Problem  |  
| 62      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsPredicate.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 80  |  Java Problem  |  
| 63      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsReference.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 127  |  Java Problem  |  
| 64      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsReference.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 128  |  Java Problem  |  
| 65      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsVariable.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 114  |  Java Problem  |  
| 66      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AbsVariable.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/abs  |  line 115  |  Java Problem  |  
| 67      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AddressNotificationService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/replication  |  line 72  |  Java Problem  |  
| 68      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  Agent.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core  |  line 1350  |  Java Problem  |  
| 69      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentContainerImpl.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core  |  line 1154  |  Java Problem  |  
| 70      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentManagementService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/management  |  line 141  |  Java Problem  |  
| 71      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentManagementService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/management  |  line 968  |  Java Problem  |  
| 72      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentManagementService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/management  |  line 969  |  Java Problem  |  
| 73      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentMobilityService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/mobility  |  line 158  |  Java Problem  |  
| 74      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentMobilityService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/mobility  |  line 1357  |  Java Problem  |  
| 75      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentMobilityService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/mobility  |  line 1377  |  Java Problem  |  
| 76      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentMobilityService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/mobility  |  line 1381  |  Java Problem  |  
| 77      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AgentReplicationService.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/core/replication  |  line 145  |  Java Problem  |  
| 78      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AggregateHelper.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 49  |  Java Problem  |  
| 79      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AggregateHelper.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 75  |  Java Problem  |  
| 80      |  Class is a raw type. References to generic type Class<T> should be parameterized  |  AggregateHelper.java  |  /JADE-Core-v4.5.4-r6867/src/main/java/com.tilab.jade/jade/content/onto  |  line 78  |  Java Problem  |  
