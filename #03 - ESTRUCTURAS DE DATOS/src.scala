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
        myList.append(6) # Insercion
        print(f'Lista despues de agregar un elemento = {myList}')
        myList.pop(1) # Borrado
        print(f'Lista luego de borrar un elemento = {myList}')
        myList[0] = 100 # Actualizacion
        print(f'Lista actualizada = {myList}')
        myList.sort() # Ordenacion
        print(f'Lista ordenada = {myList}\n')
    }
}