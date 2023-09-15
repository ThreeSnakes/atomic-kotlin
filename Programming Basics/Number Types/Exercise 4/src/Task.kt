// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long = (hours.toLong() * 60 * 60 * 1_000) +
        (minutes.toLong() * 60 * 1_000) +
        (seconds.toLong() * 1_000)

fun main() {
  println(convertToMilliseconds(1, 30, 0))
}