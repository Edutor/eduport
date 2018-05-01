package dk.edutor.eduport


abstract class Challenge(val description: String, var tags: List<String>)

class StringChallenge(
        val question: String,
        description: String,
        tags: List<String>
) : Challenge(description, tags)


class MCChallenge(
<<<<<<< HEAD
        val id: Int,
=======
>>>>>>> b423d79e398cf312ce1ddc28d5238a74be9a879e
//      answers have a string question and boolean: right question
        val question: String,
        val answers: Map<String,Boolean>,
        description: String,
        tags: List<String>
) : Challenge(description, tags)

