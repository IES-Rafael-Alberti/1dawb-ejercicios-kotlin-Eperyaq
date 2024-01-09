import java.lang.Math.pow
import javax.swing.MutableComboBoxModel
import kotlin.math.pow
import kotlin.time.times

//U1: 4, 6, 12, 15, 18, 20, 21, 22, 24, 25, 26 y 27.

fun ejercicio4(){


    println("Dime una temperatura en grados Celsius: ")
    //Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.
    val celsius: Float = readln().toFloat()

    val farenheit:Float = (celsius   * 9) / 5 + 32

    println("$celsius Grados celsius son $farenheit Grados Farenheit.")
}


fun ejercicio6(){
   //Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).
    print("Dime el precio del articulo sin iva: ")
    val precionoiva:Float = readln().toFloat()
    val precioiva:Float = (precionoiva + (precionoiva * 0.10)).toFloat()

    println("El precio del articulo es $precionoiva y con el IVA del 10% es $precioiva")
}

fun ejercicio12(){
    //Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales.
    print("Introduce tu altura en cm: ")
    val altura: Float = readln().toFloat()
    print("Introduce tu peso en kg: ")
    val peso:Float = readln().toFloat()

    val imc:Float = peso * altura.pow(2)

    print("Tu Indice de masa corporal es: $imc")

}

fun ejercicio15(){
// Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.

    print("Inserte el dinero añadido a la cuenta de ahorros: ")
    val dinero:Float = readln().toFloat()

    val primerAño:Float = (dinero * (1 * 0.4)).toFloat()
    val totalprimer:Float=(dinero + primerAño)

    val segundoAño:Float =(primerAño + dinero * (1* 0.4)).toFloat()
    val totalsegundo:Float=(dinero+segundoAño)

    val tecerAño:Float = (segundoAño + dinero * (1*0.4)).toFloat()
    val totaltercer:Float=(dinero+tecerAño)

    println("EL primer año te suma $primerAño de más, en total tienes $totalprimer")
    println("EL primer año te suma $segundoAño de más, en total tienes $totalsegundo")
    println("EL primer año te suma $tecerAño de más, en total tienes $totaltercer")
}

fun ejercicio18(){
    //Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.
    print("Introduzca su nombre: ")
    val nombreCompleto:String = readln().toString()

    println(nombreCompleto.lowercase())
    println(nombreCompleto.uppercase())
    println(nombreCompleto.lowercase().capitalize()) //Lo hago minuscula y despues hago capitalize pero solo me pone en mayus la primera

}
// 20, 21, 22

fun ejercicio20(){
    //Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código del país +34, y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte por un número de teléfono con este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.
    println("Introduzca un numero de telefono con el formato +34-XXXXXXXXX-XX: ")
    val numero = readln()
    //no se
}

fun ejercicio21(){
    //Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.
    print("Introduzca una frase: ")
    val frase:String = readln()

    print(frase.reversed())
}

fun ejercicio22(){
    //Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre por pantalla la misma frase pero con la vocal introducida en mayúscula.
    print("Introduzca una frase: ")
    val frase:String = readln()

    print("Ahora introduzca una vocal: ")
    val vocal:String = readln()

    if (vocal.lowercase() in "aeiou"){
        val vocalMayus:String = vocal.toUpperCase()

        val fraseConMayus = frase.replace(vocal.toLowerCase(), vocalMayus)

        println(fraseConMayus)
    }
}

// 24, 25, 26 y 27.

fun ejercicio24(){
    //Escribir un programa que pregunte por consola el precio de un producto en euros con dos decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido.
    print("Dime el precio de un producto con dos decimales: ")
    val precio:Double = readln().toDouble()

    if (precio != null){
        val euros = precio.toInt()
        val centimos = ((precio - euros)* 100 ).toInt()

        println("Euros = $euros")
        println("Céntimos = $centimos")

    } else{
        println("ERROR ingresa un numero correcto")
    }
}

