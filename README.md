# Proyecto - Tipos Abstractos de Datos

## Descripción del Problema

**Este ejercicio implementa el TAD Rational**

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
*Rational*
======================
Introduce el numerador   del Racional a: 7
Introduce el denominador del Racional a: 5
Introduce el numerador   del Racional b: 2
Introduce el denominador del Racional b: 3

Racional a = 7/5
Racional b = 2/3

7/5 + 2/3 =31/15
7/5 * 2/3 =14/15
2/5 = 4/10 = True

```


## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Rational
---
classDiagram
      class Rational
      Rational: -a
      Rational: -b
      Rational: +makeRational()
      Rational: +add()
      Rational: +mult()
      Rational: +equal()

```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)
```mermaid
---
title: Matriz
---
classDiagram
      class Matriz
      Matriz: -int n
      Matriz: -int m 
      Matriz: -int matriz[]
      Matriz: +Matriz()
      Matriz: +Matriz(int,int)
      Matriz: +void asignarMat(int,int,int)
      Matriz: +int infoMat(int,int)
      Matriz: +int filasMat()
      Matriz: +int columnasMat()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)
```mermaid
---
title: Conjunto
---
classDiagram
      class Conjunto
      Conjunto:  _int M
      Conjunto: -Object cto[]
      Conjunto: -int cardinal
      Conjunto: -int capacidad
      Conjunto: +Conjunto()
      Conjunto: +boolen esVacio()
      Conjunto: +void añadir(Object)
      Conjunto: +void retirar(Object)
      Conjunto: +boolean pertenece(Object)
      Conjunto: +int cardinal()
      Conjunto: +Conjunto union(Conjunto)
      Conjunto: +Object elemento(int)
```

```mermaid
---
title: Persona
---
classDiagram
      class Persona
      Persona: -String nombre
      Persona: -String curp
      Persona: -Fecha fechaNacimiento
      Persona: +Persona()
      Persona: +Persona(String,String,Fecha)
      Persona: +void toString()
      
```
```mermaid
---
title: Fecha
---
classDiagram
      class Fecha
      Fecha: -int dia
      Fecha: -int mes
      Fecha: -int anio
      Fecha: +Fecha(int,int,int)
      Fecha: +Fecha(String)
      Fecha: +int getDia()
      Fecha: +int getMes()
      Fecha: +int getAnio()
      Fecha: +setDia(int)
      Fecha: +setMes(int)
      Fecga: +setAnio(int)
      Fecha: +boolean equals(Fecha)
      Fecha: +int fechaToDias()
      Fecha: +void diasToFecha()
      Fecha: +void addDias(int)
      Fecha: +String toString()
      
```

```mermaid
---
title: Cadena
---
classDiagram
      class Cadena
      Cadena: -char cadena[80]
      Cadena: -int tamanio 
      Cadena: -int TOPE
      Cadena: +Cadena()
      Cadena: +Cadena(char [])
      Cadena: +void borrarInicio()
      Cadena: +void agregarFinal(char)
      Cadena: +boolean vacia()
      Cadena: +boolean llena()
      Cadena: +Cadena invertir()
      Cadena: +String toString()
      
```
```mermaid
---
title: Numerote
---
classDiagram
      class Numerote
      Numerote:_int M
      Numerote:+Numerote()
      
```
```mermaid
---
title: Cuenta_Cheques
---
classDiagram
      class Cuenta_Cheques
      Cuenta_Cheques: -String nombreCuenta
      Cuenta_Cheques: -String nombreCliente
      Cuenta_Cheques: -String sucursal
      Cuenta_Cheques: -float saldo
      Cuenta_Cheques: +Cuenta_Cheques()
      Cuenta_Cheques: +Cuenta_Cheques(String,String,String)
      Cuenta_Cheques: +deposito(float)
      Cuenta_Cheques: +retiro(float)
      Cuenta_Cheques: +float muestra_saldo()

      
      
```

```mermaid
---
title: Punto
---
classDiagram
      class Punto
      Punto: -int x
      Punto: -int y 
      Punto: -int z
      Punto: -String dimension
      Punto: +Punto()
      Punto: +Punto(int, int, int)
      Punto: +void leer()
      Punto: +void despliega()
      Punto: +double distancia(Punto)
      
```

```mermaid
---
title: Triangulo
---
classDiagram
      class Triangulo
      Triangulo: -Punto v1
      Triangulo: -Punto v2 
      Triangulo: -Punto v3
      Triangulo: -double longLados[3]
      Triangulo: +Triangulo(Punto, Punto, Punto)
      Triangulo: +double longitudes()
      
```
```mermaid
---
title: Poligono
---
classDiagram
      class Poligono
      Poligono:  _int M
      Poligono: +Conjunto()
      
```

[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).
## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
### Ejecutar ambos comandos en 1 sólo paso:
```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```

### Ejecutar Todas la pruebas locales de 1 Test Case
```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case
```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
