package com.erezbiox1.Core;

import com.erezbiox1.Command.CommandManager;
import com.erezbiox1.Utils;
import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.events.EventDispatcher;
import com.samczsun.skype4j.internal.Endpoints;

import java.util.Scanner;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class Main {

    //Declaring Main Vars ( skype and chat )
    public static Skype skype;
    public static Chat chat;
    public static EventDispatcher dispatcher;
    public static CommandManager commandManager;

    //Initializing Config Vars
    public static final String name = "BioBot";
    public static final String chatID = "19:d48567e4caa94de488ed0913e7313d28@thread.skype";
    public static final String commandMark = "!";
    public static final boolean randomPassword = true;
    public static String password = "Pizza123";

    public static void main(String[] args){
        System.out.println("Building...");
        Builder.build();

        System.out.println("Logging In...");
        Builder.login();

        System.out.println("Loading Chat...");
        Builder.loadChat();

        System.out.println("Registering Events...");
        dispatcher = skype.getEventDispatcher();
        Events.registerEvents();

        System.out.println("Generating password...");
        generatePassword();

        System.out.println("Password: " + password);

        System.out.println("Registering Commands...");
        commandManager = new CommandManager();
        Commands.registerEvents();



        System.out.println("Sending Test Message...");
        Utils.sendMessage("Hello world, Please enter !help to view commands.");

        System.out.println("Bot is online, Waiting... \n");

        while(true){
            Utils.sendMessage(new Scanner(System.in).nextLine());
        }
    }

    public static void generatePassword(){
        if(randomPassword)
            password = Utils.randomPassword(8);
    }
}
