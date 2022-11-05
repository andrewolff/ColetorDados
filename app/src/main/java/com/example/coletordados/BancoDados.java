package com.example.coletordados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class BancoDados extends SQLiteOpenHelper {
    public BancoDados(@Nullable Context context) {
        super(context, Constants.NOME_BANCO, null, Constants.VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String QUERY_COLUNA = "CREATE TABLE " + Constants.NOME_TABELA + " ("
                + Constants.ID + " INTEGER PRIMARY KEY, "
                + Constants.FAZENDA + " TEXT, "
                + Constants.PROJETO + " TEXT, "
                + Constants.ANO + " TEXT, "
                + Constants.AMOSTRA + " TEXT, "
                + Constants.NUMEROTALHAO + " TEXT, "
                + Constants.EXTRATO + " TEXT, "
                + Constants.AREA + " TEXT, "
                + Constants.DATA + " TEXT, "
                + Constants.F1_CAP1 + " TEXT, "
                + Constants.F1_CAP2 + " TEXT, "
                + Constants.F1_CAP3 + " TEXT, "
                + Constants.F1_CAP4 + " TEXT, "
                + Constants.F1_CAP5 + " TEXT, "
                + Constants.F1_CAP6 + " TEXT, "
                + Constants.F1_CAP7 + " TEXT, "
                + Constants.F2_CAP1 + " TEXT, "
                + Constants.F2_CAP2 + " TEXT, "
                + Constants.F2_CAP3 + " TEXT, "
                + Constants.F2_CAP4 + " TEXT, "
                + Constants.F2_CAP5 + " TEXT, "
                + Constants.F2_CAP6 + " TEXT, "
                + Constants.F2_CAP7 + " TEXT, "
                + Constants.F3_CAP1 + " TEXT, "
                + Constants.F3_CAP2 + " TEXT, "
                + Constants.F3_CAP3 + " TEXT, "
                + Constants.F3_CAP4 + " TEXT, "
                + Constants.F3_CAP5 + " TEXT, "
                + Constants.F3_CAP6 + " TEXT, "
                + Constants.F3_CAP7 + " TEXT, "
                + Constants.F4_CAP1 + " TEXT, "
                + Constants.F4_CAP2 + " TEXT, "
                + Constants.F4_CAP3 + " TEXT, "
                + Constants.F4_CAP4 + " TEXT, "
                + Constants.F4_CAP5 + " TEXT, "
                + Constants.F4_CAP6 + " TEXT, "
                + Constants.F4_CAP7 + " TEXT, "
                + Constants.F1_ALT1 + " TEXT, "
                + Constants.F1_ALT2 + " TEXT, "
                + Constants.F1_ALT3 + " TEXT, "
                + Constants.F1_ALT4 + " TEXT, "
                + Constants.F1_ALT5 + " TEXT, "
                + Constants.F1_ALT6 + " TEXT, "
                + Constants.F1_ALT7 + " TEXT, "
                + Constants.F2_ALT1 + " TEXT, "
                + Constants.F2_ALT2 + " TEXT, "
                + Constants.F2_ALT3 + " TEXT, "
                + Constants.F2_ALT4 + " TEXT, "
                + Constants.F2_ALT5 + " TEXT, "
                + Constants.F2_ALT6 + " TEXT, "
                + Constants.F2_ALT7 + " TEXT, "
                + Constants.F3_ALT1 + " TEXT, "
                + Constants.F3_ALT2 + " TEXT, "
                + Constants.F3_ALT3 + " TEXT, "
                + Constants.F3_ALT4 + " TEXT, "
                + Constants.F3_ALT5 + " TEXT, "
                + Constants.F3_ALT6 + " TEXT, "
                + Constants.F3_ALT7 + " TEXT, "
                + Constants.F4_ALT1 + " TEXT, "
                + Constants.F4_ALT2 + " TEXT, "
                + Constants.F4_ALT3 + " TEXT, "
                + Constants.F4_ALT4 + " TEXT, "
                + Constants.F4_ALT5 + " TEXT, "
                + Constants.F4_ALT6 + " TEXT, "
                + Constants.F4_ALT7 + " TEXT, "
                + Constants.F1_COD1 + " TEXT, "
                + Constants.F1_COD2 + " TEXT, "
                + Constants.F1_COD3 + " TEXT, "
                + Constants.F1_COD4 + " TEXT, "
                + Constants.F1_COD5 + " TEXT, "
                + Constants.F1_COD6 + " TEXT, "
                + Constants.F1_COD7 + " TEXT, "
                + Constants.F2_COD1 + " TEXT, "
                + Constants.F2_COD2 + " TEXT, "
                + Constants.F2_COD3 + " TEXT, "
                + Constants.F2_COD4 + " TEXT, "
                + Constants.F2_COD5 + " TEXT, "
                + Constants.F2_COD6 + " TEXT, "
                + Constants.F2_COD7 + " TEXT, "
                + Constants.F3_COD1 + " TEXT, "
                + Constants.F3_COD2 + " TEXT, "
                + Constants.F3_COD3 + " TEXT, "
                + Constants.F3_COD4 + " TEXT, "
                + Constants.F3_COD5 + " TEXT, "
                + Constants.F3_COD6 + " TEXT, "
                + Constants.F3_COD7 + " TEXT, "
                + Constants.F4_COD1 + " TEXT, "
                + Constants.F4_COD2 + " TEXT, "
                + Constants.F4_COD3 + " TEXT, "
                + Constants.F4_COD4 + " TEXT, "
                + Constants.F4_COD5 + " TEXT, "
                + Constants.F4_COD6 + " TEXT, "
                + Constants.F4_COD7 + " TEXT)";

        db.execSQL(QUERY_COLUNA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    void insert(Dado dado) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        // BASE
        values.put(Constants.FAZENDA, dado.getFazenda());
        values.put(Constants.PROJETO,dado.getProjeto());
        values.put(Constants.ANO,dado.getAno());
        values.put(Constants.AMOSTRA,dado.getAmostra());
        values.put(Constants.NUMEROTALHAO,dado.getNumeroTalhao());
        values.put(Constants.EXTRATO,dado.getExtrato());
        values.put(Constants.AREA,dado.getArea());
        values.put(Constants.DATA,dado.getData());
        // CAP
        values.put(Constants.F1_CAP1,dado.getF1Cap1());
        values.put(Constants.F1_CAP2,dado.getF1Cap2());
        values.put(Constants.F1_CAP3,dado.getF1Cap3());
        values.put(Constants.F1_CAP4,dado.getF1Cap4());
        values.put(Constants.F1_CAP5,dado.getF1Cap5());
        values.put(Constants.F1_CAP6,dado.getF1Cap6());
        values.put(Constants.F1_CAP7,dado.getF1Cap7());
        values.put(Constants.F2_CAP1,dado.getF2Cap1());
        values.put(Constants.F2_CAP2,dado.getF2Cap2());
        values.put(Constants.F2_CAP3,dado.getF2Cap3());
        values.put(Constants.F2_CAP4,dado.getF2Cap4());
        values.put(Constants.F2_CAP5,dado.getF2Cap5());
        values.put(Constants.F2_CAP6,dado.getF2Cap6());
        values.put(Constants.F2_CAP7,dado.getF2Cap7());
        values.put(Constants.F3_CAP1,dado.getF3Cap1());
        values.put(Constants.F3_CAP2,dado.getF3Cap2());
        values.put(Constants.F3_CAP3,dado.getF3Cap3());
        values.put(Constants.F3_CAP4,dado.getF3Cap4());
        values.put(Constants.F3_CAP5,dado.getF3Cap5());
        values.put(Constants.F3_CAP6,dado.getF3Cap6());
        values.put(Constants.F3_CAP7,dado.getF3Cap7());
        values.put(Constants.F4_CAP1,dado.getF4Cap1());
        values.put(Constants.F4_CAP2,dado.getF4Cap2());
        values.put(Constants.F4_CAP3,dado.getF4Cap3());
        values.put(Constants.F4_CAP4,dado.getF4Cap4());
        values.put(Constants.F4_CAP5,dado.getF4Cap5());
        values.put(Constants.F4_CAP6,dado.getF4Cap6());
        values.put(Constants.F4_CAP7,dado.getF4Cap7());
        // ALT
        values.put(Constants.F1_ALT1,dado.getF1Alt1());
        values.put(Constants.F1_ALT2,dado.getF1Alt2());
        values.put(Constants.F1_ALT3,dado.getF1Alt3());
        values.put(Constants.F1_ALT4,dado.getF1Alt4());
        values.put(Constants.F1_ALT5,dado.getF1Alt5());
        values.put(Constants.F1_ALT6,dado.getF1Alt6());
        values.put(Constants.F1_ALT7,dado.getF1Alt7());
        values.put(Constants.F2_ALT1,dado.getF2Alt1());
        values.put(Constants.F2_ALT2,dado.getF2Alt2());
        values.put(Constants.F2_ALT3,dado.getF2Alt3());
        values.put(Constants.F2_ALT4,dado.getF2Alt4());
        values.put(Constants.F2_ALT5,dado.getF2Alt5());
        values.put(Constants.F2_ALT6,dado.getF2Alt6());
        values.put(Constants.F2_ALT7,dado.getF2Alt7());
        values.put(Constants.F3_ALT1,dado.getF3Alt1());
        values.put(Constants.F3_ALT2,dado.getF3Alt2());
        values.put(Constants.F3_ALT3,dado.getF3Alt3());
        values.put(Constants.F3_ALT4,dado.getF3Alt4());
        values.put(Constants.F3_ALT5,dado.getF3Alt5());
        values.put(Constants.F3_ALT6,dado.getF3Alt6());
        values.put(Constants.F3_ALT7,dado.getF3Alt7());
        values.put(Constants.F4_ALT1,dado.getF4Alt1());
        values.put(Constants.F4_ALT2,dado.getF4Alt2());
        values.put(Constants.F4_ALT3,dado.getF4Alt3());
        values.put(Constants.F4_ALT4,dado.getF4Alt4());
        values.put(Constants.F4_ALT5,dado.getF4Alt5());
        values.put(Constants.F4_ALT6,dado.getF4Alt6());
        values.put(Constants.F4_ALT7,dado.getF4Alt7());
        // COD
        values.put(Constants.F1_COD1,dado.getF1Cod1());
        values.put(Constants.F1_COD2,dado.getF1Cod2());
        values.put(Constants.F1_COD3,dado.getF1Cod3());
        values.put(Constants.F1_COD4,dado.getF1Cod4());
        values.put(Constants.F1_COD5,dado.getF1Cod5());
        values.put(Constants.F1_COD6,dado.getF1Cod6());
        values.put(Constants.F1_COD7,dado.getF1Cod7());
        values.put(Constants.F2_COD1,dado.getF2Cod1());
        values.put(Constants.F2_COD2,dado.getF2Cod2());
        values.put(Constants.F2_COD3,dado.getF2Cod3());
        values.put(Constants.F2_COD4,dado.getF2Cod4());
        values.put(Constants.F2_COD5,dado.getF2Cod5());
        values.put(Constants.F2_COD6,dado.getF2Cod6());
        values.put(Constants.F2_COD7,dado.getF2Cod7());
        values.put(Constants.F3_COD1,dado.getF3Cod1());
        values.put(Constants.F3_COD2,dado.getF3Cod2());
        values.put(Constants.F3_COD3,dado.getF3Cod3());
        values.put(Constants.F3_COD4,dado.getF3Cod4());
        values.put(Constants.F3_COD5,dado.getF3Cod5());
        values.put(Constants.F3_COD6,dado.getF3Cod6());
        values.put(Constants.F3_COD7,dado.getF3Cod7());
        values.put(Constants.F4_COD1,dado.getF4Cod1());
        values.put(Constants.F4_COD2,dado.getF4Cod2());
        values.put(Constants.F4_COD3,dado.getF4Cod3());
        values.put(Constants.F4_COD4,dado.getF4Cod4());
        values.put(Constants.F4_COD5,dado.getF4Cod5());
        values.put(Constants.F4_COD6,dado.getF4Cod6());
        values.put(Constants.F4_COD7,dado.getF4Cod7());

        db.insert(Constants.NOME_TABELA, null, values);
        db.close();
    }

    public ArrayList<Dado> getDados() {
        ArrayList<Dado> listsDados = new ArrayList<Dado>();
        String selectQuery = "SELECT * FROM " + Constants.NOME_TABELA;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                Dado dado = new Dado();

                // BASE
                dado.setId(Integer.parseInt(cursor.getString(0)));
                dado.setFazenda(cursor.getString(1));
                dado.setProjeto(cursor.getString(2));
                dado.setAno(cursor.getString(3));
                dado.setAmostra(cursor.getString(4));
                dado.setNumeroTalhao(cursor.getString(5));
                dado.setExtrato(cursor.getString(6));
                dado.setArea(cursor.getString(7));
                dado.setData(cursor.getString(8));
                // CAP
                dado.setF1Cap1(cursor.getString(9));
                dado.setF1Cap2(cursor.getString(10));
                dado.setF1Cap3(cursor.getString(11));
                dado.setF1Cap4(cursor.getString(12));
                dado.setF1Cap5(cursor.getString(13));
                dado.setF1Cap6(cursor.getString(14));
                dado.setF1Cap7(cursor.getString(15));
                dado.setF2Cap1(cursor.getString(16));
                dado.setF2Cap2(cursor.getString(17));
                dado.setF2Cap3(cursor.getString(18));
                dado.setF2Cap4(cursor.getString(19));
                dado.setF2Cap5(cursor.getString(20));
                dado.setF2Cap6(cursor.getString(21));
                dado.setF2Cap7(cursor.getString(22));
                dado.setF3Cap1(cursor.getString(23));
                dado.setF3Cap2(cursor.getString(24));
                dado.setF3Cap3(cursor.getString(25));
                dado.setF3Cap4(cursor.getString(26));
                dado.setF3Cap5(cursor.getString(27));
                dado.setF3Cap6(cursor.getString(28));
                dado.setF3Cap7(cursor.getString(29));
                dado.setF4Cap1(cursor.getString(30));
                dado.setF4Cap2(cursor.getString(31));
                dado.setF4Cap3(cursor.getString(32));
                dado.setF4Cap4(cursor.getString(33));
                dado.setF4Cap5(cursor.getString(34));
                dado.setF4Cap6(cursor.getString(35));
                dado.setF4Cap7(cursor.getString(36));
                // ALT
                dado.setF1Alt1(cursor.getString(37));
                dado.setF1Alt2(cursor.getString(38));
                dado.setF1Alt3(cursor.getString(39));
                dado.setF1Alt4(cursor.getString(40));
                dado.setF1Alt5(cursor.getString(41));
                dado.setF1Alt6(cursor.getString(42));
                dado.setF1Alt7(cursor.getString(43));
                dado.setF2Alt1(cursor.getString(44));
                dado.setF2Alt2(cursor.getString(45));
                dado.setF2Alt3(cursor.getString(46));
                dado.setF2Alt4(cursor.getString(47));
                dado.setF2Alt5(cursor.getString(48));
                dado.setF2Alt6(cursor.getString(49));
                dado.setF2Alt7(cursor.getString(50));
                dado.setF3Alt1(cursor.getString(51));
                dado.setF3Alt2(cursor.getString(52));
                dado.setF3Alt3(cursor.getString(53));
                dado.setF3Alt4(cursor.getString(54));
                dado.setF3Alt5(cursor.getString(55));
                dado.setF3Alt6(cursor.getString(56));
                dado.setF3Alt7(cursor.getString(57));
                dado.setF4Alt1(cursor.getString(58));
                dado.setF4Alt2(cursor.getString(59));
                dado.setF4Alt3(cursor.getString(60));
                dado.setF4Alt4(cursor.getString(61));
                dado.setF4Alt5(cursor.getString(62));
                dado.setF4Alt6(cursor.getString(63));
                dado.setF4Alt7(cursor.getString(64));
                // COD
                dado.setF1Cod1(cursor.getString(65));
                dado.setF1Cod2(cursor.getString(66));
                dado.setF1Cod3(cursor.getString(67));
                dado.setF1Cod4(cursor.getString(68));
                dado.setF1Cod5(cursor.getString(69));
                dado.setF1Cod6(cursor.getString(70));
                dado.setF1Cod7(cursor.getString(71));
                dado.setF2Cod1(cursor.getString(72));
                dado.setF2Cod2(cursor.getString(73));
                dado.setF2Cod3(cursor.getString(74));
                dado.setF2Cod4(cursor.getString(75));
                dado.setF2Cod5(cursor.getString(76));
                dado.setF2Cod6(cursor.getString(77));
                dado.setF2Cod7(cursor.getString(78));
                dado.setF3Cod1(cursor.getString(79));
                dado.setF3Cod2(cursor.getString(80));
                dado.setF3Cod3(cursor.getString(81));
                dado.setF3Cod4(cursor.getString(82));
                dado.setF3Cod5(cursor.getString(83));
                dado.setF3Cod6(cursor.getString(84));
                dado.setF3Cod7(cursor.getString(85));
                dado.setF4Cod1(cursor.getString(86));
                dado.setF4Cod2(cursor.getString(87));
                dado.setF4Cod3(cursor.getString(88));
                dado.setF4Cod4(cursor.getString(89));
                dado.setF4Cod5(cursor.getString(90));
                dado.setF4Cod6(cursor.getString(91));
                dado.setF4Cod7(cursor.getString(92));

                listsDados.add(dado);

            } while (cursor.moveToNext());
        }

        return listsDados;
    }

    public int total() {
        int count = 0;
        String countQuery = "SELECT " + Constants.ID + " FROM " + Constants.NOME_TABELA;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        if(cursor != null && !cursor.isClosed()){
            count = cursor.getCount();
            cursor.close();
        }

        return count;
    }

    void delete(Dado dado) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(Constants.NOME_TABELA, Constants.ID + " = ?", new String[] { String.valueOf(dado.getId())});
        db.close();
    }
}
