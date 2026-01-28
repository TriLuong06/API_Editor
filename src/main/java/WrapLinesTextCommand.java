/**
 * This class is responsible to wrap each line in a given text
 * and provides functionality to do so.
 */
public class WrapLinesTextCommand extends WrapTextCommand
{
  private String selection;


  /**
   * Constructor to initialize.
   * @param opening the opening wrapper.
   * @param end the end wrapper.
   */
  public WrapLinesTextCommand(String opening, String end)
  {
    super(opening, end);
  }

  /**
   * Method to wrap each line.
   * @param text the text to wrap.
   * @return the result of the text.
   */
  public String execute(String text){
    if (text==null||text.isBlank()){
      throw new IllegalArgumentException("Text cannot be null or blank");
    }
    String[] lines = text.split("\n");
    StringBuilder result = new StringBuilder();

    for (int i=0; i<lines.length; i++) {
      result.append(opening);
      result.append(lines[i]);
      result.append(end);

      if (i<lines.length-1){
        result.append("\n");

      }
    }
    return result.toString();
  }

  /**
   * Getter for selection.
   * @return the selection
   */
  public String getSelection() {
    return selection;
  }




}
