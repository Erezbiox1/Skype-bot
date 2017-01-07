package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Core.Admin;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.participants.Participant;

/**
 * Created by Erezbiox1 on 07/01/2017.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class echoCommand extends Command {

    public static boolean echo = false;

    public echoCommand() {
        super("echo");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        if(Admin.isAdmin(sender)) {
            echo = !echo;
            Utils.sendMessage(echo ? "Echo mode has been enabled." : "Echo mode has been disabled.");
        } else
            Utils.sendMessage("Insufficient permission.");
    }
}
