object Implicits {

  case class Bar(name: String)

  implicit class RichBar(val self: Bar) extends AnyVal {
    def prefixedName: String = s"Bar name: ${self.name}"
  }
  
  def main(args: Array[String]): Unit = {
    
    // Implicit Parameters

    def upperCaseBarName(implicit bar: Bar): Bar = bar.copy(bar.name.toUpperCase)
    
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
    
    trait BarOrdering extends scala.math.Ordering[Bar] {
      def compare(x: Bar, y: Bar): Int = x.name.compare(y.name)
    }

    implicit object BarOrdering extends BarOrdering
    
    val sortedBars = bars.sorted
    
    println(sortedBars)
    
  }
  
}
