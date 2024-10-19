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

        // Listas como Colas - FIFO (first in first out)

        /* def queueMethod(queue: List[Int], action: String, element: Int): (List[Int], Int) = {
            action match {
                case "enqueue" =>
                    var new_queue = element +: queue
                    (new_queue, element)
                
                case "dequeue" =>
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

        }*/
    }
}