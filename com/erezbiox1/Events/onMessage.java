package com.erezbiox1.Events;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Command.CommandManager;
import com.erezbiox1.Core.Main;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.events.EventHandler;
import com.samczsun.skype4j.events.Listener;
import com.samczsun.skype4j.events.chat.message.MessageReceivedEvent;
import com.samczsun.skype4j.exceptions.ConnectionException;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class onMessage implements Listener {

    @EventHandler
    public void MessageReceivedEvent(MessageReceivedEvent event){

        String message = event.getMessage().getContent().asPlaintext();
        String prefix = Main.commandMark;
        CommandManager commandManager = Main.commandManager;

        if(message.startsWith(prefix)){

            System.out.println("Message recived:");
            System.out.println(event.getMessage().getSender().getDisplayName() + ": " + event.getMessage().getContent().asPlaintext());

            if(!message.contains(" ")){

                Command command = commandManager.getCommand(message.replace(prefix, "").toLowerCase());

                if(command == null){

                    Utils.sendMessage("Unknown Command. Type !help for a list of commands.");

                }else{

                    command.onCommand(event.getMessage().getSender(), command, command.getName(), new String[0]);

                }

            }else{

                String[] split = message.replace(prefix, "").split(" ");
                Command command = commandManager.getCommand(split[0].toLowerCase());

                if(command == null){

                    Utils.sendMessage("Unknown Command. Type !help for a list of commands.");

                }else{

                    String[] args = message.replace(prefix + command.getName() + " ", "").split(" ");
                    command.onCommand(event.getMessage().getSender(), command, command.getName(), args);

                }

            }

        }
    }

}
