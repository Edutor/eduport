package dk.edutor.eduport


abstract class Challenge(val description: String, var tags: List<String>)

class StringChallenge(
        val question: String,
        description: String,
        tags: List<String>
) : Challenge(description, tags)


class MCChallenge(
        val id: Int,
//      answers have a string question and boolean: right question
        val question: String,
        val answers: Map<String,Boolean>,
        description: String,
        tags: List<String>
) : Challenge(description, tags)

