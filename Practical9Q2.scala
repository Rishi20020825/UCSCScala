object inputtype {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer")
      return
    }

    val input = try {
      args(0).toInt
    } catch {
      case _: NumberFormatException =>
        println("The input must be a valid integer.")
        return
    }

    val Negative: Int => Boolean = _ <= 0
    val Even: Int => Boolean = _ % 2 == 0
    val Odd: Int => Boolean = _ % 2 != 0

    val result = input match {
      case x if Negative(x) => "Negative Number"
      case x if Even(x) => "Even Number"
      case x if Odd(x) => "Odd Number"
    }

    println(result)
  }
}
