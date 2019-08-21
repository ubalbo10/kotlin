fun main(){
    // programa para ver si el numero que ingresamos por teclado es primo o no

    var numero:Int
    //captura del numero ingresado por teclado
    println("Ingrese un numero:")
    numero= readLine()!!.toInt()
    //validacion para que el numero sea positivo
    while(numero<=0){
        println("Ingrese un numero mayor que cero:")
        numero= readLine()!!.toInt()
    }
    //comparaciones para poder tener solo numeros primos
    //como primera comparacion tenemos que un numero primo no puede ser par excepto el 2
    //no todos los numeros impares son primos por eso debemos de restringir los que no sea a base de condicionales
    // un numero primo es un numero mayor a 1 que solo es divisible por el 1 y por el mismo

    if ((numero%2)==0) {
        if (numero == 2) {
            println("es primo")
        }else{
            println("no es primo")
        }
    }else
        if (numero==1){
            println("no es primo")
        }else
             if (numero%3==0 || numero%5==0 || numero%7==0)  {
                 if(numero==3 || numero==5 || numero==7){
                     println("primo")
                 }else{
                     println("no es primo")
                 }
             }else{
               println("es primo")
             }
    }
