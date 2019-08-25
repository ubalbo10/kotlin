fun main(){
    //creacion de los 3 libros uno realizado sin parametros y los otros 2 con parametros
    // requerimiento de existencias de los 3 objetos 2,0,3
    var elPrincipito=Libro()
    var lacasa=Libro("casa","pablo neruda",0,0)
    var libro3=Libro("libro3","monchi",3,0)
    //uso de prestamo
    println("titulo:${elPrincipito.titulo}, Existencia:${elPrincipito.numEjemplares}")
    println("realizaremos un prestamo: true si se puede , false si no se puede prestar:")
    println(elPrincipito.prestamo())
    println("nueva existencia: ${elPrincipito.numEjemplares-elPrincipito.numPrestados}")
    println()
    println("titulo:${lacasa.titulo}, Existencia:${lacasa.numEjemplares}")
    println("realizaremos un prestamo: true si se puede , false si no se puede prestar:")
    println(lacasa.prestamo())
    println("nueva existencia: ${lacasa.numEjemplares-lacasa.numPrestados}")
    println()
    println("titulo:${libro3.titulo}, Existencia:${libro3.numEjemplares}")
    println("realizaremos un prestamo: true si se puede , false si no se puede prestar:")
    println(libro3.prestamo())
    println("nueva existencia: ${libro3.numEjemplares-libro3.numPrestados}")
    println()
    //uso de devolucion

    println("devolucio del libro ${elPrincipito.titulo}, Existencia actual: ${elPrincipito.numEjemplares-elPrincipito.numPrestados}")
    // si imprime true se realizo la devolucion si devuelve false es que no se realiza la devolucion porque no hay ejemplares prestados
    println(elPrincipito.Devolucion())
    println("existencia despues de la devolucion: ${elPrincipito.numEjemplares-elPrincipito.numPrestados}")

}

class Libro(var titulo:String,var autor:String,var numEjemplares:Int,var numPrestados:Int){
constructor():this("","",0,0){
    println("Ingrese el titulo del libro:")
    this.titulo = readLine()!!.toString()
    println("Ingrese el autor:")
    this.autor= readLine()!!.toString()
    println("Ingrese el numero de Ejemplares:")
    this.numEjemplares= readLine()!!.toInt()
    println("ingrese la cantidad de ejemplares prestados:")
    this.numPrestados= readLine()!!.toInt()

}
    fun prestamo():Boolean{
        if((this.numEjemplares-this.numPrestados)!=0){
            this.numPrestados=this.numPrestados+1
            return true
        }
        else return false
    }
    fun Devolucion():Boolean{
        if(this.numPrestados>0){
            this.numPrestados=this.numPrestados-1
            return true
        }
        else return false
    }
}