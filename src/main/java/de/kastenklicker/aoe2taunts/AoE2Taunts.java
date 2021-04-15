package de.kastenklicker.aoe2taunts;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author KastenKlicker
 *
 * Main file of the AoE2Taunts File
 */

public class AoE2Taunts extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = this.getLogger();
        logger.info("+ + + + + + + + + + + + + + + +");
        logger.info("+                             +");
        logger.info("+ AoE2Taunts by KastenKlicker +");
        logger.info("+                             +");
        logger.info("+ + + + + + + + + + + + + + + +");

        //Commands from the Commands Class
        Commands commands = new Commands();
        Objects.requireNonNull(this.getCommand("tauntsorg")).setExecutor(commands);

        Objects.requireNonNull(this.getCommand("tauntsdef")).setExecutor(commands);

        Objects.requireNonNull(this.getCommand("taunt")).setExecutor(commands);

    }

}
