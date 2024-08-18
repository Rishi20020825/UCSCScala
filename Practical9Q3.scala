object StringFormatter {
  
  val toUpper: String => String = str => str.map {
    case x if x >= 'a' && x <= 'z' => (x - 32).toChar  
    case x => x
  }

  
  val toLower: String => String = str => str.map {
    case y if y >= 'A' && y <= 'Z' => (y + 32).toChar 
    case y => y
  }

  def main(args: Array[String]): Unit = {
    
    val testString = "UCSC is The besT"

    println(s"Original String is: $testString")
    println(s"Converted to Uppercase: ${toUpper(testString)}")
    println(s"Converted to Lowercase: ${toLower(testString)}")
  }
}
