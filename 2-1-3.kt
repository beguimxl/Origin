/* Bilguun Soninbayar -2016089- April 2nd */
	
	fun main(args: Array<String>) {
    	var x = 5
	var y = 2
	var z = 3
        
    println("Finding Bigger Number")
    
	fun comparison(){
        
	if(x > y && x > z){
		println("x=$x is more than y=$y and z=$z")
    	}
    if(y > x && y > z){
		println("y=$y is more than x=$x and z=$z")
    	}
    if(z > x && z > y){
        println("z=$z is more than x=$x and y=$y")  
    	}
    }
    
    comparison()
    x = 1
    y = 10
    z = 2
    comparison()
    x = 20
    y = 150 
    z = 50
    comparison()    
    x = 50  
    y = 1
    z = 100 
    comparison()
    x = 200
    y = 20
    z = 15
    comparison()
}