fun ejercicio25(){
    //Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y muestra por pantalla, el día, el mes y el año. Adaptar el programa anterior para que también funcione cuando el día o el mes se introduzcan con un solo carácter.

    print("Introduzca su fecha de nacimiento en formato dd/mm/aaaa: ")
    val fecha:String = readln().toString()

    val (dia, mes, año) = fecha.split("/")

    println("Dia = $dia")
    println("Mes = $mes")
    println("Año = $año")

}

fun ejercicio26(){
    //Escribir un programa que pregunte por consola por los productos de una cesta de la compra, separados por comas, y muestre por pantalla cada uno de los productos en una línea distinta.
    print("Introduzca los productos de la compra separados por coma: ")

    val total = readln().toString()

    val productos = total.split(",")

    println("Productos en la cesta: ")
    for (producto in productos){
        println(producto)
    }
}

fun ejercicio27(){
    //Escribir un programa que pregunte el nombre el un producto, su precio y un número de unidades y muestre por pantalla una cadena con el nombre del producto seguido de su precio unitario con 6 dígitos enteros y 2 decimales, el número de unidades con tres dígitos y el coste total con 8 dígitos enteros y 2 decimales.

    print("Indique el nombre del producto-> ")
    val producto = readln().toString()
    if (producto == ""){
        print("ERROR, prueba de nuevo")
    }else {
        print("Indique el precio de $producto-> ")
        val precio = readln().toDouble()
        if (precio == 0.0){
            print("Deberías introducir un numero correcto")
        }else {
            print("Indique el numero de unidades de $producto que se ha llevado-> ")
            val unidades = readln().toInt()
            if (unidades == 0) {
                print("ERROR no has comprado ninguna unidad")
            }else {
                val total = unidades * precio

                println("Usted se ha llevado $unidades unidades de $producto a $precio€ cada uno, el total a pagar es: $total€")
            }
        }
    }
}

//Sentencias condicionales 2,3,6,8,10

fun ejerciciodos(){
    //Escribir un programa que almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
    val contraseña = "Contraseña"
    var todo_ok = true

    while (todo_ok){

        print("Cual crees que es la contraseña? ")
        val respuesta = readln()

        if (respuesta == contraseña){
            println("Acertaste!")
            todo_ok = false
        }else{
            println("Prueba de nuevo ")
        }
    }
}

fun ejerciciotres(){
    //Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error.
    println("Introduzca dos numeros a dividir: ")
    val num1 = readln().toDouble()
    val num2 = readln().toDouble()
    if (num2 == 0.0){
        print("ERROR, no puedes dividir entre cero")
    }else{
        val total = num1 / num2
        print("El resultado es $total")
    }
}

fun ejercicioseis() {
    //Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.
    print("Ingrese su nombre: ")
    val nombre = readln().capitalize()
    if (nombre == ""){
        println("ERROR, no puedes dejar el campo en blanco")
    }else {

        print("Ingrese su género (M/F)")
        val genero = readln().uppercase()
        if (genero != "M" && genero != "F") {
            println("ERROR, Deber introducir un genero correcto")
        } else {

            if (nombre.first() < 'M' && genero.equals("F")) {
                print("Usted está en el grupo A")
            } else {
                print("Usted pertenece al grupo B")
            }

        }
    }
}

fun ejercicioocho(){
    // En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose en mejores beneficios. Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más, pero no valores intermedios entre las cifras mencionadas. A continuación se muestra una tabla con los niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.
    /*
    *
    * @param puntuacion Puntuacion que tiene que meter el usuario para sumarle dinero
    * @param calculo El calculo a hacer dependiendo de la puntuacion
    *
    * */
    print("Indique su puntuacion -> ")
    var puntuacion = readln().toDouble()
    val calculo = (2400 * puntuacion) + 2400

    if (puntuacion == 0.0){
        println("Inaceptable, tu dinero es 2400€.")
    }else if (puntuacion == 0.4){
        println("Aceptable, tu dinero es 2400 * $puntuacion = $calculo €")
    }else if (puntuacion >= 0.6){
        println("Meritorio!, tu dinero es 2400 * $puntuacion = $calculo €")
    }else{
        println("Error, introduzca un valor correcto.")
    }
}

