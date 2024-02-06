/**
 * EJERCICIO:
 * Muestra ejemplos de todas las operaciones que puedes realizar con cadenas de caracteres
 * en tu lenguaje. Algunas de esas operaciones podrían ser (busca todas las que puedas):
 * - Acceso a caracteres específicos, subcadenas, longitud, concatenación, repetición, recorrido,
 *   conversión a mayúsculas y minúsculas, reemplazo, división, unión, interpolación, verificación...
 *
 * @version v1
 * 
 * @since 27/01/2024
 * 
 * @author Blas Barragán
 * 
 */


public class BlasBarragan {
   
   public static void main(String[] args) {
   // Java dispone de la clase String que nos ofrece multitud de metodos para trabajar con ellas.
   // Aqui expongo algunos de ellos entre los mas usados.

      // Declaracion de string con "String" que es el nombre de la clase en Java.
      String nombre = "Mi nombre es Blas Barragán ";
      // charAt() - Devuelve un caracter en un indice expecifico empezando desde 0 (Los espacios tambien cuenta como caracter).
      System.out.println("El caracter en el indice 13 es: " + nombre.charAt(13));
      // codePointAt() - Devuelve el codigo Unicode del caracter en el indice.
      System.out.println("El codigo Unicode del caracter en el indice 13 es: " + nombre.codePointAt(13));
      // codePointAt() - Devuelve el codigo del caracter anterior al del indice indicado.
      System.out.println("El codigo Unicode del caracter anterior al indice 13 es: " + nombre.codePointBefore(13)); 
      // codePointCount() - Devuelve el numero de valores Unicode encontrados entre el indice de inicio y el de final.
      System.out.println("Del caracter 0 al caracter 13, hay " + nombre.codePointCount(0, 13) + " codigos Unicode.");
      // compareTo() - Compara dos string de forma lexicografica segun codigos Unicode. Devuelve 0 si son iguales.
      String ejercicio = "Ejercicio 4 - Cadenas de caracteres";
      String nombreUp = "MI NOMBRE ES BLAS BARRAGÁN ";
         // Comparamos nombre con nombreUp 
      System.out.println("La cadena 'nombre' y la cadena 'nombreUp', tienen " + nombre.compareTo(nombreUp) + " caracteres distintos entre si."); 
         // Comparamos nombre con ejercicio
      System.out.println("La cadena 'nombre' y la cadena 'ejercicio', tienen " + nombre.compareTo(ejercicio) + " caracteres distintos entre si."); 
      // compareToIgnoreCase() - Funciona de igual manera que la anterior pero ignorando diferenciar mayusculas y minusculas
      System.out.println("La cadena 'nombre' y la cadena 'nombreUp', tienen " + nombre.compareToIgnoreCase(nombreUp) + " caracteres distintos entre si.");
      // concat() - Aunque podemos concatenar con el signo "+", la clase String tiene su propio metodo.
      System.out.println(nombre.concat(ejercicio));
      // contains() - Comprueba si la string contiene una serie de caracteres. Si coinciden todos, devuelve true.
      String apellido = "Barragán";
      System.out.println(nombre.contains(apellido));
      // copyValueOf() - Devuelve una string con los caracteres de un array de caracteres.
      char[] saludoChar = {'H', 'o', 'l', 'a'};
      String saludoStr = "";
      saludoStr = saludoStr.copyValueOf(saludoChar,0,4);
      System.out.println(saludoStr);
      // endsWith() - Comprueba si la string termina en un caracter o string concretos. y devuelve true o false.
      System.out.println(saludoStr.endsWith("a"));
      System.out.println(nombre.endsWith(saludoStr));
      // equals() - Compara si dos string son iguales diferenciando mayusculas y devuelve true o false.
      System.out.println(nombre.equals(nombreUp));
      // equalsIgnoreCase() - Igual a la anterior pero sin distinguir mayusculas.
      System.out.println(nombre.equalsIgnoreCase(nombreUp));
      // indexOf() - Devuelve el indice de la primera ocurrencia del caracter especificado.
      System.out.println(nombre.indexOf('r'));
      // isEmpty() - comprueba si una String esta vacia.
      System.out.println(nombre.isEmpty());
      // toLowerCase() - Convierte todos los caracteres de un string en minuscula.
      System.out.println(nombre.toLowerCase());
      // toUpperCase() - Convierte todos los caracteres de un string en mayuscula.)
      System.out.println(nombre.toUpperCase());
      // Mas info en: https://www.w3schools.com/java/java_ref_string.asp
   }

/**
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que analice dos palabras diferentes y realice comprobaciones
 * para descubrir si son:
 * - Palíndromos
 * - Anagramas
 * - Isogramas
 */

   public static void EsPalindromo(String palabra1, String palabra2){
      
   }
}