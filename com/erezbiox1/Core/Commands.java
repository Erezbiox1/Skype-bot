package com.erezbiox1.Core;

import com.erezbiox1.Command.Command;
import com.erezbiox1.Command.Commands.*;
import com.erezbiox1.Events.onMessage;
import com.samczsun.skype4j.events.Listener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class Commands {

    static List<Command> commands = new ArrayList<>(
            Arrays.asList(
                    new helpCommand(),
                    new creditCommand(),
                    new stopCommand(),
                    new pingCommand(),
                    new bananaCommand(),
                    new loginCommand(),
                    new echoCommand()
            )
    );

    public static void registerEvents(){
        for(Command command: commands) {
            Main.commandManager.registerCommand(command);
        }
    }

}
