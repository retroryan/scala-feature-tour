object TypeInference {
  def main(args: Array[String]): Unit = {
    
    // Explicit Types
    
    val foo: String = "foo"
    
    println(foo.isInstanceOf[String])
    
    
    // Value Inference
    
    val bar = "bar"
    
    println(bar.isInstanceOf[String])
    
    val listOfInt = List(1,2,3)
    
    println(listOfInt.isInstanceOf[List[Int]])
    
    
    // Methods Require Typed Parameters
    
    def hello(s: String): String = s"hello, $s"

    println(hello("world").isInstanceOf[String])
    
    
    // Method Return Types Can Be Inferred
    
    def bye(s: String) = s"bye, $s"
    
    val byeWorld = bye("world")
    
    println(byeWorld.isInstanceOf[String])
    
  }
  
}
