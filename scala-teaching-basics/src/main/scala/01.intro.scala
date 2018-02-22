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

    // *********************************
    // ********* SIMPLE OUTPUT *********
    // *********************************

    // println allows us to print statements to the console
    // Also Scala does not require semicolons just line breaks
    println("\n\nTop of the Introduction!\n")

    // Important note Predef.scala is the equivilent of java.lang package
    // All are available to all scala files without an import

    // *****************************
    // ********* VARIABLES *********
    // *****************************

    // Val in Scala is an immutable variable
    // final can also be used in a parent class to prevent value overrides
    val PI = 3.14
    // Var in Scala is a mutable variable with a static type
    var age = 29
    age = age + 1
    // Adding s to the start of a string allows for variable interpolation in Scala
    println(s"A rounded pie is $PI, and your real age is ${age + 1}")
    // You can also prepend a string with f to format a string and raw to prevent escaping of literals


    // ******************************
    // ********* DATA TYPES *********
    // ******************************

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


    // ************************************
    // ********* TYPE ANNOTATIONS *********
    // ************************************

    // In scala we can explicity define types
    val z : Integer = 20
    println(s"Explicit types $z")

    // Type annotations after the declaration
    val k = 50.01 : Double
    println(s"Types can be annotated after the declartion and is sometimes preferred $k")

    // Type annotations are not necessary in all JVM languages
    // But they are very important in apps like APIs to stop client confusion
    def getDataFromBackend() = List {
      val dataList = List(1, "Literature", 2, "Science")
      dataList
    }
    // In this exmaple we can see type annotations in function definitions and variables
    println(getDataFromBackend())


    // ************************************
    // ********* TYPE ASCRIPTIONS *********
    // ************************************

    // Type ascriptions tell the compiler what type we expect from an operation
    // There is no difference in syntax between type annotations and type ascriptions
    // Generally type ascriptions are used for up-casting
    val r = "Alan"

    val g = r : Object
    println(g)


    // ****************************
    // ********* LAZY VAL *********
    // ****************************

    val random = scala.util.Random

    // lazy val is only evaluated when it is used
    // This can be handy for things such as file uploads
    lazy val randomNum = random.nextInt(100)
    println(s"A random number $randomNum")
    // lazy can only be applied to a val


    // ****************************
    // ********* ARRAY ************
    // ****************************

    // Think of an array in scala fixed-size sequential collection of elements of the same type
    val za: Array[String] = new Array[String](3)
    za(0) = "Alan"
    za(1) = "Jack"
    za(2) = "Fitzpatrick"
    println(s"Full name ${za(0)} ${za(1)} ${za(2)}")

    val zy = Array("Alan", "John", "Fitzpatrick")
    println(s"Real Full Name: ${zy(0)} ${zy(1)} ${zy(2)}")

    val xz = Array(0.2, 0.8, 1.5)
    var total = 0.0

    for( x <- xz) {
      total += x
      println(x)
    }
    println(total)

    println("Printing a defined number run")
    for( i <- 1 to (xz.length - 1)) {
      println(xz(i))
    }


    // **********************************************
    // ********* MULTI DIMENSIONAL ARRAY ************
    // **********************************************

    import Array._

    var aMatrix = ofDim[Int](3, 3)

    // Build a matrix
    for (y <- 0 to 2) {
      for (x <- 0 to 2) {
        aMatrix(y)(x) = y + x
      }
    }

    // Print a Matrix
    for (y <- 0 to 2) {
      for (x <- 0 to 2) {
        print(" " + aMatrix(y)(x))
      }
      println()
    }

    println("\n\n")
  }
}

// Example of reading a file from the file system

import scala.io.Source._

object ReadFile extends App {
  println("\n\nIn the APP")

  println(System.getProperty("user.dir"))

  lazy val users = fromFile(System.getProperty("user.dir") + "/other/file1.txt").getLines
  println(users)

  println("\n\n") 
}