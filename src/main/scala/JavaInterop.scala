object JavaInterop {
  def main(args: Array[String]): Unit = {
    
    // Java Interop
    
    val url = new java.net.URL("http://scala-lang.org")
    
    val uuid = java.util.UUID.randomUUID().toString
    
    println(url, uuid)
    
    
    // Implementing Java Interfaces
    
    class MyRunnable extends Runnable {
      def run(): Unit = println("i am a runnable")
    }
    
    new Thread(new MyRunnable).start()
    
    
    // Extending Java Classes
    
    class MyThread extends Thread {
      override def run(): Unit = println("i am a thread")
    }
    
    (new MyThread).run()
    
    
    // Collection Converters
    
    val javaList = new java.util.ArrayList[String]()
    javaList.add("hello")
    javaList.add("world")
    
    import scala.collection.JavaConverters._
    
    val scalaList: scala.collection.mutable.Buffer[String] = javaList.asScala.map(_.toUpperCase)
    
    println(s"scalaList = $scalaList")

    val newJavaList: java.util.List[String] = scalaList.asJava
    
    println(s"newJavaList = $newJavaList")
    
  }
}
