// area y perimetro de un rectangulo
//area=b*h
//perimetro=2(b+h)

fun main(){
    var base:Float
    var altura:Float
    println("Ingrese base,altura del rectangulo")
    base= readLine()!!.toFloat()
    altura= readLine()!!.toFloat()
    var rectangulo=Rectangulo(base,altura)
    rectangulo.area()
    rectangulo.perimetro()
}
class Rectangulo(base:Float,altura:Float){
    var b=base
    var h=altura
    fun area(){
        println("el area es:"+(this.b*this.h))
    }
    fun perimetro(){
        println("el perimetro es:"+(2*(this.b+this.h)))
    }
}