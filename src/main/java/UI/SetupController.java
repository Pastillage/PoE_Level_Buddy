package UI;

/**
 *
 */

import Data.CharacterClass;
import Data.DataFactory;
import Data.Settings;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import static UI.Setup.stage;

public class SetupController implements Initializable
{

    @FXML
    private TextField PATH;

    @FXML
    private Button bBrowsePath;

    @FXML
    private Button bExit;

    @FXML
    private ComboBox<CharacterClass> classComboBox;

    @FXML
    private ComboBox<String> BanditDecisionCombo;

    @FXML
    private Slider pollingRateSlider;

    @FXML
    private Text pollingRateDisplay;

    private File clientTxt = null;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        pollingRateSlider.valueProperty().addListener((ov, old_val, new_val) ->
        {
            System.out.println(new_val.doubleValue());
            pollingRateDisplay.setText(String.format("%.0f", new_val) + " ms");
        });
        comboCharacterBoxInit();
        comboBanditBoxInit();
    }

    private void comboCharacterBoxInit()
    {
        classComboBox.setItems(DataFactory.characterCombo());
        classComboBox.getSelectionModel().select(0);
    }

    private void comboBanditBoxInit()
    {

        BanditDecisionCombo.setItems(DataFactory.banditCombo());
        BanditDecisionCombo.getSelectionModel().select(0);
    }

    /**
     * File Browser for Client.txt
     */
    public void browseFiles()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialFileName("Client.txt");
        fileChooser.setTitle("Select PoE's Client.txt File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Client.txt", "Client.txt"));
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null)
        {
            Settings.getINSTANCE().setClientTXT(selectedFile);
            Platform.runLater(() -> PATH.setText(selectedFile.getAbsolutePath()));
            // I'm going to trust the FileChooser that the file exists.
        }

        clientTxt = selectedFile;
    }

    public void saveAndExit()
    {
        if (clientTxt == null)
            return;

        Settings.getINSTANCE().setBandits(DataFactory.banditTranslator(BanditDecisionCombo.getSelectionModel().getSelectedIndex()));
        Settings.getINSTANCE().setClientTXT(clientTxt);
        Settings.getINSTANCE().setCharacterClass(classComboBox.getSelectionModel().getSelectedItem());
        System.out.println((long) Math.floor(pollingRateSlider.getValue()));
        Settings.setPolling_rate((long) Math.floor(pollingRateSlider.getValue()));

        Settings.getINSTANCE().saveData();

        stage.close();


        UI.BuddyUI b = new UI.BuddyUI();
        try
        {
            b.start(stage);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

