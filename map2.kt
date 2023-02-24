fun main() {
   val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

   println("The value for key two " + theMap.get("two"))
   println("The value for key two " + theMap["two"])
}