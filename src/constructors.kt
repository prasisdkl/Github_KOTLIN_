fun main(){

    val sapta= Class("gag", "rose", 7)
    println(sapta.className)
    println(sapta.age)
    println(sapta.name)

    println(sapta.canBebleTOJointTheclass())

    sapta.age = 5               // dots refers to the properties
    println(sapta.canBebleTOJointTheclass())




}

class Class(var name: String, var className: String, var age:Int){   // properties

    fun canBebleTOJointTheclass():Boolean{             // methods
        return age>5
    }


}






