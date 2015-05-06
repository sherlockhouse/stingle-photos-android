package com.fenritz.safecam;

import android.app.Application;
import android.content.Context;

import com.fenritz.safecam.util.MemoryCache;

public class SafeCameraApplication extends Application{

	public final static String TAG = "SCCam";

	private String key;
	
	private static Context context;
	private static MemoryCache cache;

    @Override
	public void onCreate(){
        super.onCreate();
        SafeCameraApplication.context = getApplicationContext();
        SafeCameraApplication.cache = new MemoryCache();
    }

    public static Context getAppContext() {
        return SafeCameraApplication.context;
    }
    
    public static MemoryCache getCache() {
        return SafeCameraApplication.cache;
    }
	
	public String getKey(){
		return key;
	}
	
	public void setKey(String pKey){
		key = pKey;
	}
}