object Tuples {
  def main(args: Array[String]): Unit = {
    
    // Creating Tuples
    
    val fooBar: (String, String) = ("foo", "bar")
    
    println(fooBar)
    
    val barFoo: (String, String) = "bar" -> "foo"
    
    println(barFoo)
    
    val oneTwoThree: (Int, Int, Int) = (1, 2, 3)
    
    println(oneTwoThree)
    
    
    // Accessing Tuples
    
    println(fooBar._1, barFoo._2, oneTwoThree._3)

    
    // Return a Tuple
    
    case class Person(name: String, company: String, age: Int)
    
    def nameAndAge(person: Person): (String, Int) = (person.name, person.age)
    
    println(nameAndAge(Person("Jon Doe", "Acme", 42)))
    
  }
  
}
