import Data.CharacterClass;
import Data.DataFactory;
import Data.Flags;
import Data.Settings;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable
{

    @FXML
    private ImageView act1Button;

    @FXML
    private ImageView act2Button;

    @FXML
    private ImageView act3Button;

    @FXML
    private ImageView act4Button;

    @FXML
    private ImageView act5Button;

    @FXML
    private ImageView act10Button;

    @FXML
    private ImageView act9Button;

    @FXML
    private ImageView act8Button;

    @FXML
    private ImageView act7Button;

    @FXML
    private ImageView act6Button;

    @FXML
    private AnchorPane optionsAnchorPane;

    @FXML
    private ComboBox<CharacterClass> characterComboBox;

    @FXML
    private Button bBrowseClientPath;

    @FXML
    private TextField clientPATH;

    @FXML
    private Button bForceLoad;

    @FXML
    private Button bDeleteSaves;

    @FXML
    private TextField characterNameField;

    @FXML
    private AnchorPane HelperZonePane;

    @FXML
    private Text zoneNameText;

    @FXML
    private ImageView iconSignificance0;

    @FXML
    private ImageView iconSignificance1;

    @FXML
    private ImageView iconSignificance2;

    @FXML
    private WebView tipsView;

    @FXML
    private AnchorPane CharacterPane;

    @FXML
    private Label dbg_characterName;

    @FXML
    private Label dbg_lvl_passives;

    @FXML
    private Label dbg_currentZone;

    @FXML
    private Label dbg_sessionTime;

    @FXML
    private AnchorPane gemSelectorAnchorPane;

    @FXML
    private Text textQuestName;

    @FXML
    private ImageView gemRewardIcon0;

    @FXML
    private RadioButton radio0;

    @FXML
    private ToggleGroup main_toggle;

    @FXML
    private ImageView gemRewardIcon1;

    @FXML
    private ImageView gemRewardIcon2;

    @FXML
    private ImageView gemRewardIcon3;

    @FXML
    private ImageView gemRewardIcon4;

    @FXML
    private ImageView gemRewardIcon5;

    @FXML
    private ImageView gemRewardIcon6;

    @FXML
    private ImageView gemRewardIcon7;

    @FXML
    private ImageView gemRewardIcon8;

    @FXML
    private ImageView gemRewardBackward;

    @FXML
    private ImageView gemRewardForward;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private RadioButton radio3;

    @FXML
    private RadioButton radio4;

    @FXML
    private RadioButton radio5;

    @FXML
    private RadioButton radio6;

    @FXML
    private RadioButton radio7;

    @FXML
    private RadioButton radio8;

    @FXML
    private ImageView gemRewardIcon9;

    @FXML
    private ImageView gemRewardIcon10;

    @FXML
    private ImageView gemRewardIcon11;

    @FXML
    private RadioButton radio9;

    @FXML
    private RadioButton radio10;

    @FXML
    private RadioButton radio11;

    @FXML
    private ImageView gemRewardIcon12;

    @FXML
    private RadioButton radio12;

    @FXML
    private ImageView buttonOpenOptions;

    @FXML
    private AnchorPane optionsAnchorPaneMenu;

    @FXML
    private ImageView bOptions;

    @FXML
    private ImageView optionsArrow;

    @FXML
    private Text errorNoClientTxt;

    private ArrayList<ImageView> actArray = new ArrayList<>();

    /**
     * Runs when the GUI is first created.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        actButtonArrayCollector();
        dataInit();
    }

    /**
     * Collection for initialization of several GUI elements.
     */
    private void dataInit()
    {
        comboCharacterBoxInit();
        characterNameTextFieldInit();
        // Default PoE Path.
        // C:\Program Files\Steam (x86)\SteamApps\common\Path of Exile\logs\Client.txt
        // Y:\Steam\SteamApps\common\Path of Exile\logs\Client.txt
        clientPATH.setText("Y:\\Steam\\SteamApps\\common\\Path of Exile\\logs\\Client.txt");

        File f = new File(clientPATH.getText());
        if (!f.exists())
        {
            errorNoClientTxt.setVisible(true);
        }
    }


    /**
     * Init for the CharacterName TextField.
     * 23 Characters Limit
     */
    private void characterNameTextFieldInit()
    {

            characterNameField.textProperty().addListener((observable, oldValue, newValue) ->
            {
                if (newValue.length() <= 23 && newValue.length() >= 0)
                {
                    Settings.getINSTANCE().setCharacterName(newValue);
                    Platform.runLater(() -> dbg_characterName.setText(newValue));
                }
                else
                {
                    Platform.runLater(() -> characterNameField.setText(oldValue));
                }
            });
    }

    /**
     * Combobox items init.
     */
    private void comboCharacterBoxInit()
    {
        characterComboBox.setItems(DataFactory.characterCombo());
        characterComboBox.getSelectionModel().select(0);
    }


    /**
     * Creates an ArrayList for simple Act Button accessibility through numbers.
     */
    private void actButtonArrayCollector()
    {
        actArray.add(act1Button);
        actArray.add(act2Button);
        actArray.add(act3Button);
        actArray.add(act4Button);
        actArray.add(act5Button);
        actArray.add(act6Button);
        actArray.add(act7Button);
        actArray.add(act8Button);
        actArray.add(act9Button);
        actArray.add(act10Button);
    }

    // TODO: Implement Quest Rewards Display
    // TODO: Finish GUI
    // TODO: Client Parsing
    // TODO: HTMLs for Zones
    // TODO: Waypoint / Skill Point / Respec Point Checkmark images

    /**
     * Handles highlighting of act buttons.
     */
    public void actButtonMouseOver(MouseEvent mouseEvent)
    {
        if (mouseEvent.getSource() instanceof ImageView)
        {
            ImageView imgView = (ImageView) mouseEvent.getSource();

            int actNum = actNumParser(imgView.getId());

            if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED))
            {
                imgView.setImage(new Image(getClass().getResource("act_buttons/hl/act" + actNum + ".png").toString()));
            }
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED))
            {
                if (Flags.getINSTANCE().getCurrentActiveAct() != actNum)
                {
                    imgView.setImage(new Image(getClass().getResource("act_buttons/act" + actNum + ".png").toString()));
                }
            }
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED))
            {
                int actNumPrev = Flags.getINSTANCE().getCurrentActiveAct();

                if (actNum != actNumPrev || Flags.getINSTANCE().getActiveWindow() == 0)
                {
                    imgView.setImage(new Image(getClass().getResource("act_buttons/hl/act" + actNum + ".png").toString()));
                    actArray.get(actNumPrev-1).setImage(new Image(getClass().getResource("act_buttons/act" + actNumPrev + ".png").toString()));
                    Flags.getINSTANCE().setCurrentActiveAct(actNum);

                    // Activate the options for that specific act if inOptions.
                    if (inOptions)
                    {
                        System.out.println("We should be loading gem selections now...");
                        // Set Quest Reward Data

                        // Hide options
                        if (Flags.getINSTANCE().getActiveWindow() == 0)
                        {
                            optionsAnchorPane.setVisible(false);
                        }
                    }
                }
            }
        }
    }

    /**
     * Sets gem selection data.
     */
    private void setGemSelectionData()
    {
        // Ask DataFactory to supply data from "CLASS" and "ACT"
    }

    /**
     * Retrieves act Number from ImageView's ID.
     */
    private int actNumParser(String id)
    {
        int result = 1;
        for (ImageView i : actArray)
        {
            if (i.getId().equals(id))
                return result;
            result++;
        }
        return 0;
    }

    /**
     * Updates the characterclass in settings whenever the combobox is changed.
     */
    public void updateCharacterBox()
    {
        Settings.getINSTANCE().setCharacterClass(characterComboBox.getSelectionModel().getSelectedItem());
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
            Platform.runLater(() -> clientPATH.setText(selectedFile.getAbsolutePath()));
            // I'm going to trust the FileChooser that the file exists.
            errorNoClientTxt.setVisible(false);
        }
    }

    /**
     * Hides the options when pressed.
     */
    public void optionsArrow(MouseEvent mouseEvent)
    {
        if (mouseEvent.getSource() instanceof ImageView)
        {
            ImageView imgView = (ImageView) mouseEvent.getSource();

            if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED))
            {
                imgView.setImage(new Image(getClass().getResource("ico/collapse0_hl.png").toString()));
            }
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED))
            {
                imgView.setImage(new Image(getClass().getResource("ico/collapse0.png").toString()));
            }
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED))
            {
                optionsAnchorPane.setVisible(false);
                optionsAnchorPaneMenu.setVisible(false);
                inOptions = false;
            }
        }
    }

    /**
     * Handles showing of the optionsAnchorPaneMenu
     * @param mouseEvent
     */
    public void optionsArrowBase(MouseEvent mouseEvent)
    {
        if (mouseEvent.getSource() instanceof ImageView)
        {
            ImageView imgView = (ImageView) mouseEvent.getSource();

            if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED))
                imgView.setImage(new Image(getClass().getResource("ico/collapse1_hl.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED))
                imgView.setImage(new Image(getClass().getResource("ico/collapse1.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED))
                optionsAnchorPaneMenu.setVisible(true);
        }
    }

    private boolean inOptions = true;

    public void optionsButton(MouseEvent mouseEvent)
    {
        if (mouseEvent.getSource() instanceof ImageView)
        {
            ImageView imgView = (ImageView) mouseEvent.getSource();

            if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED))
                imgView.setImage(new Image(getClass().getResource("ico/options1.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED))
                imgView.setImage(new Image(getClass().getResource("ico/options0.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED))
            {
                optionsAnchorPane.setVisible(true);
                inOptions = true;
            }
        }
    }
}
