fun main(){

    println(addition(1,2))
    println(addition(1.0,2.0))
}

//This function is Same name different parameter
//Either number of parameter is different Or Type is different

fun addition(a: Int, b:Int ): Int
{
    return a + b

}

fun addition(a: Double, b:Double): Double
{
    return a + b
}