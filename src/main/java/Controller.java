import Data.*;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * Text Colours
 * #CC995B normal
 * #FEC076 highlight
 */
public class Controller implements Initializable
{
    private static final Color TEXT_NORMAL_COLOUR = Color.web("#CC995B");
    private static final Color TEXT_HIGHLIGHT_COLOUR = Color.web("#FEC076");

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
    private Label txtNote1;

    @FXML
    private Label txtNote2;

    @FXML
    private Label txtNote3;

    @FXML
    private Label txtNote4;

    @FXML
    private Label txtNote5;

    @FXML
    private Label txtNote6;

    @FXML
    private Label txtNote7;

    @FXML
    private Label txtNote8;

    @FXML
    private Label txtNote9;

    @FXML
    private Label txtNote10;

    @FXML
    private Label txtNote11;

    @FXML
    private Label txtNote12;

    @FXML
    private Label txtNote13;

    @FXML
    private ImageView gemDisplay1;

    @FXML
    private ImageView gemDisplay2;

    @FXML
    private ImageView gemDisplay3;

    @FXML
    private ImageView gemDisplay4;

    @FXML
    private ImageView gemDisplay5;

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
    private RadioButton rBanditsKill;

    @FXML
    private ToggleGroup bandit_group;

    @FXML
    private RadioButton rBanditsOak;

    @FXML
    private RadioButton rBanditsKraityn;

    @FXML
    private RadioButton rBanditsAlira;

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
    private ImageView iconSignificance21;

    @FXML
    private RadioButton radio11;

    @FXML
    private ImageView gemRewardIcon12;

    @FXML
    private RadioButton radio12;

    @FXML
    private ImageView gemRewardIcon13;

    @FXML
    private RadioButton radio13;

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
    private ArrayList<ImageView> gemIcons = new ArrayList<>();
    private ArrayList<RadioButton> radioButtons = new ArrayList<>();
    private Timer session_timer = new Timer();

