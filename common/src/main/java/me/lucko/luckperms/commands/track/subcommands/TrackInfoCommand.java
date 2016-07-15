package me.lucko.luckperms.commands.track.subcommands;

import me.lucko.luckperms.LuckPermsPlugin;
import me.lucko.luckperms.commands.Sender;
import me.lucko.luckperms.commands.Util;
import me.lucko.luckperms.commands.track.TrackSubCommand;
import me.lucko.luckperms.constants.Message;
import me.lucko.luckperms.constants.Permission;
import me.lucko.luckperms.tracks.Track;

import java.util.List;

public class TrackInfoCommand extends TrackSubCommand {
    public TrackInfoCommand() {
        super("info", "Gives info about the track", "/perms track <track> info", Permission.TRACK_INFO);
    }

    @Override
    protected void execute(LuckPermsPlugin plugin, Sender sender, Track track, List<String> args) {
        Message.TRACK_INFO.send(sender, track.getName(), Util.listToArrowSep(track.getGroups()));
    }

    @Override
    public boolean isArgLengthInvalid(int argLength) {
        return false;
    }
}