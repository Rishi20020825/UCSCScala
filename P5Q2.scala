
case class Book(title: String, author: String, isbn: String)


object Library 
{
 
  var books: Set[Book] = Set(
    Book("2022 Last", "Craig Simpson", "20022002"),
    Book("Harry Wilder", "Wilder HArp", "20022005"),
    Book("The Tot", "G.Sakri", "20022004")
  )

  
  def addBook(book: Book): Unit = 
  {
    books += book
    println(s"Book added: ${book.title}")
  }

 
  def removeBook(isbn: String): Unit = 
  {
    books = books.filterNot(_.isbn == isbn)
    println(s"Book with ISBN $isbn removed.")
  }


  def bookExists(isbn: String): Boolean = 
  {
    books.exists(_.isbn == isbn)
  }

 
  def displayCollection(): Unit = 
  {
    println("Current library collection:")
    books.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
  }

  

  def displayBooksByAuthor(author: String): Unit = 
  {
    val authorBooks = books.filter(_.author.equalsIgnoreCase(author))
    if (authorBooks.nonEmpty) {
      println(s"Books by $author:")
      authorBooks.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    } else {
      println(s"No books found by $author.")
    }
  }
}


@main def main(): Unit = {
  Library.displayCollection()
  Library.addBook(Book("Last Day", "Adolf Hitler", "20012001"))
  Library.removeBook("20022005")
  println(s"Book exists with ISBN 20012001: ${Library.bookExists("20012001")}")
  
  Library.displayBooksByAuthor("G.Sakri")
  Library.displayCollection()
}
