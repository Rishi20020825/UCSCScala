@main def main(): Unit={
        var k,i,j = 2
        var m,n = 2
        var f = 12.0f
        var g = 4.0f
        var c = 'X'
        println("Question 1")
        println()


        println(k + 12 * m)
        println(m/j)
        println(n%j)
        println(m/j*j)
        println(f+10*5+g)
        i+=1
        println(i*n)

    //Second question
        println("--------------")
        println("Question 2")
        println()
        var a = 2
        var b = 3
        c = 4
        var d = 5

        var x: Float = k.toInt
        
        b -= 1


        println(b*a+c*d)
        d -= 1
    
        println(a)
        a += 1
        println(-2 * (g-x) + c)
        
        var y = c.toInt
        println(y)
        y += 1
        y += 1
        println(y*a)
        a += 1


        //Question 3
        println("----------")
        println("Question 3")
        

        takeHomeSalary(40,30)
        println("---------")

        //Question 4
        println("Question 4")
        println()
        profit(15)



        






}


def takeHomeSalary (normalHrs : Int , otHrs : Int): Unit = 
{
    val payForNormal = 250
    val payForOt = 85
    val taxes = 12/100

    val earning = (250 * normalHrs) + (85 * otHrs) 
    val salary = earning - (earning*taxes)
    println(s"Take Home Salary is $salary") 

}

def attendee(ticketPrice: Int): Int=
{
    120 + (15-ticketPrice)/5*20
}
def expense (attendee : Int): Int=
{
    500 + 3 * attendee
}
def profit (ticketPrice : Int):Unit = 

{
    val attendees = attendee(ticketPrice)
    val expenses = expense(attendees)
    val profi = (ticketPrice*attendees) - expenses
    println(s"Profit for $ticketPrice is $profi ")
}