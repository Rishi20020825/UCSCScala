case class Item(name: String, quantity: Int, price: Float)
var inventory1 = Map(
  "123D" -> Item("Apple", 12, 32.50), 
  "124D" -> Item("Orange", 33, 12.50), 
  "125D" -> Item("Banana", 43, 42.50),
  "126D" -> Item("Papaya", 18, 172.50))

var inventory2 = Map(
  "123D" -> Item("Apple", 42, 132.50),
  "124D" -> Item("Orange", 55, 44.50), 
  "125D" -> Item("Banana", 21, 35.50),
  "126D" -> Item("Papaya", 18, 17.50))


@main def main(): Unit = {  
  getProductNames()
  calculateTotalValue()
  mergeInventories()
  findProduct("125D")
}

def getProductNames(): Unit = {
  inventory1.values.foreach(i => println(i.name))
}

def calculateTotalValue(): Unit = {
  val total = inventory1.values.map(item => item.quantity * item.price).sum
  println(s"Total value of inventory2 is: $total")
}

def mergeInventories(): Unit = {
  var merged = (inventory1++inventory2)
  println(merged)
}

def findProduct(pID: String): Unit = {
  var foundItems = inventory1.filter(_._1 == pID)
  
  if (foundItems.isEmpty)
    println("Item not found!")
  else
  {
    for ((key, value) <- foundItems)
      println(s"Item found with productID $key: $value")
  }
}
