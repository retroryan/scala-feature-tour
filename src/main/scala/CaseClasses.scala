object CaseClasses {
  def main(args: Array[String]): Unit = {
    
    // Case Classes
    
    // immutable accessors
    
    // create & apply

    // copy
    
    // pattern matching

    // equals
    
    // hashCode
    
    // toString
    
  }
  
  case class Person(name: String, age: Int)
  
  case class Household(father: Option[Person], mother: Option[Person], children: List[Person])
  
}
