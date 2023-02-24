fun main() {
   val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)

   if(theMap.containsKey("two")){
      println(true)
   }else{
      println(false)
   }
   
   if(theMap.containsValue("two")){
      println(true)
   }else{
      println(false)
   } 
}