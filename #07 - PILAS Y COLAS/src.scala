/*###################################
#   Dev: rianojnicolas              #
###################################*/

object Source7 {
    def main(args: Array[String]): Unit = {
        // EJERCICIO

        // Listas como Pilas - LIFO (last in first out)
        def stackMethod(stack: List[Int], action: String, element: Int): (List[Int], Int) = {
            action match {
                case "push" => 
                    var new_stack = stack :+ element
                    (new_stack, element)
                
                case "pop" => 
                    var new_stack = stack.tail
                    (new_stack, stack.head)
                
                case "peek" =>
                    (stack, stack.head)
                }    
        }

        var Mystack = List(1,2,3,4,5)
        var Mystack_push = stackMethod(Mystack, "push", 6)(0)
        println(Mystack_push)
        var Mystack_pop = stackMethod(Mystack_push, "pop", 0)(0)
        println(Mystack_pop)
        println(stackMethod(Mystack_pop, "peek", 0)(1))

        // Listas como Colas - FIFO (first in first out)

        def queueMethod(queue: List[Int], action: String, element: Int): (List[Int], Int) = {
            action match {
        }
    }
}