fun ejerciciodiez(){
    /*La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes. Los ingredientes para cada tipo de pizza aparecen a continuación.

Ingredientes vegetarianos: Pimiento y tofu.
Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y en función de su respuesta le muestre un menú con los ingredientes disponibles para que elija.
Solo se puede eligir un ingrediente además de la mozzarella y el tomate que están en todas la pizzas.
Al final se debe mostrar por pantalla si la pizza elegida es vegetariana o no y todos los ingredientes que lleva.*/

    print("Desea pedir una pizza?(S/N) -> ")
    val opcion = readln().toUpperCase()
    if (opcion == "S" || opcion == "SI"){
        print("Normal o vegetariana?(N,V) ")
        val pizza = readln().capitalize()
        if (pizza == "N" || pizza == "Normal") {
            print("escoja un ingrediente -> Peperoni (P), Jamón (J) o Salmón(S) ")
            val ingredientenormal = readln().capitalize()
            if (ingredientenormal == "P" || ingredientenormal == "Peperoni"){
                println("Tu pizza lleva: Mozzarella, tomate y peperoni")
            }else if (ingredientenormal == "J" || ingredientenormal == "Jamón"){
                println("Tu pizza lleva: Mozzarella, tomate y jamón")
            }else if (ingredientenormal == "S"|| ingredientenormal == "Salmon"){
                println("Tu pizza lleva: Mozzarella, tomate y salmón")
            }else{
                println("ERROR, escoja un ingrediente correcto. ")
            }


        }else if (pizza == "V" || pizza == "Vegetariana" || pizza == "Vegetariano"){
            print("escoja un ingrediente -> Pimiento (P) o Tofu(T)")
            val veggie = readln().capitalize()
            if (veggie == "P" || veggie == "Pimiento"){
                println("Tu pizza lleva: Mozzarella, tomate y pimiento")
            }else if (veggie == "T" || veggie == "Tofu"){
                println("Tu pizza lleva: Mozzarella, tomate y tofu")
            }else{
                println("Error, escoja un ingrediente correcto.")
            }
        }
    }else{
        println("Saliendo...")
    }
}

//Sentencias iterativas: 2, 4, 6, 7, 8, 13,

fun iterativas2() {
    // Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los años que ha cumplido (desde 1 hasta su edad).
    print("Introduzca su edad ")
    try {
        val edad = readln().toInt()
        var cero = 0
        if (edad <= 0) {
            println("ERROR, introduzca un numero correcto")
        }
        while (cero != edad) {
            cero++
            print(cero)
        }
    } catch (e: NumberFormatException) {
        print("Caracter invalido")
    }
}



fun iterativas4() {
    // Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
    try {
        print("Introduzca un numero-> ")
        var num = readln().toInt()
        var contador = 0
        while (contador != num) {
            num--

            print("$num,")
        }
    }
    catch (e: NumberFormatException){
        println("ERROR, has introducido un caracter incorrecto.")
    }
}

fun iterativas6(){
    //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.
    print("Introduzca el numero de altura que quieres que tenga la piramide: ")
    val altura = readln().toIntOrNull()

    if (altura != null && altura > 0){
        for (i in 1..altura){
            for (j in 1..i){
                print("* ")
            }
            println()
        }
    }else{
        println("ERROR, ingrese un numero positivo")
    }
}

fun iterativas7(){
    // Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.
    print("Escoge el numero de la tabla que quieres realizar-> ")
    val num = readln().toInt()
    var resultado = 1
    for (i in 1..10){
        resultado = num * i
        println("$resultado")
    }
}


fun iterativas8(){
    //Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo rectángulo como el de más abajo.
    //
    //1
    //3 1
    //5 3 1
    //7 5 3 1
    //9 7 5 3 1

    print("Introduzca un numero entero: ")
    var num= readln().toInt()
    for (i in 1..10){
        for (j in 1..i){
            print(" ")
            }
        }
        println("$num")

}

fun iterativas13(){
    // Escribir un programa que muestre el eco de todo lo que el usuario introduzca hasta que el usuario escriba "salir" que terminará.
    var todo_ok = true
    val exit = "salir"
    while (todo_ok){
        print("Diga una palabra(menos salir)-> ")
        val palabra = readln()
        println(palabra)
        if (palabra == exit){
            todo_ok=false
        }
    }

}
//15, 18, 19 y 25

