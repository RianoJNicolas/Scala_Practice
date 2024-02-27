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
            def reglas() = {
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


        def run(): Unit = {
            welcomePlayer()
        }
        
        run()
    }
}