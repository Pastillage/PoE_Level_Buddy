import Data.Flags;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;

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
    private ComboBox<?> characterComboBox;

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
    private AnchorPane OptionsAnchorPaneMenu;

    @FXML
    private ImageView bOptions;

    @FXML
    private ImageView optionsArrow;

    private ArrayList<ImageView> actArray = new ArrayList<>();

    /**
     * Runs when the GUI is first created.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        actButtonArrayCollector();

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

                if (actNum != actNumPrev)
                {
                    imgView.setImage(new Image(getClass().getResource("act_buttons/hl/act" + actNum + ".png").toString()));
                    actArray.get(actNumPrev-1).setImage(new Image(getClass().getResource("act_buttons/act" + actNumPrev + ".png").toString()));
                    Flags.getINSTANCE().setCurrentActiveAct(actNum);
                }
            }
        }

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
}
