object Main {
  def main(args: Array[String]): Unit = {

    println("Rational Number with neg and sub methods")
    class Rational(x: Int, y: Int) {
      require(y != 0, "Denominator cannot be zero")
      
      private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
      private val g = gcd(x.abs, y.abs)
  
      val numer: Int = x / g
      val denom: Int = y / g
  
      def neg: Rational = new Rational(-numer, denom)

      def sub(that: Rational): Rational = 
        new Rational(numer * that.denom - that.numer * denom, denom * that.denom)
  
      override def toString: String = s"$numer/$denom"
    }
    
    
    val r = new Rational(3, 4)
    println(s"Negative of $r: ${r.neg}")
    
    println("Subtract two rational numbers")
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    val result = x.sub(y).sub(z)
    println(s"Result of $x - $y - $z: $result") 

    println( "Account with transfer method")
    class Account(var balance: Double) {
      def deposit(amount: Double): Unit = balance += amount
      def withdraw(amount: Double): Unit = 
        if (amount <= balance) balance -= amount else println("Insufficient funds")
  
      def transfer(amount: Double, that: Account): Unit = {
        if (amount <= balance) {
          this.withdraw(amount)
          that.deposit(amount)
        } else {
          println("Insufficient funds")
        }
      }

      def applyInterest(): Unit = {
        if (balance > 0) balance += balance * 0.05
        else balance += balance * 0.1
      }
  
      override def toString: String = s"Balance: $$${balance}"
    }
    
    
    val acc1 = new Account(1000)
    val acc2 = new Account(500)
    acc1.transfer(200, acc2)
    println(s"Account 1: $acc1") 
    println(s"Account 2: $acc2") 

    println("Bank system functions")
    object Bank {
      def negativeBalances(accounts: List[Account]): List[Account] = 
        accounts.filter(_.balance < 0)
      
      def totalBalance(accounts: List[Account]): Double = 
        accounts.map(_.balance).sum
      
      def applyInterestToAll(accounts: List[Account]): Unit = 
        accounts.foreach(_.applyInterest())
    }

    
    val accounts = List(new Account(100), new Account(-50), new Account(200))
    println(s"Accounts with negative balances: ${Bank.negativeBalances(accounts)}")
    println(s"Total balance: ${Bank.totalBalance(accounts)}")
    
    Bank.applyInterestToAll(accounts)
    println("Accounts after applying interest:")
    accounts.foreach(println)

    println(" Question 5")
    def countLetterOccurrences(words: List[String]): Int = {
      words.map(_.length).reduce(_ + _)
    }

    
    val words = List("apple", "banana", "cherry", "date")
    val count = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $count")
  }
}
