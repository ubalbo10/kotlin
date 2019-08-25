fun main(){
    //una forma pidiendo datos en el main
    /*println("ingrese nombre y nota del primer alumno")
    var nom1= readLine()!!.toString()
    var not1= readLine()!!.toFloat()
    println("ingrese nombre y nota del segundo alumno")
    var nom2= readLine()!!.toString()
    var not2= readLine()!!.toFloat()*/


    var Alumno1=Alumno()
    var Alumno2=Alumno()
    Alumno1.imprimir()
    Alumno1.esRegular()
    Alumno2.imprimir()
    Alumno2.esRegular()

}

class Alumno() {
    var nombre:String
    var nota : Float

    init {
        println("ingrese nombre y nota alumno")
        this.nombre= readLine()!!.toString()
        this.nota= readLine()!!.toFloat()

    }
    fun imprimir() {
        println("nombre:" + this.nombre)
        println("nota:" + this.nota)
    }

    fun esRegular() {
        if (this.nota >= 6) {
            println("Es regular")
        } else {
            println("No es regular")
        }
    }
}