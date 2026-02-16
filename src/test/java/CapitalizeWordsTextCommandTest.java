import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Test class for CapitalizeWordsText class that tests for both negative and positive test scenarios
 * to verify expected behavior.
 */
class CapitalizeWordsTextCommandTest {


  /**
   * Positive test to check that every first character in every word gets upper cased.
   */
  @Test
  void execute_valid_upperCaseCharWords() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    String text = "hei bror hva skjer";
    String result = command.execute(text);
    assertEquals("Hei Bror Hva Skjer", result);
  }


  /**
   * Negative test that check for throw when trying to execute a null value for a text string.
   */
  @Test
  void execute_invalid_null() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    String result = null;
    assertThrows(IllegalArgumentException.class, () -> command.execute(result));
  }

  /**
   * Negative test that check for throw when trying to execute a blank string.
   *
   */
  @Test
  void execute_invalid_empty() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    String result = "";
    assertThrows(IllegalArgumentException.class, () -> command.execute(result));
  }


}