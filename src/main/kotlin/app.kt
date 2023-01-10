class App {
//    создал переменую возраста
    val id:Int = 34
    val nam:String = "Игорь"
//    вывожу через метод mypri пееменную
    fun mypri(){
        println(id )
    }
// тест
}

fun main(){
//    создаю обьект
    val mydan = App()
    mydan.mypri()
    mydan.mypri()
    mydan.mypri()

}
