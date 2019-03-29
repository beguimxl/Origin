fun main(args: Array<String>) {
  



open class Grade(var total: Int, var ave: Int,vararg grade:Int) {
    fun total(){
        var sum = 0
        for(i in grade){
            sum+=i
        }
        return sum
    }
    open fun ave(){
        println("average is:" + (total.classes/3))
    }
}
 
    
class Classes(var CS:String, var EE:String):Grade(){
    fun classes(){
        
    }
}
class CS(val java:Int=100, var python:Int=50, var web:Int=75, var max:Int){
	fun max(){
        if(java>python) && (java>web){
            println("Max is:Java"+java)
        }
        if(python>java) && (python>web){
            println("Max is Python"+python)
        }
        else(){
            
        }
        }
    }
    
}

}







 
 