    /**
     * Runs when the GUI is first created.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // Loads zones into RAM early.
        World.getINSTANCE();

        Settings.getINSTANCE().loadSaveData();


        dataInit();
        Platform.runLater(() -> startDaemon());
        Platform.runLater(() -> newLineDaemon());
        Platform.runLater(() -> sessionTimerDaemon());
    }

    private void sessionTimerDaemon()
    {
        Runnable r = () ->
        {
            session_timer.timer_start();
            while (true)
            {
                Platform.runLater(() ->
                {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Session Timer: ");
                    stringBuilder.append(session_timer.getHours());
                    stringBuilder.append(':');
                    stringBuilder.append(session_timer.getMins());
                    stringBuilder.append(':');
                    stringBuilder.append(session_timer.getSec());

                    dbg_sessionTime.setText(stringBuilder.toString());
                });
                try
                {
                    Thread.sleep(1000l);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t_session_timer = new Thread(r);
        t_session_timer.setDaemon(true);
        t_session_timer.start();
    }

    private String _currentZone = "";

    ArrayList<String> list = new ArrayList<>();

    private void newLineDaemon()
    {
        Runnable r = () ->
        {
            String cache = "";
            String cache_name = Settings.getINSTANCE().getCharacterName();
            String cache_level = Settings.getINSTANCE().getCharLevel();
            int cache_passives = 0;

            while (true)
            {
                String _currZone = ClientParser.currentZone;
                String _currName = ClientParser.playerName;
                String _currLevel = ClientParser.currentLevel;

                if (!cache.equals(_currZone))
                {
                    cache = _currZone;
                    _currentZone = _currZone;

                    if (_currZone.contains("Hideout"))
                    {
                        Platform.runLater(() -> dbg_currentZone.setText("Hideout"));
                        Platform.runLater(() -> zoneNameText.setText("Hideout"));
                        return;
                    }

                    // Update GUI based on zone entered.
                    Zone _zone = World.getINSTANCE().findZone(_currZone);
                    Flags.getINSTANCE().addVisitedZone(_zone);

                    Platform.runLater(() ->
                    {
                        int act = actFinder(_currZone);
                        displayGemPicksForThisAct(act);
                        // Update ZoneNames
                        zoneNameText.setText(_zone.getZoneName());
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Current Zone: ");
                        stringBuilder.append(_currZone);
                        dbg_currentZone.setText(stringBuilder.toString());
                        // Update ImageViews
                        if (_zone.isWaypoint())
                            iconSignificance0.setOpacity(1.0);
                        else
                            iconSignificance0.setOpacity(0.1);

                        if (_zone.isSkill_point_quest())
                            iconSignificance1.setOpacity(1.0);
                        else
                            iconSignificance1.setOpacity(0.1);

                        if (_zone.isRespec_point_quest())
                            iconSignificance2.setOpacity(1.0);
                        else
                            iconSignificance2.setOpacity(0.1);

                        if (_zone.isTrial_of_ascendency())
                            iconSignificance21.setOpacity(1.0);
                        else
                            iconSignificance21.setOpacity(0.1);
                    });
                }

                // Either a new character was made, or a new character was opened and leveled up, either way reset passives.
                if (!_currName.equals(cache_name))
                {
                    Settings.getINSTANCE().setPassivePoints(0);
                    Flags.getINSTANCE().resetVisited();
                    cache_name = _currName;
                    Settings.getINSTANCE().setCharacterName(_currName);
                    Platform.runLater(() -> dbg_characterName.setText(_currName));
                }

                if (!_currLevel.equals(cache_level))
                {
                    cache_level = _currLevel;
                    Settings.getINSTANCE().setCharLevel(_currLevel);
                    Platform.runLater(() -> dbg_lvl_passives.setText("Level: " + _currLevel + "\tPassives: " + Settings.getINSTANCE().getPassivePoints() + "/22" ));
                }
                else if (cache_passives != Settings.getINSTANCE().getPassivePoints())
                {
                    Settings.getINSTANCE().saveData();
                    cache_passives = Settings.getINSTANCE().getPassivePoints();
                    Platform.runLater(() -> dbg_lvl_passives.setText("Level: " + _currLevel + "\tPassives: " + Settings.getINSTANCE().getPassivePoints() + "/22" ));
                }

                try
                {
                    Thread.sleep(Settings.getINSTANCE().getPollingRate());
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t_lineDaemon = new Thread(r);
        t_lineDaemon.setDaemon(true);
        t_lineDaemon.start();
    }

    private void displayGemPicksForThisAct(int act)
    {
        switch (act)
        {
            case 1 : displayAct1Gems(); break;
            case 2 : displayAct2Gems(); break;
            case 3 : displayAct3Gems(); break;
            case 4 : displayAct4Gems(); break;
            default : displayBlank(true); break;
        }
    }

    private void displayBlank(boolean showThankYou)
    {
        gemDisplay1.setVisible(false);
        gemDisplay2.setVisible(false);
        gemDisplay3.setVisible(false);
        gemDisplay4.setVisible(false);

        if (showThankYou)
        {
            txtNote1.setText("No more text hints or gem selections from act 5 onwards.");
            txtNote4.setText("However, The little icons up above are still accurate!");
            txtNote7.setText("I'm hoping to add more hints and tips later down the line");
            txtNote10.setText("Also, thank YOU for using this program :)");

            txtNote1.setVisible(true);
            txtNote4.setVisible(true);
            txtNote7.setVisible(true);
            txtNote10.setVisible(true);

            txtNote11.setVisible(false);
        }
        else
        {
            txtNote1.setVisible(false);
            txtNote4.setVisible(false);
            txtNote7.setVisible(false);
            txtNote10.setVisible(false);
            txtNote11.setVisible(false);
        }
        txtNote2.setVisible(false);
        txtNote5.setVisible(false);
        txtNote8.setVisible(false);
        txtNote11.setVisible(false);
    }

    // Remind players of Deshret
    private void displayAct4Gems()
    {
        displayBlank(false);

        Flags f = Flags.getINSTANCE();
        gemDisplayImageDispenser(gemDisplay1, txtNote2, 8);
        gemDisplayImageDispenser(gemDisplay2, txtNote5, 9);

        txtNoteTextDispenser(txtNote1, 8, f.hasZoneBeenVisited(ActZones.z1_4_3_1) ? "\u2713" : "");
        txtNoteTextDispenser(txtNote4, 9, f.hasZoneBeenVisited(ActZones.z1_4_6_1) ? "\u2713" : "");

        if (f.hasZoneBeenVisited(ActZones.z1_4_3_3))
        {
            txtNote7.setText("\u2713[Reminder] Deshret is in \"The Mines Level 2\"!");
            txtNote7.setVisible(true);
        }
        else if (f.hasZoneBeenVisited(ActZones.z1_4_3_1) || f.hasZoneBeenVisited(ActZones.z1_3_13))
        {
            txtNote7.setText("[Reminder] Deshret is in \"The Mines Level 2\"!");
            txtNote7.setVisible(true);
        }
    }

    // Remind Player of Siosa
    private void displayAct3Gems()
    {
        displayBlank(false);

        Flags f = Flags.getINSTANCE();
        gemDisplayImageDispenser(gemDisplay1, txtNote2, 6);
        gemDisplayImageDispenser(gemDisplay2, txtNote5, 7);

        txtNoteTextDispenser(txtNote1, 6, f.hasZoneBeenVisited(ActZones.z1_3_14_1) ? "\u2713" : "");
        txtNoteTextDispenser(txtNote4, 7, f.hasZoneBeenVisited(ActZones.z1_3_17_2) ? "\u2713" : "");

        if (f.hasZoneBeenVisited(ActZones.z1_3_17_2))
        {
            txtNote7.setText("\u2713[Reminder] Complete Siosa's Quest in the Library!");
            txtNote7.setVisible(true);
        }
        else if (f.hasZoneBeenVisited(ActZones.z1_3_15) || f.hasZoneBeenVisited(ActZones.z1_3_13))
        {
            txtNote7.setText("[Reminder] Complete Siosa's Quest in the Library!");
            txtNote7.setVisible(true);
        }
    }

    // Show Bandits
    private void displayAct2Gems()
    {
        displayBlank(false);

        Flags f = Flags.getINSTANCE();
        gemDisplayImageDispenser(gemDisplay1, txtNote2, 4);
        gemDisplayImageDispenser(gemDisplay2, txtNote5, 5);

        txtNoteTextDispenser(txtNote1, 4, f.hasZoneBeenVisited(ActZones.z1_2_6_2) ? "\u2713" : "");
        txtNoteTextDispenser(txtNote4, 5, f.hasZoneBeenVisited(ActZones.z1_2_10) ? "\u2713" : "");

        if (f.hasZoneBeenVisited(ActZones.z1_2_8))
        {
            txtNote7.setText("\u2713[Reminder]" + comboBoxThatIsSelected());
            txtNote7.setVisible(true);
        }
        else if (f.hasZoneBeenVisited(ActZones.z1_2_town))
        {
            txtNote7.setText("[Reminder]" + comboBoxThatIsSelected());
            txtNote7.setVisible(true);
        }

    }

    private String comboBoxThatIsSelected()
    {
        if (rBanditsKill.isSelected())
        {
            return " Kill all the bandits for 2 Passive Skill Points!";
        }
        else if (rBanditsAlira.isSelected())
        {
            return " Help Alira by killing Oak and Kraityn!";
        }
        else if (rBanditsOak.isSelected())
        {
            return " Help Oak by killing Alira and Kraityn!";
        }
        else
        {
            return " Help Kraityn by killing Alira and Oak!";
        }
    }

    private void displayAct1Gems()
    {
        displayBlank(false);

        Flags f = Flags.getINSTANCE();
        gemDisplayImageDispenser(gemDisplay1, txtNote2, 0);
        gemDisplayImageDispenser(gemDisplay2, txtNote5, 1);
        gemDisplayImageDispenser(gemDisplay3, txtNote8, 2);
        gemDisplayImageDispenser(gemDisplay4, txtNote11, 3);

        txtNoteTextDispenser(txtNote1, 0, f.hasZoneBeenVisited(ActZones.z1_1_town) ? "\u2713" : "");
        txtNoteTextDispenser(txtNote4, 1, f.hasZoneBeenVisited(ActZones.z1_1_4_1) ? "\u2713" : "");
        txtNoteTextDispenser(txtNote7, 2, f.hasZoneBeenVisited(ActZones.z1_1_8) ? "\u2713" : "");
        txtNoteTextDispenser(txtNote10, 3, f.hasZoneBeenVisited(ActZones.z1_1_11_1) ? "\u2713" : "");
    }

    private void txtNoteTextDispenser(Label txt, int n, String prepend)
    {
        txt.setText("\t\t\t" + prepend + DataFactory.questName(n));
        txt.setVisible(true);
    }

    private void gemDisplayImageDispenser(ImageView imgview, Label txt, int n)
    {
        ArrayList<QuestRewards> temp_quests = DataFactory.receiveQuests();
        txt.setText("\t\t\t" + temp_quests.get(n).get_reward().get(Settings.getINSTANCE().getSelectedGems()[n]).toString().replace("_", " "));
        txt.setTextFill(TEXT_HIGHLIGHT_COLOUR);
        txt.setVisible(true);
        imgview.setImage(new Image(getClass().getResource("gems/" + temp_quests.get(n).get_reward().get(Settings.getINSTANCE().getSelectedGems()[n]) + "_inventory_icon.png").toString()));
        imgview.setVisible(true);
    }

    private int actFinder(String in)
    {
        return Integer.parseInt(in.substring(2,4).replace("_", ""));
    }

    private void startDaemon()
    {
        Runnable r = () ->
        {
            while (true)
            {
                try
                {
                    ClientParser.coreLoop();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
                try
                {
                    Thread.sleep(Settings.getINSTANCE().getPollingRate());
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        Thread t_background_checker = new Thread(r);
        t_background_checker.setDaemon(true);
        t_background_checker.start();
    }

    /**
     * Collection for initialization of several GUI elements.
     */
    private void dataInit()
    {
        loadBanditComboSave();
        actButtonArrayCollector();
        gemSelectorCollector(gemRewardIcon0, gemRewardIcon1, gemRewardIcon2, gemRewardIcon3, gemRewardIcon4, gemRewardIcon5,
                gemRewardIcon6, gemRewardIcon7, gemRewardIcon8, gemRewardIcon9, gemRewardIcon10, gemRewardIcon11, gemRewardIcon12, gemRewardIcon13);
        radioButtonsCollector(radio0, radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, radio9, radio10,
                radio11, radio12, radio13);
        comboCharacterBoxInit();
        characterNameTextFieldInit();
        // Default PoE Path.
        // C:\Program Files\Steam (x86)\SteamApps\common\Path of Exile\logs\Client.txt
        clientPATH.setText(Settings.getINSTANCE().getClientTXT().getAbsolutePath());

        radioButtonInit();

        File f = new File(clientPATH.getText());
        if (!f.exists())
        {
            errorNoClientTxt.setVisible(true);
            browseFiles();
        }
    }

