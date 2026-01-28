/**
 * This class extends ReplaceTextCommand and is responsible to replace first text.
 */
public class ReplaceFirstTextCommand extends  ReplaceTextCommand{


  /**
   * Constructor to initialize all the fields and data.
   * @param text the text to replace.
   */
  public  ReplaceFirstTextCommand(String text, String replacement) {
    super(text,replacement);
  }

  /**
   * Method to replace the first target string only with replacement string.
   * @param text the text to replace.
   * @return the replaced string.
   */
  @Override
  public String execute(String text) {
    if (text == null||text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null or blank");
    }
    return text.replaceFirst(target, replacement);

  }


}
