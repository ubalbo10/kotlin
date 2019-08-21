fun main(){
    // funcionamiento como cajero de dispersion de billetes para vuelto
  var dinero:Int
    var x: Int //cantidad de billete de a 20
    var y:Int //cantidad de billete de a 10
    var z:Int //cantidad de billetes de a 5
    println("ingrese una cantidad de dinero:")
    dinero=readLine()!!.toInt()
    while(dinero<=0){
        println("ingrese una cantidad de dinero mayor que cero:")
        dinero=readLine()!!.toInt()
    }
    if(dinero>=20){
        //hacemos la division para ver cuantos billetes de a 20 se pueden dar en la cantidad introducida
        x=dinero/20
        //la division nos da la cantidad de billetes de a 20 que podemos dar
        println("billetes de a 20):"+x)
        //actualizamos el dinero que queda pendiente si anteriormente dimos algunos billetes de a 20
        dinero=dinero-(x*20)
        // esto se repite en cada condicion solo que con diferentes valores
        if(dinero>=10){
            y=dinero/10
            println("billete de a 10:)"+y)
            dinero=dinero-(y*10)
            //
            if(dinero>=5){
                z=dinero/5
                println("billetes de a 5:)"+z)
                dinero=dinero-(5*z)
                println("billetes de a 1:"+dinero)
            }else{
                println("billetes de a 1:"+dinero)
            }

        }else
            if(dinero>=5){
                z=dinero/5
                println("billetes de a 5:)"+z)
                dinero=dinero-(5*z)
                println("billetes de a 1:"+dinero)
            }else{
                println("billetes de a 1:"+dinero)
            }


    }else
        if(dinero>=10){
            y=dinero/10
            println("billete de a 10:)"+y)
            dinero=dinero-(y*10)
            //
            if(dinero>=5){
                z=dinero/5
                println("billetes de a 5:)"+z)
                dinero=dinero-(5*z)
                println("billetes de a 1:"+dinero)
            }else{
                println("billetes de a 1:"+dinero)
            }

        }else
            if(dinero>=5){
                z=dinero/5
                println("billetes de a 5:)"+z)
                dinero=dinero-(5*z)
                println("billetes de a 1:"+dinero)
            }else{
                println("billetes de a 1:"+dinero)
            }



}