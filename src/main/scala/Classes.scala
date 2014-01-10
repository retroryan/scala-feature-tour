object Classes {
  def main(args: Array[String]): Unit = {

    // Defining Classes with Constructor Params
    class Food(val calories:Int)

    class Salad(val lettuceCalories:Int, val dressingCalories:Int) extends Food(lettuceCalories+dressingCalories)

    // Overriding Methods with Values
    class Menu(items:List[Food]) {
      def numberOfMenuItems() = items.size
    }

    //Dinners only consist of Salads
    class Dinner(items:List[Salad]) extends Menu(items){
      override val numberOfMenuItems = 2 * items.size
    }

  }
}
