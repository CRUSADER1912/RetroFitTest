package crusader.retrofittest.db.models;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import crusader.retrofittest.db.ColumnValuePair;

/**
 * Created by user on 3/20/2016.
 */
public class UserRegistration extends BaseTable<UserRegistration> {

    public static final String REGISTRATION_TABLE_NAME = "UserRegistration";
    public static final String REGISTRATION_COLUMN_ID = "id";
    public static final String REGISTRATION_COLUMN_USERNAME = "username";
    public static final String REGISTRATION_COLUMN_ADDRESS = "address";
    public static final String REGISTRATION_COLUMN_PASSWORD = "password";

    private String userName;
    private String address;
    private String password;

    public UserRegistration() {
    }

    public UserRegistration(String userName, String address, String password) {
        this.userName = userName;
        this.address = address;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void createTable(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE IF NOT EXISTS " + REGISTRATION_TABLE_NAME +
                        " (" + REGISTRATION_COLUMN_ID + " integer primary key, " + REGISTRATION_COLUMN_USERNAME + " text, " + REGISTRATION_COLUMN_ADDRESS + " text, " + REGISTRATION_COLUMN_PASSWORD + " text)"
        );
    }

    @Override
    public String getTableName() {
        return REGISTRATION_TABLE_NAME;
    }

    @Override
    public String[] getColumnNames() {
        return new String[]{REGISTRATION_COLUMN_ID, REGISTRATION_COLUMN_USERNAME, REGISTRATION_COLUMN_ADDRESS, REGISTRATION_COLUMN_PASSWORD};
    }

    @Override
    public boolean insertInDb(SQLiteDatabase db, UserRegistration tableModel) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(REGISTRATION_COLUMN_USERNAME, tableModel.getUserName());
        contentValues.put(REGISTRATION_COLUMN_ADDRESS, tableModel.getAddress());
        contentValues.put(REGISTRATION_COLUMN_PASSWORD, tableModel.getPassword());
        long count = db.insert(getTableName(), null, contentValues);
        return count > 0;
    }

    @Override
    public ArrayList<UserRegistration> getAllData(SQLiteDatabase db) {
        ArrayList<UserRegistration> array_list = new ArrayList<>();

        Cursor cursor = db.rawQuery("select * from " + getTableName(), null);
        try {
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                UserRegistration userRegistration = new UserRegistration();
                userRegistration.setUserName(cursor.getString(cursor.getColumnIndex(REGISTRATION_COLUMN_USERNAME)));
                userRegistration.setAddress(cursor.getString(cursor.getColumnIndex(REGISTRATION_COLUMN_ADDRESS)));
                userRegistration.setPassword(cursor.getString(cursor.getColumnIndex(REGISTRATION_COLUMN_PASSWORD)));
                array_list.add(userRegistration);
                cursor.moveToNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
        }
        return array_list;
    }

    @Override
    public ArrayList<UserRegistration> getFilteredData(SQLiteDatabase db, ColumnValuePair... pair) {
        ArrayList<UserRegistration> array_list = new ArrayList<>();

        String queryString = "select * from " + getTableName();

        if (pair != null) {
            StringBuilder filteredQuery = new StringBuilder();
            if (pair.length > 0) {
                filteredQuery.append(" WHERE ");
            }
            for (int i = 0; i < pair.length; i++) {
                filteredQuery.append(pair[i].getColumnName()).append(" = ").append("'").append(pair[i].getColumnValue()).append("'");
                if (i != pair.length - 1) {
                    filteredQuery.append(" AND ");
                }
            }
            if (filteredQuery.length() > 0) {
                queryString = queryString + filteredQuery.toString();
            }
        }

        Cursor cursor = db.rawQuery(queryString, null);
        try {
            cursor.moveToFirst();

            while (!cursor.isAfterLast()) {
                UserRegistration userRegistration = new UserRegistration();
                userRegistration.setUserName(cursor.getString(cursor.getColumnIndex(REGISTRATION_COLUMN_USERNAME)));
                userRegistration.setAddress(cursor.getString(cursor.getColumnIndex(REGISTRATION_COLUMN_ADDRESS)));
                userRegistration.setPassword(cursor.getString(cursor.getColumnIndex(REGISTRATION_COLUMN_PASSWORD)));
                array_list.add(userRegistration);
                cursor.moveToNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cursor.close();
        }
        return array_list;
    }

    @Override
    public int numberOfRows(SQLiteDatabase db) {
        int numRows = (int) DatabaseUtils.queryNumEntries(db, REGISTRATION_TABLE_NAME);
        return numRows;
    }

    @Override
    public boolean updateData(SQLiteDatabase db, UserRegistration userRegistration) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(REGISTRATION_COLUMN_USERNAME, userRegistration.getUserName());
        contentValues.put(REGISTRATION_COLUMN_ADDRESS, userRegistration.getAddress());
        contentValues.put(REGISTRATION_COLUMN_PASSWORD, userRegistration.getPassword());
        db.update(getTableName(), contentValues, REGISTRATION_COLUMN_USERNAME + " = ? ", new String[] { userRegistration.getUserName() } );
        return true;
    }

    @Override
    public Integer deleteContact(SQLiteDatabase db, UserRegistration tableModel) {
            return db.delete(getTableName(),
                    REGISTRATION_COLUMN_USERNAME + " = ? ",
                    new String[] { tableModel.getUserName() });
    }


}
