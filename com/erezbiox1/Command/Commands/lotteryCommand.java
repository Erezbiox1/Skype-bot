package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Core.Admin;
import com.erezbiox1.Core.Main;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.participants.Participant;

import java.util.Collection;

/**
 * Created by Erezbiox1 on 17/01/2017.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class lotteryCommand extends Command {

    public lotteryCommand() {
        super("lottery");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        if(Admin.isAdmin(sender)) {

            Utils.sendMessage("User picked: " + Utils.getRandomUserName(Main.chat.getAllParticipants()));

        }else Utils.sendMessage("Insufficient permission.");
    }
}
