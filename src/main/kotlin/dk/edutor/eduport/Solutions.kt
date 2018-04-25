package dk.edutor.eduport

abstract class Solution(val solver: PersonIdentifier, val id: Long)

class StringSolution(
    val text: String,
    solver: PersonIdentifier,
    id: Long
    //) : Solution(solver, id)
    ) : Solution(id = id, solver = solver)

/* Java:
  public class StringSolution extends Solution {
    private final String text;

    StringSolution(String text, PersonIdentifier solver, long id) {
      super(solver, id);
      this.text = text;
      }

    public String getText() { return text; }
    }
 */

