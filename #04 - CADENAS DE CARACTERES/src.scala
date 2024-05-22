object Main {
    def main(args: Array[String]): Unit = {
        // OPERACIONES CON CADENAS DE CARACTERES

        // 1. Asignacion
        val saludo = "Hola, "
        val nombre = "Mr X"

        // 2. Concatenacion
        val final_saludo_1 = saludo + nombre
        println(s"${final_saludo_1}\n")
        val final_saludo_2 = saludo.concat(nombre)
        println(s"${final_saludo_2}\n")

        // 3. Operaciones "Aritmeticas"
        val saludoTotal = saludo*3
        println(s"${saludoTotal}\n")

        // 4. Subcadenas
        val secuencia = "123456789"
        val primerSub = secuencia.substring(0, 5)
        val secondSub = secuencia.substring(3)
        val thirdSub =  secuencia.substring(2,6)
        println(s"Primera subcadena $primerSub") // Se toma 12345
        println(s"Segunda subcadena $secondSub") // Se toma 456789
        println(s"Tercera subcadena $thirdSub") // Se toma 456789

    }
}