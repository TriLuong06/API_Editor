/**
 * Class to wrap selected text.
 */
public class WrapSelectionTextCommand extends WrapTextCommand {

  private String selection;

  /**
   * Constructor to initialize all the fields and data.
   * @param opening the opening text.
   * @param end the end text.
   * @param selection the selected text.
   */
  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    if (selection == null || selection.isBlank()) {
      throw new IllegalArgumentException("Selection should not be null or blank");
    }

    this.selection = selection;
  }

  /**
   * The text that is executed.
   * @return the executed text.
   */
  @Override
  public String execute(String text) {
    if (text == null || text.isBlank()) {
      throw new IllegalArgumentException("Text should not be null or blank");
    }
    return text.replace(selection, opening+ selection + end );
  }

  /**
   * Getter for selected text.
   * @return the selected text.
   */
  public String getSelection() {
    return selection;
  }

}
