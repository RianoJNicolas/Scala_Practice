object Main {
    def main(args: Array[String]): Unit = {
        // Variable Global
        var varGlobal = "Muchos Exitos, y que tenas un buen día"

        // Funciones:
        // Funcion sin parametros ni retorno
        def welcomePlayer(): Unit = {
            println("""
        Hola People !!, este es un juego improvisado de
        piedra, papel o tijera.
        
        las reglas son las siguientes:
        """)
        // Funcion dentro de otra funcion
            def reglas(): Unit = {
                print("""
            1. Debes ingresar el objeto con el que jugaras
            2. El pc elegira aleatoriamente un objeto
            3. Recuerda que: papel le gana a piedra,
                            piedra le gana a tijera,
                            tijera le gana a papel.
            
            Muchos Exitooooss !!!
            """)
            }
            reglas()
        }


        // Funcion sin parametros con retorno   
        // Funcion para pedir el objeto a jugar
        def functionInput(): String = {
            println("Ingresa tu objeto con el que vas a jugar: ")
            var option = scala.io.StdIn.readLine()
            while(option != "piedra" && option != "tijera" && option != "papel"){
                println("Ingresa tu objeto con el que vas a jugar: ")
                option = scala.io.StdIn.readLine()
            }
            return option
        }

        def run(): Unit = {
            welcomePlayer()
            println(varGlobal)
            var option_player = functionInput()
        }
        
        run()
    }
}