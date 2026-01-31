import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  /**
   * Positive test for the execute method.
   */
  @Test
  void execute_valid_wraps_selected_text() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>",
        "</p>", "ola");
    String result = command.execute("ola");
    assertEquals("<p>ola</p>", result);
  }

  /**
   * Negative test that check for IllegalArgumentException throw when entering a null value
   * for the execute method .
   */
  @Test
  void execute_null_throwsException() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>",
        "</p>", "ola");
    assertThrows(IllegalArgumentException.class, () -> command.execute(null));
  }


  /**
   * Negative test that check for IllegalArgumentException throw when entering a blank value
   * for the execute method .
   */
  @Test
  void execute_blank_throwsException() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>",
        "</p>", "ola");
    assertThrows(IllegalArgumentException.class, () -> command.execute(""));
  }

  /**
   * Test method.
   */
  @Test
  void getSelection() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>","</p>", "ola");
    String result = command.getSelection();
    assertEquals("ola", result);

  }
}