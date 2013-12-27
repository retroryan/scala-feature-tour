object DSLs {
  def main(args: Array[String]): Unit = {

    // Optional Parens
    
    val hello: String = "hello"
    
    val helloDoubleLength: Int = hello.length() + hello.length
    
    println(helloDoubleLength)
    
    
    // Optional Dots
    
    val h: Char = hello.charAt(0)
    
    val e: Char = hello charAt 1
    
    println(h, e)
    
    val maxHE = hello.charAt(0).max(e)
    
    val minHE = hello charAt 0 min e
    
    println(maxHE, minHE)
    
    
    // Symbolic Method Names / Operators
    
    def @!(c: Char): Char = if (c.isLower) c.toUpper else c.toLower
    
    val flipCaseA = @!('a')
    
    println(flipCaseA)
    
    
    class MyString(s: String) {
      def >!<(other: String): String = s.take(s.length / 2) + other.drop(other.length / 2)
    }

    val myHello = new MyString("hello")
    
    val help: String = myHello >!< "kelp"
    
    println(help)
    
    
    // Right Associative Methods
    
    class FunString(s: String) {
      def ~~:(c: Char): String = s.map(_.toString + c.toString).mkString
    }
    
    val funHello = new FunString("hello")
    
    val normalWithDot = funHello.~~:('a')
    
    val reversedWithout = 'e' ~~: funHello
    
    println(normalWithDot, reversedWithout)
    
  }
  
}
