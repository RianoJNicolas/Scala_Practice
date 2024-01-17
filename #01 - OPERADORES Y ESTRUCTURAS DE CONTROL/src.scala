object Main {
    def main(args: Array[String]): Unit = {
        // Operadores Aritmeticos
        val a = 2
        val b = 10
        println("OPERADORES ARITMETICOS")
        val suma: Int  = a + b 
        println(s"La suma entre $a y $b es igual a $suma")
        val resta: Int = a - b
        println(s"La resta entre $a y $b es igual a $resta")
        val division = a/b
        println(s"La division entre $a y $b es igual a $division")
        val producto: Int = a*b
        println(s"La multiplicacion entre $a y $b es igual a $producto")
        val modulo = a%b
        println(s"El resto de la division entre $a y $b es igual a $modulo")
        println("")

        // Operadores Relacionales
        println("OPERADORES RELACIONALES")
        val igualdad = a == b
        println(s"¿ Son iguales $a y $b ? RTA -> $igualdad")
        val diferencia = a != b
        println(s"¿ Son diferentes $a y $b ? RTA -> $diferencia")
        val mayor = a > b
        println(s"¿ $a es mayor a $b ? RTA -> $mayor")
        val menor = a < b
        println(s"¿ $a es menor a $b ? RTA -> $menor")
        val menorIgual = a <= b
        println(s"¿ $a es menor e igual a $b ? RTA -> $menorIgual")
        val mayorIgual = a >= b
        println(s"¿ $a es mayor e igual a $b ? RTA -> $mayorIgual")
        print("")

        // Operadores de Asignacion

        // Operadores Logicos

        // Operadores de Pertenencia

        // Operadores de Identidad

        // Estructuras de Control

        // Dificultad Extra
    }
}