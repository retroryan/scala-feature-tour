object HigherOrderFunctions {
  def main(args: Array[String]): Unit = {
    
    // Creating Functions
    
    def stringLength(s: String): Int = s.length
    
    println(stringLength("hello"))
    
    
    // Higher Order Functions
    
    def stringTransformer(s: String, f: String => Int): Int = f(s)
    
    println(stringTransformer("a string", stringLength))
    
    
    // Transformation with the Map Higher Order Function
    
    val oneTwoThree: List[String] = List("one", "two", "three")
    
    val oneTwoThreeLengths: List[Int] = oneTwoThree.map(stringLength)
    
    println(oneTwoThreeLengths)
    
    
    // Anonymous Functions
    
    val helloLength: Int = stringTransformer("hello", s => s.length)
    
    println(helloLength)
    
    val hiLength: Int = stringTransformer("hi", _.length)
    
    println(hiLength)
    
    val oneTwoThreeLengthsShorthand = oneTwoThree.map(_.length)
    
    println(oneTwoThreeLengthsShorthand)
    
    
    // Multi-line Anonymous Functions
    
    oneTwoThree.foreach { s =>
      println(s)
    }
    
  }
}
