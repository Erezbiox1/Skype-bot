package com.erezbiox1;

import com.erezbiox1.Core.Main;
import com.samczsun.skype4j.exceptions.ConnectionException;

import java.util.Random;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class Utils {

    public static void sendMessage(String message){
        try {
            Main.chat.sendMessage(message);
        } catch (ConnectionException e) {
            System.out.println("No connection to the server.");
        }
    }

    public static int randInt(int min, int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static void logout(){
        try {
            Main.skype.logout();
        } catch (ConnectionException ignored) {}
        System.exit(0);
    }

}
