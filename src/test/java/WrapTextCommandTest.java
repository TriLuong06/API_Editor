import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Test class for the WrapTextCommand class.
 */
class WrapTextCommandTest {

  /**
   * Positive test for the execute method.
   */
  @Test
  void execute_valid_wrapsText() {
    WrapTextCommand command = new WrapTextCommand("<p>", "</p>");
    String input = "ola";
    String result = command.execute(input);
    assertEquals("<p>ola</p>", result);
  }


    /**
     * Negative test with null value for the execute method.
     */
    @Test
    void execute_null_throwsException() {
      WrapTextCommand command = new WrapTextCommand("<p>","</p>");
      String input = null;
      assertThrows(IllegalArgumentException.class, () -> command.execute(input),
          "Throws Exception input should not be null");

    }



  /**
   * Negative test with blank value for the execute method.
   */
  @Test
  void execute_blank_throwsException() {
    WrapTextCommand command = new WrapTextCommand("<p>","</p>");
    String input = "";
    assertThrows(IllegalArgumentException.class, () -> command.execute(input),
        "Throws Exception input should not be blank");

  }




  /**
   * Method that test getter for opening.
   */
  @Test
  void getOpening() {
    WrapTextCommand command = new WrapTextCommand("<p>","</p>");
    String result = command.getOpening();
    assertEquals("<p>", result);
  }


  /**
   * Getter for closing.
   */
  @Test
  void getClosing() {
    WrapTextCommand command = new WrapTextCommand("<p>","</p>");
    String result = command.getClosing();
    assertEquals("</p>", result);

  }
}