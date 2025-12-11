fun main(){

    val tea = Drinks("tea","blackJACK",200)
    val coffee = Drinks("coffee", "chiyaGhar", 200)

    println(tea.name)
    println(tea.shop)
    println(tea.price)

    println(coffee.name)
    println(coffee.shop)
    println(coffee.price)


    tea.addMoreSUGAR()
    coffee.extraCup()


}

class Drinks(val name: String, val shop: String, val price : Int  )
{


    fun addMoreSUGAR()
    {
        println("$name -Sugar is added")
    }

    fun extraCup()
    {
        println("$name -Extra cup is here")
    }
}