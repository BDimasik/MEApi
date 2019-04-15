package com.mineexperts.api.messages;

import org.bukkit.entity.Player;

public interface Message {

	enum Event {
        SHOW_TEXT, RUN_COMMAND, OPEN_URL, COMMAND
    }

    /**
    * Add event to last message
    * @param event - type of event(
    * Event.SHOW_TEXT - show text on prompting,
    * Event.RUN_COMMAND - instantly run a command on click,
    * Event.OPEN_URL - I don't know what is this, but if you know, you can use this,
    * Event.COMMAND - Add text into input line)
    * @param string - message for event
    * @return message for next use
    */
    Message addEvent(Message.Event event, String string);
    
    /**
     * Sends current message to all players in the array.
     * @param players - an array of recievers.
     */
    void send(Player... players);
}