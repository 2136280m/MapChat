package com.example.alex.MapChat;

import java.util.ArrayList;

/**
 * Created by alex on 09/03/18.
 */

public class AllMessages {
    public static ArrayList<IndividualMessage> allMessagesArray = new ArrayList<IndividualMessage>();

    IndividualMessage n1 = new IndividualMessage(2,"Hi guys", "en");
    IndividualMessage n2 = new IndividualMessage(2,"Hi gwsgdguys", "en");
    IndividualMessage n3 = new IndividualMessage(2,"Hi gudzfbhearhys", "en");
    IndividualMessage n4 = new IndividualMessage(2,"Hi guys", "en");
    IndividualMessage n5 = new IndividualMessage(2,"Hi guys", "en");
    IndividualMessage n6 = new IndividualMessage(2,"Hi guys", "en");
    IndividualMessage n7 = new IndividualMessage(2,"This is another message", "en");
    IndividualMessage n8 = new IndividualMessage(2,"Hi guys", "en");
    IndividualMessage n9 = new IndividualMessage(2,"My last message", "en");

    public AllMessages(){
        allMessagesArray.add(n1);
        allMessagesArray.add(n2);
        allMessagesArray.add(n3);
        allMessagesArray.add(n4);
        allMessagesArray.add(n5);
        allMessagesArray.add(n6);
        allMessagesArray.add(n7);
        allMessagesArray.add(n8);
        allMessagesArray.add(n9);
    }

    public ArrayList<IndividualMessage> getAllMessagesArray(){
        return allMessagesArray;
    }
}
