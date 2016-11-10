package com.example.a.lanna;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "score.db";

    // Contacts table name
    private static final String TABLE_LOC1 = "score1";
    private static final String TABLE_LOC2 = "score2";
    private static final String TABLE_LOC3 = "score3";
    private static final String TABLE_LOC4 = "score4";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_SCORE = "score";

    public SQLiteDatabase sqliteDatabaseInstance_ = null;

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        sqliteDatabaseInstance_ = getWritableDatabase();
        sqliteDatabaseInstance_.execSQL("PRAGMA foreign_keys = ON;");
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_CONTACTS_TABLE1 =
                "CREATE TABLE " + TABLE_LOC1 + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_NAME + " TEXT," + KEY_SCORE + " INTEGER" + ");";

        db.execSQL(CREATE_CONTACTS_TABLE1);

        String CREATE_CONTACTS_TABLE2 =
                "CREATE TABLE " + TABLE_LOC2 + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_NAME + " TEXT," + KEY_SCORE + " INTEGER" + ");";
        db.execSQL(CREATE_CONTACTS_TABLE2);

        String CREATE_CONTACTS_TABLE3 =
                "CREATE TABLE " + TABLE_LOC3 + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_NAME + " TEXT," + KEY_SCORE + " INTEGER" + ");";
        db.execSQL(CREATE_CONTACTS_TABLE3);

        String CREATE_CONTACTS_TABLE4 =
                "CREATE TABLE " + TABLE_LOC4 + "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + KEY_NAME + " TEXT," + KEY_SCORE + " INTEGER" + ");";
        db.execSQL(CREATE_CONTACTS_TABLE4);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_LOC);
        // Create tables again
//        onCreate(db);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    public void addScore1(String name , Integer score ) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_NAME,name);
        values.put(KEY_SCORE,score);


        // Inserting Row
        db.insert(TABLE_LOC1, null, values);
        db.close(); // Closing database connection
    }

    // Adding new contact
    public void addScore2(String name , Integer score ) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_NAME,name);
        values.put(KEY_SCORE,score);


        // Inserting Row
        db.insert(TABLE_LOC2, null, values);
        db.close(); // Closing database connection
    }

    // Adding new contact
    public  void addScore3(String name , Integer score ) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_NAME,name);
        values.put(KEY_SCORE,score);


        // Inserting Row
        db.insert(TABLE_LOC3, null, values);
        db.close(); // Closing database connection
    }

    // Adding new contact
    public void addScore4(String name, Integer score) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(KEY_NAME,name);
        values.put(KEY_SCORE,score);


        // Inserting Row
        db.insert(TABLE_LOC4, null, values);
        db.close(); // Closing database connection
    }

//deleteall
    public void deleteall(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_LOC1,null,null);
        db.delete(TABLE_LOC2,null,null);
        db.delete(TABLE_LOC3,null,null);
        db.delete(TABLE_LOC4,null,null);
        db.close();
    }

    public List<Score> getscore1() {
        List<Score> scoreList = new ArrayList<Score>();

        // Select All Query
        String selectQuery = " SELECT * FROM score1 ORDER BY score DESC LIMIT 50";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Score sc = new Score();
                sc.setName(cursor.getString(1));
                sc.setScore(cursor.getString(2));

                // Adding contact to list
                scoreList.add(sc);
            } while (cursor.moveToNext());
        }

        // return contact list
        return scoreList;
    }

    public List<Score> getscore2() {
        List<Score> scoreList = new ArrayList<Score>();

        // Select All Query
        String selectQuery = " SELECT * FROM score2 ORDER BY score DESC LIMIT 50";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Score sc = new Score();
                sc.setName(cursor.getString(1));
                sc.setScore(cursor.getString(2));

                // Adding contact to list
                scoreList.add(sc);
            } while (cursor.moveToNext());
        }

        // return contact list
        return scoreList;
    }

    public List<Score> getscore3() {
        List<Score> scoreList = new ArrayList<Score>();

        // Select All Query
        String selectQuery = " SELECT * FROM score3 ORDER BY score DESC LIMIT 50";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Score sc = new Score();
                sc.setName(cursor.getString(1));
                sc.setScore(cursor.getString(2));

                // Adding contact to list
                scoreList.add(sc);
            } while (cursor.moveToNext());
        }

        // return contact list
        return scoreList;
    }

    public List<Score> getscore4() {
        List<Score> scoreList = new ArrayList<Score>();

        // Select All Query
        String selectQuery = " SELECT * FROM score4 ORDER BY score DESC LIMIT 50";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Score sc = new Score();
                sc.setName(cursor.getString(1));
                sc.setScore(cursor.getString(2));

                // Adding contact to list
                scoreList.add(sc);
            } while (cursor.moveToNext());
        }

        // return contact list
        return scoreList;
    }

//
//    // Getting single contact
//    Contact getContact(int id) {
//        SQLiteDatabase db = this.getReadableDatabase();
//
//        Cursor cursor = db.query(TABLE_CONTACTS, new String[] { KEY_NUM,
//                        KEY_NAME, KEY_PH_NO }, KEY_NUM + "=?",
//                new String[] { String.valueOf(id) }, null, null, null, null);
//        if (cursor != null)
//            cursor.moveToFirst();
//
//        Contact contact = new Contact(Integer.parseInt(cursor.getString(0)),
//                cursor.getString(1), cursor.getString(2));
//        // return contact
//        return contact;
//    }
//
    // Getting All Contacts
//    public List<Contact> getAllContacts() {
//        List<Contact> contactList = new ArrayList<Contact>();
//        // Select All Query
//        String selectQuery = "SELECT  * FROM " + TABLE_CONTACTS;
//
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//
//        // looping through all rows and adding to list
//        if (cursor.moveToFirst()) {
//            do {
//                Contact contact = new Contact();
//                contact.setID(Integer.parseInt(cursor.getString(0)));
//                contact.setName(cursor.getString(1));
//                contact.setPhoneNumber(cursor.getString(2));
//                // Adding contact to list
//                contactList.add(contact);
//            } while (cursor.moveToNext());
//        }
//
//        // return contact list
//        return contactList;
//    }
//
//    // Updating single contact
//    public int updateContact(Contact contact) {
//        SQLiteDatabase db = this.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put(KEY_NAME, contact.getName());
//        values.put(KEY_PH_NO, contact.getPhoneNumber());
//
//        // updating row
//        return db.update(TABLE_CONTACTS, values, KEY_NUM + " = ?",
//                new String[] { String.valueOf(contact.getID()) });
//    }
//
//    // Deleting single contact
//    public void deleteContact(Contact contact) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        db.delete(TABLE_CONTACTS, KEY_NUM + " = ?",
//                new String[] { String.valueOf(contact.getID()) });
//        db.close();
//    }
//
//
//    // Getting contacts Count
//    public int getLocsCount() {
//        String countQuery = "SELECT  * FROM " + TABLE_LOC;
//        SQLiteDatabase db = this.getReadableDatabase();
//        int numRows = (int) DatabaseUtils.queryNumEntries(db,TABLE_LOC);
//        Cursor cursor = db.rawQuery(countQuery, null);
//        cursor.close();

        // return count
//        return cursor.getCount();
//        return numRows;
//    }
}