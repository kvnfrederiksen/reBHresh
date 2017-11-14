package com.bullhornsdk.data.model.response.crud;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contains the response from an entity action
 * 
 * Any response messages from bh AND validation errors from our own side will be added to messages.
 * 
 * @author magnus.palm
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "changedEntityType", "changedEntityId", "changeType", "messages" })
public class AbstractCrudResponse implements CrudResponse {

    private String changedEntityType;

    private Integer changedEntityId;

    private String changeType;

    private List<Message> messages = new ArrayList<Message>();

    private String errorCode;

    private String errorMessage;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    public AbstractCrudResponse() {
        super();
        this.errorCode = "";
        this.errorMessage = "";
    }

    
    @JsonProperty("changedEntityType")
    public String getChangedEntityType() {
        return changedEntityType;
    }

    
    @JsonProperty("changedEntityType")
    public void setChangedEntityType(String changedEntityType) {
        this.changedEntityType = changedEntityType;
    }

    
    @JsonProperty("changedEntityId")
    public Integer getChangedEntityId() {
        return changedEntityId;
    }

    
    @JsonProperty("changedEntityId")
    public void setChangedEntityId(Integer changedEntityId) {
        this.changedEntityId = changedEntityId;
    }

    
    @JsonProperty("changeType")
    public String getChangeType() {
        return changeType;
    }

    
    @JsonProperty("changeType")
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    
    @JsonProperty("messages")
    public List<Message> getMessages() {
        return messages;
    }

    
    @JsonProperty("messages")
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    
    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    
    @JsonIgnore
    public boolean isError() {
        if (hasMessages()) {
            for (Message message : messages) {
                if ("ERROR".equalsIgnoreCase(message.getType()) || "ERROR".equalsIgnoreCase(message.getSeverity())) {
                    return true;
                }
            }
        }

        return false;
    }
    
    
    @JsonIgnore
    public boolean hasWarnings() {
        if (hasMessages()) {
            for (Message message : messages) {
                if ("WARNING".equalsIgnoreCase(message.getType())) {
                    return true;
                }
            }
        }

        return false;
    }

    
    @JsonIgnore
    public boolean hasMessages() {
        if (messages == null || messages.isEmpty()) {
            return false;
        }
        return true;
    }

    @JsonIgnore
    
    public boolean hasValidationErrors() {
        if (hasMessages()) {
            for (Message message : messages) {
                if ("VALIDATION_ERROR".equalsIgnoreCase(message.getType())) {
                    return true;
                }
            }
        }

        return false;
    }

    
    @JsonIgnore
    public void addOneMessage(Message message) {
        this.messages.add(message);
    }

    
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UpdateResponse {\nchangedEntityType=");
        builder.append(changedEntityType);
        builder.append(", \nchangedEntityId=");
        builder.append(changedEntityId);
        builder.append(", \nchangeType=");
        builder.append(changeType);
        builder.append(", \nmessages=");
        builder.append(messages);
        builder.append(", \nerrorCode=");
        builder.append(errorCode);
        builder.append(", \nerrorMessage=");
        builder.append(errorMessage);
        builder.append("\n}");
        return builder.toString();
    }

}
