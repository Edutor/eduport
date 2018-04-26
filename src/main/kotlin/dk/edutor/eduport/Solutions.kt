package dk.edutor.eduport

abstract class Solution(val solver: PersonIdentifier, val id: Long)

class StringSolution(
        val answer: String,
        solver: PersonIdentifier,
        id: Long
    //) : Solution(solver, id)
    ) : Solution(id = id, solver = solver)

class CMSolution(
        val answers:List<String>,
         solver: PersonIdentifier,
         id: Long
    ):Solution(id = id, solver = solver)

/* Java:
  public class StringSolution extends Solution {
    private final String answer;

    StringSolution(String answer, PersonIdentifier solver, long id) {
      super(solver, id);
      this.answer = answer;
      }

    public String getAnswer() { return answer; }
    }
 */

