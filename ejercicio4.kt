fun main(){
   // println("uso del primer constructor")
    var cuenta1=Cuenta("guillermo")
    println("titular:${cuenta1.titular} y cantidad:${cuenta1.cantidad}")
    //println("uso del segundo constructor")
    var cuenta2=Cuenta("guille",100.0)
    println("titular:${cuenta2.titular} y cantidad:${cuenta2.cantidad}")
    println("haremos un ingreso a la cuenta de 20")
    cuenta2.ingresar(20.0)
    println("titular:${cuenta2.titular} y cantidad:${cuenta2.cantidad}")
    println("haremos un retiro de 10")
    cuenta2.retirar(10.0)
    println("titular:${cuenta2.titular} y cantidad:${cuenta2.cantidad}")
    println("haremos un ingreso negativo , no deberia de modificar el saldo")
    cuenta2.ingresar(-10.0)
    println("titular:${cuenta2.titular} y cantidad:${cuenta2.cantidad}")
    println("haremos un retiro negativo, la cuenta debe de quedar en cero")
    cuenta2.retirar(-10.0)
    println("titular:${cuenta2.titular} y cantidad:${cuenta2.cantidad}")


}
class Cuenta(var titular:String,var cantidad:Double){
constructor(titular: String):this("",0.0){
    this.titular=titular
    this.cantidad=0.0
}
    fun ingresar(cantidad:Double){
        if(cantidad>=0) {
            this.cantidad = this.cantidad + cantidad
        }
    }
    //se resta si la cantidad es posita , si es negativa se pone a cero
    fun retirar(cantidad: Double){
        if(cantidad>=0) {
            this.cantidad = this.cantidad - cantidad
        }else this.cantidad=0.0
    }
}