class hesabu {
    //datamember
    private var nambari:Int=8
    private var nambari2:Int=25

    //member function
    fun jumuisha():Int{
        return nambari*nambari2
    }
}

fun main(args: Array<String>) {
    //creating anobject of a class
    val obj=hesabu()
    println("${obj.jumuisha()}")
}