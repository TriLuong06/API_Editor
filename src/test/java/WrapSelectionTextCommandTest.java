import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {

  /**
   * Test method.
   */
  @Test
  void execute() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("<p>","</p>", "ola");
    String result = command.execute("ola");
    assertEquals("<p>ola</p>", result);
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