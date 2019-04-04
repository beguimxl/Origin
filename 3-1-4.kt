/* Bilguun Soninbayar -2016089- April 4th */
	
fun main(args: Array<String>) {
val rows = 5
for (i in rows downTo 1) {

        for (space in 1..rows - i) {
            print("  ")
        }

        for (j in i..2 * i - 3) {
            print("* ")
        }

        for (j in 0..i - 2) {
            print("* ")
        }

        println()
 		}
}    