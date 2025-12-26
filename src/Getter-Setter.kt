import java.util.Locale
import java.util.Locale.getDefault

fun main(){

    var vlog = Food("Pizza",800)

    println(vlog.name)
    println(vlog.price)
    vlog.price=400

}

class Food(nameParam: String, priceParam: Int)
{
    var name: String = nameParam
        get() {

            println("NAME getter is called:")
            return field.uppercase(getDefault())
        }


    var price: Int = priceParam
        set(value){
            if(value > 400){
                println("PIZZA IS READY")
                field = value
            }
            else if(value < 400){
                println("ONLY WATER")
            }
            else{
                println("YOU ONLY GET BURGER ,PRICE IS LOW:")
            }
        }

//  DEFAULT syntax to define "GETTER and SETTER"
//          var email: String = ""
//              get() = field
//              set(value){
//              field = value
//              }
}