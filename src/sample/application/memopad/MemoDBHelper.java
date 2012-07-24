package sample.application.memopad;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class MemoDBHelper extends SQLiteOpenHelper {
	
	static final String name="memos.db";
	static final int version = 1;
	static final CursorFactory factory = null;
	
	public MemoDBHelper(Context context) {
		super(context, name, factory, version);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO 自動生成されたメソッド・スタブ
		
			String sql="CREATE TABLE memoDB("
			+android.provider.BaseColumns._ID
	        +" INTEGER PRIMARY KEY AUTOINCREMENT, title Text, memo TEXT);";
			db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自動生成されたメソッド・スタブ

	}
}
	

