package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Core.Admin;
import com.erezbiox1.Core.Main;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.participants.Participant;

import java.util.Objects;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class loginCommand extends Command{


    public loginCommand() {
        super("login");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        if(Admin.isAdmin(sender)){
            Utils.sendMessage("You are already an admin.");
            return;
        }

        if(args == null || args.length != 1){
            Utils.sendMessage("Invalid Arguments");
            return;
        }

        if(Objects.equals(args[0], Main.password)){
            Admin.add(sender);
            Utils.sendMessage("Logged on successfully.");
        }else Utils.sendMessage("Invalid Login.");
    }
}
