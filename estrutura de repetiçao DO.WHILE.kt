fun main() {
    var i=0
        do{
            print("${i} ")
            i++
        }while(i != 10)

        while (i==10){
            print("loop while")
            i++
        }
    print("\n")
    do{
        print("Qual seu nome: ")
        val value = readLine()
    }while (value== "")

}