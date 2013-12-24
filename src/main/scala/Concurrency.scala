object Concurrency {
  def main(args: Array[String]): Unit = {
    
    // Futures
    import scala.concurrent.{Future, Await}
    import scala.concurrent.duration.Duration
    import scala.concurrent.ExecutionContext.global
    
    val f: Future[String] = Future("hello, future")(global)
    
    f.onSuccess {
      case msg => println(msg)
    } (global)
    
    println(Await.result(f, Duration.Inf).toUpperCase) // block until the future completes
    
    
    // Promises
    import scala.concurrent.Promise

    val p: Promise[String] = Promise[String]()

    p.future.foreach(println)(global)
    
    p.success("promise fulfilled")
    
    println(Await.result(p.future, Duration.Inf).toUpperCase)
    
    
    // Failure Handling
    val promiseFailure = Promise[String]()
    
    val futureWithRecovery = promiseFailure.future.recover {
      case e: RuntimeException => "error"
    } (global)
    
    futureWithRecovery.foreach(println)(global)
    
    promiseFailure.failure(new RuntimeException())
    
    println(Await.result(futureWithRecovery, Duration.Inf).toUpperCase)
    
    
    // Composition
    
    // Import the implicit global execution context under a different identifier since the
    // non-implicit one was already imported under the global identifier
    import scala.concurrent.ExecutionContext.Implicits.{global => ImplicitGlobalExecutionContext}
    
    val futureOne = Future.successful(1)
    val futureTwo = Future.successful(2)
    
    val futureOneAndTwo = Future.sequence(Seq(futureOne, futureTwo))
    
    println(Await.result(futureOneAndTwo, Duration.Inf))
    
    val futureThree = for {
      one <- futureOne
      two <- futureTwo
    } yield one + two
    
    println(Await.result(futureThree, Duration.Inf))
    
    
    // Non-Blocking IO
    import dispatch._
    
    val futureResponse = Http(url("http://www.scala-lang.org") OK as.String)
    
    println(Await.result(futureResponse, Duration.Inf).length)
    
  }
}
