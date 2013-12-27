object SingletonObjects extends App {
  
  // Defining and Using Singleton Objects
  
  object Foo {
    println("Foo Created")
    
    def sayHello() = println("hello")
  }
  
  Foo.sayHello()


  // Package Objects
  
  import utils._
  
  println(prependHello(world))
  
  
  // Companion Objects
  
  class Person {
    override def toString: String = "Person"
  }
  
  object Person {
    def create(): Person = new Person
  }
  
  println(Person.create())
  
  
  // Case Class Companions
  
  case class Bar(name: String)
  
  val bar1 = Bar.apply("Beez")
  
  val bar2 = Bar("Neez")
  
  println(bar1, bar2)
  
}
