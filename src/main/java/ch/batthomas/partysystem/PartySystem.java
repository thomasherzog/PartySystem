package ch.batthomas.partysystem;

import ch.batthomas.partysystem.command.PartyCommand;
import ch.batthomas.partysystem.manager.PartyManager;
import net.md_5.bungee.api.plugin.Plugin;

/**
 *
 * @author batthomas
 */
public class PartySystem extends Plugin {

    private String prefix;
    private PartyManager pm;

    @Override
    public void onEnable() {
        prefix = "§l§5Party §r§8| §7";
        registerCommands();
        registerManagers();
    }

    private void registerListeners() {

    }

    private void registerCommands() {
        getProxy().getPluginManager().registerCommand(this, new PartyCommand(this));
    }

    private void registerManagers() {
        pm = new PartyManager(this);
    }

    public String getPrefix() {
        return prefix;
    }

    public PartyManager getPartyManager() {
        return pm;
    }
}
