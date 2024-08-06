fun Impressao(){
    println("Funçoes sem parametro e sem retorno")
}
fun Soma(a:Int,b:Int):Int{//Funçao com parametro e com retorno do tipo inteiro
    return a+b
}

fun main() {
    Impressao()
    var x=10
    var y= 20
    println(Soma(x,y))
    Soma_2(x,y)
}

fun Soma_2(a:Int,b:Int){//Funçao com parametro e sem retorno
    println("a soma das variaveis sao: ${a+b}")
}