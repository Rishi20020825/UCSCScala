@main def main() = 
{
    val items: List[String] = List("apples", "oranges", "pears","Milk")
    var quant: List[Int] = List(10,32,5,12)
    println(s"${displayInventory(items,quant)}");
    quant = restockItem("Milk",items,2,quant);
    println(s"${displayInventory(items,quant)}");
    quant = sellItem("Milk",items,2,quant);
    println(s"${displayInventory(items,quant)}");
}

def displayInventory(items: List[String],quant: List[Int]):String = {
  
    if (items.isEmpty)
    {
        "Stock is :\n"
    }else 
    {
        displayInventory(items.tail,quant.tail) + items.head + ": " + quant.head + "\n"
    }
}

def restockItem(item: String, items: List[String], add: Int, quant: List[Int]):List[Int] =
{
    var index = items.indexOf(item);
    if(index == -1)
    {
        println("There is no such item in the storage\n")
        quant
    }else
    {
        var newQuant = quant.updated(index,quant(index) + add)
        println(s"updated stock ; ${items(index)} : ${newQuant(index)}\n")
        newQuant
    }
}

def sellItem(item: String, items: List[String], sell: Int, quant: List[Int]):List[Int] =
{
    var index = items.indexOf(item);
    if(index == -1)
    {
        println("There is no such item in the storage\n")
        quant
    }
    else if(quant(index) < sell)
    {
        println("Not enough stock in the storage\n")
        quant
    }else
    {
        var newQuant = quant.updated(index,quant(index) - sell)
        println(s"updated stock ; ${items(index)} : ${newQuant(index)}\n")
        newQuant
    }
}
