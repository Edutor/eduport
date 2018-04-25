package dk.edutor.eduport

interface Port {
  fun sayHello(text: String) : String
  fun check(challenge: Challenge, solution: Solution): Assessment
  }

open class PersonIdentifier(val id: Long)

open class Assessment(val solution: Solution, val grade: Int)

