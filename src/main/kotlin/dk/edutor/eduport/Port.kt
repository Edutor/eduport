package dk.edutor.eduport

interface Port {
  fun sayHello(text: String) : String
  fun check(solution: Solution): Assessment
  }

open class Person(val id: Long)

open class Assessment(val solution: Solution, val grade: Double)

class LauncherTestResult{
    var status : String = ""
    var message : String = ""
}
class WebAssessment(
        solution: Solution,
        grade : Double,
        val numberoftests: Int,
        val successful: Int,
        val failed : Int,
        val percentage : Double,
        val tests: Map<String,LauncherTestResult>
) : Assessment(solution, grade)
