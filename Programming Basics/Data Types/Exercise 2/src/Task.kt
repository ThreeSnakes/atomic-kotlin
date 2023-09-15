// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val si = string + int
  val sd = string + double
  val sb = string + boolean
  val sc = string + character

  val id = int + double
  val di = double + int
  val cs = character + string
  val ci = character + int

  println(
    "The type that can be combined " +
            "with every other type using '+':"
  )
  println("String")

//  val di = double + int
//  var db = double + boolean
}