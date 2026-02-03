import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ReplaceFirstTextCommand class that test both negative and positive test scenarios
 * to verify expected behavior.
 */
class ReplaceFirstTextCommandTest {


  /**
   * Positive test that replaces the text string with a replacement string.
   */
  @Test
  void execute_valid_capitalizes() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("hei", "hade");
    String result = command.execute("hei");
    assertEquals("hade", result);
  }


  /**
   * Negative test that check for throw when given a null value String.
   */
  @Test
  void execute_invalid_null() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand(null, "hade");
    assertThrows(IllegalArgumentException.class, () -> command.execute(null));
  }


  /**
   * Negative test that check for throw when given a blank value String.
   */
  @Test
  void execute_invalid_blank() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("", "hade");
    assertThrows(IllegalArgumentException.class, () -> command.execute(""));
  }
}