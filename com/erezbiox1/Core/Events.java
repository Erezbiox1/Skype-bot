package com.erezbiox1.Core;

import com.erezbiox1.Events.onMessage;
import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.events.Listener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Erezbiox1 on 27/12/2016.
 * (C) 2016 Erez Rotem All Rights Reserved.
 */
public class Events {

    static List<Listener> events = new ArrayList<>(
            Arrays.asList(
                    new onMessage()
            )
    );

    public static void registerEvents(){
        for(Listener event: events) {
            Main.dispatcher.registerListener(event);
        }
    }

}
