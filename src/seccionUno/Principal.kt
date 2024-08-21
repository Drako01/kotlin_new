package seccionUno

fun main(args: Array<String>) {
    // Ejercicio_01
    val cantidadDePosiciones = args.size
    println("La cantidad de Argumentos pasados al main es: $cantidadDePosiciones")
    if (cantidadDePosiciones > 0) {
        println("El Primer argumento es: ${args[0]}")
    }
    if (cantidadDePosiciones > 1) {
        println("El Segundo argumento es: ${args[1]}")
    }

    // Ejercicio_01B
    if (args.size == 3) {
        println("El Argumento de la Posicion 1 es: ${args[0]}")
        println("El Argumento de la Posicion 2 es: ${args[1]}")
        println("El Argumento de la Posicion 3 es: ${args[2]}")
    } else {
        println("Debe ejecutar el programa con 3 argumentos")
    }

    // Ejercicio_02
    val unCaracter = '1'
    if (unCaracter in 'A'..'Z') {
        println("$unCaracter Es mayuscula")
    } else if (unCaracter in 'a'..'z') {
        println("$unCaracter Es minuscula")
    } else {
        println("$unCaracter No es una Letra")
    }

    // Ejercicio_03
    val nota1 = 7.2f
    val nota2 = 8.49f
    val nota3 = 5.6f
    var cantidadDeNotasMayoresQue4 = 0
    var cantidadDeNotasMenoresQue4 = 0

    val promedio = (nota1 + nota2 + nota3) / 3

    if (promedio >= 6.59) {
        println("El Promedio supera los 6.59 puntos")
    } else {
        println("El promedio no supera los 6.59 puntos")
    }

    if (nota1 > 4) {
        cantidadDeNotasMayoresQue4++
    } else {
        cantidadDeNotasMenoresQue4++
    }
    if (nota2 > 4) {
        cantidadDeNotasMayoresQue4++
    } else {
        cantidadDeNotasMenoresQue4++
    }
    if (nota3 > 4) {
        cantidadDeNotasMayoresQue4++
    } else {
        cantidadDeNotasMenoresQue4++
    }

    println("Cantidad De Notas Mayores Que 4 $cantidadDeNotasMayoresQue4")
    println("Cantidad De Notas Menores Que 4 $cantidadDeNotasMenoresQue4")

    // Ejercicio_01 (Switch)
    val diaDeLaSemana = 6
    when (diaDeLaSemana) {
        1 -> println("El dia de la semana $diaDeLaSemana es Lunes")
        2 -> println("El dia de la semana $diaDeLaSemana es Martes")
        3 -> println("El dia de la semana $diaDeLaSemana es Miercoles")
        4 -> println("El dia de la semana $diaDeLaSemana es Jueves")
        5 -> println("El dia de la semana $diaDeLaSemana es Viernes")
        6 -> println("El dia de la semana $diaDeLaSemana es Sábado")
        7 -> println("El dia de la semana $diaDeLaSemana es Domingo")
        else -> println("El valor $diaDeLaSemana se encuentra fuera de Rango")
    }
    println("Fin del Main")

    // Ejercicio_02 (Switch)
    val unValor = 10
    when (unValor) {
        1, 2, 3, 4 -> println("Menor que Cinco, o menor o igual que cuatro")
        5 -> println("Igual a Cinco")
        6, 7, 8, 9 -> println("Es mayor que cinco y menor que diez")
        else -> println("Es mayor o igual a 10")
    }
    println("Fin Main")
}
