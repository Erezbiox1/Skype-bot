package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Core.Admin;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.participants.Participant;

/**
 * Created by Erezbiox1 on 07/01/2017.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class adminsCommand extends Command {

    public adminsCommand() {
        super("admins");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {

        if(Admin.admins.isEmpty()){
            Utils.sendMessage("There is no admins. Use !login to login as an admin.");
            return;
        }

        String message = "The admins are: ";

        for(Participant admin: Admin.admins){
            message += admin.getDisplayName() + ", ";
        }

        Utils.sendMessage(message);
    }
}
