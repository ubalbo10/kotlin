fun main(){
    val ano: Int=360  //tomamos en cuenta 360 dias para un ano , esto lo hacemos para que cada mes tenga 30 dias
    val mes:Int=30    //tomamos todos los meses como de 30 dias esto para que todos los meses tengan la misma cantidad de dias
    val dia:Int=1     //representa 1 dia
    var x:Int=0  // representa los anos
    var y:Int=0  //representa los meses
    var z:Int=0  //representa los dias
    var n:Int=0  //es la cantidad de dias que queremos convertir
    println("Ingrese el numero de dias a convertir")
    n=readLine()!!.toInt()
    while(n<=0){
        println("Ingrese el numero de dias a convertir tiene que ser un numero mayor que cero")
        n=readLine()!!.toInt()
    }
    if(n>=ano){
        x=n/ano //con esto sacamos los anos que tenemos  en los dias ingresados
        n=n-(x*ano)  //actualizamos la cantidad de dias que nos queda quitando la cantidad de anos que sacamos anteriormente
        //
        if(n>=mes){
           y=n/mes
            n=n-(y*mes)
            z=n
        }else{
           z=n
        }
    }else
        if(n>=mes){
            y=n/mes
            n=n-(y*mes)
            z=n
        }else{
            z=n
        }
     println("anos:"+x)
    println("meses:"+y)
    println("dias: "+z)
}