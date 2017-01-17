package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.participants.Participant;

/**
 * Created by Erezbiox1 on 17/01/2017.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class shaharCommand extends Command {

    public shaharCommand() {
        super("shahar");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        Utils.sendMessage("Is boosted.");
    }
}
