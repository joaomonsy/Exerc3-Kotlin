fun main(args:Array<String>){
    println("Digite o primeiro número:")
    val X: Int = readLine()!!.toInt()

    println("Digite o segundo número:")
    val Y: Int = readLine()!!.toInt()

    val resultado: Int = multiplica(X,Y)
    println("O resultado da multiplicação é = $resultado")
}

//método da multiplicação
fun multiplica(X:Int,Y:Int): Int{
    return X * Y
}