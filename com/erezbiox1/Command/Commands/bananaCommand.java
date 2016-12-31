package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.participants.Participant;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class bananaCommand extends Command {

    public bananaCommand() {
        super("banana");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        int random = Utils.randInt(1, 5);
        switch (random){
            case 1:
                Utils.sendMessage("Banana is Red!");
                break;
            case 2:
                Utils.sendMessage("Banana is Blue!");
                break;
            case 3:
                Utils.sendMessage("Banana is Green!");
                break;
            case 4:
                Utils.sendMessage("Banana is Yellow!");
                break;
            case 5:
                Utils.sendMessage("Banana is Null! ( OMGGGG )");
                break;
        }
    }
}
