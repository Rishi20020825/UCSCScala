@main def main(): Unit = {
  val newStudent: (String, Int, Int, Double, Char) = getStudentInfo()
  printStudentRecord(newStudent)
}

def getStudentInfo(): (String, Int, Int, Double, Char) = {

  println("Enter student's name, marks, and total  marks:")
  val student = (
    scala.io.StdIn.readLine,
    scala.io.StdIn.readInt,
    scala.io.StdIn.readInt
    )

  //validate
  val (isValid, errorMessage) = validateInput(student._1, student._2, student._3)
  if (!isValid) 
  {
    println(errorMessage)
    getStudentInfoWithRetry()
  }
  else
  {
    val percentage = student._2.toDouble/student._3*100
    val grade = getGrade(percentage)
    
    println(s"percentage: $percentage, grade: $grade")
    val newStudent: (String, Int, Int, Double, Char) = (student._1, student._2, student._3, percentage, grade)
    return newStudent
  }
}

def getGrade(marks: Double): Char = marks match {
  case a if marks >= 90 => 'A'
  case b if marks >= 75 => 'B'
  case c if marks >= 50 => 'C'
  case _ => 'D'
}

def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, String) = {
  if (name == "" || marks < 0 || marks > totalMarks)
    return (false, "Invalid input")
  else
    return (true, "Input is valid")
}

def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) =
{
  getStudentInfo()
}

def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
  println(s"Name: ${student._1}")
  println(s"Marks: ${student._2}")
  println(s"Total possible marks: ${student._3}")
  println(s"Percentage: ${student._4}%")
  println(s"Grade: ${student._5}")
}
