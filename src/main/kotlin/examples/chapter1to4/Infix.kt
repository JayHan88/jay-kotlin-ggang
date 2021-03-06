package examples.chapter1to4

infix fun Int.myFun(x:Int): Int {
    return x * x
}

class FunClass {
    infix fun infixFun(a:Int) {
        println("infixFun called")
    }
}

fun main(args: Array<String>) {
    val obj = FunClass()
    obj.infixFun(10)
    // 중위표현식
    obj infixFun 10

    println(10 myFun 10)
    println(10.myFun(10))

}