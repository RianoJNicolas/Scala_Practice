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
        }


        def run(): Unit = {
            welcomePlayer()
        }
        
        run()
    }
}