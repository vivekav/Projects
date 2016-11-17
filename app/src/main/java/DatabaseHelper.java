import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vivek on 11/17/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME= "Student.db";
    public static final String TABLE_NAME = "Student_table.db";
    public static final String ID= "ID";
    public static final String NAME= "NAME";
    public static final String SURNAME= "SURNAME";
    public static final String MARKS= "MARKS";


    public DatabaseHelper(Context context) {
        super(context, NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+ TABLE_NAME+ "(ID )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
