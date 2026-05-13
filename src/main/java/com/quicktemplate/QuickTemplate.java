package com.quicktemplate;

import com.quicktemplate.quicklink.QuickLink;
import com.quicktemplate.util.Msg;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuickTemplate extends JavaPlugin {

    private static QuickTemplate instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        Msg.init(this);

        QuickLink.register(this);

        registerCommand("quicktemplate", (sender, command, label, args) -> {
            if (!sender.hasPermission("quicktemplate.admin")) {
                Msg.send(sender, "no-permission");
                return true;
            }
            if (args.length > 0 && args[0].equalsIgnoreCase("reload")) {
                reloadConfig();
                Msg.send(sender, "reloaded");
                return true;
            }
            Msg.send(sender, "&7Usage: /qt reload");
            return true;
        });

        getLogger().info("QuickTemplate enabled. Server: " + Bukkit.getBukkitVersion());
    }

    @Override
    public void onDisable() {
        QuickLink.unregister();
    }

    private void registerCommand(String name, org.bukkit.command.CommandExecutor executor) {
        PluginCommand cmd = getCommand(name);
        if (cmd != null) {
            cmd.setExecutor(executor);
            if (executor instanceof TabCompleter tc) cmd.setTabCompleter(tc);
        }
    }

    public static QuickTemplate get() { return instance; }
}
