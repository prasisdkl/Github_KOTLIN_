import kotlin.math.pow

fun main(){

    var fn = ::MULTI
    println(fn(1.0,2.0))

    fn = ::power1
    println(fn(2.0,3.0))
}

fun MULTI(a:Double , b:Double):Double
{
    return a * b
}

fun power1(a: Double, b: Double): Double
{
    return  a.pow(b)
}
