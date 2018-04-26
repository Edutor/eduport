package dk.edutor.eduport


abstract class Challenge(val description: String)

class StringChallenge(
        val question: String,
        description: String
) : Challenge(description)


class MCChallenge(
//      answers have a string question and boolean: right question
        val question: String,
        val answers: Map<String,Boolean>,
        description: String
) : Challenge(description)

