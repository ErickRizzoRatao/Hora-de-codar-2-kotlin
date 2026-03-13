fun main() {

    println("Digite o primeiro número:")
    val n1 = readLine()!!.toDouble()

    println("Digite o segundo número:")
    val n2 = readLine()!!.toDouble()

    if (n1 > n2) {
        println("O maior número é: $n1")
    } else {
        println("O maior número é: $n2")
    }


    println("Digite um número:")
    val num1 = readLine()!!.toDouble()

    if (num1 > 0) {
        println("Número positivo")
    } else if (num1 < 0) {
        println("Número negativo")
    } else {
        println("O número é zero")
    }


    println("Digite três números:")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    var maior = a

    if (b > maior) maior = b
    if (c > maior) maior = c

    println("O maior número é: $maior")


    val menor = minOf(a, b, c)
    val somaDoisMaiores = a + b + c - menor
    println("Soma dos dois maiores: $somaDoisMaiores")


    var soma = 0.0

    for (i in 1..6) {
        println("Digite um número:")
        val num = readLine()!!.toDouble()
        soma += num
    }

    val media = soma / 6
    println("Média: $media")


    println("Digite quatro números:")
    val n3 = readLine()!!.toDouble()
    val n4 = readLine()!!.toDouble()
    val n5 = readLine()!!.toDouble()
    val n6 = readLine()!!.toDouble()

    val maior4 = maxOf(n3, n4, n5, n6)

    println("Primeiro número: $n3")
    println("Último número: $n6")
    println("Maior número: $maior4")


    var somaMenores = 0.0
    val numeros = mutableListOf<Double>()

    for (i in 1..6) {
        val num = readLine()!!.toDouble()
        numeros.add(num)

        if (num < 72) {
            somaMenores += num
        }
    }

    println("Números digitados: $numeros")
    println("Soma dos menores que 72: $somaMenores")


    var somaTeste = 0.0
    var contador = 0

    for (i in 1..4) {
        val num = readLine()!!.toDouble()

        if (num > 0 && num < 10) {
            somaTeste += num
            contador++
        }
    }

    val mediaTeste = somaTeste / contador

    if (mediaTeste > 5) {
        println("Você passou no teste")
    } else {
        println("Tente novamente")
    }


    println("Digite seu ano de nascimento:")
    val nascimento = readLine()!!.toInt()

    val idade = 2026 - nascimento

    if (idade >= 18) {
        println("Você pode votar este ano")
    } else {
        println("Você não pode votar este ano")
    }


    println("Digite sua altura:")
    val altura = readLine()!!.toDouble()

    println("Digite o gênero (1 feminino / 2 masculino):")
    val genero = readLine()!!.toInt()

    if (genero == 1) {
        val peso = (62.1 * altura) - 44.7
        println("Peso ideal: $peso")
    } else {
        val peso = (72.7 * altura) - 58
        println("Peso ideal: $peso")
    }


    println("Digite o primeiro número:")
    val x = readLine()!!.toInt()

    println("Digite o segundo número:")
    val y = readLine()!!.toInt()

    println("Escolha operação:")
    println("1 Adição")
    println("2 Subtração")
    println("3 Divisão")
    println("4 Multiplicação")

    val op = readLine()!!.toInt()

    when (op) {
        1 -> println("Resultado: ${x + y}")
        2 -> println("Resultado: ${x - y}")
        3 -> println("Resultado: ${x / y}")
        4 -> println("Resultado: ${x * y}")
        else -> println("Operação inválida")
    }
}