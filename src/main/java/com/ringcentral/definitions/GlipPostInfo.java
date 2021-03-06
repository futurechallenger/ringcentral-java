package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipPostInfo
{
    // Internal identifier of a post
    public String id;
    public GlipPostInfo id(String id) {
        this.id = id;
        return this;
    }
    // Internal identifier of a group a post belongs to
    public String groupId;
    public GlipPostInfo groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    // Type of a post
    public String type;
    public GlipPostInfo type(String type) {
        this.type = type;
        return this;
    }
    // For 'TextMessage' post type only. Message text
    public String text;
    public GlipPostInfo text(String text) {
        this.text = text;
        return this;
    }
    // Internal identifier of a user - author of a post
    public String creatorId;
    public GlipPostInfo creatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    // For PersonsAdded post type only. Identifiers of persons added to a group
    public String[] addedPersonIds;
    public GlipPostInfo addedPersonIds(String[] addedPersonIds) {
        this.addedPersonIds = addedPersonIds;
        return this;
    }
    // Post creation datetime in ISO 8601 format
    public String creationTime;
    public GlipPostInfo creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Post last modification datetime in ISO 8601 format
    public String lastModifiedTime;
    public GlipPostInfo lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    // List of posted attachments
    public GlipMessageAttachmentInfo[] attachments;
    public GlipPostInfo attachments(GlipMessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
    // List of posted attachments
    public GlipMentionsInfo[] mentions;
    public GlipPostInfo mentions(GlipMentionsInfo[] mentions) {
        this.mentions = mentions;
        return this;
    }
    // activity type
    public String activity;
    public GlipPostInfo activity(String activity) {
        this.activity = activity;
        return this;
    }
    // Title of the message. Can be set for bot messages only
    public String title;
    public GlipPostInfo title(String title) {
        this.title = title;
        return this;
    }
    // URI to an image to use as the icon for this message.
    public String iconUri;
    public GlipPostInfo iconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }
    // Emoji to use as the icon for a message
    public String iconEmoji;
    public GlipPostInfo iconEmoji(String iconEmoji) {
        this.iconEmoji = iconEmoji;
        return this;
    }
}
