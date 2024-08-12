object SimpleCaesarCipher {
  
  def encrypting(text: String, shift: Int): String = 
    {
      text.map {char =>
        if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      } 
        else 
        {
            char
        }
    }
  }

  
  def decrypt(ciphertext: String, shift: Int): String = 
    {
    ciphertext.map {char =>
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        ((char - base - shift + 26) % 26 + base).toChar
      } 
      else 
        {
            char
        }
    }
  }

//def cipherFunc(text: String, shift: Int, operation: (String, Int) => String ): String = 
    //{
        //operation(text, shift)
        
    //}
  
  def main(args: Array[String]): Unit = {
    val text = "Rishi The Best!"
    val shift = 3

    
    val encryptText = encrypting(text, shift)
    println(s"Encrypted Text: $encryptText")

    
    val decryptText = decrypt(encryptText, shift)
    println(s"Decrypted Text: $decryptText")

    

    


  }

 

  
}
