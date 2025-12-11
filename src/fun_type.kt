import kotlin.math.pow

fun main(){

    var fn = ::additioon
    println(fn(1.0,2.0))

    fn=::power
    println(fn(2.0,5.0))

}

fun additioon(a:Double, b:Double): Double
{
    return a  + b
}

fun power(a:Double, b:Double): Double
{
    return a.pow(b)
}