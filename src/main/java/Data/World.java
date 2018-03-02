package Data;

import java.util.ArrayList;

import static Data.ActZones.*;

/**
 *
 */
public final class World
{
    private final static World INSTANCE = new World();

    public static ArrayList<Zone> zones;

    private World()
    {
        zones = new ArrayList<>();
        act1Data();        act2Data();        act3Data();
        act4Data();        act5Data();        act6Data();
        act7Data();        act8Data();        act9Data();
        act10Data();       act11Data();
    }

    public Zone findZone(String code)
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('z');
        stringBuilder.append(code);

        for (Zone z : zones)
        {
            if(stringBuilder.toString().equals(z.getCode().toString()))
            {
                return z;
            }
        }
        return new Zone(z2_10_10, "Vilenta", false, false, true, false, false);
    }

    public static World getINSTANCE()
    {
        return INSTANCE;
    }

    private static void act1Data()
    {
        Zone z = new Zone(z1_1_1, "The Twilight Strand", true, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_town, "Lioneye's Watch", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_2, "The Coast", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_2a, "The Tidal Island", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_3, "The Mud Flats", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z1_1_3a, "The Fetid Pool", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z1_1_4_1, "The Submerged Passage", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z1_1_4_0, "The Flooded Depths", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z1_1_5, "The Ledge", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_6, "The Climb", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_7_1, "The Lower Prison", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z1_1_7_2, "The Upper Prison", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_8, "Prisoner's Gate", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_9, "The Ship Graveyard", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z1_1_9a, "The Ship Graveyard Cave", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z1_1_11_1, "The Cavern of Wrath", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_1_11_2, "The Cavern of Anger", false, false, false, false, false);
        zones.add(z);
    }

    private static void act2Data()
    {
        Zone z;
        z = new Zone(z1_2_1, "The Southern Forest", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_town, "The Forest Encampment", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_2, "The Old Fields", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z1_2_2a, "The Den", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z1_2_3, "The Crossroads", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_4, "The Broken Bridge", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_15, "The Fellshrine Ruins", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_5_2, "The Crypt Level 2", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_5_1, "The Crypt Level 1", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z1_2_6_1, "The Chamber of Sins Level 1", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_6_2, "The Chamber of Sins Level 2", false, false, false, false, true);
        zones.add(z);
        z = new Zone(z1_2_7, "The Riverways", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_9, "The Western Forest", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z1_2_10, "The Weaver's Chambers", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_12, "The Wetlands", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_11, "The Vaal Ruins", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_8, "The Northern Forest", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_13, "The Dread Thicket", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_14_2, "The Caverns", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_2_14_3, "The Ancient Pyramid", false, false, false, false, false);
        zones.add(z);
    }

    private static void act3Data()
    {
        Zone z;
        z = new Zone(z1_3_1, "The City of Sarn", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_town, "The Sarn Encampment", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_2, "The Slums", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_3_1, "The Crematorium", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z1_3_10_1, "The Sewers", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_5, "The Marketplace", false, true, false, true, false);
        zones.add(z);
        z = new Zone(z1_3_6, "The Catacombs", false, false, false, false, true);
        zones.add(z);
        z = new Zone(z1_3_7, "The Battlefront", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_9, "The Docks", false, true, false, true, false);
        zones.add(z);
        z = new Zone(z1_3_8_1, "The Solaris Temple Level 1", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_8_2, "The Solaris Temple Level 2", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_13, "The Ebony Barracks", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_14_1, "The Lunaris Temple Level 1", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_14_2, "The Lunaris Temple Level 2", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_15, "The Imperial Gardens", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z1_3_17_1, "The Library", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_17_2, "The Archives", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_18_1, "The Sceptre of God", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_3_18_2, "The Upper Sceptre of God", false, false, false, false, false);
        zones.add(z);
    }

    private static void act4Data()
    {
        Zone z;
        z = new Zone(z1_4_1, "The Aqueduct", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_town, "Highgate", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_2, "The Dried Lake", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_7, "The Ascent", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_3_1, "The Mines Level 1", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_3_2, "The Mines Level 2", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z1_4_3_3, "The Crystal Veins", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_4_1, "Kaom's Dream", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_4_3, "Kaom's Stronghold", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_5_1, "Daresso's Dream", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_5_2, "The Grand Arena", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_6_1, "The Belly of the Beast Level 1", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_6_2, "The Belly of the Beast Level 2", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_4_6_3, "The Harvest", false, true, false, false, false);
        zones.add(z);
    }

    private static void act5Data()
    {
        Zone z;
        z = new Zone(z1_5_1, "The Slave Pens", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_town, "Overseer's Tower", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_2, "The Control Blocks", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z1_5_3, "Oriath Square", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_4, "The Templar Courts", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_5, "The Chamber of Innocence", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_4b, "The Torched Courts", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_3b, "The Ruined Square", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_6, "The Ossuary", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z1_5_7, "The Reliquary", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z1_5_8, "The Cathedral Rooftop", false, true, false, false, false);
        zones.add(z);
    }

    private static void act6Data()
    {
        Zone z;
        z = new Zone(z2_6_town, "Lioneye's Watch", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_1, "The Twilight Strand", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z2_6_2, "The Coast", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_3, "The Tidal Island", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z2_6_4, "The Mud Flats", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_5, "The Karui Fortress", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_6, "The Ridge", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_7_1, "The Lower Prison", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z2_6_7_2, "Shavronne's Tower", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_8, "Prisoner's Gate", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z2_6_9, "The Western Forest", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_10, "The Riverways", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_11, "The Wetlands", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z2_6_12, "The Southern Forest", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_13, "The Cavern of Anger", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_14, "The Beacon", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_6_15, "The Brine King's Reef", false, true, false, false, false);
        zones.add(z);
    }

    private static void act7Data()
    {
        Zone z;
        z = new Zone(z2_7_town, "The Bridge Encampment", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_1, "The Broken Bridge", false, false, false, true, false);
        zones.add(z);
        z = new Zone(z2_7_2, "The Crossroads", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_3, "The Fellshrine Ruins", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_4, "The Crypt", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z2_7_5_1, "The Chamber of Sins Level 1", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_5_2, "The Chamber of Sins Level 2", false, false, false, false, true);
        zones.add(z);
        z = new Zone(z2_7_5_map, "Maligaro's Sanctum", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_6, "The Den", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_7, "The Ashen Fields", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_8, "The Northern Forest", false, true, false, true, false);
        zones.add(z);
        z = new Zone(z2_7_9, "The Dread Thicket", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z2_7_10, "The Causeway", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z2_7_11, "The Vaal City", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_12_1, "The Temple of Decay Level 1", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_7_12_2, "The Temple of Decay Level 2", false, false, false, false, false);
        zones.add(z);
    }

    private static void act8Data()
    {
        Zone z;
        z = new Zone(z2_8_1, "The Sarn Ramparts", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_town, "The Sarn Encampment", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_2_1, "The Toxic Conduits", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_2_2, "Doedre's Cesspool", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_3, "The Grand Promenade", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_4, "The High Gardens", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z2_8_5, "The Bath House", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z2_8_6, "The Lunaris Concourse", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_7_1_, "The Lunaris Temple Level 1", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_7_2, "The Lunaris Temple Level 2", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_8, "The Quay area", false, false, true, false, false);
        zones.add(z);
        z = new Zone(z2_8_9, "The Grain Gate", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z2_8_10, "The Imperial Fields", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_11, "The Solaris Concourse", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_12_1, "The Solaris Temple Level 1", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_12_2, "The Solaris Temple Level 2", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_8_13, "The Harbour Bridge", false, false, false, false, false);
        zones.add(z);
    }

    private static void act9Data()
    {
        Zone z;
        z = new Zone(z2_9_1, "The Blood Aqueduct", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_town, "Highgate", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_2, "The Descent", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_3, "The Vastiri Desert", false, true, false, true, false);
        zones.add(z);
        z = new Zone(z2_9_4, "The Oasis", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_5, "The Foothills", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_6, "The Boiling Lake", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_7, "The Tunnel", false, true, false, false, true);
        zones.add(z);
        z = new Zone(z2_9_8, "The Quarry", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z2_9_9, "The Refinery", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_10_1, "The Belly of the Beast", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_9_10_2, "The Rotting Core", false, false, false, false, false);
        zones.add(z);
    }

    private static void act10Data()
    {
        Zone z;
        z = new Zone(z2_10_town, "Oriath Docks", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_1, "The Cathedral Rooftop", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_2, "The Ravaged Square", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_3, "The Torched Courts", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_4, "The Desecrated Chambers", false, true, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_5, "The Canals", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_6, "The Feeding Trough", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_7, "The Cathedral Rooftop", false, false, false, false, false);
        zones.add(z);
        z = new Zone(z2_10_8, "The Reliquary", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z2_10_9, "The Ossuary", false, false, false, false, true);
        zones.add(z);
        z = new Zone(z2_10_10, "Vilenta", false, false, true, false, false);
        zones.add(z); // Upcoming 3.2.0 boss area?
    }

    private static void act11Data()
    {
        Zone z;
        z = new Zone(z2_11_town, "Oriath", false, true, true, false, false);
        zones.add(z);
        z = new Zone(z2_11_lab, "The Templar Laboratory", false, true, false, false, false);
        zones.add(z);
    }
}
