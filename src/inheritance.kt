fun main(){

    val objChild = Child()
    objChild.method()
    objChild.method2()

}

open class Parent{

    init{
        println("parent's constructor is called")
    }

    val name: String = ""

    fun method(){
        println("I am in Parent.")
    }

}

class Child : Parent(){

    init{
        println("Child's constructor is called")
    }

    val name2: String= ""

    fun method2(){
        println("I am in Child.")
    }
}