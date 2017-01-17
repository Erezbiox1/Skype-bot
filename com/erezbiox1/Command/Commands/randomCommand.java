package com.erezbiox1.Command.Commands;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.participants.Participant;

import javax.swing.*;

/**
 * Created by Erezbiox1 on 17/01/2017.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class randomCommand extends Command {

    public randomCommand() {
        super("random");
    }

    @Override
    public void onCommand(Participant sender, Command command, String Label, String[] args) {
        if(args.length != 2){
            Utils.sendMessage("Invalid arguments, please enter !random <first number> <second number>");
            return;
        }else if(!(Utils.isNumeric(args[0]) || Utils.isNumeric(args[1]))){
            Utils.sendMessage("Invalid arguments, arguments must be a number!");
            return;
        }else {

            Utils.sendMessage("Random Number: " + Utils.randInt(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

        }
    }
}
