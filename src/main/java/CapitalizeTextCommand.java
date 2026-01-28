/**
 * This class is responsible to capitalize the first word in a given text.
 */
public class CapitalizeTextCommand implements TextCommand{

  /**
   * Capitalizes the first word in the given text.
   * @param text the text to execute.
   * @return the given text with the first word capitalized.
   */
  public String execute(String text) {
    if (text == null || text.length() == 0) {
      throw new IllegalArgumentException("Text cannot be null or empty");
    }
    char firstChar=text.charAt(0);
    firstChar =Character.toUpperCase(firstChar);
    return firstChar+text.substring(1);
  }
}
