package institute.immune.delivreyapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import androidx.annotation.Nullable;


public class MyOpenHelper extends SQLiteOpenHelper {
    private static final String script = "CREATE TABLE 'user' ('_id' INTEGER PRIMARY KEY AUTOINCREMENT, 'phone' TEXT, 'mail' TEXT, 'password' TEXT)";
    private SQLiteDatabase db;
    private static final String nameDb = "users.sqlite";

    public MyOpenHelper(@Nullable Context context) {
        super(context, nameDb, null, 1);
        db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(script);
    }

    public void insert_user(String phone, String email, String password){
        ContentValues cv = new ContentValues();
        cv.put("phone", phone);
        cv.put("mail", email);
        cv.put("password", password);

        db.insert("user", null, cv);
    }


    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {


    }
}
