fun main(){

    val apple = Apple("SmartPhone")
    apple.display()
    println(apple.name)
    println(apple.size)

    println(apple.toString())

    val mobile = Mobile("General")
    println (mobile.name)
    println (mobile.size)
    mobile.makeCall()
    mobile.display()
    mobile.powerOff()


}

open class Mobile( val type: String){

    init{
        println("Mobile is running")
    }

   open val name: String =""
   open val size: Double = 5.09

    open fun makeCall() = println("calling from mobile")
    open fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class Apple(typeParam: String) : Mobile(typeParam){

    init{
        println("Apple device is activate")
    }

    override fun display(){
        super.display()
        println("Apple display")
    }


    override val name: String = "Iphone Pro Max"
    override val size: Double = 6.07

    override fun toString(): String{
        return "Name - $name - Size - $size"
    }


}

