object Implicits {

  case class Bar(name: String)

  implicit class RichBar(val self: Bar) extends AnyVal {
    def prefixedName: String = s"Bar name: ${self.name}"
  }
  
  def main(args: Array[String]): Unit = {
    
    // Implicit Parameters

    def upperCaseBarName(implicit bar: Bar): Bar = Bar(bar.name.toUpperCase)
    
    val explicitFooBar = upperCaseBarName(new Bar("explicit"))
    
    implicit val bar = new Bar("implicit")
    
    val implicitFooBar = upperCaseBarName
    
    println(explicitFooBar, implicitFooBar)
    
    
    // Extension Methods
    
    println(bar.prefixedName)
    
    
    // Type Classes
    
    val bars = List(Bar("Beez"), Bar("All Star"), Bar("Cheese"))

    val sortedBarNames = bars.map(_.name).sorted

    println(sortedBarNames)
    
    implicit val BarOrdering: Ordering[Bar] = new scala.math.Ordering[Bar] {
      def compare(x: Bar, y: Bar): Int = x.name.length.compare(y.name.length)
    }
    
    val sortedBarsByNameLength = bars.sorted
    
    println(sortedBarsByNameLength)
    
  }
  
}
