/*###################################
#   Dev: rianojnicolas              #
###################################*/

object Source5 {
    def main(args: Array[String]): Unit = {

        // 1. Asignacion de variables por valor y referencia
        // 1.1 Variables por valor
        //      Para el lenguaje de programación Scala, las variables se pueden asignar
        //      por valor con var y con val
        //      a. var es un tipo de variable que se puede asignar por valor
        //      b. val es un tipo de variable que se puede asignar por valor y que no puede ser modificada
        
        println("1. Asignacion de variables por valor")

        // var
        println("1.1.a Asignacion de variables por valor y referencia con definicion var")
        var myIntA = 10
        var myIntB = myIntA
        myIntB = 20
        myIntA = 50
        println(myIntA)
        println(myIntB)

        // val
        println("1.1.b Asignacion de variables por valor y referencia con definicion *val*")
        val myIntC = 10
        val myIntD = myIntC
        // myIntD = 20 // Error: val cannot be reassigned
        // myIntC = 50 // Error: val cannot be reassigned
        println(myIntC)
        println(myIntD)

        // ## 1.2 Variables por referencia
        //      Generalmente en python, los valores que se pueden asignar por referencia son los tipos de datos que no son primiticos
        //      Por ejemplo: Listas, tuplas, diccionarios, set, etc
        //      Se traduce a que estos valores por referencia heredan la posición de memoria, parece como si fueran los punteros de C++

        var my_listA = Set(10, 20)
        var my_listB = Set(30, 40)
        println("my_listB - inicial : " + my_listB)
        my_listB = my_listA
        println(my_listA)
        println("my_listB - Finaal : " + my_listB)
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