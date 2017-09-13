package com.fise.xiaoyu.ui.adapter;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.fise.xiaoyu.DB.entity.UserEntity;
import com.fise.xiaoyu.R;
import com.fise.xiaoyu.config.DBConstant;
import com.fise.xiaoyu.imservice.service.IMService;
import com.fise.xiaoyu.ui.widget.IMBaseImageView;

import java.util.ArrayList;
import java.util.List;

public class DeviceAdspter extends BaseAdapter {  
   
    private  LayoutInflater layoutInflater;  
    private  Context context;  
    private  IMService imService;
    public   List<UserEntity>  deviceList = new ArrayList<>();
    
    public DeviceAdspter(Context context ,List<UserEntity> deviceList ,IMService imService){  
        this.context=context;  
        this.deviceList = deviceList;  
        this.layoutInflater=LayoutInflater.from(context);  
        this.imService = imService; 
    }  
    /** 
     * 组件集合，对应list.xml中的控件
     */  
    public final class Zujian{  
        public IMBaseImageView deviceImage;  
        public TextView deviceName;    
    }  
    @Override  
    public int getCount() {  
        return deviceList.size();  
    }  
    /** 
     * 获得某一位置的数据 
     */  
    @Override  
    public Object getItem(int position) {  
        return deviceList.get(position);  
    }  
    /** 
     * 获得唯一标识 
     */  
    @Override  
    public long getItemId(int position) {  
        return position;  
    }  
  
    
    public void putDeviceList(List<UserEntity> deviceList){
        this.deviceList = deviceList;
        notifyDataSetChanged();
    }

    @Override  
    public View getView(int position, View convertView, ViewGroup parent) {  
        Zujian zujian=null;  
        if(convertView==null){  
            zujian=new Zujian();  
            //获得组件，实例化组件  
            convertView=layoutInflater.inflate(R.layout.device_list_item, null);  
            zujian.deviceImage = (IMBaseImageView)convertView.findViewById(R.id.img);  
            zujian.deviceName  = (TextView)convertView.findViewById(R.id.tv);    
            convertView.setTag(zujian);  
        }else{  
            zujian=(Zujian)convertView.getTag();  
        }
         
            
        //绑定数据
        
        zujian.deviceImage.setCorner(90);
        zujian.deviceImage.setImageUrl(deviceList.get(position).getAvatar());

		if ((deviceList.get(position).getIsFriend() == DBConstant.FRIENDS_TYPE_YUYOU)
				&& (deviceList.get(position).getOnLine() != DBConstant.ONLINE)) {

			ColorMatrix matrix = new ColorMatrix();
			matrix.setSaturation(0);
			ColorMatrixColorFilter filter = new ColorMatrixColorFilter(
					matrix); 
			zujian.deviceImage.setColorFilter(filter);
		}else{
			ColorMatrix matrix = new ColorMatrix();
			matrix.setSaturation(1);
			ColorMatrixColorFilter filter = new ColorMatrixColorFilter(
					matrix);
			zujian.deviceImage.setColorFilter(filter);
		}
		
		
        zujian.deviceName.setText(deviceList.get(position).getMainName());   
       
        return convertView;  
    }  
     
  
}  
