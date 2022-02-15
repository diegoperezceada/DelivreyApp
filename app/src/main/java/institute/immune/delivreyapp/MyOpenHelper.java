package institute.immune.delivreyapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyOpenHelper extends SQLiteOpenHelper {
    private static final String script = "CREATE TABLE 'user' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' TEXT, 'mail' TEXT)";
    private SQLiteDatabase db;
    private static final String nameDb = "users.sqlite";

    public MyOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, nameDb, null, 1);
    }



    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(script);
        db = this.getWritableDatabase();
    }

    public void insert_user(Integer phone, String email, String password){
        ContentValues cv = new ContentValues();
        cv.put("name", phone);
        cv.put("mail", email);
        cv.put("password", password);

        db.insert("user", null, cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
