package com.example.coletordados;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaAdapter extends RecyclerView.Adapter<LineHolder> {
    private List<Dado> dados;
    private Context context;
    private BancoDados db;

    public ListaAdapter(Context context, ArrayList<Dado> dados) {
        this.context = context;
        this.dados = dados;
        db = new BancoDados(context);
    }

    @Override
    public LineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LineHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista, parent, false));
    }

    @Override
    public void onBindViewHolder(LineHolder holder, int position) {
        Dado d = dados.get(position);

        holder.txtItemId.setText(String.valueOf(d.getId()));
        holder.txtItemFazenda.setText(d.getFazenda());
        holder.txtItemProjeto.setText(d.getProjeto());

        holder.btItemExcluir.setOnClickListener(view -> {
            removerItem(d, position);
        });

        holder.btItemExportar.setOnClickListener(view -> {
            exportarItem(d);
        });
    }

    @Override
    public int getItemCount() {
        return dados != null ? dados.size() : 0;
    }

    private void removerItem(Dado dado, int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
        builder.setTitle("Atenção");
        builder.setMessage("Confirma a exclusão da coleta de ID: " + dado.getId() + "?");

        builder.setPositiveButton("Sim", (arg0, arg1) -> {
            db.delete(dado);
            dados.remove(position);
            notifyItemRemoved(position);
            notifyItemRangeChanged(position, dados.size());
        });

        builder.setNeutralButton("Não", (arg0, arg1) -> {});

        AlertDialog alert = builder.create();
        alert.show();
    }

    private void exportarItem(Dado dado) {
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Coleta");

        Row rowTitle = sheet.createRow(0);
        Row rowData = sheet.createRow(1);

        Cell cellId = rowTitle.createCell(0);
        cellId.setCellValue("ID");
        Cell cellIdValue = rowData.createCell(0);
        cellIdValue.setCellValue(dado.getId());

        Cell cellFazenda = rowTitle.createCell(1);
        cellFazenda.setCellValue("Fazenda");
        Cell cellFazendaValue = rowData.createCell(1);
        cellFazendaValue.setCellValue(dado.getFazenda());

        Cell cellProjeto = rowTitle.createCell(2);
        cellProjeto.setCellValue("Projeto");
        Cell cellProjetoValue = rowData.createCell(2);
        cellProjetoValue.setCellValue(dado.getProjeto());

        Cell cellAno = rowTitle.createCell(3);
        cellAno.setCellValue("Ano");
        Cell cellAnoValue = rowData.createCell(3);
        cellAnoValue.setCellValue(dado.getAno());

        Cell cellAmostra = rowTitle.createCell(4);
        cellAmostra.setCellValue("Amostra");
        Cell cellAmostraValue = rowData.createCell(4);
        cellAmostraValue.setCellValue(dado.getAmostra());

        Cell cellNumTalhao = rowTitle.createCell(5);
        cellNumTalhao.setCellValue("Num Talhão");
        Cell cellNumTalhaoValue = rowData.createCell(5);
        cellNumTalhaoValue.setCellValue(dado.getNumeroTalhao());

        Cell cellExtrato = rowTitle.createCell(6);
        cellExtrato.setCellValue("Extato");
        Cell cellExtratoValue = rowData.createCell(6);
        cellExtratoValue.setCellValue(dado.getExtrato());

        Cell cellArea = rowTitle.createCell(7);
        cellArea.setCellValue("Área");
        Cell cellAreaValue = rowData.createCell(7);
        cellAreaValue.setCellValue(dado.getArea());

        Cell cellData = rowTitle.createCell(8);
        cellData.setCellValue("Data");
        Cell cellDataValue = rowData.createCell(8);
        cellDataValue.setCellValue(dado.getData());

        // F1
        Cell cellF1Alt1 = rowTitle.createCell(9); cellF1Alt1.setCellValue("F1Alt1");
        Cell cellF1Alt1Value = rowData.createCell(9); cellF1Alt1Value.setCellValue(dado.getF1Alt1());

        Cell cellF1Cap1 = rowTitle.createCell(10); cellF1Cap1.setCellValue("F1Cap1");
        Cell cellF1Cap1Value = rowData.createCell(10); cellF1Cap1Value.setCellValue(dado.getF1Cap1());

        Cell cellF1Cod1 = rowTitle.createCell(11); cellF1Cod1.setCellValue("F1Cod1");
        Cell cellF1Cod1Value = rowData.createCell(11); cellF1Cod1Value.setCellValue(dado.getF1Cod1());

        Cell cellF1Alt2 = rowTitle.createCell(12); cellF1Alt2.setCellValue("F1Alt2");
        Cell cellF1Alt2Value = rowData.createCell(12); cellF1Alt2Value.setCellValue(dado.getF1Alt2());

        Cell cellF1Cap2 = rowTitle.createCell(13); cellF1Cap2.setCellValue("F1Cap2");
        Cell cellF1Cap2Value = rowData.createCell(13); cellF1Cap2Value.setCellValue(dado.getF1Cap2());

        Cell cellF1Cod2 = rowTitle.createCell(14); cellF1Cod2.setCellValue("F1Cod2");
        Cell cellF1Cod2Value = rowData.createCell(14); cellF1Cod2Value.setCellValue(dado.getF1Cod2());

        Cell cellF1Alt3 = rowTitle.createCell(15); cellF1Alt3.setCellValue("F1Alt3");
        Cell cellF1Alt3Value = rowData.createCell(15); cellF1Alt3Value.setCellValue(dado.getF1Alt3());

        Cell cellF1Cap3 = rowTitle.createCell(16); cellF1Cap3.setCellValue("F1Cap3");
        Cell cellF1Cap3Value = rowData.createCell(16); cellF1Cap3Value.setCellValue(dado.getF1Cap3());

        Cell cellF1Cod3 = rowTitle.createCell(17); cellF1Cod3.setCellValue("F1Cod3");
        Cell cellF1Cod3Value = rowData.createCell(17); cellF1Cod3Value.setCellValue(dado.getF1Cod3());

        Cell cellF1Alt4 = rowTitle.createCell(18); cellF1Alt4.setCellValue("F1Alt4");
        Cell cellF1Alt4Value = rowData.createCell(18); cellF1Alt4Value.setCellValue(dado.getF1Alt4());

        Cell cellF1Cap4 = rowTitle.createCell(19); cellF1Cap4.setCellValue("F1Cap4");
        Cell cellF1Cap4Value = rowData.createCell(19); cellF1Cap4Value.setCellValue(dado.getF1Cap4());

        Cell cellF1Cod4 = rowTitle.createCell(20); cellF1Cod4.setCellValue("F1Cod4");
        Cell cellF1Cod4Value = rowData.createCell(20); cellF1Cod4Value.setCellValue(dado.getF1Cod4());

        Cell cellF1Alt5 = rowTitle.createCell(21); cellF1Alt5.setCellValue("F1Alt5");
        Cell cellF1Alt5Value = rowData.createCell(21); cellF1Alt5Value.setCellValue(dado.getF1Alt5());

        Cell cellF1Cap5 = rowTitle.createCell(22); cellF1Cap5.setCellValue("F1Cap5");
        Cell cellF1Cap5Value = rowData.createCell(22); cellF1Cap5Value.setCellValue(dado.getF1Cap5());

        Cell cellF1Cod5 = rowTitle.createCell(23); cellF1Cod5.setCellValue("F1Cod5");
        Cell cellF1Cod5Value = rowData.createCell(23); cellF1Cod5Value.setCellValue(dado.getF1Cod5());

        Cell cellF1Alt6 = rowTitle.createCell(24); cellF1Alt6.setCellValue("F1Alt6");
        Cell cellF1Alt6Value = rowData.createCell(24); cellF1Alt6Value.setCellValue(dado.getF1Alt6());

        Cell cellF1Cap6 = rowTitle.createCell(25); cellF1Cap6.setCellValue("F1Cap6");
        Cell cellF1Cap6Value = rowData.createCell(25); cellF1Cap6Value.setCellValue(dado.getF1Cap6());

        Cell cellF1Cod6 = rowTitle.createCell(26); cellF1Cod6.setCellValue("F1Cod6");
        Cell cellF1Cod6Value = rowData.createCell(26); cellF1Cod6Value.setCellValue(dado.getF1Cod6());

        Cell cellF1Alt7 = rowTitle.createCell(27); cellF1Alt7.setCellValue("F1Alt7");
        Cell cellF1Alt7Value = rowData.createCell(27); cellF1Alt7Value.setCellValue(dado.getF1Alt7());

        Cell cellF1Cap7 = rowTitle.createCell(28); cellF1Cap7.setCellValue("F1Cap7");
        Cell cellF1Cap7Value = rowData.createCell(28); cellF1Cap7Value.setCellValue(dado.getF1Cap7());

        Cell cellF1Cod7 = rowTitle.createCell(29); cellF1Cod7.setCellValue("F1Cod7");
        Cell cellF1Cod7Value = rowData.createCell(29); cellF1Cod7Value.setCellValue(dado.getF1Cod7());

        // F2
        Cell cellF2Alt1 = rowTitle.createCell(30); cellF2Alt1.setCellValue("F2Alt1");
        Cell cellF2Alt1Value = rowData.createCell(30); cellF2Alt1Value.setCellValue(dado.getF2Alt1());

        Cell cellF2Cap1 = rowTitle.createCell(31); cellF2Cap1.setCellValue("F2Cap1");
        Cell cellF2Cap1Value = rowData.createCell(31); cellF2Cap1Value.setCellValue(dado.getF2Cap1());

        Cell cellF2Cod1 = rowTitle.createCell(32); cellF2Cod1.setCellValue("F2Cod1");
        Cell cellF2Cod1Value = rowData.createCell(32); cellF2Cod1Value.setCellValue(dado.getF2Cod1());

        Cell cellF2Alt2 = rowTitle.createCell(33); cellF2Alt2.setCellValue("F2Alt2");
        Cell cellF2Alt2Value = rowData.createCell(33); cellF2Alt2Value.setCellValue(dado.getF2Alt2());

        Cell cellF2Cap2 = rowTitle.createCell(34); cellF2Cap2.setCellValue("F2Cap2");
        Cell cellF2Cap2Value = rowData.createCell(34); cellF2Cap2Value.setCellValue(dado.getF2Cap2());

        Cell cellF2Cod2 = rowTitle.createCell(35); cellF2Cod2.setCellValue("F2Cod2");
        Cell cellF2Cod2Value = rowData.createCell(35); cellF2Cod2Value.setCellValue(dado.getF2Cod2());

        Cell cellF2Alt3 = rowTitle.createCell(36); cellF2Alt3.setCellValue("F2Alt3");
        Cell cellF2Alt3Value = rowData.createCell(36); cellF2Alt3Value.setCellValue(dado.getF2Alt3());

        Cell cellF2Cap3 = rowTitle.createCell(37); cellF2Cap3.setCellValue("F2Cap3");
        Cell cellF2Cap3Value = rowData.createCell(37); cellF2Cap3Value.setCellValue(dado.getF2Cap3());

        Cell cellF2Cod3 = rowTitle.createCell(38); cellF2Cod3.setCellValue("F2Cod3");
        Cell cellF2Cod3Value = rowData.createCell(38); cellF2Cod3Value.setCellValue(dado.getF2Cod3());

        Cell cellF2Alt4 = rowTitle.createCell(39); cellF2Alt4.setCellValue("F2Alt4");
        Cell cellF2Alt4Value = rowData.createCell(39); cellF2Alt4Value.setCellValue(dado.getF2Alt4());

        Cell cellF2Cap4 = rowTitle.createCell(40); cellF2Cap4.setCellValue("F2Cap4");
        Cell cellF2Cap4Value = rowData.createCell(40); cellF2Cap4Value.setCellValue(dado.getF2Cap4());

        Cell cellF2Cod4 = rowTitle.createCell(41); cellF2Cod4.setCellValue("F2Cod4");
        Cell cellF2Cod4Value = rowData.createCell(41); cellF2Cod4Value.setCellValue(dado.getF2Cod4());

        Cell cellF2Alt5 = rowTitle.createCell(42); cellF2Alt5.setCellValue("F2Alt5");
        Cell cellF2Alt5Value = rowData.createCell(42); cellF2Alt5Value.setCellValue(dado.getF2Alt5());

        Cell cellF2Cap5 = rowTitle.createCell(43); cellF2Cap5.setCellValue("F2Cap5");
        Cell cellF2Cap5Value = rowData.createCell(43); cellF2Cap5Value.setCellValue(dado.getF2Cap5());

        Cell cellF2Cod5 = rowTitle.createCell(44); cellF2Cod5.setCellValue("F2Cod5");
        Cell cellF2Cod5Value = rowData.createCell(44); cellF2Cod5Value.setCellValue(dado.getF2Cod5());

        Cell cellF2Alt6 = rowTitle.createCell(45); cellF2Alt6.setCellValue("F2Alt6");
        Cell cellF2Alt6Value = rowData.createCell(45); cellF2Alt6Value.setCellValue(dado.getF2Alt6());

        Cell cellF2Cap6 = rowTitle.createCell(46); cellF2Cap6.setCellValue("F2Cap6");
        Cell cellF2Cap6Value = rowData.createCell(46); cellF2Cap6Value.setCellValue(dado.getF2Cap6());

        Cell cellF2Cod6 = rowTitle.createCell(47); cellF2Cod6.setCellValue("F2Cod6");
        Cell cellF2Cod6Value = rowData.createCell(47); cellF2Cod6Value.setCellValue(dado.getF2Cod6());

        Cell cellF2Alt7 = rowTitle.createCell(48); cellF2Alt7.setCellValue("F2Alt7");
        Cell cellF2Alt7Value = rowData.createCell(48); cellF2Alt7Value.setCellValue(dado.getF2Alt7());

        Cell cellF2Cap7 = rowTitle.createCell(49); cellF2Cap7.setCellValue("F2Cap7");
        Cell cellF2Cap7Value = rowData.createCell(49); cellF2Cap7Value.setCellValue(dado.getF2Cap7());

        Cell cellF2Cod7 = rowTitle.createCell(50); cellF2Cod7.setCellValue("F2Cod7");
        Cell cellF2Cod7Value = rowData.createCell(50); cellF2Cod7Value.setCellValue(dado.getF2Cod7());

        // F3
        Cell cellF3Alt1 = rowTitle.createCell(51); cellF3Alt1.setCellValue("F3Alt1");
        Cell cellF3Alt1Value = rowData.createCell(51); cellF3Alt1Value.setCellValue(dado.getF3Alt1());

        Cell cellF3Cap1 = rowTitle.createCell(52); cellF3Cap1.setCellValue("F3Cap1");
        Cell cellF3Cap1Value = rowData.createCell(52); cellF3Cap1Value.setCellValue(dado.getF3Cap1());

        Cell cellF3Cod1 = rowTitle.createCell(53); cellF3Cod1.setCellValue("F3Cod1");
        Cell cellF3Cod1Value = rowData.createCell(53); cellF3Cod1Value.setCellValue(dado.getF3Cod1());

        Cell cellF3Alt2 = rowTitle.createCell(54); cellF3Alt2.setCellValue("F3Alt2");
        Cell cellF3Alt2Value = rowData.createCell(54); cellF3Alt2Value.setCellValue(dado.getF3Alt2());

        Cell cellF3Cap2 = rowTitle.createCell(55); cellF3Cap2.setCellValue("F3Cap2");
        Cell cellF3Cap2Value = rowData.createCell(55); cellF3Cap2Value.setCellValue(dado.getF3Cap2());

        Cell cellF3Cod2 = rowTitle.createCell(56); cellF3Cod2.setCellValue("F3Cod2");
        Cell cellF3Cod2Value = rowData.createCell(56); cellF3Cod2Value.setCellValue(dado.getF3Cod2());

        Cell cellF3Alt3 = rowTitle.createCell(57); cellF3Alt3.setCellValue("F3Alt3");
        Cell cellF3Alt3Value = rowData.createCell(57); cellF3Alt3Value.setCellValue(dado.getF3Alt3());

        Cell cellF3Cap3 = rowTitle.createCell(58); cellF3Cap3.setCellValue("F3Cap3");
        Cell cellF3Cap3Value = rowData.createCell(58); cellF3Cap3Value.setCellValue(dado.getF3Cap3());

        Cell cellF3Cod3 = rowTitle.createCell(59); cellF3Cod3.setCellValue("F3Cod3");
        Cell cellF3Cod3Value = rowData.createCell(59); cellF3Cod3Value.setCellValue(dado.getF3Cod3());

        Cell cellF3Alt4 = rowTitle.createCell(60); cellF3Alt4.setCellValue("F3Alt4");
        Cell cellF3Alt4Value = rowData.createCell(60); cellF3Alt4Value.setCellValue(dado.getF3Alt4());

        Cell cellF3Cap4 = rowTitle.createCell(61); cellF3Cap4.setCellValue("F3Cap4");
        Cell cellF3Cap4Value = rowData.createCell(61); cellF3Cap4Value.setCellValue(dado.getF3Cap4());

        Cell cellF3Cod4 = rowTitle.createCell(62); cellF3Cod4.setCellValue("F3Cod4");
        Cell cellF3Cod4Value = rowData.createCell(62); cellF3Cod4Value.setCellValue(dado.getF3Cod4());

        Cell cellF3Alt5 = rowTitle.createCell(63); cellF3Alt5.setCellValue("F3Alt5");
        Cell cellF3Alt5Value = rowData.createCell(63); cellF3Alt5Value.setCellValue(dado.getF3Alt5());

        Cell cellF3Cap5 = rowTitle.createCell(64); cellF3Cap5.setCellValue("F3Cap5");
        Cell cellF3Cap5Value = rowData.createCell(64); cellF3Cap5Value.setCellValue(dado.getF3Cap5());

        Cell cellF3Cod5 = rowTitle.createCell(65); cellF3Cod5.setCellValue("F3Cod5");
        Cell cellF3Cod5Value = rowData.createCell(65); cellF3Cod5Value.setCellValue(dado.getF3Cod5());

        Cell cellF3Alt6 = rowTitle.createCell(66); cellF3Alt6.setCellValue("F3Alt6");
        Cell cellF3Alt6Value = rowData.createCell(66); cellF3Alt6Value.setCellValue(dado.getF3Alt6());

        Cell cellF3Cap6 = rowTitle.createCell(67); cellF3Cap6.setCellValue("F3Cap6");
        Cell cellF3Cap6Value = rowData.createCell(67); cellF3Cap6Value.setCellValue(dado.getF3Cap6());

        Cell cellF3Cod6 = rowTitle.createCell(68); cellF3Cod6.setCellValue("F3Cod6");
        Cell cellF3Cod6Value = rowData.createCell(68); cellF3Cod6Value.setCellValue(dado.getF3Cod6());

        Cell cellF3Alt7 = rowTitle.createCell(69); cellF3Alt7.setCellValue("F3Alt7");
        Cell cellF3Alt7Value = rowData.createCell(69); cellF3Alt7Value.setCellValue(dado.getF3Alt7());

        Cell cellF3Cap7 = rowTitle.createCell(70); cellF3Cap7.setCellValue("F3Cap7");
        Cell cellF3Cap7Value = rowData.createCell(70); cellF3Cap7Value.setCellValue(dado.getF3Cap7());

        Cell cellF3Cod7 = rowTitle.createCell(71); cellF3Cod7.setCellValue("F3Cod7");
        Cell cellF3Cod7Value = rowData.createCell(71); cellF3Cod7Value.setCellValue(dado.getF3Cod7());

        // F4
        Cell cellF4Alt1 = rowTitle.createCell(72); cellF4Alt1.setCellValue("F4Alt1");
        Cell cellF4Alt1Value = rowData.createCell(72); cellF4Alt1Value.setCellValue(dado.getF4Alt1());

        Cell cellF4Cap1 = rowTitle.createCell(73); cellF4Cap1.setCellValue("F4Cap1");
        Cell cellF4Cap1Value = rowData.createCell(73); cellF4Cap1Value.setCellValue(dado.getF4Cap1());

        Cell cellF4Cod1 = rowTitle.createCell(74); cellF4Cod1.setCellValue("F4Cod1");
        Cell cellF4Cod1Value = rowData.createCell(74); cellF4Cod1Value.setCellValue(dado.getF4Cod1());

        Cell cellF4Alt2 = rowTitle.createCell(75); cellF4Alt2.setCellValue("F4Alt2");
        Cell cellF4Alt2Value = rowData.createCell(75); cellF4Alt2Value.setCellValue(dado.getF4Alt2());

        Cell cellF4Cap2 = rowTitle.createCell(76); cellF4Cap2.setCellValue("F4Cap2");
        Cell cellF4Cap2Value = rowData.createCell(76); cellF4Cap2Value.setCellValue(dado.getF4Cap2());

        Cell cellF4Cod2 = rowTitle.createCell(77); cellF4Cod2.setCellValue("F4Cod2");
        Cell cellF4Cod2Value = rowData.createCell(77); cellF4Cod2Value.setCellValue(dado.getF4Cod2());

        Cell cellF4Alt3 = rowTitle.createCell(78); cellF4Alt3.setCellValue("F4Alt3");
        Cell cellF4Alt3Value = rowData.createCell(78); cellF4Alt3Value.setCellValue(dado.getF4Alt3());

        Cell cellF4Cap3 = rowTitle.createCell(79); cellF4Cap3.setCellValue("F4Cap3");
        Cell cellF4Cap3Value = rowData.createCell(79); cellF4Cap3Value.setCellValue(dado.getF4Cap3());

        Cell cellF4Cod3 = rowTitle.createCell(80); cellF4Cod3.setCellValue("F4Cod3");
        Cell cellF4Cod3Value = rowData.createCell(80); cellF4Cod3Value.setCellValue(dado.getF4Cod3());

        Cell cellF4Alt4 = rowTitle.createCell(81); cellF4Alt4.setCellValue("F4Alt4");
        Cell cellF4Alt4Value = rowData.createCell(81); cellF4Alt4Value.setCellValue(dado.getF4Alt4());

        Cell cellF4Cap4 = rowTitle.createCell(82); cellF4Cap4.setCellValue("F4Cap4");
        Cell cellF4Cap4Value = rowData.createCell(82); cellF4Cap4Value.setCellValue(dado.getF4Cap4());

        Cell cellF4Cod4 = rowTitle.createCell(83); cellF4Cod4.setCellValue("F4Cod4");
        Cell cellF4Cod4Value = rowData.createCell(83); cellF4Cod4Value.setCellValue(dado.getF4Cod4());

        Cell cellF4Alt5 = rowTitle.createCell(84); cellF4Alt5.setCellValue("F4Alt5");
        Cell cellF4Alt5Value = rowData.createCell(84); cellF4Alt5Value.setCellValue(dado.getF4Alt5());

        Cell cellF4Cap5 = rowTitle.createCell(85); cellF4Cap5.setCellValue("F4Cap5");
        Cell cellF4Cap5Value = rowData.createCell(85); cellF4Cap5Value.setCellValue(dado.getF4Cap5());

        Cell cellF4Cod5 = rowTitle.createCell(86); cellF4Cod5.setCellValue("F4Cod5");
        Cell cellF4Cod5Value = rowData.createCell(86); cellF4Cod5Value.setCellValue(dado.getF4Cod5());

        Cell cellF4Alt6 = rowTitle.createCell(87); cellF4Alt6.setCellValue("F4Alt6");
        Cell cellF4Alt6Value = rowData.createCell(87); cellF4Alt6Value.setCellValue(dado.getF4Alt6());

        Cell cellF4Cap6 = rowTitle.createCell(88); cellF4Cap6.setCellValue("F4Cap6");
        Cell cellF4Cap6Value = rowData.createCell(88); cellF4Cap6Value.setCellValue(dado.getF4Cap6());

        Cell cellF4Cod6 = rowTitle.createCell(89); cellF4Cod6.setCellValue("F4Cod6");
        Cell cellF4Cod6Value = rowData.createCell(89); cellF4Cod6Value.setCellValue(dado.getF4Cod6());

        Cell cellF4Alt7 = rowTitle.createCell(90); cellF4Alt7.setCellValue("F4Alt7");
        Cell cellF4Alt7Value = rowData.createCell(90); cellF4Alt7Value.setCellValue(dado.getF4Alt7());

        Cell cellF4Cap7 = rowTitle.createCell(91); cellF4Cap7.setCellValue("F4Cap7");
        Cell cellF4Cap7Value = rowData.createCell(91); cellF4Cap7Value.setCellValue(dado.getF4Cap7());

        Cell cellF4Cod7 = rowTitle.createCell(92); cellF4Cod7.setCellValue("F4Cod7");
        Cell cellF4Cod7Value = rowData.createCell(92); cellF4Cod7Value.setCellValue(dado.getF4Cod7());

        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Coleta_" + dado.getId() + ".xls");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);

            Toast.makeText(context, "Salvo com sucesso", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();

            Toast.makeText(context, "Ocorreu um erro ao salvar", Toast.LENGTH_SHORT).show();
        }
    }
}

class LineHolder extends RecyclerView.ViewHolder {

    public TextView txtItemId, txtItemFazenda, txtItemProjeto;
    public ImageButton btItemExportar, btItemExcluir;

    public LineHolder(View itemView) {
        super(itemView);
        txtItemId = itemView.findViewById(R.id.txtItemId);
        txtItemFazenda = itemView.findViewById(R.id.txtItemFazenda);
        txtItemProjeto = itemView.findViewById(R.id.txtItemProjeto);
        btItemExportar = itemView.findViewById(R.id.btItemExportar);
        btItemExcluir = itemView.findViewById(R.id.btItemExcluir);
    }
}
