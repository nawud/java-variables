### Ejercicio N° 1: Introducción a Java, variables y operaciones

----------

### **Explicación del Ejercicio**

**¿Qué vamos a hacer?**

Vamos a practicar la sintaxis básica de Java, utilizando la consola de la terminal para ver los resultados de nuestro código. Los ejercicios están organizados en orden de dificultad progresiva para facilitar el aprendizaje de los conceptos fundamentales de Java.

Realiza un **fork** del repositorio en el siguiente enlace:

**¿Dónde lo vamos a hacer?**

Trabajaremos en varios archivos `.java`, cada uno correspondiente a un ejercicio específico. Estos archivos deben ser compilados y ejecutados en la terminal.

**¿Cómo lo hacemos?**

Escribiremos y ejecutaremos código en Java, visualizando los resultados en la terminal para practicar conceptos fundamentales como la impresión de mensajes, la creación de variables, el uso de operadores y el manejo de tipos de datos en Java.

**¿Con qué lo hacemos?**

Utilizaremos Java y la terminal de tu sistema para compilar y ejecutar el código.

**¿Cómo se evalúa lo que hacemos?**

El ejercicio será evaluado en función de la correcta implementación de las instrucciones y la capacidad para visualizar los resultados en la terminal.

----------

### **Objetivo del Ejercicio**

En esta **actividad individual**, el objetivo principal es **familiarizarse con la sintaxis de Java y el uso de variables** para fomentar la comprensión de los conceptos básicos de programación.

----------

### **Objetivos Específicos**

1.  **Imprimir mensajes en la terminal**: Aprenderás a utilizar `System.out.println()` para mostrar mensajes y resultados en la consola.
2.  **Crear y usar variables**: Te familiarizarás con la declaración y uso de variables en Java para almacenar diferentes tipos de datos.
3.  **Entender tipos de datos**: Conocerás los diferentes tipos de datos en Java y cómo utilizarlos de forma eficiente.

----------

### **Criterios de Evaluación**

1.  **Uso de `System.out.println()`**: Se evaluará la correcta impresión de mensajes en la terminal.
2.  **Creación de variables**: Se verificará que las variables se declaren y utilicen correctamente.
3.  **Comprensión de tipos de datos**: Se evaluará la capacidad de crear y manejar diferentes tipos de datos en Java.
4.  **Cumplimiento de los pasos**: Se comprobará que se han seguido todos los pasos para completar cada ejercicio.

----------

### Paso a Paso

**Paso 1: Clona el repositorio y abre el proyecto**

-   **Clonar el repositorio**: Haz un fork del repositorio en GitHub, luego clónalo en tu máquina local con el siguiente comando en la terminal:
    
    ```bash
    git clone <URL_DEL_REPOSITORIO>
    
    ```
    
    Reemplaza `<URL_DEL_REPOSITORIO>` con el enlace del repositorio en tu GitHub.
    
-   **Abre el proyecto en tu editor**: Abre la carpeta del proyecto en tu editor de texto, preferiblemente **Visual Studio Code**.
    

**Paso 2: Compilar y ejecutar el archivo**

-   **Navegar hasta el archivo**: En tu terminal, usa el comando `cd` para dirigirte a la carpeta donde se encuentra cada archivo `.java`. Por ejemplo:
    
    ```bash
    cd ruta/del/archivo
    
    ```
    
-   **Compilar el archivo**: Para compilar el archivo de cada ejercicio, usa el comando:
    
    ```bash
    javac NombreDelArchivo.java
    
    ```
    
    Por ejemplo, si estás en el ejercicio `Welcome`, sería:
    
    ```bash
    javac Welcome.java
    
    ```
    
    Si la compilación es exitosa, no se mostrará ningún mensaje de error.
    
-   **Ejecutar el archivo**: Una vez compilado, ejecuta el archivo usando:
    
    ```bash
    java NombreDelArchivo
    
    ```
    
    Continuando con el ejemplo del ejercicio `Welcome`, el comando sería:
    
    ```bash
    java Welcome
    
    ```
    
    Observa los resultados en la terminal para verificar que se haya ejecutado correctamente.
    

**Paso 3: Realizar cada ejercicio según las instrucciones**

A continuación, se describen los pasos detallados para cada ejercicio:

1.  **Ejercicio 1: Welcome**
    -   **Crea** una clase llamada `Welcome`.
    -   Dentro de esta clase, **define** el método `main`.
    -   **Imprime** el mensaje `"Welcome to Java World!"` en la terminal usando `System.out.println()`.
    -   **Compila y ejecuta** el archivo, luego verifica que el mensaje aparezca en la terminal.
2.  **Ejercicio 2: AboutMe**
    -   **Declara variables** para almacenar nombre, edad, país, lenguaje de programación, horas de práctica, pasatiempo y lugar.
    -   **Imprime** un mensaje que use estas variables para completar frases en consola.
    -   **Compila y ejecuta** el archivo, asegurándote de que los valores de las variables se muestren en el mensaje.
3.  **Ejercicio 3: SplitBills**
    -   **Declara dos variables**: una para el total de la cuenta (7 EUR) y otra para el número de personas (2).
    -   **Realiza una división** del total entre el número de personas y almacena el resultado en una variable.
    -   **Imprime** la cantidad que cada persona debe pagar.
    -   **Compila y ejecuta** el archivo para confirmar que el resultado sea correcto.
4.  **Ejercicio 4: Cakes**
    -   **Define** las variables `cake` y `people` para representar la división de un pastel.
    -   **Utiliza `casting`** para dividir `cake` entre `people`, convirtiendo el resultado en `double`.
    -   **Declara otra variable `double`**, conviértela a `int`, y viceversa.
    -   **Imprime** cada valor en la terminal y compila y ejecuta para comprobar el funcionamiento.
5.  **Ejercicio 5: EnergyEfficiency**
    -   **Declara variables** para cada calificación energética de `A` a `G`.
    -   **Usa estas variables** para completar mensajes como: `"Una calificación <calificacion> es muy buena"`.
    -   **Imprime** los mensajes en la terminal y **compila y ejecuta** para revisar que cada calificación esté en el lugar correcto.
6.  **Ejercicio 6: DrivingLicense**
    -   **Define una variable `puntos`**, inicialízala en cero.
    -   **Suma y resta valores** en `puntos` según cada mensaje en el código.
    -   **Imprime** el resultado de puntos después de cada actualización.
    -   **Compila y ejecuta** el archivo para verificar que el total de puntos sea el esperado.
7.  **Ejercicio 7: Universe**
    -   **Intenta declarar** la población mundial como `int` y observa el error.
    -   **Cambia el tipo a `long`** y agrega un separador de miles usando `_`.
    -   **Declara variables** para las estrellas en la Vía Láctea y Andrómeda, y calcula su suma en el mensaje final.
    -   **Compila y ejecuta** para ver la salida en la terminal y asegúrate de que el resultado es correcto.

**Paso 4: Guardar y Revisar**

-   **Guarda los cambios**: En cada archivo `.java`, asegúrate de guardar los cambios antes de compilar y ejecutar.
-   **Revisa el resultado**: Observa que el código se ejecute correctamente, sin errores, y que los mensajes en la terminal coincidan con los resultados esperados.

**Paso 5: Realiza un Commit y Sube los Cambios**

-   **Realiza un commit** de cada cambio en el repositorio:
    
    ```bash
    git add .
    git commit -m "Completé el ejercicio [NombreDelEjercicio]"
    
    ```
    
-   **Sube los cambios** a tu repositorio en GitHub:
    
    ```bash
    git push origin main
    
    ```
    

----------

### **Recursos y Herramientas**

-   **Editor de Texto**: [Visual Studio Code](https://code.visualstudio.com/)
-   **Documentación de Java**:
    -   [Java MDN](https://developer.mozilla.org/es/docs/Web/Java) (Pendiente de los recursos)
    -   [Introducción a Java](https://developer.mozilla.org/es/docs/Learn/Java/First_steps) (Pendiente de los recursos)
    -   [Guía de Java](https://java-programming.info/) (Pendiente de los recursos)

----------

### Entrega del Ejercicio

-   **Formato de entrega**:
    -   Se deberá entregar en el Classroom, con el enlace a github.

----------

Este ejercicio te permitirá familiarizarte con la sintaxis de Java y las operaciones básicas, estableciendo una base sólida para avanzar en tu aprendizaje de programación.