fun iterativas15(){
    //Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente, mostrar la sumatoria de todos los números positivos ingresados.
    var todo_ok=true
    var resultado = 0
    while (todo_ok){
        print("Introduzca un numero entero, pulse cero para salir-> ")
        try {
            var num = readln().toInt()

            if (num ==0){
                todo_ok = false

            }else if (num >0){
                resultado += num
            }
        }catch (e:NumberFormatException){
            println("Error, ingresa un numero correcto.")
        }

    }
    println("La suma de los numeros es $resultado")
}

fun iterativas18(){
    //Solicitar al usuario que ingrese números enteros positivos y, por cada uno, imprimir la suma de los dígitos que lo componen. La condición de corte es que se ingrese el número -1. Al finalizar, mostrar cuántos de los números ingresados por el usuario fueron números pares.
    var todo_ok=true
    var resultado = 0
    var par = 0
    var numerospares = 0
    while (todo_ok){
        print("Introduzca un numero entero, introduzca -1 para salir-> ")
        try {
            var num = readln().toInt()

            if (num ==-1){
                todo_ok = false

            }else if (num >0){
                resultado += num

                par = num % 2
                if (par == 0){
                    numerospares++
                }
            }
        }catch (e:NumberFormatException){
            println("Error, ingresa un numero correcto.")
        }

    }
    println("Los numeros pares han sido $numerospares")
    println("La suma de los numeros es $resultado")
}

fun iterativas19(){
    //Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-finalizar programa. A continuación, el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El menú se debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las opciones 1 ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará.
    var todo_ok = true


    while (todo_ok){
        try {
            print("Escoja una opcion 1: comenzar programa, 2: imprimir listado, 3: Finalizar programa-> ")
            val opcion = readln().toInt()
            if (opcion != 1 && opcion != 2 && opcion!= 3){
                println("ERROR, escoja una opcion correcta")
            }else{
                if (opcion == 1){
                    println("Usted ha escogido comenzar programa")
                }else if (opcion == 2){
                    println("Usted ha escogido imprimir listado")
                }else if (opcion == 3){
                    println("Saliendo...")
                    todo_ok = false
                }
            }

        }catch (e:NumberFormatException){
            println("ERROR introduzca una opcion de las dadas.")
        }

    }
}

fun iterativas25(){
    // Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más larga (en caso de haber más de una, mostrar la primera) y cuántas palabras había. Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya sea uno o más.
    println("Escriba una frase -> ")
    val frase = readln().toString()
    val palabras = frase.split(" ")
    var larga = ""
    val cantidad = palabras.size

    palabras?.forEach{palabra ->
        if (palabra.length > larga.length){
            larga = palabra
        }

    }
    println("La palabra mas larga es $larga")
    println("La cantidad de palabras son $cantidad")
}



// Captura de Excepciones 2, 3, 4

fun excepciones2(){
    //Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas.
        print("Introduazca un numero entero positivo-> ")
      try {
          val num = readln()?.toInt() ?: throw NumberFormatException("ERROR, introduzca un numero")
          if (num > 0){
              var comienzo = 1
              while (comienzo <= num){
                  if (comienzo % 2 != 0){
                      print("$comienzo,")
                  }
                  comienzo++
              }
          }else{
              print("Introduzca un numero positivo")
          }
      }catch (e: NumberFormatException){
          print("ERROR, ingrese un numero válido")
      }
}

fun excepciones3() {
    //Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
    //Deberá solicitar el número hasta introducir uno correcto.

    var num: Int?
    var todo_ok = true

    try{
        do {
        print("Introduzca un numero entero-> ")



            num = readln().toInt()

            if (num != null && num >= 0) {
                while (todo_ok) {
                    print("$num,")
                    num--
                    if (num == 0) {
                        todo_ok = false
                    }
                }
            }
        }while (num == null || num < 0)
    }catch (e: NumberFormatException){
        println("ERROR")
    }
}

