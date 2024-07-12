@main def main(): Unit=
{
    val result1 = toUpper("rishi")
    println(s"Original string is rishi after making to upper case $result1")

    val result2 = toLower("RISHI")
    println(s"Original string is RISHI after making to lower case $result2")
    
   

}



def toUpper(word: String): String = 
{
    word.map {
      case c if c >= 'a' && c <= 'z' => (c - 32).toChar
      case c => c
    }
}
  

def toLower(word : String): String =
{
    word.map {
      case c if c >= 'A' && c <= 'Z' => (c + 32).toChar
      case c => c
    }
}

