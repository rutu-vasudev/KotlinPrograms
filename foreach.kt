fun main() {
   val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    
   theMap.forEach { 
      k, v -> println("Key = $k, Value = $v") 
   }
}