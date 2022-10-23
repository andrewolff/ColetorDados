package com.example.coletordados;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BancoDados extends SQLiteOpenHelper {

    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_DADO = "db_Dados";

    private static final String TABELA_DADO = "tb_Dados";

    private static final String COLUNA_COD = "id";
    private static final String COLUNA_FAZENDA = "fazenda";
    private static final String COLUNA_PROJETO = "projeto";
    private static final String COLUNA_ANO = "ano";
    private static final String COLUNA_AMOSTRA = "amostra";
    private static final String COLUNA_NUMEROTALHAO = "numero talhao";
    private static final String COLUNA_EXTRATO = "extrato";
    private static final String COLUNA_AREA = "area";
    private static final String COLUNA_DATA = "data";

    private static final String COLUNA_F1_CAP1 = "f1 cap1";
    private static final String COLUNA_F1_CAP2 = "f1 cap2";
    private static final String COLUNA_F1_CAP3 = "f1 cap3";
    private static final String COLUNA_F1_CAP4 = "f1 cap4";
    private static final String COLUNA_F1_CAP5 = "f1 cap5";
    private static final String COLUNA_F1_CAP6 = "f1 cap6";
    private static final String COLUNA_F1_CAP7 = "f1 cap7";

    private static final String COLUNA_F2_CAP1 = "f2 cap1";
    private static final String COLUNA_F2_CAP2 = "f2 cap2";
    private static final String COLUNA_F2_CAP3 = "f2 cap3";
    private static final String COLUNA_F2_CAP4 = "f2 cap4";
    private static final String COLUNA_F2_CAP5 = "f2 cap5";
    private static final String COLUNA_F2_CAP6 = "f2 cap6";
    private static final String COLUNA_F2_CAP7 = "f2 cap7";

    private static final String COLUNA_F3_CAP1 = "f3 cap1";
    private static final String COLUNA_F3_CAP2 = "f3 cap2";
    private static final String COLUNA_F3_CAP3 = "f3 cap3";
    private static final String COLUNA_F3_CAP4 = "f3 cap4";
    private static final String COLUNA_F3_CAP5 = "f3 cap5";
    private static final String COLUNA_F3_CAP6 = "f3 cap6";
    private static final String COLUNA_F3_CAP7 = "f3 cap7";

    private static final String COLUNA_F4_CAP1 = "f4 cap1";
    private static final String COLUNA_F4_CAP2 = "f4 cap2";
    private static final String COLUNA_F4_CAP3 = "f4 cap3";
    private static final String COLUNA_F4_CAP4 = "f4 cap4";
    private static final String COLUNA_F4_CAP5 = "f4 cap5";
    private static final String COLUNA_F4_CAP6 = "f4 cap6";
    private static final String COLUNA_F4_CAP7 = "f4 cap7";

    private static final String COLUNA_F1_ALT1 = "f1 alt1";
    private static final String COLUNA_F1_ALT2 = "f1 alt2";
    private static final String COLUNA_F1_ALT3 = "f1 alt3";
    private static final String COLUNA_F1_ALT4 = "f1 alt4";
    private static final String COLUNA_F1_ALT5 = "f1 alt5";
    private static final String COLUNA_F1_ALT6 = "f1 alt6";
    private static final String COLUNA_F1_ALT7 = "f1 alt7";

    private static final String COLUNA_F2_ALT1 = "f2 alt1";
    private static final String COLUNA_F2_ALT2 = "f2 alt2";
    private static final String COLUNA_F2_ALT3 = "f2 alt3";
    private static final String COLUNA_F2_ALT4 = "f2 alt4";
    private static final String COLUNA_F2_ALT5 = "f2 alt5";
    private static final String COLUNA_F2_ALT6 = "f2 alt6";
    private static final String COLUNA_F2_ALT7 = "f2 alt7";

    private static final String COLUNA_F3_ALT1 = "f3 alt1";
    private static final String COLUNA_F3_ALT2 = "f3 alt2";
    private static final String COLUNA_F3_ALT3 = "f3 alt3";
    private static final String COLUNA_F3_ALT4 = "f3 alt4";
    private static final String COLUNA_F3_ALT5 = "f3 alt5";
    private static final String COLUNA_F3_ALT6 = "f3 alt6";
    private static final String COLUNA_F3_ALT7 = "f3 alt7";

    private static final String COLUNA_F4_ALT1 = "f4 alt1";
    private static final String COLUNA_F4_ALT2 = "f4 alt2";
    private static final String COLUNA_F4_ALT3 = "f4 alt3";
    private static final String COLUNA_F4_ALT4 = "f4 alt4";
    private static final String COLUNA_F4_ALT5 = "f4 alt5";
    private static final String COLUNA_F4_ALT6 = "f4 alt6";
    private static final String COLUNA_F4_ALT7 = "f4 alt7";

    private static final String COLUNA_F1_COD1 = "f1 cod1";
    private static final String COLUNA_F1_COD2 = "f1 cod2";
    private static final String COLUNA_F1_COD3 = "f1 cod3";
    private static final String COLUNA_F1_COD4 = "f1 cod4";
    private static final String COLUNA_F1_COD5 = "f1 cod5";
    private static final String COLUNA_F1_COD6 = "f1 cod6";
    private static final String COLUNA_F1_COD7 = "f1 cod7";

    private static final String COLUNA_F2_COD1 = "f2 cod1";
    private static final String COLUNA_F2_COD2 = "f2 cod2";
    private static final String COLUNA_F2_COD3 = "f2 cod3";
    private static final String COLUNA_F2_COD4 = "f2 cod4";
    private static final String COLUNA_F2_COD5 = "f2 cod5";
    private static final String COLUNA_F2_COD6 = "f2 cod6";
    private static final String COLUNA_F2_COD7 = "f2 cod7";

    private static final String COLUNA_F3_COD1 = "f3 cod1";
    private static final String COLUNA_F3_COD2 = "f3 cod2";
    private static final String COLUNA_F3_COD3 = "f3 cod3";
    private static final String COLUNA_F3_COD4 = "f3 cod4";
    private static final String COLUNA_F3_COD5 = "f3 cod5";
    private static final String COLUNA_F3_COD6 = "f3 cod6";
    private static final String COLUNA_F3_COD7 = "f3 cod7";

    private static final String COLUNA_F4_COD1 = "f4 cod1";
    private static final String COLUNA_F4_COD2 = "f4 cod2";
    private static final String COLUNA_F4_COD3 = "f4 cod3";
    private static final String COLUNA_F4_COD4 = "f4 cod4";
    private static final String COLUNA_F4_COD5 = "f4 cod5";
    private static final String COLUNA_F4_COD6 = "f4 cod6";
    private static final String COLUNA_F4_COD7 = "f4 cod7";





    public BancoDados(@Nullable Context context) {
        super(context, BANCO_DADO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String QUERY_COLUNA = "CREATE TABLE " + TABELA_DADO + "("
                + COLUNA_COD + "INTEGER PRIMARY KEY,"
                + COLUNA_FAZENDA + " TEXT,"
                + COLUNA_PROJETO + " TEXT,"
                + COLUNA_ANO + " TEXT,"
                + COLUNA_AMOSTRA + " TEXT,"
                + COLUNA_NUMEROTALHAO + " TEXT,"
                + COLUNA_EXTRATO + " TEXT,"
                + COLUNA_AREA + " TEXT,"
                + COLUNA_DATA + " TEXT,"
                + COLUNA_F1_CAP1 + " TEXT,"
                + COLUNA_F1_CAP2 + " TEXT,"
                + COLUNA_F1_CAP3 + " TEXT,"
                + COLUNA_F1_CAP4 + " TEXT,"
                + COLUNA_F1_CAP5 + " TEXT,"
                + COLUNA_F1_CAP6 + " TEXT,"
                + COLUNA_F1_CAP7 + " TEXT,"
                + COLUNA_F2_CAP1 + " TEXT,"
                + COLUNA_F2_CAP2 + " TEXT,"
                + COLUNA_F2_CAP3 + " TEXT,"
                + COLUNA_F2_CAP4 + " TEXT,"
                + COLUNA_F2_CAP5 + " TEXT,"
                + COLUNA_F2_CAP6 + " TEXT,"
                + COLUNA_F2_CAP7 + " TEXT,"
                + COLUNA_F3_CAP1 + " TEXT,"
                + COLUNA_F3_CAP2 + " TEXT,"
                + COLUNA_F3_CAP3 + " TEXT,"
                + COLUNA_F3_CAP4 + " TEXT,"
                + COLUNA_F3_CAP5 + " TEXT,"
                + COLUNA_F3_CAP6 + " TEXT,"
                + COLUNA_F3_CAP7 + " TEXT,"
                + COLUNA_F4_CAP1 + " TEXT,"
                + COLUNA_F4_CAP2 + " TEXT,"
                + COLUNA_F4_CAP3 + " TEXT,"
                + COLUNA_F4_CAP4 + " TEXT,"
                + COLUNA_F4_CAP5 + " TEXT,"
                + COLUNA_F4_CAP6 + " TEXT,"
                + COLUNA_F4_CAP7 + " TEXT,"
                + COLUNA_F1_ALT1 + " TEXT,"
                + COLUNA_F1_ALT2 + " TEXT,"
                + COLUNA_F1_ALT3 + " TEXT,"
                + COLUNA_F1_ALT4 + " TEXT,"
                + COLUNA_F1_ALT5 + " TEXT,"
                + COLUNA_F1_ALT6 + " TEXT,"
                + COLUNA_F1_ALT7 + " TEXT,"
                + COLUNA_F2_ALT1 + " TEXT,"
                + COLUNA_F2_ALT2 + " TEXT,"
                + COLUNA_F2_ALT3 + " TEXT,"
                + COLUNA_F2_ALT4 + " TEXT,"
                + COLUNA_F2_ALT5 + " TEXT,"
                + COLUNA_F2_ALT6 + " TEXT,"
                + COLUNA_F2_ALT7 + " TEXT,"
                + COLUNA_F3_ALT1 + " TEXT,"
                + COLUNA_F3_ALT2 + " TEXT,"
                + COLUNA_F3_ALT3 + " TEXT,"
                + COLUNA_F3_ALT4 + " TEXT,"
                + COLUNA_F3_ALT5 + " TEXT,"
                + COLUNA_F3_ALT6 + " TEXT,"
                + COLUNA_F3_ALT7 + " TEXT,"
                + COLUNA_F4_ALT1 + " TEXT,"
                + COLUNA_F4_ALT2 + " TEXT,"
                + COLUNA_F4_ALT3 + " TEXT,"
                + COLUNA_F4_ALT4 + " TEXT,"
                + COLUNA_F4_ALT5 + " TEXT,"
                + COLUNA_F4_ALT6 + " TEXT,"
                + COLUNA_F4_ALT7 + " TEXT,"
                + COLUNA_F1_COD1 + " TEXT,"
                + COLUNA_F1_COD2 + " TEXT,"
                + COLUNA_F1_COD3 + " TEXT,"
                + COLUNA_F1_COD4 + " TEXT,"
                + COLUNA_F1_COD5 + " TEXT,"
                + COLUNA_F1_COD6 + " TEXT,"
                + COLUNA_F1_COD7 + " TEXT,"
                + COLUNA_F2_COD1 + " TEXT,"
                + COLUNA_F2_COD2 + " TEXT,"
                + COLUNA_F2_COD3 + " TEXT,"
                + COLUNA_F2_COD4 + " TEXT,"
                + COLUNA_F2_COD5 + " TEXT,"
                + COLUNA_F2_COD6 + " TEXT,"
                + COLUNA_F2_COD7 + " TEXT,"
                + COLUNA_F3_COD1 + " TEXT,"
                + COLUNA_F3_COD2 + " TEXT,"
                + COLUNA_F3_COD3 + " TEXT,"
                + COLUNA_F3_COD4 + " TEXT,"
                + COLUNA_F3_COD5 + " TEXT,"
                + COLUNA_F3_COD6 + " TEXT,"
                + COLUNA_F3_COD7 + " TEXT,"
                + COLUNA_F4_COD1 + " TEXT,"
                + COLUNA_F4_COD2 + " TEXT,"
                + COLUNA_F4_COD3 + " TEXT,"
                + COLUNA_F4_COD4 + " TEXT,"
                + COLUNA_F4_COD5 + " TEXT,"
                + COLUNA_F4_COD6 + " TEXT,"
                + COLUNA_F4_COD7 + " TEXT)";

        db.execSQL(QUERY_COLUNA);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }


    /* CRUD ABAIXO */


    void adddado (Dado dado){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COLUNA_FAZENDA, dado.getEditText_Fazenda());
        values.put(COLUNA_PROJETO,dado.getEditText_Projeto());
        values.put(COLUNA_ANO,dado.getEditText_AnoPlantio());
        values.put(COLUNA_AMOSTRA,dado.getEditText_Amostra());
        values.put(COLUNA_NUMEROTALHAO,dado.getEditText_NumeroTalhao());
        values.put(COLUNA_EXTRATO,dado.getEditText_Extrato());
        values.put(COLUNA_AREA,dado.getEditText_Area());
        values.put(COLUNA_DATA,dado.getEditText_Data());
        values.put(COLUNA_F1_CAP1,dado.getEditText_Cap01_F1());
        values.put(COLUNA_F1_CAP2,dado.getEditText_Cap02_F1());
        values.put(COLUNA_F1_CAP3,dado.getEditText_Cap03_F1());
        values.put(COLUNA_F1_CAP4,dado.getEditText_Cap04_F1());
        values.put(COLUNA_F1_CAP5,dado.getEditText_Cap05_F1());
        values.put(COLUNA_F1_CAP6,dado.getEditText_Cap06_F1());
        values.put(COLUNA_F1_CAP7,dado.getEditText_Cap07_F1());
        values.put(COLUNA_F2_CAP1,dado.getEditText_Cap01_F2());
        values.put(COLUNA_F2_CAP2,dado.getEditText_Cap02_F2());
        values.put(COLUNA_F2_CAP3,dado.getEditText_Cap03_F2());
        values.put(COLUNA_F2_CAP4,dado.getEditText_Cap04_F2());
        values.put(COLUNA_F2_CAP5,dado.getEditText_Cap05_F2());
        values.put(COLUNA_F2_CAP6,dado.getEditText_Cap06_F2());
        values.put(COLUNA_F2_CAP7,dado.getEditText_Cap07_F2());
        values.put(COLUNA_F3_CAP1,dado.getEditText_Cap01_F3());
        values.put(COLUNA_F3_CAP2,dado.getEditText_Cap02_F3());
        values.put(COLUNA_F3_CAP3,dado.getEditText_Cap03_F3());
        values.put(COLUNA_F3_CAP4,dado.getEditText_Cap04_F3());
        values.put(COLUNA_F3_CAP5,dado.getEditText_Cap05_F3());
        values.put(COLUNA_F3_CAP6,dado.getEditText_Cap06_F3());
        values.put(COLUNA_F3_CAP7,dado.getEditText_Cap07_F3());
        values.put(COLUNA_F4_CAP1,dado.getEditText_Cap01_F4());
        values.put(COLUNA_F4_CAP2,dado.getEditText_Cap02_F4());
        values.put(COLUNA_F4_CAP3,dado.getEditText_Cap03_F4());
        values.put(COLUNA_F4_CAP4,dado.getEditText_Cap04_F4());
        values.put(COLUNA_F4_CAP5,dado.getEditText_Cap05_F4());
        values.put(COLUNA_F4_CAP6,dado.getEditText_Cap06_F4());
        values.put(COLUNA_F4_CAP7,dado.getEditText_Cap07_F4());
        values.put(COLUNA_F1_ALT1,dado.getEditText_Alt01_F1());
        values.put(COLUNA_F1_ALT2,dado.getEditText_Alt02_F1());
        values.put(COLUNA_F1_ALT3,dado.getEditText_Alt03_F1());
        values.put(COLUNA_F1_ALT4,dado.getEditText_Alt04_F1());
        values.put(COLUNA_F1_ALT5,dado.getEditText_Alt05_F1());
        values.put(COLUNA_F1_ALT6,dado.getEditText_Alt06_F1());
        values.put(COLUNA_F1_ALT7,dado.getEditText_Alt07_F1());
        values.put(COLUNA_F2_ALT1,dado.getEditText_Alt01_F2());
        values.put(COLUNA_F2_ALT2,dado.getEditText_Alt02_F2());
        values.put(COLUNA_F2_ALT3,dado.getEditText_Alt03_F2());
        values.put(COLUNA_F2_ALT4,dado.getEditText_Alt04_F2());
        values.put(COLUNA_F2_ALT5,dado.getEditText_Alt05_F2());
        values.put(COLUNA_F2_ALT6,dado.getEditText_Alt06_F2());
        values.put(COLUNA_F2_ALT7,dado.getEditText_Alt07_F2());
        values.put(COLUNA_F3_ALT1,dado.getEditText_Alt01_F3());
        values.put(COLUNA_F3_ALT2,dado.getEditText_Alt02_F3());
        values.put(COLUNA_F3_ALT3,dado.getEditText_Alt03_F3());
        values.put(COLUNA_F3_ALT4,dado.getEditText_Alt04_F3());
        values.put(COLUNA_F3_ALT5,dado.getEditText_Alt05_F3());
        values.put(COLUNA_F3_ALT6,dado.getEditText_Alt06_F3());
        values.put(COLUNA_F3_ALT7,dado.getEditText_Alt07_F3());
        values.put(COLUNA_F4_ALT1,dado.getEditText_Alt01_F4());
        values.put(COLUNA_F4_ALT2,dado.getEditText_Alt02_F4());
        values.put(COLUNA_F4_ALT3,dado.getEditText_Alt03_F4());
        values.put(COLUNA_F4_ALT4,dado.getEditText_Alt04_F4());
        values.put(COLUNA_F4_ALT5,dado.getEditText_Alt05_F4());
        values.put(COLUNA_F4_ALT6,dado.getEditText_Alt06_F4());
        values.put(COLUNA_F4_ALT7,dado.getEditText_Alt07_F4());
        values.put(COLUNA_F1_COD1,dado.getEditText_Cod01_F1());
        values.put(COLUNA_F1_COD2,dado.getEditText_Cod02_F1());
        values.put(COLUNA_F1_COD3,dado.getEditText_Cod03_F1());
        values.put(COLUNA_F1_COD4,dado.getEditText_Cod04_F1());
        values.put(COLUNA_F1_COD5,dado.getEditText_Cod05_F1());
        values.put(COLUNA_F1_COD6,dado.getEditText_Cod06_F1());
        values.put(COLUNA_F1_COD7,dado.getEditText_Cod07_F1());
        values.put(COLUNA_F2_COD1,dado.getEditText_Cod01_F2());
        values.put(COLUNA_F2_COD2,dado.getEditText_Cod02_F2());
        values.put(COLUNA_F2_COD3,dado.getEditText_Cod03_F2());
        values.put(COLUNA_F2_COD4,dado.getEditText_Cod04_F2());
        values.put(COLUNA_F2_COD5,dado.getEditText_Cod05_F2());
        values.put(COLUNA_F2_COD6,dado.getEditText_Cod06_F2());
        values.put(COLUNA_F2_COD7,dado.getEditText_Cod07_F2());
        values.put(COLUNA_F3_COD1,dado.getEditText_Cod01_F3());
        values.put(COLUNA_F3_COD2,dado.getEditText_Cod02_F3());
        values.put(COLUNA_F3_COD3,dado.getEditText_Cod03_F3());
        values.put(COLUNA_F3_COD4,dado.getEditText_Cod04_F3());
        values.put(COLUNA_F3_COD5,dado.getEditText_Cod05_F3());
        values.put(COLUNA_F3_COD6,dado.getEditText_Cod06_F3());
        values.put(COLUNA_F3_COD7,dado.getEditText_Cod07_F3());
        values.put(COLUNA_F4_COD1,dado.getEditText_Cod01_F4());
        values.put(COLUNA_F4_COD2,dado.getEditText_Cod02_F4());
        values.put(COLUNA_F4_COD3,dado.getEditText_Cod03_F4());
        values.put(COLUNA_F4_COD4,dado.getEditText_Cod04_F4());
        values.put(COLUNA_F4_COD5,dado.getEditText_Cod05_F4());
        values.put(COLUNA_F4_COD6,dado.getEditText_Cod06_F4());
        values.put(COLUNA_F4_COD7,dado.getEditText_Cod07_F4());

        db.insert(TABELA_DADO, null, values);
        db.close();

    }

    void apagardado (Dado dado){

        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABELA_DADO, COLUNA_COD + " = ?", new String[] { String.valueOf(dado.getId())});

        db.close();


    }





}
