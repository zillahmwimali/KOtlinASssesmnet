fun main() {
    introduction("Zillah",20)
    serveJuice(7)
    serveJuice(22)
    serveJuice(15)
    println(namez(arrayOf("Zillah","Sheilla","Waithera","Holy","Winy")))
    println(product(56,900))
    println(add(7,8))
    println(remainder(19,7))
    var person=Human("Mwimali",20,58)
    person.eat(2)
    person.speak("Awesomeness")
    person.birthday()
    comparison(8,10)









}
fun introduction(name:String,age:Int):String{
    return "My name is $name and I am $age years old. E.g: My name is Hellen and I am 19 years old."

}
fun serveJuice(age:Int) {
    if (age < 6) {
        println("Serve Milk")
    } else if (age > 6 && age < 15) {
        println("Serve Fanta")
    } else {
        println("Serve Cocacola")
    }
}

fun namez(nam:Array<String>):Int {
    var total = 0
    for (nams in nam) {
        if (nams.length<4) {
            total++
        }
    }
    return total
}
fun product(num1:Int,num2:Int):Int{
    return num1*num2

}
fun add(num3:Int,num4:Int):Int{
    return num3+num4
}
fun remainder(num5:Int,num6:Int):Int{
    return num5%num6
}
class Human(var name:String,var age:Int,var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight = foodWeight + weight
        println(weight)
    }
    fun speak(words:String){

    }

    fun birthday() {
        ++age
        println(age)
    }
}
fun comparison(num8:Int,num9:Int){



}


