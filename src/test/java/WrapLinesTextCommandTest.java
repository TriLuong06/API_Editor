import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the WrapLinesTextCommand class that includes ´both positive and negative tests.
 */
class WrapLinesTextCommandTest {

  /**
   * Postive test for the execute method.
   */
  @Test
  void execute_valid_wrapLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>","</p>");
    String result = command.execute("Hei bro hva skjer med deg bror\nIngenting mannen");
    assertEquals("<p>Hei bro hva skjer med deg bror</p>\n<p>Ingenting mannen</p>", result);
  }

  /**
   * Negative test for the execute method, null value.
   */
  @Test
  void execute_null_wrapLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>","</p>");
    assertThrows(IllegalArgumentException.class, () -> command.execute(null));
  }
  /**
   * Negative test for the execute method, blank value.
   */
  @Test
  void execute_blank_wrapLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<p>","</p>");
    assertThrows(IllegalArgumentException.class, () -> command.execute(""));
  }


}