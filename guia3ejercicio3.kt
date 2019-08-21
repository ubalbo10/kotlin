fun main(){
    //declaracion de variables
    var base: Float
    var altura: Float
    //captura de datos por teclado
    println("ingrese la base del rectangulo:")
    base=readLine()!!.toFloat()
    println("ingrese la altura del rectangulo")
    altura=readLine()!!.toFloat()
    while(base<0 || altura<0){
        println("los numeros tienen que ser positivos")
        println("ingrese la base del rectangulo:")
        base=readLine()!!.toFloat()
        println("ingrese la altura del rectangulo")
        altura=readLine()!!.toFloat()
    }
    println("el area del rectangulo es:"+(base*altura))
    //area del rectangulo=base*altura

}