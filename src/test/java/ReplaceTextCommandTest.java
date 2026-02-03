import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {


  /**
   * Positive test that replaces every target string with replacement string.
   */
  @Test
  void execute_valid_replacesAllText() {
    ReplaceTextCommand command = new ReplaceTextCommand("Hei","Hade");
    String text = "Hei hei hei";
    String result = command.execute(text);
    assertEquals("Hade hei hei", result);

  }

  /**
   * Negative test that test for null value to check for throw.
   */

  @Test
  void execute_invalid_null() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    String result = null;
    assertThrows(IllegalArgumentException.class, () -> command.execute(result));
  }

  /**
   * Negative test that check for blank value to check for throw.
   */
  @Test
  void execute_invalid_empty() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    String result = "";
    assertThrows(IllegalArgumentException.class, () -> command.execute(result));
  }

  /**
   * Positive test for getter for target string.
   */
  @Test
  void getTarget() {
    ReplaceTextCommand command = new ReplaceTextCommand("Hei","Hade");
    String result = command.getTarget();
    assertEquals("Hei", result);

  }


  /**
   * Negative test for getter for replacement string.
   */
  @Test
  void getReplacement() {
    ReplaceTextCommand command = new ReplaceTextCommand("Hei","Hade");
    String result = command.getReplacement();
    assertEquals("Hade", result);
  }
}