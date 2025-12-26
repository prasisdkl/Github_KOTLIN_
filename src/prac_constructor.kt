fun main(){

    val nepal = House("orange","pinkey")
    val india = House("yellow","HElo")
    val uSA = House("Pink","pinku")

    println(nepal.door)
    println(nepal.name)
    println(nepal.room)
    println(nepal.color)
    nepal.various()

    println(india.door)
    println(india.name)
    println(india.room)
    println(india.color)
    india.indio()

   println(uSA.name)
    println(uSA.door)

}

class House( val color: String, val room: Int, val door: Int, val name: String)
{
    init{
        println("$name is loaded successfully.")
    }

    constructor(colorParam : String, nameParam : String)
    : this(colorParam,4,10,nameParam)

    fun various(){
        println("$name- We have Various kinds of color.")
    }

    fun indio(){
        println("$name -INDIA IS OVERPOPULATED COUNTRY")
    }
}