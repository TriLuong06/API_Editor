public class WrapLinesTextCommand extends WrapTextCommand
{
  public WrapLinesTextCommand(String opening, String end)
  {
    super(opening, end);
  }

  public String execute(String text){
    if (text==null||text.isBlank()){
      throw new IllegalArgumentException("Text cannot be null or blank");
    }



  }

  public String getSelection() {
    return
  }




}
