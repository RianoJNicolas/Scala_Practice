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
        println("OPERADORES DE ASIGNACION")
        println("""
            Asignación
            """)
        var x = 5
        println(s"A la variable *x* le asignamos el valor $x, con la siguiente sintaxis x = 1 \n")

        println("CONTADOR DE SUMA")
        x += 1
        println(s"La operacion (x += 1), es equivalente x = x + 1, que da como resultado $x \n")

        println("CONTADOR DE RESTA")
        x -= 2
        print(s"La operacion (x -= 2), es equivalente x = x - 2, que da como resultado $x \n")

        println("CONTADOR DE PRODUCTO")
        x *= 5
        println(s"La operacion (x *= 5), es equivalente x = x * 5, que da como resultado $x \n")

        println("CONTADOR DE DIVISION")
        x /= 5
        println(s"La operacion (x /= 5), es equivalente x = x / 5, que da como resultado $x \n")

        println("CONTADOR DE MODULO")
        println(s"La operacion (x %= 2), es equivalente al residuo de la división entre $x / 2")
        x %= 2
        println(s"Esta operacion da como resultado $x \n")

        // Operadores Logicos
        val A = true
        val B = false
        println("OPERADORES LOGICOS")
        // AND
        println(s"$A and $B = ${A && B}")
        println(s"$B and $A = ${B && A}")
        println(s"$A and $A = ${A && A} \n")

        // OR
        println(s"$B or $A = ${B || A}")
        println(s"$A or $B = ${A || B}")
        println(s"$A or $A = ${A || A}")
        println(s"$B or $B = ${B || B} \n")

        // NOT
        println(s"not($A) = ${!A}")
        println(s"not($B) = ${!B} \n")
        

        // Operadores de Pertenencia

        // Operadores de Identidad

        // Estructuras de Control

        // Dificultad Extra
    }
}