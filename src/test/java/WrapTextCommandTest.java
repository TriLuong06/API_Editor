import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Test class for the WrapTextCommand class.
 */
class WrapTextCommandTest {

  /**
   * Method that test the execute command.
   */
  @Test
  void execute() {
    WrapTextCommand command = new WrapTextCommand("<p>","</p>");
    String input = "ola";
    String result = command.execute(input);
    assertEquals("<p>ola</p>", result);



  }
  /**
   * Method that test getter for opening.
   */
  @Test
  void getOpening() {
    WrapTextCommand command = new WrapTextCommand("<p>","</p>");
    String input = "ola";
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