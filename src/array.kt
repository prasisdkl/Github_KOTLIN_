fun main(){
    //   i                  -element
    val arr = arrayOf("one" , "two" , "three")

//    var arr1 = arrayOf(1,2,3)

//    var arr2 = arrayOf<Int>(3,2,5)

    for((i,e)  in arr.withIndex()){
        println("$i - $e")
    }



    //access a particular element
    println(arr[0])
    println(arr.get(1))
    arr.set(0, "hello")  // changing the element
    println(arr[0])
//    println(arr.size)
//    println(arr[3])
}