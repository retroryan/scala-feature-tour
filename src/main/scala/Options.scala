object Options {
  def main(args: Array[String]): Unit = {
    
    // Options with Pattern Matching
    
    val maybeName: Option[String] = if (scala.util.Random.nextBoolean()) Some("Martin") else None
    
    println(s"name defined = ${maybeName.isDefined}")
    
    maybeName match {
      case Some(name) => println(name)
      case None => println("Nobody")
    }
    
    
    // Default Values
    
    val nameWithDefault: String = maybeName.getOrElse("Somebody")
    
    println(nameWithDefault)
    
    
    // Type-safe Alternative to Null
    
    val people: Map[String, String] = Map("jon" -> "Jon Doe", "bob" -> "Bob Eee")
    
    println(people.get("jon"))
    
    println(people.get("sam"))
    
  }
  
}
