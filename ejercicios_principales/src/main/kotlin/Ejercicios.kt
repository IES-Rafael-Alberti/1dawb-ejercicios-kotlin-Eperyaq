//U1: 4, 6, 12, 15, 18, 20, 21, 22, 24, 25, 26 y 27.

fun ejercicio4(){
//Escribe un programa que le pida al usuario una temperatura en grados Celsius, la convierta a grados Fahrenheit e imprima por pantalla la temperatura convertida.
// (0 °C × 9 / 5) + 32 = 32 °F
    var celsius = ""
    var farenheit = ""

    println("Dime una temperatura en grados Celsius: ")
    celsius = readln()
    celsius.toFloat()

    farenheit = (celsius   * 9) / 5 + 32

    println("$celsius Grados celsius son $farenheit Grados Farenheit.")




}