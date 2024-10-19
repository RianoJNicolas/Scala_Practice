/*###################################
#   Dev: rianojnicolas              #
###################################*/

object Source7 {
    def main(args: Array[String]): Unit = {
        // EJERCICIO

        // Listas como Colas - FIFO (first in first out)
        def queueMethod(stack: List[Int], action: String, element: Int): (List[Int], Int) = {
            action match {
                case "enqueue" => 
                    var new_stack = stack :+ element
                    (new_stack, element)
                
                case "dequeue" => 
                    var new_stack = stack.tail
                    (new_stack, stack.head)
                
                case "peek" =>
                    (stack, stack.head)
                }    
        }

        println("FIFO - Colas (Queues)")
        var Mystack = List(1,2,3,4,5)
        var Mystack_push = queueMethod(Mystack, "enqueue", 6)(0)
        println(Mystack_push)
        var Mystack_pop = queueMethod(Mystack_push, "dequeue", 0)(0)
        println(Mystack_pop)
        println(queueMethod(Mystack_pop, "peek", 0)(1))

        // Listas como Pilas - LIFO (Last in first out)
        def stackMethod(stack: List[Int], action: String, element: Int): (List[Int], Int) = {
            action match {
                case "push" => 
                    var new_stack = stack :+ element
                    (new_stack, element)
                
                case "pop" => 
                    val lastElement = stack.length - 1
                    var new_stack = stack.take(lastElement)
                    (new_stack, lastElement)
                
                case "peek" =>
                    (stack, stack.last)
            }    
        }

        println("LIFO - Pilas (Stacks)")
        var Mystack2 = List(1,2,3,4,5)
        var Mystack2_push = stackMethod(Mystack2, "push", 6)(0)
        println(Mystack2_push)
        var Mystack2_pop = stackMethod(Mystack2_push, "pop", 0)(0)
        println(Mystack2_pop)
        println(stackMethod(Mystack2_pop, "peek", 0)(1))
        
        // Dificultad Extra

        // WEB - LIFO - Pilas (Stacks)
        def webExplorer() : Unit = {
            println("""

            Hola, soy el navegador web y
            Estas en la pagina principal
            
            """)

            var myStack = List()
            while (true) {
                print("Escribe una opcion: ")
            }
        }
        webExplorer()


    }
}