    private void loadBanditComboSave()
    {
        switch (Settings.getINSTANCE().getBanditChoice())
        {
            case 0 : rBanditsKill.setSelected(true); break;
            case 1 : rBanditsOak.setSelected(true); break;
            case 2 : rBanditsKraityn.setSelected(true); break;
            case 3 : rBanditsAlira.setSelected(true); break;
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

    long bandAid_change_fixer = Long.MIN_VALUE;
    private void radioButtonInit()
    {
        // TODO: For some reason this fires twice, it's probably the deselection and then the selection but yeah, need to fix.
        // Using bandaid to fix for now.
        for (RadioButton r : radioButtons)
        {
            r.armedProperty().addListener((observable ->
            {
                int number = Integer.parseInt(r.getId().replace("radio", ""));
                Settings.getINSTANCE().getSelectedGems()[last_used_page] = number;

                bandAid_change_fixer++;
                if (bandAid_change_fixer % 2 == 0)
                {
                    setGemSelectionData(lastUsedPageHandler(true));
                }
            }));
        }
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
                        //System.out.println("We should be loading gem selections now...");
                        // Set Quest Reward Data
                        if (actNum == 1)
                            setGemSelectionData(0);
                        else if (actNum == 2)
                            setGemSelectionData(4);
                        else if (actNum == 3)
                            setGemSelectionData(6);
                        else if (actNum == 4)
                            setGemSelectionData(8);

                        // Hide options
                        if (Flags.getINSTANCE().getActiveWindow() == 0)
                        {
                            optionsAnchorPane.setVisible(false);
                        }

                        gemSelectorAnchorPane.setVisible(true);
                    }
                }
            }
        }
    }

    private int last_used_page = 0;

    /**
     * Sets gem selection data.
     */
    private void setGemSelectionData(int page)
    {
        last_used_page = page;
        // Ask DataFactory to supply data from "CLASS" and "ACT"
        ArrayList<QuestRewards> questRewards = DataFactory.receiveQuests();
        QuestRewards qr = questRewards.get(page);

        // Retrieve Quest Name based on page number


        // Hide All Gem Displays
        hideSelectors();

        Platform.runLater(() ->
        {
            for (int c = 0; c < qr.get_reward().size(); c++)
            {
                Gems g = qr.get_reward().get(c);

                RadioButton temp = radioButtons.get(c);
                temp.setText(g.toString().replace("_", " "));
                temp.setVisible(true);

                if (c == Settings.getINSTANCE().getSelectedGems()[page])
                    temp.setSelected(true);

                ImageView iTemp = gemIcons.get(c);
                //System.out.println(g.toString());
                iTemp.setImage(new Image(getClass().getResource("gems/" + g.toString() + "_inventory_icon.png").toString()));
                iTemp.setVisible(true);
            }

            textQuestName.setText("Select Reward for: \"" + DataFactory.questName(page) + "\"");
        });

    }

    private void hideSelectors()
    {
        for (RadioButton r : radioButtons)
        {
            r.setVisible(false);
            r.setSelected(false);
        }
        for (ImageView i : gemIcons)
            i.setVisible(false);
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
        // Also reset Selections!
        Settings.getINSTANCE().setSelectedGems(new int[]{0,0,0,0,0,0,0,0,0,0});
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
                Settings.getINSTANCE().setBandits(comboBoxThatIsSelected());
                Settings.getINSTANCE().saveData();
                optionsAnchorPane.setVisible(false);
                optionsAnchorPaneMenu.setVisible(false);
                gemSelectorAnchorPane.setVisible(false);
                for (ImageView i : actArray)
                    i.setVisible(false);
                inOptions = false;
                HelperZonePane.setVisible(true);
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

    public void gemRewardBackward(MouseEvent mouseEvent)
    {
        if (mouseEvent.getSource() instanceof ImageView)
        {
            ImageView imgView = (ImageView) mouseEvent.getSource();

            if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED))
                imgView.setImage(new Image(getClass().getResource("ico/collapse1_hl.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED))
                imgView.setImage(new Image(getClass().getResource("ico/collapse1.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED))
                setGemSelectionData(lastUsedPageHandler(false));
        }
    }

    public void gemRewardForward(MouseEvent mouseEvent)
    {
        if (mouseEvent.getSource() instanceof ImageView)
        {
            ImageView imgView = (ImageView) mouseEvent.getSource();

            if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_ENTERED))
                imgView.setImage(new Image(getClass().getResource("ico/collapse0_hl.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_EXITED))
                imgView.setImage(new Image(getClass().getResource("ico/collapse0.png").toString()));
            else if (mouseEvent.getEventType().equals(MouseEvent.MOUSE_CLICKED))
                setGemSelectionData(lastUsedPageHandler(true));
        }
    }

    /**
     * Loops 0 through 9.
     * @param increment wheter to + (true) or - (false)
     */
    private int lastUsedPageHandler(boolean increment)
    {
        if (increment)
        {
            if (last_used_page == 9)
                return 0;
            else
                return ++last_used_page;
        }
        else
        {
            if (last_used_page == 0)
                return 9;
            else
                return --last_used_page;
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
                HelperZonePane.setVisible(false);
                gemSelectorAnchorPane.setVisible(false);
                optionsAnchorPane.setVisible(true);
                act1Button.setVisible(true);
                act2Button.setVisible(true);
                act3Button.setVisible(true);
                act4Button.setVisible(true);
                act5Button.setVisible(true);
                inOptions = true;
            }
        }
    }

    private void gemSelectorCollector(ImageView... imgview_gemIcons)
    {
        gemIcons = new ArrayList<>(Arrays.asList(imgview_gemIcons));
    }

    private void radioButtonsCollector(RadioButton... radiobuttons)
    {
        radioButtons = new ArrayList<>(Arrays.asList(radiobuttons));
    }
}
