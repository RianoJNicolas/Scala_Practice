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

        // 1.6 Sets:
        val mySet = Set(1, 2, 3, 4, 5)
        println(s"Set = $mySet\n")

        // 2. Operando con las estructuras

        // Listas:
        println(s"Lista Inicial = ${myList}")
        var secondList = myList :+ 6 // Insercion
        println(s"Lista despues de agregar un elemento = ${secondList}")
        var secondList_filter = secondList.filter(_!=3) // Borrado
        println(s"Lista despues de borrar elementos = ${secondList_filter}")
        var secondList_updated = secondList_filter.updated(1, 10) // Actualizacion
        println(s"Lista actualizada = ${secondList_updated}")
        var secondList_sorted = secondList_updated.sorted // Ordenacion
        println(s"Lista ordenada = ${secondList_sorted}\n")
    }
}