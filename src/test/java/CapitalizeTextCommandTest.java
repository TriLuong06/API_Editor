import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test class for CapitalizeTextCommand class that test both positive and negative
 * scenarios for each method
 * to test expected behavior.
 */
class CapitalizeTextCommandTest {

  /**
   * Positive test that capitalizes first character in a given text.
   */
  @Test
  void execute_valid_capitalizesFirstChar() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    String text = "hei";
    String result = command.execute(text);
    assertEquals("Hei", result);
  }

  /**
   * Negative test that check for throw when entering a blank string.
   */
  @Test
  void execute_invalid_blank() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    String text = "";
    assertThrows(IllegalArgumentException.class, () -> command.execute(text));
  }

  /**
   * Negative test that check for throw when entering a null string.
   */
  @Test
  void execute_invalid_null() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    String text = null;
    assertThrows(IllegalArgumentException.class, () -> command.execute(text));
  }

}