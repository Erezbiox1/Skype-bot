package com.erezbiox1.Core;

import com.samczsun.skype4j.participants.Participant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class Admin {

    public static List<Participant> admins = new ArrayList<>();

    public static void add(Participant user){
        admins.add(user);
    }

    public static boolean isAdmin(Participant user){
        return admins.contains(user);
    }

}
