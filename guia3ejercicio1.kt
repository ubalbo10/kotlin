fun main(){
    //declaracion de variables a usar
    var n1: Int=0
    var n2: Int=0
    //mensaje en consola
    println("Ingrese dos numeros uno primero y el otro despues")
    //captura los datos que ingrese el usuario
    n1 = readLine()!!.toInt()
    n2 = readLine()!!.toInt()

    while(n1<0 || n2<0) {
        println("vuelva a Ingresar dos numeros uno primero y el otro despues, tienen que ser mayor a cero")
        //captura los datos que ingrese el usuario
        n1 = readLine()!!.toInt()
        n2 = readLine()!!.toInt()
    }
    //comparaciones para hacer el ordenamiento de menor a mayor
    if(n1<n2){
        println(n1)
        println(n2)
    }else{
         println(n2)
         println(n1)
    }

}