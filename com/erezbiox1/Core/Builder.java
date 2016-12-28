package com.erezbiox1.Core;

import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.SkypeBuilder;
import com.samczsun.skype4j.exceptions.ChatNotFoundException;
import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.exceptions.InvalidCredentialsException;
import com.samczsun.skype4j.exceptions.NotParticipatingException;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class Builder {

    public static void build(){
        Main.skype = new SkypeBuilder(Main.name).withAllResources().withChat(Main.chatID).withExceptionHandler((errorSource, throwable, willShutdown) -> {
            System.err.println("Error: " + errorSource + " " + throwable + " " + willShutdown);
        }).build();
    }

    public static void login(){
        try {
            Main.skype.login();
            Main.skype.subscribe();
        } catch (InvalidCredentialsException e) {
            System.err.println("Bad login");
        } catch (ConnectionException e) {
            System.err.println("No connection to the server.");
        } catch (NotParticipatingException e) {
            System.err.println("HOW IS THIS POSSIBLE???");
        }
    }

    public static void loadChat(){
        try {
            Main.chat = Main.skype.getOrLoadChat(Main.chatID);
        } catch (ConnectionException e) {
            System.err.println("No connection to the server");
        } catch (ChatNotFoundException e) {
            System.err.println("Invalid ChatID, Chat cannot be found.");
        }
    }

}
