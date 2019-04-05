/* Bilguun Soninbayar -2016089- April 4th */

fun main(args:Array<String>) {
	val superheroes = arrayListOf("Superman", "Spider man", "Wonder woman", "Thor", "Black Panther", "Batman", "Cat", "Invisible Woman", "Iron man", "Hulk", "Aquaman")
	val powers = arrayListOf("100","85","90","95","80","92","75","92","97","85","75")
    val genders = arrayListOf("M","M","F","M","M","M","F","F","M","M","M")
	/** println("List of all Superheroes:")
    
	for(i in superheroes){
        println(i)
    	} */
    
	val mapHero = HashMap<String,List<String>>()
    var choose: String
	val size: Int

	size = superheroes.size-1
	for(i in 0..size) mapHero.put(superheroes[i], listOf( powers[i], genders[i]))

	choose = "Aquaman"
	println("Name [Power, Gender]")
	println("$choose ${mapHero[choose]}")

	choose = "100"
	for(key in mapHero.keys){
		val power = (mapHero[key] as List)[0]
		if(power == choose) println("\nThe Superhero with the power of $choose is $key.")
	}
 }