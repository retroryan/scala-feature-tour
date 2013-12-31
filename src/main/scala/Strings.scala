object Strings {
  def main(args: Array[String]): Unit = {
    
    // Multi-line
    
    val multiLine = """This is a multi-line string.
Line 2."""
    
    println(s"multiLine = $multiLine")
    
    
    val prettyMultiLine =
      """This is a multi-line string.
        |Line 2.
        |Pretty code!""".stripMargin
    
    println(s"prettyMultiLine = $prettyMultiLine")
    
    
    // Interpolation
    
    val aString = "foo"
    val anInt = 1
    
    val interpolatedString = s"string = $aString and anInt = $anInt"
    
    println(interpolatedString)
    
    val formatted = f"uppercase string = $aString%S and hex anInt = $anInt%#x"
    
    println(formatted)
    
  }
}