fun excepciones4(){
    //Escribir un programa que pida al usuario un número entero, si la entrada no es correcta, mostrará el mensaje "La entrada no es correcta" y lanzará la excepción capturada.
    print("Introduzca un numero entero-> ")

    try {
        val num = readln().toInt()
    }catch (e:NumberFormatException){
        println("Hey, que se iba escapando, la he capturado para ti ;)")
    }
}



//  4, 6, 8, 9, 10 y 13.
fun listas04(){
    //Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.
    var todo_ok = true
    val lista_loteria = mutableListOf<String>()
    while (todo_ok){
        print("Indique los numeros ganadores de la loteria (Presione x para salir) -> ")
        val loteria = readln()

        if (loteria == "x"){
            println("Saliendo...")
            todo_ok = false
        }else{
            lista_loteria.add(loteria)
        }
        lista_loteria.sort()
        println(lista_loteria)
    }
}

fun listas06() {
    //Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas. Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.

    val asignaturas = mutableListOf("Matematicas", "Lengua", "Ingles")
    val suspensas = mutableListOf<String>()

    for (asignatura in asignaturas){
        println("Que nota has sacado en $asignatura?")
        val nota = readLine()?.toIntOrNull() ?:0

        if (nota < 5){
            suspensas.add(asignatura)
        }
    }
    asignaturas.removeAll(suspensas)

    if (asignaturas.isEmpty()){
        println("Felicidades has aprobado todo")
    }else {
        println("Te han quedado $suspensas")
    }

}

fun listas08(){
    //Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.
    print("Escriba una palabra-> ")
    try {
        val palabra = readln().toString()
        if (palabra.reversed() == palabra){
            println("Es palindromo!!")
        }else{
            println("No es palindromo :(")
        }
    }catch (e: Exception){
        println("ERROR, introduzca lo que se pide.")
    }

}

fun listas09(){
    //Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces que contiene cada vocal.
    print("Introduzca una palabra -> ")
    val palabra = readln().toLowerCase()
    val vocales = "aeiou"
    val buscar = mutableMapOf<Char, Int>()

    for (letra in palabra){
        if (letra in vocales){
          //NO SE COMO HACERLO
        }
    }

}

fun listas10(){
    //Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8 y muestre por pantalla el menor y el mayor de los precios.
    val listaPrecios = mutableListOf(50, 75, 46, 22, 80, 65, 8)
    println("Lista sin ordenar-> $listaPrecios")
    listaPrecios.sort()
    print("Lista ordenada-> $listaPrecios")
}

fun listas13(){
    //Escribir un programa que pregunte por una muestra de números, separados por comas, los guarde en una lista y muestre por pantalla su media y desviación típica.

    //No se como va la desviacion tipica :)
}


//3, 5, 6, 7, 8, 10 y 11.
fun diccionario03(){
    // Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla, pregunte al usuario por una fruta, un número de kilos y muestre por pantalla el precio de ese número de kilos de fruta. Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.

    val diccionario = mutableMapOf("Plátano" to 1.35, "Manzana" to 0.80, "Pera" to  0.85, "Naranja" to 0.70)
    var todo_ok = true

    while (todo_ok){

        print("Que fruta desea de la lista $diccionario -> ")
        val fruta = readln().capitalize().trim()
        if (fruta in diccionario){
            print("Cuantos kg de $fruta quieres? ")
            val kg= readln().toDouble()
            val precio = kg * diccionario[fruta]!!

            println("El precio de los $kg de $fruta son: $precio€")
        }
        if (fruta !in diccionario) {
            println("Error, escoja una fruta de la lista")
            todo_ok = false
        }
    }
}

fun diccionario05(){
    //Escribir un programa que almacene el diccionario con los créditos de las asignaturas de un curso {'Matemáticas': 6, 'Física': 4, 'Química': 5} y después muestre por pantalla los créditos de cada asignatura en el formato <asignatura> tiene <créditos> créditos, donde <asignatura> es cada una de las asignaturas del curso, y <créditos> son sus créditos. Al final debe mostrar también el número total de créditos del curso.
    val asignaturas = mutableMapOf("Matematicas" to 6, "Fisica" to 4, "Quimica" to 5)
    val creditosTotal = asignaturas.values.sum()

    for ((asignatura, creditos) in asignaturas){
        println("$asignatura tiene $creditos creditos")
    }
    println("Y el total de creditos es $creditosTotal")

}

