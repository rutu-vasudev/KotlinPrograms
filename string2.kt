fun main(args: Array<String>) {
	var x = "Rutu"
	var y = "Rutu"
	var z = "Ruturaj"
	println(x===y) // true , as both are pointing to the same StringPool
	println(x==z) //false since values are not equal
	println(x===z) //false
}
