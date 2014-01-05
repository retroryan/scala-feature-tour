object CaseClasses {
  def main(args: Array[String]): Unit = {
    
    // Case Classes

    case class Person(name: String, age: Int)

    case class Household(father: Option[Person], mother: Option[Person], children: List[Person])
    

    // create & apply
    
    val johnDoe = new Person("John Doe", 42)
    
    val bobDoe = Person.apply("Bob Doe", 13)
    
    val doeFamily = Household(Some(johnDoe), None, List(bobDoe))

    
    // toString

    println(doeFamily)
    

    // copy
    
    val newChildren = doeFamily.children :+ Person("Sally Doe", 0)
    
    val newDoeFamily = doeFamily.copy(children = newChildren)
    
    println(newDoeFamily)
    
    
    // pattern matching
    
    newDoeFamily match {
      case Household(father, mother, children) => println(s"mother = $mother")
    }

    
    // equals
    
    println(johnDoe == Person("John Doe", 42))
    
    
    // hashCode
    
    println(johnDoe.hashCode() == 1438696157)
    
  }
  
}
