package com.adiljamal.android_emr.data;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.adiljamal.android_emr.ui.home.medication.Medication;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "EMRDB";
    private static final int DATABASE_VERSION = 1;
    private  static final String TABLE_MEDICATION= "medications";
    private  static final String _ID= "Id";
    private  static final String _NAME = "Name";
    private  static final String _DOSAGE = "dosage";
    private  static final String _INSTRUCTIONS = "instructions";

    private  static final String CREATE_TABLE = "CREATE TABLE "
            + TABLE_MEDICATION + " ( " + _ID +" INTEGER PRIMARY KEY AUTOINCREMENT, "
            + _NAME + " TEXT NOT NULL, " + _DOSAGE + " TEXT, "+ _INSTRUCTIONS + " TEXT );";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEDICATION);
        onCreate(db);
    }

    public void save(String name, String dosage, String instruction) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(_NAME, name);
        values.put(_DOSAGE, dosage);
        values.put(_INSTRUCTIONS, instruction);

        db.insert(TABLE_MEDICATION, null, values);
        db.close();
    }

    @SuppressLint("Range")
    public ArrayList<Medication> getAllMedicarions() {
        ArrayList<Medication> students = new ArrayList<>();
        String selectQuery = "SELECT * FROM " + TABLE_MEDICATION;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Medication student = new Medication();
                student.setId(cursor.getInt(cursor.getColumnIndex(_ID)));
                student.setName(cursor.getString(cursor.getColumnIndex(_NAME)));
                student.setDosage(cursor.getString(cursor.getColumnIndex(_DOSAGE)));
                student.setInstructions(cursor.getString(cursor.getColumnIndex(_INSTRUCTIONS)));
                students.add(student);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return students;
    }

    public void delete(String name) {
        SQLiteDatabase db = getWritableDatabase();

        String whereClause = "name = ?";
        String[] whereArgs = { name };
        db.delete(TABLE_MEDICATION, whereClause, whereArgs);
    }


    public void update(int id,String name,  String dosage, String instruction) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(_NAME, name);
        values.put(_DOSAGE, dosage);
        values.put(_INSTRUCTIONS, instruction);

        String whereClause = "id = ?";
        String[] whereArgs = { String.valueOf(id) };


        db.update(TABLE_MEDICATION, values, whereClause, whereArgs);
    }
}

