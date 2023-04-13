package com.contabilidadmetales.contabilidadmetales;

import com.contabilidadmetales.contabilidadmetales.controlador.CInventario;
import com.contabilidadmetales.contabilidadmetales.controlador.Materiales;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class FacturaPdf {

    public void generarFacturaPdf(String nombreArchivo,String Tipo,Integer idfactura, String cliente, String direccion,
            String fecha, HashMap<String, HashMap<String, Double>> conceptos, double total, Double kilos) throws IOException, DocumentException, SQLException {

        // Crear documento PDF
        Document document = new Document(PageSize.A4.rotate());
        PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
        document.open();

        // Estilo para títulos
        Font tituloFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);

        // Estilo para datos de cliente y fecha
        Font datosFont = new Font(Font.FontFamily.TIMES_ROMAN, 12);

        // Estilo para encabezado de tabla
        Font encabezadoTablaFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

        // Estilo para datos de tabla
        Font datosTablaFont = new Font(Font.FontFamily.TIMES_ROMAN, 12);

        // Agregar encabezado
        Paragraph encabezado = new Paragraph();
        encabezado.add(new Phrase("METALES DE SANTANDER  \n \n" + "Nit : 900405928\n" + "\n FACTURA "+Tipo+"# " + idfactura + "", tituloFont));
        encabezado.setAlignment(Element.ALIGN_CENTER);
        encabezado.setSpacingAfter(10f);
        document.add(encabezado);

        // Agregar datos del cliente
        Paragraph datosCliente = new Paragraph();
        datosCliente.add(new Phrase("Cliente: " + cliente, datosFont));
        datosCliente.add("\n");
        datosCliente.add(new Phrase("Descripcion: " + direccion, datosFont));
        datosCliente.add("\n");
        datosCliente.add(new Phrase("Fecha: " + fecha, datosFont));
        datosCliente.setSpacingAfter(10f);
        document.add(datosCliente);

        // Agregar tabla de conceptos e importes
        float[] columnWidths = {3f, 1f, 1f};
        com.itextpdf.text.pdf.PdfPTable table = new com.itextpdf.text.pdf.PdfPTable(columnWidths);
        table.setWidthPercentage(100);
        table.setSpacingBefore(10f);
        table.setSpacingAfter(10f);

        // Encabezado de tabla
        com.itextpdf.text.pdf.PdfPCell cell = new com.itextpdf.text.pdf.PdfPCell(new Phrase("Concepto", encabezadoTablaFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPadding(5f);
        table.addCell(cell);

        cell = new com.itextpdf.text.pdf.PdfPCell(new Phrase("Cantidad", encabezadoTablaFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPadding(5f);
        table.addCell(cell);

        cell = new com.itextpdf.text.pdf.PdfPCell(new Phrase("Importe", encabezadoTablaFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setPadding(5f);
        table.addCell(cell);

        // Datos de tabla
        for (Map.Entry<String, HashMap<String, Double>> entry : conceptos.entrySet()) {
            CInventario inventario = new CInventario();
            Materiales materiales = new Materiales();
            String material = entry.getKey();
            double cantidad = entry.getValue().get("cantidad");
            double costo = entry.getValue().get("costo");
            int idMaterial = materiales.obtenerIdMaterialPorNombre(material);

            // Agregar el material al inventario en MySQL
            inventario.agregarMaterial(cantidad, idfactura.toString(), idMaterial, costo);

            cell = new com.itextpdf.text.pdf.PdfPCell(new Phrase(material, datosTablaFont));
            cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPadding(5f);
            table.addCell(cell);

            cell = new com.itextpdf.text.pdf.PdfPCell(new Phrase(String.format("%.0f", cantidad), datosTablaFont));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPadding(5f);
            table.addCell(cell);

            cell = new com.itextpdf.text.pdf.PdfPCell(new Phrase("$" + String.format("%.0f", costo), datosTablaFont));
            cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setPadding(5f);
            table.addCell(cell);
        }

        
        document.add(table);

        // Agregar total
        Paragraph totalP = new Paragraph();
        totalP.add(new Phrase("Total: $" + total, datosFont));
        totalP.setAlignment(Element.ALIGN_RIGHT);
        totalP.setSpacingBefore(10f);
        document.add(totalP);

        // Agregar firma
        Paragraph firma = new Paragraph();
        firma.add("\n\n\nFirma:");
        firma.setAlignment(Element.ALIGN_CENTER);
        document.add(firma);

        // Cerrar documento PDF
        document.close();

        // Abrir archivo PDF generado
        abrirArchivo(nombreArchivo);
    }

    public void abrirArchivo(String archivo) {
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}