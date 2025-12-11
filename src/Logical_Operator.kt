fun main(){

    val batteryHealth80 = true
    val canBeUsed = false

    // && AND Operator

    var comeToRepairedMobile = batteryHealth80 && canBeUsed
    println(comeToRepairedMobile)


    // || OR Operator
    comeToRepairedMobile = batteryHealth80 || canBeUsed
    println(comeToRepairedMobile)


}