# p20-jade-fipa
[English]()


## 1. Propuesta de actualización: P20-JADE-FIPA (SOLVED)

- [Descripción de la propuesta en...](https://dpsframework.org/proposals/P20-JADE-FIPA_es.html)

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
