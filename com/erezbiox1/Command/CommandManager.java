package com.erezbiox1.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class CommandManager {

    private Map<String, Command> commands;

    public CommandManager(){
        this.commands = new HashMap<String, Command>();
    }

    public void registerCommand(Command command){
        commands.put(command.getName(), command);
    }

    public Command getCommand(String name){
        return commands.get(name);
    }

}
