@main def main (): Unit =
{
    //Question 1
    var name = scala.io.StdIn.readLine()
    name = reversing(name)

    println(s"After Reversing $name")

    //Question 2

    println()
    println("Question 2")

    val strings  = scala.io.StdIn.readLine()
    val stringList= strings.split(" ").toList //toList is converting the array to a list

    val list = lengthChecker(stringList)

    println()
    println("Here are the string that have length > 5")

    list.foreach(println)

    println()
    //Question 3
    println("Question 3")
    val num = mean(223,48)
    println(f"$num%.2f")

    println()
    //Question 4
    println("Question 4")

    var numbers = scala.io.StdIn.readLine()
    var numList = numbers.split(" ").toList
    val result = sumList(numList)
    println(s"Sum is $result")

    
}

def reversing(name : String):String = 
{
    

    if (name.isEmpty) ""

    else reversing(name.tail) + name.head

}

def lengthChecker(string : List[String]):List[String] =  
{
    string.filter(string => string.length > 5)   // string.filter(_.length > 5) 
}

def mean(x : Int , y : Int): Float= 
{
    val sum = x + y
    val meann = sum.toFloat / 2
    return meann
}

def sumList(numbers : List[String]):Int =
{
    

    if (numbers.isEmpty) 0

    else numbers.head.toInt + sumList(numbers.tail)
}