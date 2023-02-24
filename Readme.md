
# MECANISMOS PARA GENERACIÓN DE FRAMEWORKS DE APLICACIONES EMPRESARIALES: CONTENEDORES, IOC, META-*, REFLEXIÓN

## Descripcion
Servidor que ser capaz de entregar páginas html asi como provee un framework IoC para la construcción de aplicaciones web a partir de POJOS


## Prerrequisitos

Para ejecutar el laboratorio se debe tener instalado:

- Java
- Maven
- Git


## Instalación

Debe usarse el comando git clone para descargar el repositorio

```
git clone https://github.com/Juanda171217/lab4Arep
```

Para compilar el proyecto se debe usar:

```
mvn package

```
Para ejecutarlo, se debe hacer de la siguiente forma

```
java -cp "target\classes" edu.escuelaing.HttpServer

```

Una vez iniciado el servidor, se puede acceder a la pagina web en el siguiente link

```
http://localhost:38000/hello
```
 
Si desea ver otras opciones cambie el "/hello" por los siguientes:

* hello2
* hello3
* hello4

## Pruebas

[![33.png](https://i.postimg.cc/Y0nmyw1r/33.png)](https://postimg.cc/n9mzCgRg)

[![44.png](https://i.postimg.cc/vZ66XkDy/44.png)](https://postimg.cc/MnqTpsy3)

[![55.png](https://i.postimg.cc/d02ZcC8S/55.png)](https://postimg.cc/WD41MhYM)


## Documentación

Para generar la documentación del proyecto se debe ejecutar el siguiente comando

```
mvn javadoc:javadoc
```
Para ver la documentación se debe abrir el archivo index.html que se encuentra en la carpeta target/site/apidocs

## Trabajo en clase

Para ver los test hechos en clase
```
java -cp "target/classes" edu.escuelaing.InvokeMain edu.escuelaing.RunTests edu.escuelaing.Foo
```
## Autor

* **Juan David Martinez** - [juanda171217](https://github.com/Juanda171217)
