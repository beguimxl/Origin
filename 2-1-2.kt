/* Bilguun Soninbayar -2016089- April 2nd */
	
	fun main(args: Array<String>) {
    var x = 5
	var y = 3
        
    println("Finding Bigger Number")
    
	fun comparison(){
        
	if(x > y){
		println("x=$x is more than y=$y")
    	}
    if(x < y){
		println("y=$y is more than x=$x")
    	}
    }
    
    comparison()
    x = 1
    y = 2
    comparison()
    x = 100
    y = 50    
    comparison()    
    x = 50
    y = 100
    comparison()
    x = 20
    y = 15
    comparison()
}
