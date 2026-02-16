import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScriptTest {

  /**
   * Postive test for running script.
   */
  @Test
  void execute_valid_runsScript() {
    TextCommand c1 = new CapitalizeTextCommand();
    TextCommand c2 = new WrapTextCommand("<p>","</p>");
    ArrayList<TextCommand> commands = new ArrayList<>();
    commands.add(c1);
    commands.add(c2);
    Script script = new Script(commands);
    String result = script.execute("halla");
    assertEquals("<p>Halla</p>", result);
  }


  /**
   * Negative test for a running script, null commands.
   */

  @Test
  void execute_null_throwException() {
    TextCommand c1 = new CapitalizeTextCommand();
    TextCommand c2 = new WrapTextCommand("<p>","</p>");
    ArrayList<TextCommand> commands = new ArrayList<>();
    commands.add(c1);
    commands.add(c2);
    Script script = new Script(commands);;
    assertThrows(IllegalArgumentException.class, () -> script.execute(null));
  }

  /**
   * Negative test for running script, blank commands.
   */

  @Test
  void execute_blank_throwException() {
    TextCommand c1 = new CapitalizeTextCommand();
    TextCommand c2 = new WrapTextCommand("<p>","</p>");
    ArrayList<TextCommand> commands = new ArrayList<>();
    commands.add(c1);
    commands.add(c2);
    Script script = new Script(commands);;
    assertThrows(IllegalArgumentException.class, () -> script.execute(""));
  }


}