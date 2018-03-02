package Data;

import java.util.ArrayList;

/**
 *
 */
public class Quests
{
    public static ArrayList<QuestRewards> quests_duelist = new ArrayList<>();
    public static ArrayList<QuestRewards> quests_marauder = new ArrayList<>();
    public static ArrayList<QuestRewards> quests_ranger = new ArrayList<>();
    public static ArrayList<QuestRewards> quests_scion = new ArrayList<>();
    public static ArrayList<QuestRewards> quests_shadow = new ArrayList<>();
    public static ArrayList<QuestRewards> quests_templar = new ArrayList<>();
    public static ArrayList<QuestRewards> quests_witch = new ArrayList<>();

    public static ArrayList<QuestRewards> initQuestsDuelist()
    {
        quests_duelist = new ArrayList<>();

        QuestRewards questRewards = new QuestRewards(0, CharacterClass.Duelist, Gems.Cleave, Gems.Molten_Strike, Gems.Shrapnel_Shot);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(1, CharacterClass.Duelist, Gems.Ancestral_Protector, Gems.Decoy_Totem, Gems.Puncture, Gems.Vigilant_Strike);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(2, CharacterClass.Duelist, Gems.Added_Fire_Damage_Support, Gems.Leap_Slam, Gems.Melee_Splash_Support, Gems.Rallying_Cry, Gems.Blink_Arrow, Gems.Lesser_Multiple_Projectiles_Support, Gems.Maim_Support, Gems.Whirling_Blades);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(3, CharacterClass.Duelist, Gems.Lacerate, Gems.Rain_of_Arrows, Gems.Sweep);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(4, CharacterClass.Duelist, Gems.Enduring_Cry, Gems.Frenzy, Gems.Herald_of_Ash, Gems.Herald_of_Ice, Gems.Herald_of_Thunder);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(5, CharacterClass.Duelist, Gems.Elemental_Damage_with_Attacks_Support, Gems.Faster_Attacks_Support, Gems.Melee_Physical_Damage_Support, Gems.Physical_Projectile_Attack_Damage_Support);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(6, CharacterClass.Duelist, Gems.Blast_Rain, Gems.Charged_Dash, Gems.Cyclone, Gems.Ice_Crash);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(7, CharacterClass.Duelist, Gems.Blood_Magic_Support, Gems.Fortify_Support, Gems.Hypothermia_Support, Gems.Life_Leech_Support);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(8, CharacterClass.Duelist, Gems.Abyssal_Cry , Gems.Summon_Chaos_Golem , Gems.Summon_Flame_Golem , Gems.Summon_Ice_Golem , Gems.Summon_Lightning_Golem , Gems.Summon_Stone_Golem);
        quests_duelist.add(questRewards);

        questRewards = new QuestRewards(9, CharacterClass.Duelist, Gems.Chain_Support, Gems.Greater_Multiple_Projectiles_Support, Gems.Increased_Area_of_Effect_Support, Gems.Multistrike_Support, Gems.Spell_Echo_Support);
        quests_duelist.add(questRewards);

        return quests_duelist;
    }

