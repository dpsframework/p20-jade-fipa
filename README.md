# p20-jade-fipa: <br>Solicitud de mejora de JADE-FIPA para permitir su compilación con OpenJDK-18, JDK-17 LTS y versiones anteriores de Java

- [English version here...](README_en.md)

### Basado en Trunk oficial: JADE-v4.5.4-r6868

- La descripción esta solicitud se encuentra en: [dpsFramework - p20-jade-fipa](https://dpsframework.org/proposals/P20-JADE-FIPA_es.html)


## 1. Antecedentes

1. Esta es la versión exacta de JADE-4.5.4-6868, copiada de JADE Trunk, que ha sido preparada para ser compilada con Maven.

1. Esta propuesta es una organización simple del código JADE, que utiliza las fuentes de las librerías CORBA y Apache Commons Codec. Esta versión de JADE (jade-4.5.4-6868.jar) y, es un punto de partida perfecto para iniciar análisis más profundos de la Plataforma JADE y de su evolución en los próximos 5 años.

1. Por supuesto, todo esto es gracias al esfuerzo del Equipo de TILAB.com. Y también, es gracias a la evolución propuesta en Java para el uso del Java Platform Module System.


### 1.1. Cómo obtener la versión de JADE-4.5.4-r6868

- **Use Maven para obtener la librería usando:**

```shell
git clone https://github.com/dpsframework/p20-jade-fipa.git
cd  p20-jade-fipa

mvn package

```
- ¡Eso es todo!
- El resultado en el directorio `./target/`, es el archivo `jade-4.5.4-6868.jar` autónomo y listo para usar JADE.

### 1.2 Un punto de partida para nuevas propuestas:

#### 1.2.1. Echar un vistazo al archivo: `module-info.java`

- Se encuentra en el directorio /src/main/java/jade/.

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

#### 1.2.2. Para obtener la versión anterior compilada manualmente, puede hacerse desde consola con:

- **En Ms-Windows**:
- **On Windows console**:

```shell
 robocopy src\main\java\        target\classes\    /XF *.java /E /NFL
 dir      src\main\java\*.java   /s/b    >  sources-jade.list
```


- **Sobre GNU-Linux o OS-X**:

```shell
 rsync   -av --exclude=*java  src/main/java/   target/classes/
 find    src/main/java/.  -iname  *java  -type f   > sources-jade.list
```



- **Compilar y empaquetar a mano con:**:

```shell
 javac   -d   target/classes    @sources-jade.list
 jar     --create --file  jade-4.5.4-6868.jar  -C target/classes  .
 jar     --update --file jade-4.5.4-6868.jar --manifest=src/main/resources/META-INF/MANIFEST.MF
```

- **Comprobar de nuevo el resultado con:**:

```shell 
 java -jar jade-4.5.4-6868.jar -gui
```

- **Si necesita acceder a la plataforma JADE desde el puerto de escucha 7778**, debe utilizar:**

`--add-opens` sobre Java JDK-9 o superior. Para hacer esto proceda con:

```shell

 java --add-opens java.xml/com.sun.org.apache.xerces.internal.jaxp=ALL-UNNAMED -jar jade-4.5.4-6868.jar -gui
```

- **Y puede comprobarlo con**:

```shell
 http://localhost:7778/acc/
 
```


- Si ha obtenido una advertencia del tipo: `WARNING: Malformed POST` entonces todo ha sido correcto y el formato de la sentencia POST no ha sido la correcta aunque sí ha sido procesada por JADE.



**Fig. 1**: Desde el menú Acciones del agente JADE RMA, se ha creado un agente de tipo `jade.tools.testagent.TestAgent` denominado **Test22**. Es visible en la esquina inferior izquierda. Con el botón "Iniciar-DummigAgent", se ha creado el agente denominado "da0@dirección-ip-local/JADE". Y entre estas entidades se ha enviado un mensaje de tipo INFORM con Protocolo de Interacción "fipa-request". El mensaje es recibido y mostrado por el agente Test22.

![Resultados de la prueba con JADE-4.5.4-r6868 compilado con OpenJDK-18](./images/test-jade-rma-agent-454-6868-Java-JDK-17.png)
