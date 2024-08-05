object Practical7 {
  def main(args: Array[String]): Unit = {
    println("Question 1")

    val numbers = List(1, 3, 21, 78, 109, 88, 27, 65, 44, 2, 42, 33)
    val output = filterEvenNumbers(numbers)
    println(output)
    println("_____________")
    println("Question 2")
    val output2 = calculateSquare(numbers)
    println(output2)
    println("_____________")
    println("Question 3")

    val output3 = filterPrime(numbers)
    println(output3)

    
  }

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(x => x % 2 == 0)
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(y => y * y)
  }
  val isPrime: Int => Boolean = n => 
  {
  if (n <= 1) false
  else if (n == 2) true
  else if (n % 2 == 0) false
  else (2 to math.sqrt(n).toInt).filter(n % _ == 0).isEmpty
  }

  def filterPrime(numbers: List[Int]): List[Int] = 
    {
    numbers.filter(x => isPrime(x))
    }
}
