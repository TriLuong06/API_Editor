import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {

  /**
   * Positive test for capitalizing selected text.
   */
  @Test
  void testExecute_valid_capitalizesText() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("hei");
    String result = command.execute("hei");
    assertEquals("Hei", result);
  }


  /**
   * Negative test for capitalizing selected text, null value.
   */
  @Test
  void testExecute_null_throwsIllegalArgumentException() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("hei");
    assertThrows(IllegalArgumentException.class, () -> command.execute(null));
  }

  /**
   * Negative test for capitalizing selected text, blank value.
   */
  @Test
  void testExecute_blank_throwsIllegalArgumentException() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("hei");
    assertThrows(IllegalArgumentException.class, () -> command.execute(""));
  }

}