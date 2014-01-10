object Classes {
  def main(args: Array[String]): Unit = {

    // Defining Classes with Constructor Params
    class Food(val calories: Int)

    class Salad(val lettuceCalories: Int, val dressingCalories: Int) extends Food(lettuceCalories + dressingCalories)

    // Overriding Methods with Values
    // Scala implements the uniform access principle - methods and variables can both be accessed the same
    class Menu(items: List[Food]) {
      def numberOfMenuItems() = items.size
    }

    //Dinners only consists of Salads
    class Dinner(items: List[Salad]) extends Menu(items) {
      override val numberOfMenuItems = 2 * items.size
    }

    val s1 = new Salad(5,5)
    val s2 = new Salad(15,15)
    val dinner = new Dinner(List(s1,s2))
    println(s"Number Of Menu Items = ${dinner.numberOfMenuItems}")

  }
}
