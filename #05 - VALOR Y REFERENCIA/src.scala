/*###################################
#   Dev: rianojnicolas              #
###################################*/
import scala.collection.mutable.ArrayBuffer

object Source5 {
    def main(args: Array[String]): Unit = {

        // 1. Asignacion de variables por valor y referencia
    
        // En Scala, todas las variables y parámetros de funciones se pasan por valor.
        // Esto significa que siempre se pasa una copia de lo que contiene la variable
        //  a. Para tipos primitivos como Int, Double, Boolean, etc., la copia es simplemente el valor en sí.
        //  b. Para objetos (listas, clases, arrays, etc.), la copia es la referencia al objeto, no el objeto
        //     completo. Entonces, aunque la referencia se pasa por valor, ambas variables (la original y la
        //     copia) apuntan al mismo objeto en memoria.
        //
        // Aunque Scala fomenta el uso de inmutabilidad (con val), las variables mutables (definidas con var)
        // permiten cambiar la referencia que almacenan, lo que significa que puedes hacer que una variable
        // apunte a un objeto diferente.
        // 
        // Mutabilidad e inmutabilidad: Si bien las variables val son inmutables (no pueden cambiar de 
        // referencia), si el objeto que apuntan es mutable, el contenido del objeto puede cambiar.
        
        // 1.1 Variables por valor
        
        println("1. Asignacion de variables por valor")

        // var
        println("1.1.a Asignacion de variables por valor y referencia con definicion var")
        var myIntA = 10
        var myIntB = myIntA
        myIntB = 20
        myIntA = 50
        println(myIntA)
        println(myIntB)
        println("\n")

        // val
        println("1.1.b Asignacion de variables por valor y referencia con definicion *val*")
        val myIntC = 10
        val myIntD = myIntC
        // myIntD = 20 // Error: val cannot be reassigned
        // myIntC = 50 // Error: val cannot be reassigned
        println(myIntC)
        println(myIntD)
        println("\n")

        // ## 1.2 Variables por referencia
        //      Generalmente en scala, los valores que se pueden asignar por referencia son los tipos de datos que no son primiticos
        //      Por ejemplo: Listas, tuplas, diccionarios, set, etc
        //      Se traduce a que estos valores por referencia heredan la posición de memoria, parece como si fueran los punteros de C++

        var my_listA = List(10, 20)
        var my_listB = my_listA
        println("my_listA - inicial : " + my_listA)
        println("my_listB - inicial : " + my_listB)
        my_listB :+ 50
        println("my_listA - Final : " + my_listA)
        println("my_listB - Final : " + my_listB)



        val array1 = ArrayBuffer(1, 2, 3)
        val array2 = array1  // Ambas referencias apuntan al mismo objeto

        array2 += 4  // Modificamos el objeto referenciado
        println(array1)  // Imprime ArrayBuffer(1, 2, 3, 4)

    }
}
/*# 1. Asignacion de variables por valor y referencia

## 1.2 Variables por referencia
##      Generalmente en python, los valores que se pueden asignar por referencia son los tipos de datos que no son primiticos
##      Por ejemplo: Listas, tuplas, diccionarios, set, etc
##      Se traduce a que estos valores por referencia heredan la posición de memoria, parece como si fueran los punteros de C++

my_setA = {10, 20}
#my_setB = {30, 40}
my_setB = my_setA
my_setB.add(30)
print(my_setA)
print(my_setB)


# 2. Ejemplos de funciones por valor y por referencia

## 2.1 Funciones con datos por valor

def fillCoupValue(fill):
    fill = 99
    print(fill)
    return fill

my_fill = 50
fillCoupValue(my_fill)
print(my_fill)

## 2.2 Funciones con datos por referencia
def fillCoupHistory(fill):
    fill.append(25)
    
    fill_a = fill
    fill_a.append(45)

    print(fill)
    print(fill_a)
    return fill

my_fill_history = [0, 10, 5, 50, 20]
fillCoupHistory(my_fill_history)
print(my_fill_history)

# Dificultad Extra
# Caso 1: Parametros por valor
def byValue(a, b):
    c = a
    a = b
    b = c
    return a, b


# Caso 2: Parametros por referencia
def byRefer(a, b):
    c = a
    a = b
    b = c
    return a, b


def run():
    # Caso 1: Parametros por valor
    my_val_1 = 10
    my_val_2 = 20
    print("Los valores inciales son: ")
    print(my_val_1)
    print(my_val_2)
    my_val_3, my_val_4 = byValue(my_val_1, my_val_2)
    print("Los valores retornados son: ")
    print(my_val_3)
    print(my_val_4)
    print("Los valores originales son: ")
    print(my_val_1)
    print(my_val_2)

    # Caso 2: Parametros por referencia
    my_ref_1 = [10, 30, 50]
    my_ref_2 = [20, 40, 60]
    print("Los valores inciales son: ")
    print(my_ref_1)
    print(my_ref_2)
    my_ref_3, my_ref_4 = byValue(my_ref_1, my_ref_2)
    print("Los valores retornados son: ")
    print(my_ref_3)
    print(my_ref_4)
    print("Los valores originales son: ")
    print(my_ref_1)
    print(my_ref_2)



if __name__ == '__main__':
    run()
    */