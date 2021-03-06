package com.erezbiox1;

import com.erezbiox1.Core.Main;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.exceptions.ConnectionException;
import com.samczsun.skype4j.formatting.Message;
import com.samczsun.skype4j.formatting.RichText;
import com.samczsun.skype4j.formatting.Text;
import com.samczsun.skype4j.participants.Participant;

import java.awt.*;
import java.util.Collection;
import java.util.Random;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class Utils {

    private static final char[] randomLetters = { 'A', 'B', 'C', 'D',
            'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
            'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd',
            'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4',
            '5', '6', '7', '8', '9'};

    public static void sendMessage(String message){
        try {
            Main.chat.sendMessage(message);
        } catch (ConnectionException e) {
            System.out.println("No connection to the server.");
        }
    }

    public static void sendMessage(Message message){
        try {
            Main.chat.sendMessage(message);
        } catch (ConnectionException e) {
            System.out.println("No connection to the server");
        }
    }

    public static void sendMessage(String message, Color color){
        sendMessage(Message.create().with(Text.rich(message).withColor(color)));
    }

    public static int randInt(int min, int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static String randomPassword(int length){

        int index;
        String result = "";

        for(int i = 0; i != length; i++){
            index = randInt(0, randomLetters.length - 1);
            result += randomLetters[index];
        }

        return result;
    }

    public static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }

    public static String getRandomUserName(Collection users) {
        Random rnd = new Random();
        String user = "No one";
        boolean noName = true;

        while(noName) {
            int i = rnd.nextInt(users.size());
            user = ((Participant) users.toArray()[i]).getDisplayName();

            if (!user.equals(Main.name))
                noName = false;
        }

        return user;
    }

    public static void logout(){
        System.out.println("Shutting down...");
        try {
            Main.skype.logout();
        } catch (ConnectionException ignored) {}
        System.exit(0);
    }

}