    public static ArrayList<QuestRewards> initQuestsMarauder()
    {
        quests_marauder = new ArrayList<>();

        QuestRewards questRewards = new QuestRewards(0, CharacterClass.Marauder, Gems.Ground_Slam, Gems.Molten_Strike);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(1, CharacterClass.Marauder, Gems.Ancestral_Protector, Gems.Decoy_Totem, Gems.Molten_Shell, Gems.Vigilant_Strike);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(2, CharacterClass.Marauder, Gems.Added_Fire_Damage_Support, Gems.Leap_Slam, Gems.Melee_Splash_Support, Gems.Rallying_Cry, Gems.Shield_Charge);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(3, CharacterClass.Marauder, Gems.Static_Strike, Gems.Sunder, Gems.Sweep, Gems.Rallying_Cry, Gems.Shield_Charge);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(4, CharacterClass.Marauder, Gems.Enduring_Cry, Gems.Herald_of_Ash, Gems.Herald_of_Ice, Gems.Herald_of_Thunder);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(5, CharacterClass.Marauder, Gems.Elemental_Damage_with_Attacks_Support, Gems.Faster_Attacks_Support, Gems.Melee_Physical_Damage_Support);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(6, CharacterClass.Marauder, Gems.Ancestral_Warchief, Gems.Cyclone, Gems.Earthquake, Gems.Ice_Crash);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(7, CharacterClass.Marauder, Gems.Blood_Magic_Support, Gems.Fortify_Support, Gems.Increased_Duration_Support, Gems.Life_Leech_Support);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(8, CharacterClass.Marauder, Gems.Abyssal_Cry , Gems.Summon_Chaos_Golem , Gems.Summon_Flame_Golem , Gems.Summon_Ice_Golem , Gems.Summon_Lightning_Golem , Gems.Summon_Stone_Golem);
        quests_marauder.add(questRewards);

        questRewards = new QuestRewards(9, CharacterClass.Marauder, Gems.Brutality_Support , Gems.Chain_Support , Gems.Greater_Multiple_Projectiles_Support , Gems.Increased_Area_of_Effect_Support , Gems.Multistrike_Support , Gems.Spell_Echo_Support);
        quests_marauder.add(questRewards);

        return quests_marauder;
    }
    public static ArrayList<QuestRewards> initQuestsRanger()
    {
        quests_ranger = new ArrayList<>();

        QuestRewards questRewards = new QuestRewards(0, CharacterClass.Ranger, Gems.Frost_Blades, Gems.Ice_Shot, Gems.Shrapnel_Shot);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(1, CharacterClass.Ranger, Gems.Bear_Trap, Gems.Caustic_Arrow, Gems.Puncture, Gems.Siege_Ballista);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(2, CharacterClass.Ranger, Gems.Added_Cold_Damage_Support, Gems.Blink_Arrow, Gems.Freeze_Mine, Gems.Lesser_Multiple_Projectiles_Support, Gems.Melee_Splash_Support, Gems.Smoke_Mine, Gems.Whirling_Blades);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(3, CharacterClass.Ranger, Gems.Lightning_Arrow, Gems.Lightning_Strike, Gems.Rain_of_Arrows, Gems.Reave);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(4, CharacterClass.Ranger, Gems.Arctic_Armour, Gems.Frenzy, Gems.Herald_of_Ash, Gems.Herald_of_Ice, Gems.Herald_of_Thunder);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(5, CharacterClass.Ranger, Gems.Elemental_Damage_with_Attacks_Support, Gems.Faster_Attacks_Support, Gems.Physical_Projectile_Attack_Damage_Support);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(6, CharacterClass.Ranger, Gems.Blade_Flurry, Gems.Blast_Rain, Gems.Charged_Dash, Gems.Tornado_Shot, Gems.Wild_Strike);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(7, CharacterClass.Ranger, Gems.Fork_Support, Gems.Fortify_Support, Gems.Hypothermia_Support, Gems.Ice_Bite_Support, Gems.Life_Leech_Support, Gems.Poison_Support);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(8, CharacterClass.Ranger, Gems.Abyssal_Cry , Gems.Summon_Chaos_Golem , Gems.Summon_Flame_Golem , Gems.Summon_Ice_Golem , Gems.Summon_Lightning_Golem , Gems.Summon_Stone_Golem);
        quests_ranger.add(questRewards);

        questRewards = new QuestRewards(9, CharacterClass.Ranger, Gems.Chain_Support, Gems.Greater_Multiple_Projectiles_Support, Gems.Increased_Area_of_Effect_Support, Gems.Multistrike_Support, Gems.Spell_Echo_Support);
        quests_ranger.add(questRewards);

        return quests_ranger;
    }
    public static ArrayList<QuestRewards> initQuestsScion()
    {
        quests_scion = new ArrayList<>();

        QuestRewards questRewards = new QuestRewards(0, CharacterClass.Scion, Gems.Lightning_Tendrils, Gems.Molten_Strike, Gems.Split_Arrow);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(1, CharacterClass.Scion, Gems.Bear_Trap, Gems.Decoy_Totem, Gems.Frost_Bomb, Gems.Vigilant_Strike);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(2, CharacterClass.Scion, Gems.Added_Cold_Damage_Support, Gems.Added_Fire_Damage_Support, Gems.Added_Lightning_Damage_Support, Gems.Blink_Arrow, Gems.Flame_Dash, Gems.Leap_Slam, Gems.Lesser_Multiple_Projectiles_Support, Gems.Melee_Splash_Support, Gems.Unbound_Ailments_Support);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(3, CharacterClass.Scion, Gems.Blade_Vortex, Gems.Ice_Nova, Gems.Rain_of_Arrows, Gems.Scorching_Ray, Gems.Static_Strike);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(4, CharacterClass.Scion, Gems.Arctic_Armour, Gems.Enduring_Cry, Gems.Frenzy, Gems.Herald_of_Ash, Gems.Herald_of_Ice, Gems.Herald_of_Thunder);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(5, CharacterClass.Scion, Gems.Concentrated_Effect_Support, Gems.Deadly_Ailments_Support, Gems.Elemental_Damage_with_Attacks_Support, Gems.Faster_Attacks_Support, Gems.Faster_Casting_Support, Gems.Melee_Physical_Damage_Support, Gems.Physical_Projectile_Attack_Damage_Support);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(6, CharacterClass.Scion, Gems.Blade_Flurry, Gems.Bladefall, Gems.Charged_Dash, Gems.Cyclone, Gems.Flameblast, Gems.Storm_Burst, Gems.Tornado_Shot);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(7, CharacterClass.Scion, Gems.Cold_Penetration_Support, Gems.Efficacy_Support, Gems.Fire_Penetration_Support, Gems.Fortify_Support, Gems.Ice_Bite_Support, Gems.Innervate_Support, Gems.Life_Leech_Support, Gems.Lightning_Penetration_Support);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(8, CharacterClass.Scion, Gems.Abyssal_Cry , Gems.Summon_Chaos_Golem , Gems.Summon_Flame_Golem , Gems.Summon_Ice_Golem , Gems.Summon_Lightning_Golem , Gems.Summon_Stone_Golem);
        quests_scion.add(questRewards);

        questRewards = new QuestRewards(9, CharacterClass.Scion, Gems.Chain_Support, Gems.Decay_Support, Gems.Greater_Multiple_Projectiles_Support, Gems.Immolate_Support, Gems.Increased_Area_of_Effect_Support, Gems.Multistrike_Support, Gems.Spell_Echo_Support);
        quests_scion.add(questRewards);

        return quests_scion;
    }
    public static ArrayList<QuestRewards> initQuestsShadow()
    {
        quests_shadow = new ArrayList<>();

        QuestRewards questRewards = new QuestRewards(0, CharacterClass.Shadow, Gems.Ethereal_Knives, Gems.Fire_Trap, Gems.Frost_Blades, Gems.Freezing_Pulse, Gems.Lightning_Tendrils);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(1, CharacterClass.Shadow, Gems.Bear_Trap, Gems.Contagion, Gems.Detonate_Dead, Gems.Orb_of_Storms, Gems.Riposte);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(2, CharacterClass.Shadow, Gems.Added_Cold_Damage_Support, Gems.Smoke_Mine, Gems.Unearth, Gems.Whirling_Blades, Gems.Added_Lightning_Damage_Support, Gems.Clarity, Gems.Flame_Dash, Gems.Lesser_Multiple_Projectiles_Support, Gems.Void_Manipulation_Support);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(3, CharacterClass.Shadow, Gems.Blade_Vortex, Gems.Essence_Drain, Gems.Fire_Nova_Mine, Gems.Ice_Nova, Gems.Lightning_Trap, Gems.Reave, Gems.Volatile_Dead);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(4, CharacterClass.Shadow, Gems.Arctic_Armour, Gems.Frenzy, Gems.Herald_of_Ash, Gems.Herald_of_Ice, Gems.Herald_of_Thunder);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(5, CharacterClass.Shadow, Gems.Deadly_Ailments_Support, Gems.Faster_Attacks_Support, Gems.Elemental_Focus_Support, Gems.Faster_Casting_Support, Gems.Melee_Physical_Damage_Support, Gems.Trap_and_Mine_Damage_Support);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(6, CharacterClass.Shadow, Gems.Ball_Lightning, Gems.Blade_Flurry, Gems.Bladefall, Gems.Charged_Dash, Gems.Cremation, Gems.Flameblast, Gems.Ice_Trap, Gems.Storm_Burst, Gems.Wild_Strike);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(7, CharacterClass.Shadow, Gems.Cold_Penetration_Support, Gems.Faster_Projectiles_Support, Gems.Fire_Penetration_Support, Gems.Ice_Bite_Support, Gems.Innervate_Support, Gems.Lightning_Penetration_Support, Gems.Poison_Support, Gems.Swift_Affliction_Support);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(8, CharacterClass.Shadow, Gems.Abyssal_Cry , Gems.Summon_Chaos_Golem , Gems.Summon_Flame_Golem , Gems.Summon_Ice_Golem , Gems.Summon_Lightning_Golem , Gems.Summon_Stone_Golem);
        quests_shadow.add(questRewards);

        questRewards = new QuestRewards(9, CharacterClass.Shadow, Gems.Chain_Support, Gems.Greater_Multiple_Projectiles_Support, Gems.Increased_Area_of_Effect_Support, Gems.Multistrike_Support, Gems.Spell_Echo_Support, Gems.Vile_Toxins_Support);
        quests_shadow.add(questRewards);

        return quests_shadow;
    }
    public static ArrayList<QuestRewards> initQuestsTemplar()
    {
        quests_templar = new ArrayList<>();

        QuestRewards questRewards = new QuestRewards(0, CharacterClass.Templar, Gems.Frostbolt, Gems.Molten_Strike, Gems.Lightning_Tendrils, Gems.Magma_Orb);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(1, CharacterClass.Templar, Gems.Flame_Totem, Gems.Ancestral_Protector, Gems.Frost_Bomb, Gems.Molten_Shell, Gems.Vigilant_Strike);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(2, CharacterClass.Templar, Gems.Added_Lightning_Damage_Support, Gems.Added_Fire_Damage_Support, Gems.Chance_to_Ignite_Support, Gems.Clarity, Gems.Flame_Dash, Gems.Leap_Slam, Gems.Melee_Splash_Support, Gems.Rallying_Cry);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(3, CharacterClass.Templar, Gems.Firestorm, Gems.Scorching_Ray, Gems.Static_Strike, Gems.Storm_Call, Gems.Ice_Nova, Gems.Searing_Bond);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(4, CharacterClass.Templar, Gems.Enduring_Cry, Gems.Herald_of_Ash, Gems.Herald_of_Ice, Gems.Herald_of_Thunder);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(5, CharacterClass.Templar, Gems.Concentrated_Effect_Support, Gems.Controlled_Destruction_Support, Gems.Elemental_Focus_Support, Gems.Faster_Casting_Support, Gems.Elemental_Damage_with_Attacks_Support, Gems.Melee_Physical_Damage_Support);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(6, CharacterClass.Templar, Gems.Flameblast, Gems.Ice_Crash, Gems.Shock_Nova, Gems.Shockwave_Totem, Gems.Storm_Burst, Gems.Vortex);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(7, CharacterClass.Templar, Gems.Blasphemy_Support, Gems.Burning_Damage_Support, Gems.Cold_Penetration_Support, Gems.Fortify_Support, Gems.Fire_Penetration_Support, Gems.Lightning_Penetration_Support);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(8, CharacterClass.Templar, Gems.Abyssal_Cry , Gems.Summon_Chaos_Golem , Gems.Summon_Flame_Golem , Gems.Summon_Ice_Golem , Gems.Summon_Lightning_Golem , Gems.Summon_Stone_Golem);
        quests_templar.add(questRewards);

        questRewards = new QuestRewards(9, CharacterClass.Templar, Gems.Ignite_Proliferation_Support, Gems.Chain_Support, Gems.Greater_Multiple_Projectiles_Support, Gems.Increased_Area_of_Effect_Support, Gems.Multistrike_Support , Gems.Spell_Echo_Support);
        quests_templar.add(questRewards);

        return quests_templar;
    }
    public static ArrayList<QuestRewards> initQuestsWitch()
    {
        quests_witch = new ArrayList<>();

        QuestRewards questRewards = new QuestRewards(0, CharacterClass.Witch, Gems.Blight, Gems.Freezing_Pulse, Gems.Lightning_Tendrils, Gems.Magma_Orb, Gems.Raise_Zombie);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(1, CharacterClass.Witch, Gems.Contagion, Gems.Detonate_Dead, Gems.Frost_Bomb, Gems.Orb_of_Storms, Gems.Summon_Raging_Spirit);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(2, CharacterClass.Witch, Gems.Added_Lightning_Damage_Support, Gems.Bodyswap, Gems.Chance_to_Ignite_Support, Gems.Clarity, Gems.Flame_Dash, Gems.Lightning_Warp, Gems.Minion_Damage_Support, Gems.Summon_Skeleton, Gems.Unbound_Ailments_Support, Gems.Void_Manipulation_Support, Gems.Wither);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(3, CharacterClass.Witch, Gems.Arc, Gems.Essence_Drain, Gems.Firestorm, Gems.Flesh_Offering, Gems.Scorching_Ray, Gems.Volatile_Dead);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(4, CharacterClass.Witch, Gems.Arctic_Armour, Gems.Desecrate, Gems.Herald_of_Ice, Gems.Herald_of_Thunder);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(5, CharacterClass.Witch, Gems.Concentrated_Effect_Support, Gems.Controlled_Destruction_Support, Gems.Elemental_Focus_Support, Gems.Faster_Casting_Support, Gems.Minion_Speed_Support);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(6, CharacterClass.Witch, Gems.Ball_Lightning, Gems.Cremation, Gems.Dark_Pact, Gems.Flameblast, Gems.Glacial_Cascade, Gems.Kinetic_Blast, Gems.Raise_Spectre, Gems.Storm_Burst);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(7, CharacterClass.Witch, Gems.Blasphemy_Support, Gems.Burning_Damage_Support, Gems.Cold_Penetration_Support, Gems.Efficacy_Support, Gems.Fire_Penetration_Support, Gems.Lightning_Penetration_Support, Gems.Swift_Affliction_Support);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(8, CharacterClass.Witch, Gems.Abyssal_Cry , Gems.Summon_Chaos_Golem , Gems.Summon_Flame_Golem , Gems.Summon_Ice_Golem , Gems.Summon_Lightning_Golem , Gems.Summon_Stone_Golem);
        quests_witch.add(questRewards);

        questRewards = new QuestRewards(9, CharacterClass.Witch, Gems.Decay_Support , Gems.Chain_Support , Gems.Greater_Multiple_Projectiles_Support , Gems.Increased_Area_of_Effect_Support , Gems.Immolate_Support, Gems.Multistrike_Support , Gems.Spell_Echo_Support);
        quests_witch.add(questRewards);

        return quests_witch;
    }

}
