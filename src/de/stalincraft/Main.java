//Before editing please read the README.md and LICENSE on my Github Repository. https://github.com/KastenKlicker/AoE2Taunts
package de.stalincraft;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author KastenKlicker
 */
public class Main extends JavaPlugin {
     @Override
    public void onEnable() {
    // UpdateChecker
        Logger logger = this.getLogger();
 
        new UpdateChecker(this, 76955).getVersion(version -> {
            if (this.getDescription().getVersion().equalsIgnoreCase(version)) {
                logger.info("There is not a new update available.");
            } else {
                logger.info("There is a new update available.");
            }
        });
        //Commands from Taunts Class
        this.getCommand("1").setExecutor(new Taunts());
        this.getCommand("2").setExecutor(new Taunts());
        this.getCommand("3").setExecutor(new Taunts());
        this.getCommand("4").setExecutor(new Taunts());
        this.getCommand("5").setExecutor(new Taunts());
        this.getCommand("6").setExecutor(new Taunts());
        this.getCommand("7").setExecutor(new Taunts());
        this.getCommand("8").setExecutor(new Taunts());
        this.getCommand("9").setExecutor(new Taunts());
        this.getCommand("10").setExecutor(new Taunts());
        this.getCommand("11").setExecutor(new Taunts());
        this.getCommand("12").setExecutor(new Taunts());
        this.getCommand("13").setExecutor(new Taunts());
        this.getCommand("14").setExecutor(new Taunts());
        this.getCommand("15").setExecutor(new Taunts());
        this.getCommand("16").setExecutor(new Taunts());
        this.getCommand("17").setExecutor(new Taunts());
        this.getCommand("18").setExecutor(new Taunts());
        this.getCommand("19").setExecutor(new Taunts());
        this.getCommand("20").setExecutor(new Taunts());
        this.getCommand("21").setExecutor(new Taunts());
        this.getCommand("22").setExecutor(new Taunts());
        this.getCommand("23").setExecutor(new Taunts());
        this.getCommand("24").setExecutor(new Taunts());
        this.getCommand("25").setExecutor(new Taunts());
        this.getCommand("26").setExecutor(new Taunts());
        this.getCommand("27").setExecutor(new Taunts());
        this.getCommand("28").setExecutor(new Taunts());
        this.getCommand("29").setExecutor(new Taunts());
        this.getCommand("30").setExecutor(new Taunts());
        this.getCommand("31").setExecutor(new Taunts());
        this.getCommand("32").setExecutor(new Taunts());
        this.getCommand("33").setExecutor(new Taunts());
        this.getCommand("34").setExecutor(new Taunts());
        this.getCommand("35").setExecutor(new Taunts());
        this.getCommand("36").setExecutor(new Taunts());
        this.getCommand("37").setExecutor(new Taunts());
        this.getCommand("38").setExecutor(new Taunts());
        this.getCommand("39").setExecutor(new Taunts());
        this.getCommand("40").setExecutor(new Taunts());
        this.getCommand("41").setExecutor(new Taunts());
        this.getCommand("42").setExecutor(new Taunts());
        
        //Taunts from the Definitv Edition
        this.getCommand("43").setExecutor(new Taunts());
        this.getCommand("44").setExecutor(new Taunts());
        this.getCommand("45").setExecutor(new Taunts());
        this.getCommand("46").setExecutor(new Taunts());
        this.getCommand("47").setExecutor(new Taunts());
        this.getCommand("48").setExecutor(new Taunts());
        this.getCommand("49").setExecutor(new Taunts());
        this.getCommand("50").setExecutor(new Taunts());
        this.getCommand("51").setExecutor(new Taunts());
        this.getCommand("52").setExecutor(new Taunts());
        this.getCommand("53").setExecutor(new Taunts());
        this.getCommand("54").setExecutor(new Taunts());
        this.getCommand("55").setExecutor(new Taunts());
        this.getCommand("56").setExecutor(new Taunts());
        this.getCommand("57").setExecutor(new Taunts());
        this.getCommand("58").setExecutor(new Taunts());
        this.getCommand("59").setExecutor(new Taunts());
        this.getCommand("60").setExecutor(new Taunts());
        this.getCommand("61").setExecutor(new Taunts());
        this.getCommand("62").setExecutor(new Taunts());
        this.getCommand("63").setExecutor(new Taunts());
        this.getCommand("64").setExecutor(new Taunts());
        this.getCommand("65").setExecutor(new Taunts());
        this.getCommand("66").setExecutor(new Taunts());
        this.getCommand("67").setExecutor(new Taunts());
        this.getCommand("68").setExecutor(new Taunts());
        this.getCommand("69").setExecutor(new Taunts());
        this.getCommand("70").setExecutor(new Taunts());
        this.getCommand("71").setExecutor(new Taunts());
        this.getCommand("72").setExecutor(new Taunts());
        this.getCommand("73").setExecutor(new Taunts());
        this.getCommand("74").setExecutor(new Taunts());
        this.getCommand("75").setExecutor(new Taunts());
        this.getCommand("76").setExecutor(new Taunts());
        this.getCommand("77").setExecutor(new Taunts());
        this.getCommand("78").setExecutor(new Taunts());
        this.getCommand("79").setExecutor(new Taunts());
        this.getCommand("80").setExecutor(new Taunts());
        this.getCommand("81").setExecutor(new Taunts());
        this.getCommand("82").setExecutor(new Taunts());
        this.getCommand("83").setExecutor(new Taunts());
        this.getCommand("84").setExecutor(new Taunts());
        this.getCommand("85").setExecutor(new Taunts());
        this.getCommand("86").setExecutor(new Taunts());
        this.getCommand("87").setExecutor(new Taunts());
        this.getCommand("88").setExecutor(new Taunts());
        this.getCommand("89").setExecutor(new Taunts());
        this.getCommand("90").setExecutor(new Taunts());
        this.getCommand("91").setExecutor(new Taunts());
        this.getCommand("92").setExecutor(new Taunts());
        this.getCommand("93").setExecutor(new Taunts());
        this.getCommand("94").setExecutor(new Taunts());
        this.getCommand("95").setExecutor(new Taunts());
        this.getCommand("96").setExecutor(new Taunts());
        this.getCommand("97").setExecutor(new Taunts());
        this.getCommand("98").setExecutor(new Taunts());
        this.getCommand("99").setExecutor(new Taunts());
        this.getCommand("100").setExecutor(new Taunts());
        this.getCommand("101").setExecutor(new Taunts());
        this.getCommand("102").setExecutor(new Taunts());
        this.getCommand("103").setExecutor(new Taunts());
        this.getCommand("104").setExecutor(new Taunts());
        this.getCommand("105").setExecutor(new Taunts());
        
        //Command from Help Class
        this.getCommand("taunts").setExecutor(new Help());
    }

    /**
     *
     */
    @Override
    public void onDisable() {
    
    }
}
