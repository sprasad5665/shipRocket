package com.shiprocket.model.Ecwid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "eventId", "eventCreated", "storeId", "entityId", "eventType", "data" })
public class webHookItems {
	private String eventId;
	private float eventCreated;
	private String storeId;
	private float entityId;
	private String eventType;
	@JsonProperty("data")
	private webHookData webHookData;

	// Getter Methods

	public String getEventId() {
		return eventId;
	}

	public float getEventCreated() {
		return eventCreated;
	}

	public String getStoreId() {
		return storeId;
	}

	public float getEntityId() {
		return entityId;
	}

	public String getEventType() {
		return eventType;
	}

	// Setter Methods

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public void setEventCreated(float eventCreated) {
		this.eventCreated = eventCreated;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public void setEntityId(float entityId) {
		this.entityId = entityId;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public webHookData getWebHookData() {
		return webHookData;
	}

	public void setWebHookData(webHookData webHookData) {
		this.webHookData = webHookData;
	}
	
	

}
