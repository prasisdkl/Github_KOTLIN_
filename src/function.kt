fun main(){

   val result = add(4,5)
    println(result)
    val result2 = add(3,2)           // ARGUMENT values
    println(result2)
    evenOrOdd(1)
    evenOrOdd(4)
    printMessage(4)
    printMessage()

}


fun add(num1 : Int, num2 : Int ): Int             // PARAMETER values
{
    val sum = num1 + num2
    return sum
}



fun evenOrOdd(num1 : Int):Unit
{
    val result = if(num1 %2 == 0) "Even" else "Odd"         //unit return type
    println(result)
}



fun printMessage(count: Int = 2)     // Count Parameter IS VAL so value cannot be reassigned.
{
    for(i in 1..count)
    {
        println("PRASIS $i")
    }
}