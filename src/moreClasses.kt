fun main()
{
    val i = 20
    println(i.plus(30))
    println(i.toFloat())

    val p1 = Person("a",20)
    val p2 = Person("b",18)

    println(p1.canVote())
    println(p2.canVote())

    p2.age=21
    println(p2.canVote())


    val s1 = School("Ravi", "science", 6)
    val s2 = School("Shyam", "science", 4)

    println(s1.canAdmission())
    println(s2.canAdmission())

    println(s1.faculty)
    s1.canChoose()

}

class Person(var name: String , var age: Int )
{
    fun canVote(): Boolean{
    return age>18
}
}

class School(var name: String, var faculty: String, var age: Int )
{
    fun canAdmission():Boolean{
        return age>=5
    }

    fun canChoose(){
        println("$name can choose the Subject")
    }
}
