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

        // Secuencias:
        println(s"Secuencia Inicial = ${mySeq}")
        var secondSeq = mySeq :+ 6 // Insercion
        println(s"Secuencia despues de agregar un elemento = ${secondSeq}")
        var secondSeq_filter = secondSeq.filter(_!=3) // Borrado
        println(s"Secuencia despues de borrar elementos = ${secondSeq_filter}")
        var secondSeq_updated = secondSeq_filter.updated(1, 10) // Actualizacion
        println(s"Secuencia actualizada = ${secondSeq_updated}")
        var secondSeq_sorted = secondSeq_updated.sorted // Ordenacion
        println(s"Secuencia ordenada = ${secondSeq_sorted}\n")

        // Maps:
        println(s"Map Inicial = ${myMap}")
        var sencondMap = myMap + (100 -> "One hundred") + (3 -> "Three")  // Insercion
        println(s"Map despues de agregar un elemento = ${sencondMap}")
        var secondMap_filter = sencondMap - 1 // Borrado
        println(s"Map despues de borrar el elemento con clave 1 = ${secondMap_filter}")
        var secondMap_updated = secondMap_filter + (3 -> "Tres") // Actualizacion
        println(s"Map actualizado = ${secondMap_updated}")
        import collection.immutable.SortedMap // Ordenacion
        var secondMap_sorted = SortedMap.empty[Int, String] ++ secondMap_updated 
        println(s"Map ordenado = ${secondMap_sorted}\n")

        // Tuplas
        println(s"Tupla Inicial = ${myTupla}")
        var sencondTupla =  myTupla ++ (300, 10) // Insercion
        println(s"Tupla despues de agregar elementos = ${sencondTupla}")
        var secondTupla_delete = (sencondTupla._1, sencondTupla._3, sencondTupla._5, sencondTupla._6) 
        println(s"Tupla despues de borrar = ${secondTupla_delete}")
        var secondTupla_updated = (secondTupla_delete._1, 8, secondTupla_delete._3, secondTupla_delete._4)  // Actualizacion
        println(s"Tupla actualizada = ${secondTupla_updated}")
        var secondList_Tuple = (secondTupla_updated).toList // Ordenar
        var secondListTupla_order = secondList_Tuple.sorted
        var SecondTupla_ordered = secondListTupla_order match {
            case List(a, b) => (a,b)
            case List(a, b, c) => (a,b,c)
            case List(a, b, c, d) => (a,b,c,d)
        }
        println(s"Tupla ordenada = ${SecondTupla_ordered}\n")

        // Arrays No se puede visualizar muy bien
        // No encontre mucha documentación al respecto
        println(s"Array Inicial = ${myArray} \n")

        // Vectores
        println(s"Vector Inicial = ${myVector}")
        var sencondVector =  myVector ++ Vector(300, 10) // Insercion
        println(s"Vector despues de agregar un elemento = ${sencondVector}")
        val elementoEliminar = 10
        var secondVector_delete = sencondVector.filterNot(_ == elementoEliminar) // Borrar
        println(s"Vector despues de borrar = ${secondVector_delete}")
        val indice = 3
        val nuevoValor = 500
        var sencondVector_updated = secondVector_delete.updated(indice, nuevoValor) // Actualización
        println(s"Vector actualizado = ${sencondVector_updated}")
        var secondVector_sorted = sencondVector_updated.sorted // Ordenar
        println(s"Vector ordenado = ${secondVector_sorted}\n")

        // Sets
        println(s"Set Inicial = ${mySet}")
        var secondSet =  mySet + 300 + 10 // Insercion
        println(s"Set despues de agregar elementos = ${secondSet}")
        var secondSet_delete = secondSet - 5 // Borrado
        println(s"Set despues de borrar = ${secondSet_delete}")
        var secondSet_up1 = secondSet_delete - 3
        var secondSet_update = secondSet_up1 + 1050 // Actualizacion
        println(s"Set actualizado = ${secondSet_update}")
    }
}