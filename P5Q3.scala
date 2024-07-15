@main def main(): Unit = 
{
  fibonacciSeq(12)
}

def fibonacciSeq(n: Int): Unit = 
{
  for (i <- 0 until n) 
  {
    println(fibonacci(i))
  }
}

def fibonacci(n: Int): Int = n match 
{
  case 0 => 0
  case 1 => 1
  case _ => fibonacci(n - 1) + fibonacci(n - 2)
}
