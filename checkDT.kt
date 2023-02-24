fun main(args: Array<String>) {
    var n: Any = 2
    when(n){
        is Int -> println("Integer")
        is String -> println("String")
        is Double -> println("Double")
    }
}