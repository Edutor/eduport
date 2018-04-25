package dk.edutor.eduport

abstract class Challenge(val description: String)

class StringChallenge(
    val answer: String,
    description: String
    ) : Challenge(description)

