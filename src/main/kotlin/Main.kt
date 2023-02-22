// Function that takes in 4 strings and prints their array


//Main function
fun main() {
   StringArray("Joyce","Faith","Ann","Susan")
    Cities()
    op()
    println(GetNames("Nancy","Landy","Arsy"))
}

//function that takes in four strings and create an array out of them

fun StringArray(s1:String,s2:String,s3:String,s4:String){
    var ArrStr= arrayOf(s1,s2,s3,s4)
    println(ArrStr.contentToString())
}

//Function that prints out the cities and grammatically case them
fun Cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for (city in cities){
        println(city.capitalize())
    }

}

//function that adds two numbers in array, gives index of a number and arrange numbers in ascending order
fun op() {
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println("the sum of the second and the fifth number is:$sum")

    println("the index of 158 is:"+numbers.indexOf(158))

    var AscNumbers = numbers.sortedArray()
    println("the ascending order of the array is:"+AscNumbers.contentToString())
}
// function that takes three names and return a string array
fun GetNames(n1:String,n2:String,n3:String):String{
    var Names = arrayOf(n1,n2,n3)
    return Names.contentToString()
}