import java.util.List;

/**
 * This class is a "pipeline" that can run multiple scrip one after the other.
 */
public class Script {
  private List<TextCommand> textCommands;

  /**
   * Constructor to initialize the text commands.
   * @param textCommands the commands to execute.
   */
  public Script(List<TextCommand> textCommands) {
    this.textCommands = textCommands;
  }

  /**
   * The method that executes the commands on the given text.
   * @param text the given text.
   * @return the text.
   */
  public String execute(String text) {
    for (TextCommand textCommand : textCommands) {
      text= textCommand.execute(text);
    }
    return text;
  }

}
