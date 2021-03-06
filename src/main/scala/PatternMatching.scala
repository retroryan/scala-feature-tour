object PatternMatching {
  def main(args: Array[String]): Unit = {
    
    // Match on a Value
    
    val randomBoolean: Boolean = scala.util.Random.nextBoolean()
    
    val randomHeadsOrTails: String = randomBoolean match {
      case true => "heads"
      case false => "tails"
    }
    
    println(s"randomHeadsOrTails = $randomHeadsOrTails")
    
    
    // Match on a Type
    
    abstract class Pet
    class Dog extends Pet
    class Cat extends Pet
    
    val dogOrCat: Pet = if (randomBoolean) new Dog else new Cat

    dogOrCat match {
      case dog: Dog => println("a dog")
      case cat: Cat => println("a cat")
    }
    
    
    // Default Case
    
    dogOrCat match {
      case dog: Dog => println("a dog")
      case _ => println("something else")
    }
    
    
    // Extractors

    case class Person(name: String, age: Int)

    val joe = Person("Jon Doe", 42)
    val bob = Person("Bob Eee", 24)
    
    joe match {
      case Person(name, age) => println(s"$name is $age")
    }
    
    val bobsAge = bob match {
      case Person(_, age) => age
    }
    
    
    // Guards
    
    def overTheHill(person: Person): Boolean = person match {
      case Person(_, age) if age >= 40 => true
      case _ => false
    }
    
    val joeIsOverTheHill = overTheHill(joe)
    
    println(s"joe is over the hill = $joeIsOverTheHill")
    
    
    // Case Class Hierarchies
    
    case class Driver(car: String, person: Person)
    
    val van: Driver = Driver("van", joe)

    van match {
      case Driver(car, Person(name, _)) => println(s"The driver of the $car is $name")
    }
    
    
    // Variable Binding
    
    van match {
      case Driver(car, person @ Person(_, _))  => println(s"The driver of the $car is $person")
    }
    
  }
}
