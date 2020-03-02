

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DB_Adapter  {
    DatabaseHelper databaseHelper;
    Context context;
    public DB_Adapter(Context context)
    {
        databaseHelper=new DatabaseHelper(context);
        this.context=context;
    }
    public long Insert(User user)
    {
    }
    public List getData()
    {
        List list=new ArrayList<>();
        SQLiteDatabase sqLiteDatabase=databaseHelper.getWritableDatabase();
     
        Cursor cursor=sqLiteDatabase.query(databaseHelper.table_name,columns,null,null,null,null,null);
        while (cursor.moveToNext())
        {
        
        }
        return list;
    }
}
