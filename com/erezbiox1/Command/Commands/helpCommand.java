package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Command.CommandManager;
import com.erezbiox1.Core.Main;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.participants.Participant;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class helpCommand extends Command {

    public helpCommand(){
        super("help");
    }

    static String help = "~~~~~~~~~~~\nBioBot V2.0 By erezbiox1\n~~~~~~~~~~~\n";

    public static void init(CommandManager manager){
        manager.getCommandNames().forEach((name) -> {
            help += Main.commandMark + name + "\n";
        });

        help += "~~~~~~~~~~~";
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        Utils.sendMessage(help);
    }
}
