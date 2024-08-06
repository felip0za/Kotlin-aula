fun main() {
    var i=0
        while (i<1000){
            if(i == 20){
                 break //parar uma iteraçao com base em uma requisiçao logica
            }
            print("${i} ")
            i++
        }
    print("\n")
    var str = "teste de perfil"
    var j=0
        while(j<str.length){
            if(str[j] == 'p'){
                break
            }
            print("${str[j]} ")
            j++
        }
    print("\n")
    for(i in 0 .. 20){
        if(i%2==0){
            continue
        }
        print("${i} ")
    }
    var str2 = "teste de perfil"
    print("\n")
    for(i in 0 .. str2.length-1){
        if(str2[i] == 'e' || str2[i] == 'i'){
            continue
        }
        print("${str2[i]} ")
    }
}