fun diccionario06(){
    //Escribir un programa que cree un diccionario vacío y lo vaya llenado con información sobre una persona (por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.) que se le pida al usuario. Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.
    val diccionarioVacio = mutableMapOf<String, Any>()
    var todo_ok = true

    while (todo_ok){
        print("Quiere introducir un dato? (s/n) ->")
        val respuesta = readln().toLowerCase()

        if (respuesta != "s" && respuesta!="si"){
            println("Saliendo...")
            todo_ok = false
        }
        else{
            print("Que deseas añadir? -> ")
            val dato = readln()
            print("introduzca el dato-> ")
            val añadir = readln()
            diccionarioVacio[dato] = añadir
            println(diccionarioVacio)

        }
    }
}

fun diccionario07(){
    //Escribir un programa que cree un diccionario simulando una cesta de la compra. El programa debe preguntar el artículo y su precio y añadir el par al diccionario, hasta que el usuario decida terminar. Después se debe mostrar por pantalla la lista de la compra y el coste total, con el siguiente formato
    val listaCompra = mutableMapOf<String,Double>()
    var todoOk= true

    while (todoOk){
        print("Desea añadir algún producto a la lista? (s/n)-> ")
        val respuesta = readln().toLowerCase().trim()

        if (respuesta != "s" && respuesta != "si"){
            println("Saliendo...")
            todoOk=false
        }
        else{
            print("Que producto desea añadir? -> ")
            val producto = readln().capitalize()

            print("Cuanto vale $producto?-> ")
            val precio = readln().toDouble()

            listaCompra[producto] = precio


        }
    }
    val total = listaCompra.values.sum()
    println("Lista de la compra: $listaCompra, precio total a pagar: $total€ ")
}

fun diccionario08(){
    //Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las palabras en español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por comas. El programa debe crear un diccionario con las palabras y sus traducciones. Después pedirá una frase en español y utilizará el diccionario para traducirla palabra a palabra. Si una palabra no está en el diccionario debe dejarla sin traducir.
    val traducido = mutableMapOf("mesa" to "table", "la" to "the", "limpia" to "clean", "grande" to "big", "caro" to "expensive")
    val usuario = mutableMapOf<String,String>()
    val listaAtraducir = mutableListOf<String>()

    print("Introduzca una frase a traducir-> ")
    val frase = readln().toString().toLowerCase()

    //if (frase == traducido.keys){



}

fun diccionario10(diccionarioInterior: MutableMap<String,Any>){
    //Gestion de la base de datos, diccionario dentro de diccionario
    val diccionarioNif = mutableMapOf<Int, MutableMap<String,Any>>()

    print("Que desea hacer-> ")
    println("(1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los clientes, (5) Listar clientes preferentes, (6) Terminar.")
    val opcion = readln().toInt()
    when (opcion){
        1 -> añadirCliente(diccionarioNif)
    }

}

fun añadirCliente(diccionarioNif: MutableMap<Int, MutableMap<String, Any>>): MutableMap<String,Any>{

    val diccionarioInterior = mutableMapOf<String, Any>()

        println("Introduzca los siguientes datos: ")
        print("NIF-> ")
        val nif= readln().toInt()
        diccionarioNif[nif]


        print("Nombre-> ")
        val nombre = readln()
        diccionarioInterior["Nombre"]= nombre

        print("Direccion-> ")
        val direccion = readln()
        diccionarioInterior["Direccion"]= direccion

        print("Telefono-> ")
        val telefono = readln()
        if (telefono.length > 9 ){
            println("ERROR, introduzca un numero correcto")
        }else{
            diccionarioInterior["Telefono"] = telefono
        }

        print("Correo-> ")
        val correo = readln()
        diccionarioInterior["Correo"] = correo

        print("Eres cliente preferente? (s/n) ")
        val preferente = readln().toLowerCase()
        if (preferente =="s" && preferente =="si"){
            diccionarioInterior["Preferente"] = true
        }else{
            diccionarioInterior["Preferente"] = false
        }
        println("$diccionarioInterior")

    return diccionarioInterior
}


