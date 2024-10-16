/*###################################
#   Dev: rianojnicolas              #
###################################*/

object Source7 {
    def main(args: Array[String]): Unit = {
        // EJERCICIO

        // Listas como Pilas - LIFO (last in first out)
        def stackMethod(stack: List[Int], action: String, element: Int): (List[Int], Option[Int]) = {
            action match {
                case "push" => 
                    var new_stack = stack :+ element
                    (new_stack, Some(element))
                }
            /*else if (action == "pop") {
                var new_stack = stack.tail
                return (new_stack, stack.head)
            }
            else if (action == "peek") {
                return (stack, stack.head)
            }*/
                
        }

        var Mystack = List(1,2,3,4,5)
        println(stackMethod(Mystack, "push", 6)(0))
        //println(stackMethod(Mystack, "pop", 0))
        //println(stackMethod(Mystack, "peek", 0))

        
    }
}