/*###################################
#   Dev: rianojnicolas              #
###################################*/

object Source7 {
    def main(args: Array[String]): Unit = {
        // EJERCICIO

        // Listas como Pilas - LIFO (last in first out)
        def stackMethod(stack: List[Int], action: String, element: Int): Unit = {
            if (action == "push") {
                var new_stack = stack :+ element    
                return new_stack
            }
            else if (action == "pop") {
                
                return stack
            }
            elif action == "peek":
                return stack[len(stack)-1]
        }
        
    }
}