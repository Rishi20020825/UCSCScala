@main def main(): Unit = 
{
  val products = getProductList(Array())
  printProductList(products)
  getTotalProducts(products)
  
  
}

def getProductList(products: Array[String]): Array[String] = 
{
  println("Enter a Product > ")
  val product = scala.io.StdIn.readLine()
  
  if (product == "done") 
    {
        products
    } 
    else 
    {
        getProductList(products :+ product)
    }
}


def printProductList(products : Array[String]): Unit =
    {
        for (i <- products.indices) 
        {
            println(s"${i + 1}  ${products(i)}")
        }
    
    }
    
        
    
def getTotalProducts (products : Array[String]): Unit=
    {
        val total = products.length
        println(s"Total products are $total")
    }