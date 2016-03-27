package crusader.retrofittest.db.models;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import crusader.retrofittest.db.ColumnValuePair;

/**
 * Created by user on 3/20/2016.
 */
public abstract class BaseTable<T> {

    public String tableName;

    public abstract void createTable(SQLiteDatabase db);

    public abstract String getTableName();

    public abstract String[] getColumnNames();

    public abstract boolean insertInDb(SQLiteDatabase db, T tableModel);

    public abstract ArrayList<T> getAllData(SQLiteDatabase db);

    public abstract ArrayList<T> getFilteredData(SQLiteDatabase db, ColumnValuePair... pair);

    public abstract int numberOfRows(SQLiteDatabase db);

    public abstract boolean updateData(SQLiteDatabase db, T tableModel);

    public abstract Integer deleteData(SQLiteDatabase db, T tableModel);
}
