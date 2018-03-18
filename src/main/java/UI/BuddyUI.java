package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 */
public class BuddyUI extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage = new Stage();
        primaryStage.initStyle(StageStyle.DECORATED);
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResource("/GUI.fxml"));
        primaryStage.setTitle("PoE Level Buddy by twitch.tv/Rizlim");
        primaryStage.getIcons().add(new Image(getClass().getResource("/program_icons/witch.png").toString()));
        primaryStage.setScene(new Scene(root, 390, 390));
        //Settings.GUI = primaryStage;
        primaryStage.show();
    }

    public void Init(String[] args)
    {
        launch(args);
    }
}
