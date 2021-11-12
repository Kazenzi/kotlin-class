class wanafunzi(val jina:String,val jinsia:String,val miaka:Int) {
}

fun main(args: Array<String>) {
    val stud=wanafunzi("Erick","Male",6)
    println("My name is ${stud.jina}")
    println("My gender is ${stud.jinsia}")
    println("My age is ${stud.miaka}")
}