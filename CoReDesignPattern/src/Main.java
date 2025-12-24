import com.demo.LevelOneRequestHandler;
import com.demo.LevelThreeRequestHandler;
import com.demo.LevelTwoRequestHandler;
import com.demo.RequestHandler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RequestHandler levelOneRequestHandler = new LevelOneRequestHandler();
        RequestHandler levelTwoRequestHandler = new LevelTwoRequestHandler();
        RequestHandler levelThreeRequestHandler = new LevelThreeRequestHandler();

        levelOneRequestHandler.setNextHandler(levelTwoRequestHandler);
        levelTwoRequestHandler.setNextHandler(levelThreeRequestHandler);

        levelOneRequestHandler.handleRequest("Intermediate");



    }
}