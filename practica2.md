# Practica_2

I.	Declaración de variables 


a.	Cree un fichero llamado Variables y copie el siguiente código 
Una vez que nos encontremos en el programa, vamos a crear un fichero y le vamos asignar el nombre que se nos indica; En este caso le vamos a poner <Variables.kt>, en donde se nos abrirá una nueva ventana, en donde vamos a ingresar el siguiente código. 

fun main()
{
    var nombre = "Excy"
    nombre = "Matilda"

    println("Mi nombre es: $nombre")

    val apellido = "Lopez"
    apellido = "Arostegui"

      println ("Mi apellido es: $apellido")
     
     var edad = "60"
     println("mi nombre es $nombre $apellido y tengo $edad años")
}




Cree el fichero .gitignore y agregue el siguiente texto: *.jar puede usar el siguiente código para generar el .gitignore a través de bash.
Primeramente a como se pide, vamos a crear el fichero escribiendo <.gitignore>


Y luego a darle clic, se nos muestra una nueva ventana en donde vamos a escribir <*.jar> 

	


Imprima la variable que creo en el código usando println en el programa 

Y como podemos ver, nos imprimió lo que declaramos en el printl, que se trata del nombre. 





Copie el siguiente código al final del fichero variable
 





Imprima la variable del código anterior e indique si hay algún error, en caso de haberlo indique el porque del error y como corregirlo. 
 

Si hay error, y es porque tenemos declarado el apellido con la variable <val>, para corregirlo demos de cambiar el val> por un <var>  





Cree una variable edad y establezca como valor su edad en años 

 


Imprima todas las variables en una misma línea y confirme cambios en GIT 

	







II.	Tipos de datos básicos en Kotlin 

Cree un nuevo fichero llamado Tipos.kt dentro de la carpeta contenedora creada en la actividad anterior




	
Copie el siguiente código y muestre los valores en una sola línea, precediendo una cadena descriptiva ante cada variable 







	
Indique si hay error, en caso de encontrar alguno, resuélvalo e indique como hacerlo 

Al compilar nos damos cuenta de que no hay ningún error 




Indique como se pueden realizar conversiones entre tipos, de int a float y viceversa. Pruebe cada una de las funciones existentes de conversiones. Muestre ejemplos.
 



Copie el siguiente código sobre el tipo de dato Bolean e indique de forma generalizada el uso de este tipo de dato













Muestre el resultado de las dos expresiones en una sola línea, mostrando la operación en una cadena y el valor de la variable Boolean a la par. Confirme cambios en GIT 



Realice un ejemplo del tipo de dato Char, en el mismo fichero Tipos.kt después del código relacionado a booleanos. Indique de forma generalizada cuando usamos este tipo de dato. Confirme cambios en GIT 




Copie el siguiente código de cadenas en el fichero Tipos.kt e indique las diferencias entre Raw String y un String normal 











 

 Compile el fichero y muestre las variables en una sola sentencia println. Confirme los cambios en GIT. 
 
Investigue la forma de usar los rangos en Kotlin usando el operador in y .. en primera instancia. También puede lograrlo usando las funciones downTo() y rangeTo()
R// El operador <in>, es usado para asegurar su un valor está presente en un rango, este operador puede ser remplazado con la función de extensión rangeTo() para crear un rango.


Investigue: 
1.	¿Por qué es importando el control sobre nulos en Kotlin? 
R// es importante porque es inevitable lidiar con el concepto <vacío> o <inexistente> y un punto en el patrón al que podemos recurrir que se llama <Null Object Pattern> que nos puede ayudar en estos casos.

2.	¿Cómo usar la sentencia when sin argumentos en Kotlin? 
R// when sin argumentos: en esta opción se puede hacer prácticamente la comprobación que queremos.

3.	Conversión explicita vs implícita de datos en Kotlin 
R// las conversiones explicitas debido a que las diferentes representaciones, los tipos más pequeños no son subtipos de los más grandes.
Conversiones implícitas raramente se nota ya que el tipo se deduce del contexto, por tanto las operaciones aritméticas están sobrecargadas.

4.	Compare mediante ejemplos el uso de Arrays vs Listas en Kotlin 
R// 
