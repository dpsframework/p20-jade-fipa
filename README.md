# p20-jade-fipa
[English](https://github.com/dpsframework/p20-jade-fipa#p20-jade-fipa-1)



## 1. Propuesta de actualización: P20-JADE-FIPA (Finalizada)

- [Descripción de la propuesta en...https://dpsframework.org/proposals/P20-JADE-FIPA](https://dpsframework.org/proposals/P20-JADE-FIPA_es.html)

### 1.1. Cómo generar la librería: `jade-4.5.4-6868.jar` con Maven

- Desde consola, una vez instalado correctamente Apache-Maven:

```shell
git clone https://github.com/dpsframework/p20-jade-fipa.git
cd  p20-jade-fipa

mvn package
```

- En directorio: `./target/`, el archivo `jade-4.5.4-6868.jar` es la version íntegra de la Plataforma JADE que puede operar de forma autónoma hasta la futura revisón de JADE.

- Para futuras revisiones, copiar del Trunk oficial de JADE-v4.5.4-r6868, sobre el directorio `p20-jade-fipa/src/main/java/jade/` y volver a obtener con `mvn package`.




### 1.2. Cómo generar la librería: `jade-4.5.4-6868.jar` manualmente 

- Windows 10:

```shell
 robocopy src\main\java\        target\classes\    /XF *.java /E /NFL
 dir      src\main\java\*.java   /s/b    >  sources-jade.list
```


- GNU-Linux o OS-X Apple:

```shell
 rsync   -av --exclude=*java  src/main/java/   target/classes/
 find    src/main/java/.  -iname  *java  -type f   > sources-jade.list
```



- **Compilar con:**:

```shell
 javac   -d   target/classes    @sources-jade.list
 jar     --create --file  jade-4.5.4-6868.jar  -C target/classes  .
 jar     --update --file jade-4.5.4-6868.jar --manifest=src/main/resources/META-INF/MANIFEST.MF
```

- **Comprobar de nuevo el resultado con:**:

```shell 
 java -jar jade-4.5.4-6868.jar -gui
```


**Fig. 1**: Desde el menú Acciones del agente JADE RMA, se ha creado un agente de tipo `jade.tools.testagent.TestAgent` denominado **Test22**. Es visible en la esquina inferior izquierda. Con el botón "Iniciar-DummigAgent", se ha creado el agente denominado "da0@dirección-ip-local/JADE". Y entre estas entidades se ha enviado un mensaje de tipo INFORM con Protocolo de Interacción "fipa-request". El mensaje es recibido y mostrado por el agente Test22.

![Resultados de la prueba con JADE-4.5.4-r6868 compilado con OpenJDK-18](./images/test-jade-rma-agent-454-6868-Java-JDK-17.png)






---

# p20-jade-fipa
[Castellano](https://github.com/dpsframework/p20-jade-fipa#p20-jade-fipa)

## 1. Update proposal: P20-JADE-FIPA (COMPLETED)

- [Description of the proposal in...https://dpsframework.org/proposals/P20-JADE-FIPA](https://dpsframework.org/proposals/P20-JADE-FIPA_en.html)

### 1.1. How to generate the library: `jade-4.5.4-6868.jar` with Maven

- From the console, once Apache-Maven is correctly installed:

```shell
git clone https://github.com/dpsframework/p20-jade-fipa.git
cd p20-jade-fipa

mvn package
```

- In directory: `./target/`, the file `jade-4.5.4-6868.jar` is the full version of the JADE Platform that can operate autonomously until the future revision of JADE.

- For future revisions, copy from the official JADE-v4.5.4-r6868 Trunk, over the `p20-jade-fipa/src/main/java/jade/` directory and fetch again with `mvn package`.




### 1.2. How to generate the library: `jade-4.5.4-6868.jar` manually

-Windows 10:
```shell
 robocopy src\main\java\        target\classes\    /XF *.java /E /NFL
 dir      src\main\java\*.java   /s/b    >  sources-jade.list
```


- GNU-Linux or OS-X Apple:

```shell
 rsync   -av --exclude=*java  src/main/java/   target/classes/
 find    src/main/java/.  -iname  *java  -type f   > sources-jade.list
```



- Compile and package by hand:


```shell
 javac   -d   target/classes    @sources-jade.list
 jar     --create --file  jade-4.5.4-6868.jar  -C target/classes  .
 jar     --update --file jade-4.5.4-6868.jar --manifest=src/main/resources/META-INF/MANIFEST.MF
```


- **Check the result again with:**:


```shell 
 java -jar jade-4.5.4-6868.jar -gui
```




**Fig. 1**: From the JADE RMA Agent Actions menu, an agent of type `jade.tools.testagent.TestAgent` called **Test22** has been created. It is visible in the lower left corner. Using the "Start-DummigAgent" button, the agent named "da0@local-ip-address/JADE" has been created. And between these entities, an INFORM type message has been sent with the "fipa-request" Interaction Protocol. The message is received and displayed by the Test22 agent.

![Test results with JADE-4.5.4-r6868 compiled with OpenJDK-18](./images/test-jade-rma-agent-454-6868-Java-JDK-17.png)




