fun main(){

    val number = 14
    val result = when(number){
        13 -> "The number is 13"
        in 10..13 -> "The number is 10"
        in 11 until 15 -> "The number is 11"
        else -> "The number is not listed"
    }
    println(result)
}