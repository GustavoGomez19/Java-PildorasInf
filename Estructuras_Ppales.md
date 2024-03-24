# Constantes: 
  * Es un espacio en memoria del PC donde se almacena un valor el cualno cambia durante la ejecución de programa.
  * La forma de declarar una variable constante es anteponiendo al tipo de dato la palabra final. Ejemplo:
  * final int documentoIdentidad = 1231546;

# Operadores de Java:
  * Se pueden dividir en:
   # Aritméticos:
    * suma (+)
    * resta (-)
    * Multiplicación (*)
    * División (/)
    * Modulo (%)
   # Lógicos, relacionales y booleanos:
    * Mayor que (>)
    * Menor que (<)
    * Mayor o igual que (>=)
    * Menor o igual que (<=)
    * Diferente que (!=)
    * Igual que (==)
    * AND (&&)
    * OR (||)
   # Incremento y decremento
    * Incremento (++)
    * Decremento (--)

# Clases en Java
  * En Java pueden haber 2 tipode clases, propias y predefinidas
   # Clases Propias:
    * Son las que define el mismo programador para la construcción del código del progama
   # Clases predefinidas:
    * Son calses que vienen ya constridas dentro del lenguaje de programación, son clases que se suministran
    * para que puedan ser usadas dentro de la codificaición del programa en caso de ser necesario.
    * Para conocer todas la clases que vienen predefinidas en el lengueaje existe una API para consultarla
    * URL: https://docs.oracle.com/javase/8/docs/api/

# Clase Math
  * Es una clase que permite realizar cáculos matemáticos, contiene una variedad de métodos para realizar
  * dichos cálculos
   # Método Math.sqrt(n):
    * Permite hallar la raíz cuadrada de un número que se pasa por parámetro
   # Método Math.pow(base, exp):
    * Permite hallar la potencia de un número, recibe 2 parámetros los cuales deben ser de tipo double
   # Método Math.round(n):
    * Permite redondear un número decimal
   # Método Math.random():
    * Permite generar un númeor aleatorio
   # Método Math.PI():
    * Es una constante de clase que almacena el número PI (3.1416)

# Termino de refundición:
  * Consiste en cambiar un tipo de dato en otro, se debe colocar entre parentesis el tipo de dato al que
  * se quiere convertir, se debe colocar antes de la expresión, ejemplo
  * --> int raiz = (int)Math.round(numero); | En este ejemplo, el valor de la variable numero es de tipo
  * double y se desea convertir a entero (int)