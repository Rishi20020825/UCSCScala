@main def main(arg: String): Unit = 
{
    try 
    {
        val num = arg.toInt

        num match
        {
            case x if x <= 0 => println("Negative/Zero Number")
            case x if x % 2 == 0 => println("Even Number")
        case _ => println("Odd Number")
         }
        } 
    catch 
    {
        case _ => println("Please provide a valid integer.")
    }
}
