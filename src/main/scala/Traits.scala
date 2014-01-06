object Traits {
  def main(args: Array[String]): Unit = {
    
    // Defining Traits
    
    trait IFoo {
      def sayHello: String
    }
    
    trait Foo extends IFoo {
      def sayHello: String = "hello"
    }
    
    
    // Implementations
    
    class MyFoo extends Foo
    
    val foo: Foo = new MyFoo
    
    println(foo.sayHello)
    
    
    // Overriding Methods
    
    class AnotherFoo extends Foo {
      override def sayHello = "hi"
    }
    
    println((new AnotherFoo).sayHello)
    
    
    // Multi-Inheritance
    
    trait Bar {
      def sayBye = "bye"
    }
    
    class FooBar extends Foo with Bar
    
    val fooBar = new FooBar
    
    println(fooBar.sayHello, fooBar.sayBye)
    
  }
}
