fun main(){

    val arr = arrayOf("One", "Two", "Three")


    //i = index which is arr and e = element which is one two three
    for((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    //accessing the element  in arr
    println(arr[0])
    println(arr.get(1))
    arr.set(2,"PRASIS")   // this step change the element of arr in position two
    println(arr.get(2))
}
