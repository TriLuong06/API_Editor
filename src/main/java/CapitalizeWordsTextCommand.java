/**
 * This class is responsible to capitalize each word in an sentence.
 */
public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{


  /**
   * Method to capitalize each first character in evey word in a text.
   * @param text the text to execute.
   * @return the text with all first characters in a text capitalized.
   */
  @Override
  public String execute(String text) {

    String[] words = text.split("\\s");
    StringBuilder result = new StringBuilder();

    for (int i=0; i<words.length; i++){
      result.append(super.execute(words[i]));
      if (i < words.length-1)
        result.append(" ");
    }
    return result.toString();


  }
}
