fun main(args: Array<String>) {
  
    var cm = 50
    var cm1 = 180
    var cm2 = 1500
    var cm3 = 15000
    var m: Int
    
    println("Conversion of cm to m:")

    m = cm  / 100
    cm = cm % 100
    println("$m m $cm cm")

    m = cm1  / 100
    cm1 = cm1 % 100
    println("$m m $cm1 cm")

	m = cm2  / 100
    cm2 = cm2 % 100
    println("$m m $cm2 cm")

    m = cm3  / 100
    cm3 = cm3 % 100
    println("$m m $cm3 cm")
}
