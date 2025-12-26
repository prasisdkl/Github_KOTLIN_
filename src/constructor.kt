fun main(){

    val laptop = Computer("Aser","Rtx")
    val laptop2 = Computer("macBook","A-chip")
    val laptop3 = Computer("levono","Intel")

    laptop.keyboard()
    laptop.bestCom()

}

class Computer( val name: String, val graphics: String, val cpu: String, val memory: Int)
{

    init{
        println("$name  is created successfully.")
    }
    init{
        println("$name is started.")
    }

    constructor(nameParam: String, cpuParam: String) :
            this(nameParam, "Rtx",cpuParam,16)

    fun bestCom(){
        println("$name - is best for performance.")
    }

    fun keyboard(){
        println("$name - Selles you a best Keyboard.")
    }
}