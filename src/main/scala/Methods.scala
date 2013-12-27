object Methods {
  def main(args: Array[String]): Unit = {
    
    // Inner Methods
    
    def inside(foo: String): String = foo.toUpperCase
    
    println(inside("foo"))
    
    
    // Default Values
    
    def defaultFoo(foo: String = "hello"): String = inside(foo)
    
    println(defaultFoo())
    
    
    // Multiple Values
    
    def multiValues(foos: String*): Int = foos.size
    
    println(multiValues("one"))
    
    println(multiValues("one", "two", "three"))
    
    println(multiValues("one"), multiValues("one", "two"))
    
    
    // Parameter Sets
    
    def twoParameterSets(foo: String)(bar: Int): String = s"$bar:$foo"
    
    println(twoParameterSets("hello")(1))
    
    
    // Named Parameters
    
    def namedParams(foo: Option[String] = None, bar: String) = bar + " " + foo.getOrElse("no foo")
    
    println(namedParams(bar = "something"))
    
    
    // Apply
    
    object Foo {
      def apply(): Unit = println("Called Apply")
    }
    
    Foo()
    
  }
  
}
