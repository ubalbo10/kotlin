//clase persona
//atributos nombre,dia,mes,ano
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun main(){

   /* println("Escriba la fecha de ahora en formato dia/mes/ano una despues del otro")
    var dia:Int
    var mes:Int
    var ano:Int
    var edad:Int
    dia= readLine()!!.toInt()
    mes= readLine()!!.toInt()
    ano= readLine()!!.toInt()
*/
    var edad:Int
    var fecha:LocalDateTime=LocalDateTime.now()
    /*println("year"+fecha.year)
    println("mes"+(fecha.month))
    println("dias"+fecha.dayOfMonth)*/

   var guillermo=Persona()
    println("su nombre es: "+guillermo.nombre)
    println("su edad es :")
    if(fecha.monthValue>=guillermo.mes && fecha.dayOfMonth>=guillermo.dia) {
        edad = fecha.year - guillermo.ano
    }else{
        edad=(fecha.year-guillermo.ano)-1
    }
    print(edad)
}
// creacion de la clase persona
class Persona(){
    var nombre:String
    var dia: Int
    var mes: Int
    var ano: Int

    init{
        println("Ingrese su nombre:")
        this.nombre= readLine()!!.toString()
        println("ingrese dia de nacimiento:")
        this.dia= readLine()!!.toInt()
        println("Ingrese mes de nacimiento en numeros ejemplo 1-enero, 2-febrero....12-diciembre  ")
        this.mes= readLine()!!.toInt()
        println("Ingrese year de nacimiento:")
        this.ano= readLine()!!.toInt()
    }


}