/**
 * This class is responsible to capitalize a given word in a text.
 */
public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand{
  private String selection;


  /**
   * Constructor to initialize data.
   * @param selection the selected text to capitalize.
   */
  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  /**
   * Getter to get selected text.
   * @return the selected text.
   */
  public String getSelection() {
    return selection;
  }


  /**
   * Replaces the selected word with the same word in the
   * given text but capitalized first letter.
   * @param text the text to execute.
   * @return the text with the selected text capitalized.
   */
  public String execute(String text) {
    String capitalized = super.execute(selection);
    return text.replace(selection, capitalized);

  }


}
