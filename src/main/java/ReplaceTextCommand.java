/**
 * This class is responsible for all the actions that includes to replace a text.
 */
public class ReplaceTextCommand implements TextCommand

{
  protected String target;
  protected String replacement;

  /**
   * Constructor to initialize all methods and data necessary.
   * @param target the text to replace.
   */
  public ReplaceTextCommand(String target, String replacement){
    this.target = target;
    this.replacement = replacement;

  }

  /**
   * String to replace all target strings with replacement.
   * @param text the text to execute.
   * @return the executed String.
   */
  @Override
  public String execute(String text) {
    if (text == null||text.isBlank()) {
      throw new IllegalArgumentException("Text cannot be null or blank");
    }
    return text.replace(target, replacement);
  }



  /**
   * Getter for target
   * @return the target.
   */
  public String getTarget() {
    return target;

  }

  /**
   * Getter to get the replacement.
   * @return the replacement.
   */
  public String getReplacement() {
    return replacement;

  }


}
