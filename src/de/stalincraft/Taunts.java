package de.stalincraft;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author KastenKlicker
 */
public class Taunts implements CommandExecutor{

    /**
     *
     * @param sender
     * @param command
     * @param label
     * @param args
     * @return
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        //Commands
        
        if (label.equalsIgnoreCase("1")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Yes.");
	}	
        if (label.equalsIgnoreCase("2")) {
            Bukkit.broadcastMessage("<" + sender.getName() +"> " + "No.");
	}
        if (label.equalsIgnoreCase("3")) {
            Bukkit.broadcastMessage("<" + sender.getName() + "> " + "Food please.");
        }
         if (label.equalsIgnoreCase("4")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Wood please.");
	}	
         if (label.equalsIgnoreCase("5")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Gold please.");
	}
         if (label.equalsIgnoreCase("6")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Stone please.");
	}
         if (label.equalsIgnoreCase("7")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Ahhhh!");
	}
        if (label.equalsIgnoreCase("8")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "All hail, king of the losers!");
	}
        if (label.equalsIgnoreCase("9")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Ooooh!");
	}
        if (label.equalsIgnoreCase("10")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "I'll beat you back to Age of Empires.");
	}
        if (label.equalsIgnoreCase("11")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Hiahiahiahia!");
	}
        if (label.equalsIgnoreCase("12")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Ah! being rushed.");
	}
        if (label.equalsIgnoreCase("13")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Sure, blame it on your ISP.");
	}
        if (label.equalsIgnoreCase("14")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Start the game already!");
	}
        if (label.equalsIgnoreCase("15")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Don't point that thing on me!");
	}
        if (label.equalsIgnoreCase("16")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Enemy sighted!");
	}
        if (label.equalsIgnoreCase("17")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "It is good to be the king.");
	}
        if (label.equalsIgnoreCase("18")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Monk! I need a monk!");
	}
        if (label.equalsIgnoreCase("19")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Long tine, no siege.");
	}
        if (label.equalsIgnoreCase("20")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "My granny could better scrap than that.");
	}
        if (label.equalsIgnoreCase("21")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Nice town, I'll take it.");
	}
        if (label.equalsIgnoreCase("22")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Quit touching me!");
	}
        if (label.equalsIgnoreCase("23")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Raiding party!");
	}
        if (label.equalsIgnoreCase("24")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Dadgum.");
	}
        if (label.equalsIgnoreCase("25")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Eh, smite me.");
	}
        if (label.equalsIgnoreCase("26")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "The wonder, the wonder, the... no!");
	}
        if (label.equalsIgnoreCase("27")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "You played two hours to die like this?");
	}
        if (label.equalsIgnoreCase("28")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Yeah, well, you should see the other guy.");
	}
        if (label.equalsIgnoreCase("29")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Roggan.");
	}
        if (label.equalsIgnoreCase("30")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Wololo.");
	}
        if (label.equalsIgnoreCase("31")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack an enemy now.");
	}
        if (label.equalsIgnoreCase("32")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Cease creating extra villagers.");
	}
        if (label.equalsIgnoreCase("33")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Create extra villagers.");
	}
        if (label.equalsIgnoreCase("34")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a navy.");
	}
        if (label.equalsIgnoreCase("35")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Stop building a navy.");
	}
        if (label.equalsIgnoreCase("36")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Wait for my signal to attack.");
	}
        if (label.equalsIgnoreCase("37")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a wonder.");
	}
        if (label.equalsIgnoreCase("38")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Give me your extra resources.");
	}
        if (label.equalsIgnoreCase("39")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "*dingdingding*");
	}
        if (label.equalsIgnoreCase("40")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "*dong*");
	}
        if (label.equalsIgnoreCase("41")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "*phuuuuu*");
	}
        if (label.equalsIgnoreCase("42")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "What age are you in?");
	}
        
        // Taunts from the Definitiv Edition
        if (label.equalsIgnoreCase("43")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "What is your strategy?");
	}
        if (label.equalsIgnoreCase("44")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "How many resources do you have?");
	}
        if (label.equalsIgnoreCase("45")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Retreat now!");
	}
        if (label.equalsIgnoreCase("46")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Flare the location of your army.");
	}
        if (label.equalsIgnoreCase("47")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack in direction of the flared location.");
	}
        if (label.equalsIgnoreCase("48")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "I'm being attacked, please help!");
	}
        if (label.equalsIgnoreCase("49")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a forward base at the flared location.");
	}
        if (label.equalsIgnoreCase("50")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a fortification at the flared location.");
	}
        if (label.equalsIgnoreCase("51")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Keep your army close to mine and fight with me.");
	}
        if (label.equalsIgnoreCase("52")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a market at the flared location. ");
	}
        if (label.equalsIgnoreCase("53")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Rebuild your base at the flared location.");
	}
        if (label.equalsIgnoreCase("54")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a wall between the two flared locations.");
	}
        if (label.equalsIgnoreCase("55")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Build a wall around your town.");
	}
        if (label.equalsIgnoreCase("56")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Train units which counter the enemy's army.");
	}
        if (label.equalsIgnoreCase("57")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Stop training counter units.");
	}
        if (label.equalsIgnoreCase("58")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Prepare to send me all your resources so I can vanquish our foes!");
	}
        if (label.equalsIgnoreCase("59")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Stop sending me extra resources.");
	}
        if (label.equalsIgnoreCase("60")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Prepare to train a large army, I will send you as many resources as I can spare");
	}
        if (label.equalsIgnoreCase("61")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 1!");
	}
        if (label.equalsIgnoreCase("62")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 2!");
	}
        if (label.equalsIgnoreCase("63")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 3!");
	}
        if (label.equalsIgnoreCase("64")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 4!");
	}
        if (label.equalsIgnoreCase("65")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 5!");
	}
        if (label.equalsIgnoreCase("66")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 6!");
	}
        if (label.equalsIgnoreCase("67")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 7!");
	}
        if (label.equalsIgnoreCase("68")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack player 8!");
	}
        if (label.equalsIgnoreCase("69")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Delete the object on the flared location.");
	}
        if (label.equalsIgnoreCase("70")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Delete your excess villagers.");
	}
        if (label.equalsIgnoreCase("71")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Delete excess warships.");
	}
        if (label.equalsIgnoreCase("72")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Focus on training infantry units.");
	}
        if (label.equalsIgnoreCase("73")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Focus on training cavalry units.");
	}
        if (label.equalsIgnoreCase("74")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Focus on training ranged units.");
	}
        if (label.equalsIgnoreCase("75")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Focus on training warships.");
	}
        if (label.equalsIgnoreCase("76")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Militia.");
	}
        if (label.equalsIgnoreCase("77")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Archers.");
	}
        if (label.equalsIgnoreCase("78")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Skirmishers.");
	}
        if (label.equalsIgnoreCase("79")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with a mix of Archers and Skirmishers.");
	}
        if (label.equalsIgnoreCase("80")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Scout Cavalry.");
	}
        if (label.equalsIgnoreCase("81")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Men-at-Arms.");
	}
        if (label.equalsIgnoreCase("82")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Eagle Scouts.");
	}
        if (label.equalsIgnoreCase("83")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Towers.");
	}
        if (label.equalsIgnoreCase("84")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Crossbowmen.");
	}
        if (label.equalsIgnoreCase("85")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Cavalry Archers.");
	}
        if (label.equalsIgnoreCase("86")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Unique Units.");
	}
        if (label.equalsIgnoreCase("87")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Knights.");
	}
        if (label.equalsIgnoreCase("88")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Battle Elephants.");
	}
        if (label.equalsIgnoreCase("89")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Scorpions.");
	}
        if (label.equalsIgnoreCase("90")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Monks.");
	}
        if (label.equalsIgnoreCase("91")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Monks and Mangonels.");
	}
        if (label.equalsIgnoreCase("92")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Eagle Warriors.");
	}
        if (label.equalsIgnoreCase("93")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Halberdiers and Rams.");
	}
        if (label.equalsIgnoreCase("94")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Elite Eagle Warriors.");
	}
        if (label.equalsIgnoreCase("95")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Arbalests.");
	}
        if (label.equalsIgnoreCase("96")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Champions.");
	}
        if (label.equalsIgnoreCase("97")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Galleys.");
	}
        if (label.equalsIgnoreCase("98")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Fire Galleys.");
	}
        if (label.equalsIgnoreCase("99")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Demolition Rafts.");
	}
        if (label.equalsIgnoreCase("100")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with War Galleys.");
	}
        if (label.equalsIgnoreCase("101")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Fire Ships.");
	}
        if (label.equalsIgnoreCase("102")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Attack the enemy with Unique Warships.");
	}
        if (label.equalsIgnoreCase("103")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Use an Onager to cut down trees at the flared location.");
	}
        if (label.equalsIgnoreCase("104")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "Don't resign!");
	}
        if (label.equalsIgnoreCase("105")) {
            Bukkit.broadcastMessage("<" + sender.getName()+ "> " + "You can resign again.");
	}
        
        return true;
        
    }
    
}
