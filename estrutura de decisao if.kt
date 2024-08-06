fun main(){
    //classifique as pessoas pela sua idade
    //idoso: 60+ | adulto:entre 21 a 59 | jovem:entre 13 e 20 anos | criança:12 ou menos
    var idade:Int = 13
    if(idade >= 60){ //true
        println("idoso")
    }else if (idade <= 59 && idade >= 21){
        println("adulto")
    }else if (idade <= 20 && idade >= 13){
        println("jovem")
    }else if(idade == 12 && idade <=12 ){
        println("criança")
    }
}