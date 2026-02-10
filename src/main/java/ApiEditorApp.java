import java.util.List;

/**
 * Main starting point of the application that initializes and starts the program.
 */

public class ApiEditorApp{
  public static void main(String[] args) {

    Script script =
        new Script(List.of(
            //Capitalizes text
        new CapitalizeTextCommand(),
        //Replaces text
        new ReplaceTextCommand("verden", "NTNU"),
        //Wraps text
        new WrapTextCommand("<p>", "</p>")
    ));

    //input string
    String input = "hei verden";
    //executes string
    String result = script.execute(input);

    System.out.println(result);
  }
}
