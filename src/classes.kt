fun main(){

    val mustang = Car("mustang", "petrol",100)
    val beetle = Car("beetle", "diesel",200)

    println(mustang.name)  // .(DOT Operator) is used to access the property
    println(mustang.type)
    println(mustang.kmRan)

    println(beetle.name)

    mustang.driveCar()

    beetle.driveCar()

    mustang.applyBrakes()

}

class Car (val name:String, val type : String, var kmRan : Int)   //PROPERTIES
{
    fun driveCar(){                                              //Methods
        println("$name -car is driving")
    }

    fun applyBrakes(){
        println("$name -Apply Brakes")
    }
}