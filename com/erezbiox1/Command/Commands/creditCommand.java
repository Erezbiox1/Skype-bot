package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.participants.Participant;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class creditCommand extends Command {

    public creditCommand() {
        super("credit");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        Utils.sendMessage("The best man ever, Erezbiox1!");
    }
}
