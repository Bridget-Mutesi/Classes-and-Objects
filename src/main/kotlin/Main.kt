fun main(){
    var Bjt = Human("Bridget",20,40,)
    Bjt.speak("Hello dear")
    Bjt.eat(5)
    println(Bjt.weight)
    Bjt.name
    Bjt.birthday()
    println(Bjt.age)
    var myUser = User("Buraje","Vallary","burageval@gmail.com","0750570400","bureva")
    println(myUser.firstname)
    println(myUser.phoneNumber)


}





class Human(var name:String, var age:Int, var weight:Int, ){
    fun eat(foodWeight: Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(){
        age++
    }
}
data class User(var firstname: String, var LstName: String, var email: String, var phoneNumber: String, var password: String){

}