fun main(){
  var person=Human("Sosano",23,60)
    person.eat(13)
    println(person.weight)
    person.speak("Hey you! Nice to see you,ha!ha!")
    person.birthday(1)
    println(person.age)
    var lady=User("Olerani","Jona","olerani@gmail.com","Barcelona616")
    println(lady.firstName)
    println(lady.password)


}
class Human( var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
weight+=foodWeight
     println("I am eating ${foodWeight} kgs of food")
    }
    fun speak(speech:String){
        println(speech)

    }
    fun birthday(year:Int){
        age+=year

    }
}
data class User(var firstName:String,var lastName:String,var email:String,var password:String)