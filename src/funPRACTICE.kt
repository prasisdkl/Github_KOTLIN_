fun main(){

    val result = subtraction( 6, 2)
    println(result)
    val result2 = subtraction(6,9)
    println(result2)
    evenorodd(3)
    evenorodd(4)
    MessagePrint(2)
    MessagePrint()
}
fun subtraction(num1 : Int , num2 : Int): Int
{
    val sub = num1 - num2
    return sub
}

fun evenorodd(num1:Int):Unit
{
    val result=if(num1 %2 == 0) "even" else "odd"
    println(result)
}

fun MessagePrint(count: Int=2 )      //count parameter
{
    for(i in 1..count)
    {
        println("PRASIS $i")
    }
}