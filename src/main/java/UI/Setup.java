package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 */
public class Setup extends Application
{
    public static Stage stage;

    public void Init(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.initStyle(StageStyle.UNDECORATED);

        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResource("/Setup.fxml"));
        primaryStage.setScene(new Scene(root, 347, 347));
        //Settings.GUI = primaryStage;
        stage = primaryStage;
        primaryStage.show();
    }
}
