/**
 * @name  02 Type Inference
 * @desc  This is our introduction file
 *        Further info can be found in the comments
 **/ 

object typeInference extends App {

    // Scala has type inference
    // This means generally Scala can deduce types
    // It is important to note this is only at a local level
    // Generally type inference is to help prevent verbose typing
    // Type Inference is the best of both worlds Static and Dynamic Types
    // IMPORTANT: Scala is a Static typed language
    println("\n\nLooking at Type Inferenec")

    // Type systems stop stupid human mistakes
    // This responsibility is passed to the compiler
    // It helps prevent a tonne of bugs

    // Scala uses a type inference
    // A well known global type inference is the Hindley-Miller algorithm
    // More info here: https://en.wikipedia.org/wiki/Hindley-Milner_type_system
    // The algorithm analyses all elements and builds a final parse tree of possibilities of type
    // Scala type inference works a bit different to this

    // We must declare the return value as we have local inference
    // With other languages like Haskell this is not required

    // When local inference is not possible we must declare the function return type
    def factorial(a: Int): Int = {
        if (a < 1) 1 else a * factorial(a-1)
    }
    println(s"Factorial of the number 6: ${factorial(6)}")

    // Here we can see an obvious return type so we don't need to declare it
    def multiplyTwoInts(x: Int, y: Int) = {
        x * y
    }
    println(s"2 * 4 = ${multiplyTwoInts(2, 4)}")

    // For languages such as Scala that are multi-paradigm it is hard to do global inference
    // Haskel for instance is functional and easier to deduce

    // In Scala all types lead back to a default Any type

    // *********************************
    // ********* Sub-Typing ************
    // *********************************

    // Hetrogenous lists convert lower types to higher types were necessary
    val aList = List(10, 20.0)
    println(aList)
    // Here 10 is converted to a double
    // If a subtype matches no higher types it becomes a Any


    // *****************************************************
    // ********* Value Types vs Reference Types ************
    // *****************************************************

    // Value types are the samw as their native Java counterparts
    val vt: Int = 10

    // Reference types must have the new keyword
    val arr = new ArrayBuffer[Int]()
    // There are exceptions to this such as String
    // Also Array and List have their own apply method so they can be created without the new keyword


    /**
     * - When to use Type Inference?
     *  - When it saves time   
     *  - When we are within a function
     *  - When within a loop
     * - When not to use Type Inference?
     *  - When the reader will have to guess the type
     *  - If someone in a code review doens't understand, use them
     **/

    // We have Types as guessing bring mistakes and mistake bring bad code

    // Types can be non-intuitive at the start, work to get your head round it

    println("\n\n")
}