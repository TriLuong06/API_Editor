public class WrapTextCommand implements TextCommand{

  protected String opening;
  protected String end;

  /**
   * Constructor to initialize opening, and closing text.
   * @param opening the opening text.
   * @param end the closing text.
   */
  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }


  /**
   * Wraps opening and end text between the given text.
   * @param text the text to execute.
   * @return the wrapped text.
   */
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Text cannot be null or empty");
    }
    return opening + text + end;
  }

  /**
   * Getter to get the opening text
   * @return the opening text
   */

  public String getOpening() {
    return opening;
  }

  /**
   * Getter to get closing text.
   * @return the closing text.
   */
  public String getClosing() {
    return end;
  }

}
