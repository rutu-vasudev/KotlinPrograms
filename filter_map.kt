fun main() {
    val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    var resultMap = theMap.filterValues{ it > 2}
    println(resultMap)
    
    resultMap = theMap.filterKeys{ it == "two"}
    println(resultMap)
    
    resultMap = theMap.filter{ it.key == "two" || it.value == 4}
    println(resultMap)
    
}