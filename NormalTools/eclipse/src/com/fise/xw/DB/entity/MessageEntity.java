package com.fise.xw.DB.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here

import com.fise.xw.config.DBConstant;
import com.fise.xw.protobuf.IMDevice.AlarmType;
import com.fise.xw.protobuf.helper.EntityChangeEngine;
 

/**
 *  聊天消息基本数据
 * @author weileiguan
 *
 */
public class MessageEntity implements java.io.Serializable {

    protected Long id;
    protected int msgId;
    protected int fromId;
    protected int toId;
    /** Not-null value. */
    protected String sessionKey;
    /** Not-null value. */
    protected String content;
    protected int msgType;
    protected int displayType;
    protected int status;
    protected int created;
    protected int updated; 
    protected int isDelete = 0;   
	public int type;
	
	protected String messageTime = ""; 
    // KEEP FIELDS - put your custom fields here
	 
	public int sendId;
	public String address = "";
    protected boolean isGIfEmo;
    // KEEP FIELDS END
     

    public MessageEntity() {
    }

    public MessageEntity(Long id) {
        this.id = id;
    }

    public MessageEntity(Long id, int msgId, int fromId, int toId, String sessionKey, String content, int msgType, int displayType
    		, int status, int created, int updated,int isDelete,int type,int sendId,String address,String messageTime) {
        this.id = id;
        this.msgId = msgId;
        this.fromId = fromId;
        this.toId = toId;
        this.sessionKey = sessionKey;
        this.content = content;
        this.msgType = msgType;
        this.displayType = displayType;
        this.status = status;
        this.created = created;
        this.updated = updated; 
        this.isDelete = isDelete; 
        
        this.type = type;
        this.sendId = sendId;
        this.address = address; 
        this.messageTime = messageTime;
         
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMsgId() {
        return msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    /** Not-null value. */
    public String getSessionKey() {
        return sessionKey;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    /** Not-null value. */
    public String getContent() {
        return content;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setContent(String content) {
        this.content = content;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public int getDisplayType() {
        return displayType;
    }

    public void setDisplayType(int displayType) {
        this.displayType = displayType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }
    
    
    public int getDelete() {
        return isDelete;
    }

    public void setDelete(int isDelete) {
        this.isDelete = isDelete;
    }
    
    

    public int getType() {
        return this.type ;
   }
   

    public int getSendId() {
        return this.sendId ;
   }
     
    
    
    public void setType(int type) {
        this.type = type;
   }
    
   public void setSendId(int sendId) {
       this.sendId = sendId;
  }
  
   
   
   
   public void setAddress(String address) {
       this.address = address;
  }
   
   
   public String getAddress() {
       return this.address;
  }
   
   
   
   
  public void setMessageTime(String messageTime) {
       this.messageTime = messageTime;
  }
   
   
  public String getMessageTime() {
       return this.messageTime;
  }
    
//   
//  public void setPath(String path) {
//       this.path = path;
//  }
//   
//   
//   public String getPath() {
//       return this.path;
//   }

    // KEEP METHODS - put your custom methods here
    /**
     * -----根据自身状态判断的---------
     */
    public int getSessionType() {
        switch (msgType) {
            case  DBConstant.MSG_TYPE_SINGLE_TEXT:
            case  DBConstant.MSG_TYPE_SINGLE_AUDIO:
            case  DBConstant.MSG_TYPE_SINGLE_NOTICE:
            case  DBConstant.MSG_TYPE_SINGLE_BUSSINESS_CARD:
            case  DBConstant.MSG_TYPE_SINGLE_VIDIO:
            case  DBConstant.MSG_TYPE_SINGLE_LOCATION:
            case  DBConstant.MSG_TYPE_SINGLE_AUTH_IMAGE:
            case  DBConstant.MSG_TYPE_SINGLE_AUTH_SOUND:
            case  DBConstant.MSG_TYPE_SINGLE_IMAGE :
            	
                return DBConstant.SESSION_TYPE_SINGLE;
            case DBConstant.MSG_TYPE_GROUP_TEXT:
            case DBConstant.MSG_TYPE_GROUP_AUDIO:
            case DBConstant.MSG_TYPE_GROUP_BUSSINESS_CARD:
            case DBConstant.MSG_TYPE_GROUP_LOCATION:
            case DBConstant.MSG_TYPE_GROUP_VIDIO:
            case  DBConstant.MSG_TYPE_GROUP_AUTH_IMAGE:
            case  DBConstant.MSG_TYPE_GROUP_AUTH_SOUND:
            case  DBConstant.MSG_TYPE_GROUP_IMAGE:
            	
                return DBConstant.SESSION_TYPE_GROUP;
                
            default:
                //todo 有问题
                return DBConstant.SESSION_TYPE_SINGLE;
        }
    }


    public String getMessageDisplay() {
        switch (displayType){
            case DBConstant.SHOW_AUDIO_TYPE:
                return DBConstant.DISPLAY_FOR_AUDIO;
            case DBConstant.SHOW_ORIGIN_TEXT_TYPE:
            case DBConstant.SHOW_TYPE_ADDFRIENDS:
                return content;
            case DBConstant.SHOW_IMAGE_TYPE:
                return DBConstant.DISPLAY_FOR_IMAGE;
            case DBConstant.SHOW_MIX_TEXT:
                return DBConstant.DISPLAY_FOR_MIX;
            case DBConstant.CHANGE_NOT_FRIEND:
                return DBConstant.DISPLAY_FOR_NOTICE;
            case DBConstant.SHOW_TYPE_NOTICE_BLACK:
                return DBConstant.DISPLAY_FOR_NOTICE;
                
            case DBConstant.SHOW_TYPE_CARD:
                return DBConstant.DISPLAY_FOR_CARD;      
            case DBConstant.SHOW_TYPE_VEDIO:
                return DBConstant.DISPLAY_FOR_VEDIO;      
            case DBConstant.SHOW_TYPE_POSTION:
                return DBConstant.DISPLAY_FOR_POSTION;   
                
            case DBConstant.SHOW_TYPE_DEV_MESSAGE:
            	if(type == AlarmType.ALARM_TYPE_ANSWER_CALL.ordinal()
            	||type == AlarmType.ALARM_TYPE_REJECT_CALL.ordinal()
            	||type == AlarmType.ALARM_TYPE_AUTH_NORMAL_CALL.ordinal())
            	{
            		 return DBConstant.DISPLAY_FOR_DEV_PHONE;   
            		 
            	}else if(type == AlarmType.ALARM_TYPE_AUTH_SLIENCE_CALL.ordinal())
            	{
            		 return DBConstant.DISPLAY_FOR_DEV_SILENT; 
            	}
                return DBConstant.DISPLAY_FOR_DEV_MESSAGE;   
            default:
                return DBConstant.DISPLAY_FOR_ERROR;
        }
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id=" + id +
                ", msgId=" + msgId +
                ", fromId=" + fromId +
                ", toId=" + toId +
                ", content='" + content + '\'' +
                ", msgType=" + msgType +
                ", displayType=" + displayType +
                ", status=" + status +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;

        MessageEntity that = (MessageEntity) o;

        if (created != that.created) return false;
        if (displayType != that.displayType) return false;
        if (fromId != that.fromId) return false;
        if (msgId != that.msgId) return false;
        if (msgType != that.msgType) return false;
        if (status != that.status) return false;
        if (toId != that.toId) return false;
        if (updated != that.updated) return false;
        if (!content.equals(that.content)) return false;
        if (!id.equals(that.id)) return false;
        if (!sessionKey.equals(that.sessionKey)) return false;
        if (isDelete != that.isDelete) return false;
        
        
        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + msgId;
        result = 31 * result + fromId;
        result = 31 * result + toId;
        result = 31 * result + sessionKey.hashCode();
        result = 31 * result + content.hashCode();
        result = 31 * result + msgType;
        result = 31 * result + displayType;
        result = 31 * result + status;
        result = 31 * result + created;
        result = 31 * result + updated;
        result = 31 * result + isDelete;
        
        return result;
    }


    /**
     * 获取会话的sessionId
     * @param isSend
     * @return
     */
    public int getPeerId(boolean isSend){
        if(isSend){
            /**自己发出去的*/
            return toId;
        }else{
            /**接受到的*/
            switch (getSessionType()){
                case DBConstant.SESSION_TYPE_SINGLE:
                    return fromId;
                case DBConstant.SESSION_TYPE_GROUP:
                    return toId;
                default:
                    return toId;
            }
        }
    }

    public byte[] getSendContent(){
        return null;
    }

    public boolean isGIfEmo() {
        return isGIfEmo;
    }

    public void setGIfEmo(boolean isGIfEmo) {
        this.isGIfEmo = isGIfEmo;
    }

    public boolean isSend(int loginId){
        boolean isSend = (loginId==fromId)?true:false;
        return isSend;
    }

    public String buildSessionKey(boolean isSend){
        int sessionType = getSessionType();
        int peerId = getPeerId(isSend);
        sessionKey = EntityChangeEngine.getSessionKey(peerId,sessionType);
        return sessionKey;
    }
    // KEEP METHODS END

}