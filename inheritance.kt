open class Animal {
    open fun size(){
        println()

    }
    open fun move(){
        println()
    }
    open fun food(){
        println()

    }
    open fun skin(){
        println()

    }
    open fun talk(){
        println()

    }
}
interface alatnapas {
    fun kandedes(){
        println("")
    }
}
class kucing : Animal(), alatnapas{
    override fun size() {
        println("small")
    }

    override fun skin() {
        println("fether")
    }

    override fun food() {
     println("fish")
    }

    override fun move() {
        println("land")
    }

    override fun talk() {
        println("meow")
    }

    override fun kandedes() {
        println("meow")
    }
}




fun main(){
    var animal = Animal()
    animal = kucing()
    animal.size()
    animal.skin()
    animal.food()
    animal.move()
    animal.kandedes()


}
