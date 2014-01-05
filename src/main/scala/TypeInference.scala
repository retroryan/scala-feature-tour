object TypeInference {
  def main(args: Array[String]): Unit = {

    // Methods Require Typed Parameters

    def printAString(s: String): Unit = println(s)

    def hello(s: String): String = s"hello, $s"

    printAString(hello("world"))


    // Method Return Types Can Be Inferred

    def bye(s: String) = s"bye, $s"

    printAString(bye("world"))
    
    
    // Explicit Value Types
    
    val foo: String = "foo"
    
    printAString(foo)
    
    
    // Value Inference
    
    val bar = "bar"
    
    printAString(bar)
    
    val listOfInt = List(1,2,3)

    def printEachInt(l: List[Int]) = l.foreach(println)
    
    printEachInt(listOfInt)
    
  }
  
}
