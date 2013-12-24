import java.util

object Collections {
  def main(args: Array[String]): Unit = {
    
    // Immutable
    println("\n--- Immutable ---")
    
    val immutableList = scala.collection.immutable.List(1,2)
    
    val newList = immutableList :+ 3
    
    println(s"newList = $newList")
    
    
    // Mutable
    println("\n--- Mutable ---")
    
    val mutableArrayBuffer = scala.collection.mutable.ArrayBuffer(1,2,2)

    mutableArrayBuffer.update(2,3)
    
    println(s"mutableArrayBuffer = $mutableArrayBuffer")

    
    // Concurrent
    println("\n--- Concurrent ---")
    
    newList.par.foreach(println)
    
    
    // Universal API
    println("\n--- Universal API ---")
    
    val parMap = scala.collection.parallel.ParSeq(1,2,3)
    
    val heads = List(newList.head, mutableArrayBuffer.head, parMap.head)
    
    println(s"heads = $heads")
    
    
    // Transformation
    println("\n--- Transformation ---")
    
    val addOneToEach = newList.map(_ + 1)
    
    println(s"addOneToEach = $addOneToEach")
    
    
    // Sorting
    println("\n--- Sorting ---")
    
    val lowestToHighest = List(3,1,2).sorted
    
    println(s"lowestToHighest = $lowestToHighest")
    
    
    // Filtering
    println("\n--- Filtering ---")

    val lessThanThree = List(1,2,3,4,5).filter(_ < 3)
    
    println(s"lessThanThree = $lessThanThree")
    
    
    // Partitioning
    println("\n--- Partitioning ---")

    val groupByOddAndEven = List(1,2,3,4,5).groupBy(_ % 2 == 0)
    
    println(s"groupByOddAndEven = $groupByOddAndEven")
    
    
    // Folding
    println("\n--- Folding ---")

    val manualSum = List(1,2,3,4,5).foldLeft(0)((sum, i) => sum + i)
    
    println(s"manualSum = $manualSum")


    // Prepend & Append
    println("\n--- Prepend & Append ---")
    
    val oneTwo = List(1,2)
    val oneTwoThree = oneTwo :+ 3
    val zeroOneTwo = 0 +: oneTwo
    
    println(s"oneTwoThree = $oneTwoThree")
    println(s"zeroOneTwo = $zeroOneTwo")


    // Chaining Higher Order Functions
    println("\n--- Chaining Higher Order Functions ---")
    
    val lessThanFourPlusOneReversed = List(1,2,3,4,5).filter(_ < 4).map(_ + 1).reverse
    
    println(s"lessThanFourPlusOneReversed = $lessThanFourPlusOneReversed")
    
    
    // Java Interop
    println("\n--- Java Interop ---")
    
    val javaList = new java.util.ArrayList[String]()
    javaList.add("hello")
    javaList.add("world")
    
    import scala.collection.JavaConverters._
    
    val scalaList = javaList.asScala.map(_.toUpperCase)
    
    println(s"scalaList = $scalaList")
    
  }
  
}
