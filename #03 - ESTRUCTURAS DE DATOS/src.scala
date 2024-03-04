object Main {
    def main(args: Array[String]): Unit = {

        // 1. Estrucutras de datos

        // 1.1 Listas:
        val myList = List(1, 2, 3, 4, 5)
        println(s"Lista = $myList\n")

        // 1.2 Secuencias:
        val mySeq = Seq(1, 2, 3, 4, 5)
        println(s"Secuencia = $mySeq\n")

        // 1.2 Maps:
        val myMap = Map(1 -> "one", 2 -> "two")
        println(s"Map = $myMap\n")

        // 1.3 Tuplas:
        val myTupla = (1, "one", 7.0, "seven")
        println(s"Tupla = $myTupla\n")

        // 1.4 Array:
        val myArray = Array(1, 2, 3, 4, 5)
        println(s"Array = ${myArray.toString}\n")

        // 1.5 Vector:
        val myVector = Vector(1, 2, 3, 4, 5)
        println(s"Vector = $myVector\n")
    }
}