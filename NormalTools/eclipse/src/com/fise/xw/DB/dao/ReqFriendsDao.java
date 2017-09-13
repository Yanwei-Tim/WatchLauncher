package com.fise.xw.DB.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.fise.xw.DB.entity.UserEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * 请求人的信息表
*/

public class ReqFriendsDao extends AbstractDao<UserEntity, Long> {

    public static final String TABLENAME = "ReqFriendsInfo";
 
    /**
     * Properties of entity UserEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property PeerId = new Property(1, int.class, "peerId", false, "PEER_ID");
        public final static Property Gender = new Property(2, int.class, "gender", false, "GENDER");
        public final static Property MainName = new Property(3, String.class, "mainName", false, "MAIN_NAME");
        public final static Property PinyinName = new Property(4, String.class, "pinyinName", false, "PINYIN_NAME");
        public final static Property RealName = new Property(5, String.class, "realName", false, "REAL_NAME");
        public final static Property Avatar = new Property(6, String.class, "avatar", false, "AVATAR");
        public final static Property Phone = new Property(7, String.class, "phone", false, "PHONE");
        public final static Property Email = new Property(8, String.class, "email", false, "EMAIL");
        public final static Property DepartmentId = new Property(9, int.class, "departmentId", false, "DEPARTMENT_ID");
        public final static Property Status = new Property(10, int.class, "status", false, "STATUS");
        public final static Property Created = new Property(11, int.class, "created", false, "CREATED");
        public final static Property Updated = new Property(12, int.class, "updated", false, "UPDATED");
        public final static Property IsFriends = new Property(13, int.class, "isFriends", false, "ISFRIENDS");
         
        public final static Property Longitude = new Property(14, double.class, "Longitude", false, "LONGITUDE");
        public final static Property Latitude = new Property(15, double.class, "Latitude", false, "LATITUDE");
        public final static Property Battery = new Property(16, int.class, "Battery", false, "BATTERY");
        public final static Property Signal = new Property(17, int.class, "Signal", false, "SIGNAL");
        public final static Property Auth = new Property(18, int.class, "Auth", false, "AUTH");
        public final static Property Online = new Property(19, int.class, "Online", false, "ONLINE");
        public final static Property Usertype = new Property(20, int.class, "Usertype", false, "USERTYPE");
        
	    public final static Property Country = new Property(21, String.class, "Country", false, "COUNTRY");
		public final static Property Province = new Property(22, String.class, "Province", false, "PROVINCE");
		public final static Property City = new Property(23, String.class, "City", false, "CITY");
		public final static Property Sign_info = new Property(24, String.class, "Sign_info", false, "SIGN_INFO");
		public final static Property Comment = new Property(25, String.class, "Comment", false, "COMMENT");
		
		
        public final static Property Friend_need_auth = new Property(26, int.class, "FriendNeedAuth", false, "FRIENDNEEDAUTH");
        public final static Property Login_safe_switch = new Property(27, int.class, "LoginSafeSwitch", false, "LOGINSAFESWITH");
        public final static Property Search_allow = new Property(28, int.class, "SearchAllow", false, "SEARCHALLOW");
        
        public final static Property groupNick = new Property(29, String.class, "groupNick", false, "GROUPNICK"); 
    };


    public ReqFriendsDao(DaoConfig config) {
        super(config);
    }
    
    public ReqFriendsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ReqFriendsInfo' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'PEER_ID' INTEGER NOT NULL UNIQUE ," + // 1: peerId
                "'GENDER' INTEGER NOT NULL ," + // 2: gender
                "'MAIN_NAME' TEXT NOT NULL ," + // 3: mainName
                "'PINYIN_NAME' TEXT NOT NULL ," + // 4: pinyinName
                "'REAL_NAME' TEXT NOT NULL ," + // 5: realName
                "'AVATAR' TEXT NOT NULL ," + // 6: avatar
                "'PHONE' TEXT NOT NULL ," + // 7: phone
                "'EMAIL' TEXT NOT NULL ," + // 8: email
                "'DEPARTMENT_ID' INTEGER NOT NULL ," + // 9: departmentId
                "'STATUS' INTEGER NOT NULL ," + // 10: status
                "'CREATED' INTEGER NOT NULL ," + // 11: created
                "'UPDATED' INTEGER NOT NULL ," + // 12: updated
    			"'ISFRIENDS' INTEGER NOT NULL,"+ // 13: updated  
				"'LONGITUDE' DOUBLE NOT NULL," + // 14: Longitude
				"'LATITUDE' DOUBLE NOT NULL," + // 15: Latitude
				"'BATTERY' INTEGER NOT NULL," + // 16: Battery
				"'SIGNAL' INTEGER NOT NULL," + // 17: Signal
				"'AUTH' INTEGER NOT NULL," + // 18: Auth
				"'ONLINE' INTEGER NOT NULL," + // 19: Online
				"'USERTYPE' INTEGER NOT NULL," + // 20: UserType
				
				"'COUNTRY' TEXT NOT NULL ," + // 21: COUNTRY
				"'PROVINCE' TEXT NOT NULL ," + // 22: PROVINCE
				"'CITY' TEXT NOT NULL ," + // 23: CITY
				"'SIGN_INFO' TEXT NOT NULL ," + // 24: SIGN_INFO

				"'COMMENT' TEXT NOT NULL ," + // 25: COMMENT 
				"'FRIENDNEEDAUTH' INTEGER NOT NULL ," + // 26: FRIENDNEEDAUTH
				"'LOGINSAFESWITH' INTEGER NOT NULL ," + // 27: LOGINSAFESWITH 
				"'SEARCHALLOW' INTEGER NOT NULL ," + // 28: SEARCHALLOW  
    			"'GROUPNICK' TEXT NOT NULL );");  // 29: STICKYONTOP


        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_ReqFriendsInfo_PEER_ID ON ReqFriendsInfo" +
                " (PEER_ID);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ReqFriendsInfo'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, UserEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getPeerId());
        stmt.bindLong(3, entity.getGender());
        stmt.bindString(4, entity.getMainName());
        stmt.bindString(5, entity.getPinyinName());
        stmt.bindString(6, entity.getRealName());
        stmt.bindString(7, entity.getUserAvatar());
        stmt.bindString(8, entity.getPhone());
        stmt.bindString(9, entity.getEmail());
        stmt.bindLong(10, entity.getDepartmentId());
        stmt.bindLong(11, entity.getStatus());
        stmt.bindLong(12, entity.getCreated());
        stmt.bindLong(13, entity.getUpdated());
        stmt.bindLong(14, entity.getIsFriend());
         
        stmt.bindDouble(15, entity.getLongitude());
        stmt.bindDouble(16, entity.getLatitude());
        stmt.bindLong(17, entity.getBattery());
        stmt.bindLong(18, entity.getSignal());    
        stmt.bindLong(19, entity.getAuth());
        stmt.bindLong(20, entity.getOnLine());
        stmt.bindLong(21, entity.getUserType());
        
        stmt.bindString(22, entity.getCountry());
        stmt.bindString(23, entity.getProvince());
        stmt.bindString(24, entity.getCity());
        stmt.bindString(25, entity.getSign_info());
        stmt.bindString(26, entity.getComment());

        
        stmt.bindLong(27, entity.getFriendNeedAuth());
        stmt.bindLong(28, entity.getLoginSafeSwitch());
        stmt.bindLong(29, entity.getSearchAllow());

        stmt.bindString(30, entity.getGroupNick()); 
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public UserEntity readEntity(Cursor cursor, int offset) {
        UserEntity entity = new UserEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // peerId
            cursor.getInt(offset + 2), // gender
            cursor.getString(offset + 3), // mainName
            cursor.getString(offset + 4), // pinyinName
            cursor.getString(offset + 5), // realName
            cursor.getString(offset + 6), // avatar
            cursor.getString(offset + 7), // phone
            cursor.getString(offset + 8), // email
            cursor.getInt(offset + 9), // departmentId
            cursor.getInt(offset + 10), // status
            cursor.getInt(offset + 11), // created
            cursor.getInt(offset + 12), // updated
            cursor.getInt(offset + 13), // updated 
            cursor.getDouble(offset + 14), // updated
            cursor.getDouble(offset + 15), // updated
            cursor.getInt(offset + 16),
            cursor.getInt(offset + 17),
            cursor.getInt(offset + 18),
            cursor.getInt(offset + 19),
            cursor.getInt(offset + 20),
            
            cursor.getString(offset + 21), // Country
            cursor.getString(offset + 22), // province
            cursor.getString(offset + 23), // city
            cursor.getString(offset + 24), // sign_info
            cursor.getString(offset + 25),  // comment
             
            cursor.getInt(offset + 26), //FriendNeedAuth
            cursor.getInt(offset + 27), //LoginSafeSwitch
            cursor.getInt(offset + 28),  //SearchAllow
            cursor.getString(offset + 29)  //group
                    
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, UserEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPeerId(cursor.getInt(offset + 1));
        entity.setGender(cursor.getInt(offset + 2));
        entity.setMainName(cursor.getString(offset + 3));
        entity.setPinyinName(cursor.getString(offset + 4));
        entity.setRealName(cursor.getString(offset + 5));
        entity.setAvatar(cursor.getString(offset + 6));
        entity.setPhone(cursor.getString(offset + 7));
        entity.setEmail(cursor.getString(offset + 8));
        entity.setDepartmentId(cursor.getInt(offset + 9));
        entity.setStatus(cursor.getInt(offset + 10));
        entity.setCreated(cursor.getInt(offset + 11));
        entity.setUpdated(cursor.getInt(offset + 12));
        entity.setFriend(cursor.getInt(offset + 13)); 
        entity.setLongitude(cursor.getDouble(offset + 14));
        entity.setLatitude(cursor.getDouble(offset + 15));
        entity.setBattery(cursor.getInt(offset + 16));
        entity.setSignal(cursor.getInt(offset + 17));
        entity.setAuth(cursor.getInt(offset + 18));
        entity.setOnLine(cursor.getInt(offset + 19));
        entity.setUserType(cursor.getInt(offset + 20));
        
        entity.setCountry(cursor.getString(offset + 21));
        entity.setProvince(cursor.getString(offset + 22));
        entity.setCity(cursor.getString(offset + 23));
        entity.setSign_info(cursor.getString(offset + 24));
        entity.setComment(cursor.getString(offset + 25));
        
        
        entity.setFriendNeedAuth(cursor.getInt(offset + 26));
        entity.setLoginSafeSwitch(cursor.getInt(offset + 27));
        entity.setSearchAllow(cursor.getInt(offset + 28));
        entity.setGroupNick(cursor.getString(offset + 29));
         
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(UserEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(UserEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}