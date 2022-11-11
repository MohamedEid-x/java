


               /* fun HowToCreateFunction() {
                    var greeting: String? = null  // nullable string  that means this variable doesn't contain anything

                    fun getgreeting(): String {  // this the first way to create a function that returns value
                        return "hello world"
                    }

                    fun welcome(): String =
                        "welcome in kotlin" // you can declare the function  like that without curly brackets

                    fun sayhello(): Unit {
                        /* you can use function with Unit type if that function doesn't return anything useful
*/
                        println(getgreeting())
                    }

                    fun saywelcom() {
                        /* you can use function with Unit type if that function doesn't return anything useful,
    and you can delete the type (Unit) that explain why the main method doesn't have a type of return
    */
                        println(sayhello())
                    }
                }*/
               /* fun HowToCreateArrayandlist(){
                    var interestingthings= arrayOf("kotlin","java","python") // Array declaration
                    println(interestingthings[0]) // print the item in array with index 0
                    println(interestingthings.get(0))// get the item in array with index 0
                    println(interestingthings.size) // print the array size how many item in array
                    for (iteminarray in interestingthings) // simple for loop to print the items in array
                    {
                        println(iteminarray)
                    }
                    interestingthings.forEach {
                        println(it ) // it keyword means items in this array (string parameter)
                    } // forEach method to control of all items in this array
                    interestingthings.forEach {itemsinarray-> // you can replace the it keyword with any keyword parameter
                        println(itemsinarray)

                    }
                    interestingthings.forEachIndexed{ index, s ->
                        println("$s,$index")
                    }// forEach method to control of all items in this array with it index
                    interestingthings.forEachIndexed{ index, String ->
                        println("$String,$index")

                    }
                }*/
               /*fun Creatinglist(){
                   // list is like the array
                   var interestingthings = listOf("java","kotlin","python")
//                  interestingthings.add() -> this method doesn't work because of the list is immutable by default
                   /* you can all methods that you use in array
                   but the Collection in kotlin is immutable so you cannot add or replace any value from it
                   if you need to change any value from the collection you should use mutable methods instead
                    */
                   var interesting = mutableListOf("java","kotlin","python")
                   interesting.add("C++")

               }*/
              /* fun Creatingmap(){
                   //map take a value with key
                   var coursesprice= mapOf(
                       "java" to 660,
                       "kotlin" to 440,
                       "python" to 100
                   )
                   // and also if you need to add any value or change it you should use mutable collection
                   var coursesprices= mutableMapOf(
                       "java" to 660,
                       "kotlin" to 440,
                       "python" to 100
                   )
                   coursesprices.put("Algorithm",4)
                   // you can also use forEach method to control all thing in the map

               }*/
fun sayhello(greeting:String, itemtogreeting:List<String>){
    itemtogreeting.forEach{iitemtogreet->
        println("$greeting $iitemtogreet")

    }
}

 fun main() {
     var greeting= listOf("java","kotlin","python")
     sayhello("hello ", greeting)

   }