package dk.edutor.eduport

interface Port {
  fun sayHello()
  fun check(challenge: Challenge, solution: Solution): Assessment
  }

open class PersonIdentifier(val id: Long)

abstract class Solution(val solver: PersonIdentifier, val id: Long)

abstract class Challenge(val portKey: String, val id: Long, val description: String)

abstract class Assessment(val solution: Solution, val grade: Int)

