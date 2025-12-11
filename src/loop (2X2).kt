fun main(){

    var number = 2
    var index = 1
    while(index<=10)
    {
       // print( "2x"+ index + "=")
        println( number.toString() + "x" + index + "=" + (number * index))
        index++
    }
    print("Outside loop - " +  number.toString() + "x" + index + "=" + ( number * index) )
    index++
    print(" - Next index= " + index)
}