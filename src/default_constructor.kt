fun main(){

    val calc= Calculator()

    println(calc.add(4,5))
    println(calc.multi(2,3))

}

class Calculator(){

    lateinit var message: String
    fun add(a: Int, b:Int): Int{
        return a+b
    }

    fun multi(a:Int, b:Int):Int{
        return a*b
    }
}