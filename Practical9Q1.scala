object InterestCal {
  
  val interestRate: Double => Double = deposit => deposit match {
    case d if d <= 20000 => 0.02
    case d if d <= 200000 => 0.04
    case d if d <= 2000000 => 0.035
    case _ => 0.065
  }

  
  val calInterest: Double => Double = deposit => {
    val rate = interestRate(deposit)
    deposit * rate
  }

  def main(args: Array[String]): Unit = {
    val deposits = List(15000.0, 60000.0, 600000.0, 2700000.0)
    
    deposits.foreach { deposit =>
      println(s"Deposit: Rs. $deposit, Interest: Rs. ${calInterest(deposit)}")
    }
  }
}
