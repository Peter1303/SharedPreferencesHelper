package com.peter1303.SharedPreferencesHelper;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

public class SharedPreferencesHelper {
	
	public static String LAUCH_TIMES= "LAUCH_TIMES";
	
	private Context context;
	
	private SharedPreferences sharedPreferences = null;
	private SharedPreferences.Editor editor = null;
	// 初始化，默认模式为 私有 数据
	public SharedPreferencesHelper(Context context, String name){
		init(context, Context.MODE_PRIVATE, name);
	}
	// 初始化，自定义存储数据 模式
	public SharedPreferencesHelper(Context context, int mode, String name){
		init(context, mode, name);
	}
	//初始化
	public void init(Context context, int mode, String name){
		this.context = context;
		sharedPreferences = context.getSharedPreferences(name, mode);
		editor = sharedPreferences.edit();
	}
	
	//保存 String
	public boolean save(String tag, String str){
		return editor.putString(tag, str).commit() && canEdit();
	}
	//保存 int
	public boolean save(String tag, int value){
		return editor.putInt(tag, value).commit() && canEdit();
	}
	//保存 float
	public boolean save(String tag, float value){
		return editor.putFloat(tag, value).commit() && canEdit();
	}
	//保存 boolean
	public boolean save(String tag, boolean value){
		return editor.putBoolean(tag, value).commit() && canEdit();
	}
	//保存 long
	public boolean save(String tag, long value){
		return editor.putLong(tag, value).commit() && canEdit();
	}
	//保存 StringSet
	public boolean save(String tag, Set<String> value){
		return editor.putStringSet(tag, value).commit() && canEdit();
	}
	
	//得到 String
	public String getString(String tag, String str){
		return canEdit() ? sharedPreferences.getString(tag, str) : "";
	}
	//得到 int
	public int getInt(String tag, int value){
		return canEdit() ? sharedPreferences.getInt(tag, value) : value;
	}
	//得到 float
	public float getFloat(String tag, float value){
		return canEdit() ? sharedPreferences.getFloat(tag, value) : value;
	}
	//得到 boolean
	public boolean getBoolean(String tag, boolean value){
		return canEdit() ? sharedPreferences.getBoolean(tag, value) : value;
	}
	//得到 long
	public long getLong(String tag, long value){
		return canEdit() ? sharedPreferences.getLong(tag, value) : value;
	}
	//得到 StringSet
	public Set<String> getStringSet(String tag, Set<String> value){
		return canEdit() ? sharedPreferences.getStringSet(tag, value) : value;
	}
	
	//删除
	public boolean delete(String tag){
		return editor.remove(tag).commit() && canEdit();
	}
	
	//清空
	public boolean clearAll(){
		return editor.clear().commit() && canEdit();
	}
	
	/**
	*  其他
	*/
	//反转 布尔值 并保存
	public boolean saveReverseBoolean(String tag, boolean defaultValue){
		return save(tag, (getBoolean(tag, defaultValue) ? false : true) );
	}
	
	public boolean contains(String tag){
		return sharedPreferences.contains(tag) && canEdit();
	}
	
	//记录启动次数
	public boolean recordLaunchTimes(){
		int temp = getInt(LAUCH_TIMES, 0);
		return save(LAUCH_TIMES, (temp + 1) ) && canEdit();
	}
	//得到启动次数
	public int getLaunchTimes(){
		return canEdit() ? getInt(LAUCH_TIMES, 0) : 0;
	}
	
	//返回是否初始化为 null
	private boolean canEdit(){
		return sharedPreferences != null && editor != null;
	}
}
