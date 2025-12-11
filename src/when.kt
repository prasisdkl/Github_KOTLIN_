fun main(){

    val animal = "Cow"
    val result = when(animal){
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is Cat"
        "Dog"  -> "Animal is Dog"
        else -> "Animal Not Found"
    }
    println(result)
}