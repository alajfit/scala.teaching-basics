/**
 * @name  01 Introduction
 * @desc  This is our introduction file
 *        Further info can be found in the comments
 **/ 

// In scala unlike Java class names do not need to match the file names
object Test {

  // In Scala def allows us to define a method
  // There are arguments passed to methods and like a Java Main we are passing a String Array
  // This string array can be used for things such as config or runtime variables
  def main(args: Array[String]) {

    // ********* SIMPLE OUTPUT *********

    // println allows us to print statements to the console
    // Also Scala does not require semicolons just line breaks
    println("\n\nTop of the Introduction!\n")

    // Important note Predef.scala is the equivilent of java.lang package
    // All are available to all scala files without an import

    // ********* VARIABLES *********

    // Val in Scala is an immutable variable
    // final can also be used in a parent class to prevent value overrides
    val PI = 3.14
    // Var in Scala is a mutable variable with a static type
    var age = 29
    age = age + 1
    // Adding s to the start of a string allows for variable interpolation in Scala
    println(s"A rounded pie is $PI, and your real age is ${age + 1}")
    // You can also prepend a string with f to format a string and raw to prevent escaping of literals

    // ********* DATA TYPES *********

    // Scala has the same data types as Java and the same memory usage and precision
    // All data types in Scala are objects and methods can be called on them
    val sixty = 60
    // Here we get the character value of the number 60
    println(sixty.toChar)

    val sentence = "Hello Universe"
    // Here we are getting the character at a number
    println(sentence.charAt(2))

    // IMPORTANT: Scala does deduction of types at compile time, this is known as the Type Interface
    // Variables are inferred to their best type deemed fit
    // Example of inference at compile time
    val y = 10
    // A new value is inferered as an integer and this is a legitamite statement
    println(y+10)
    // Another important note is that Scale variables must be declared
    // This is part of the Scala lang and prevents null pointer examples
    // The only place variables don't need assigned values is in an Abstract Class

    println("\n\n")
  }
}