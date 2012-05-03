package com.akjava.gwt.lib.hangouts.client.events;

import com.akjava.gwt.lib.hangouts.client.Participant;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class EnabledParticipantsChangedEvent extends JavaScriptObject {
	protected EnabledParticipantsChangedEvent(){}
	
	public  final native JsArray<Participant> getEnabledParticipants() /*-{
    return this.enabledParticipants;
   }-*/;
}
