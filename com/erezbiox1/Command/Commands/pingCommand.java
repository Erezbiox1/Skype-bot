package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.participants.Participant;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class pingCommand extends Command {

    public pingCommand() {
        super("ping");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        Utils.sendMessage("Pong!");
    }
}
