//fun main() {
    //UNIDAD 1
    //ejercicio4()
    //ejercicio6()
    //ejercicio12()
    //ejercicio15()
    //ejercicio18()
    //ejercicio21()
    //ejercicio22()
    //ejercicio24()
    //ejercicio25()
    //ejercicio26()
    //ejercicio27()

    //UNIDAD 2
    //ejerciciodos()
    //ejerciciotres()
    //ejercicioseis()
    //ejercicioocho()
    //ejerciciodiez()


    //iterativas2()
    //iterativas4()
    //iterativas6()
    //iterativas7()
    //iterativas8()
    //iterativas13()
    //iterativas15()
    //iterativas18()
    //iterativas19()
    //iterativas25()


    //excepciones2()
    //excepciones3()
    //excepciones4()

    //UNIDAD3
    //listas04()
    //listas06()
    //listas08()
    //listas09(ACABAR)
    //listas10()
//}











fun main() {

    var op: Int

    do {

        limpiaConsola()
        mostrarMenuPpal()
        op = pedirOpcion(0, 3)

        if (op != 0) {
            mostrarMenu(op)
        }

    } while (op != 0)

}
fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun mostrarMenu(tipo: Int) {
    var op = -1

    do {
        limpiaConsola()
        when (tipo) {
            1 -> {
                println("1. Ejercicio 04")
                println("2. Ejercicio 06")
                println("3. Ejercicio 12")
                println("4. Ejercicio 15")
                println("5. Ejercicio 18")
                println("6. Ejercicio 21")
                println("7. Ejercicio 22")
                println("8. Ejercicio 24")
                println("9. Ejercicio 25")
                println("10. Ejercicio 26")
                println("11. Ejercicio 27")

                op = pedirOpcion(0, 11)
                when (op) {
                    1 -> ejercicio4()
                    2 -> ejercicio6()
                    3 -> ejercicio12()
                    4 -> ejercicio15()
                    5 -> ejercicio18()
                    6 -> ejercicio21()
                    7 -> ejercicio22()
                    8 -> ejercicio24()
                    9 -> ejercicio25()
                    10 -> ejercicio26()
                    11 -> ejercicio27()
                }
            }

            2 -> {
                println("1. EjCondicion 02")
                println("2. EjCondicion 03")
                println("3. EjCondicion 06")
                println("4. EjCondicion 08")
                println("5. EjCondicion 10")
                println("----------------")
                println("6. EjIterativa 02")
                println("7. EjIterativa 04")
                println("7. EjIterativa 06")
                println("7. EjIterativa 07")
                println("7. EjIterativa 08")
                println("7. EjIterativa 13")
                println("7. EjIterativa 15")
                println("7. EjIterativa 18")
                println("7. EjIterativa 19")
                println("7. EjIterativa 25")

                op = pedirOpcion(0, 18)
                when (op) {
                    1 -> ejerciciodos()
                    2 -> ejerciciotres()
                    3 -> ejercicioseis()
                    4 -> ejercicioocho()
                    5 -> ejerciciodiez()
                    6 -> iterativas2()
                    7 -> iterativas4()
                    8 -> iterativas6()
                    9 -> iterativas7()
                    10 -> iterativas8()
                    11 -> iterativas13()
                    12 -> iterativas15()
                    13 -> iterativas18()
                    14 -> iterativas19()
                    15 -> iterativas25()
                    16 -> excepciones2()
                    17 -> excepciones3()
                    18 -> excepciones4()

                }
            }

            3 -> {
                println("1. Listas 04")
                println("2. Listas 06")
                println("3. Listas 08")
                println("4. Listas 09")
                println("5. Listas 10")
                println("6. Listas 13")
                println("7. Diccionario 3....")

                op = pedirOpcion(0, 6)
                when (op) {
                    1 -> listas04()
                    2 -> listas06()
                    3 -> listas08()
                    4 -> listas09()
                    5 -> listas10()
                    6 -> listas13()

                }
            }
        }
    } while (op != 0)

}

/**
 * Pedir una opción del menú
 * @param min Opción mínima
 * @param max Opción máxima
 */
fun pedirOpcion(min: Int, max: Int): Int {

    var opcion: Int
    var error = false

    do {
        print("Seleccione opción (0 = SALIR) >> ")
        opcion = try {
            readln().toInt()
        } catch (ex: NumberFormatException) {
            error = true
            -1
        }

        if (error || opcion !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (opcion !in min..max)

    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("**Opción no válida**")
        else -> {
            println("**Error desconocido**")
        }
    }
}

fun limpiaConsola() {
    for (i in 1..20) {
        println()
    }
}
/*/