fun main() {
    val theMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    theMap.remove( "two")
    println(theMap)
    
    theMap -= listOf("three")
    println(theMap)
}