package com.example.reseptron.ui.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseArray;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reseptron.R;
import com.google.android.gms.vision.barcode.Barcode;

import java.util.List;

import info.androidhive.barcode.BarcodeReader;

//TODO :: This activity uses third library to read QR code and here it implements `BarcodeReader.BarcodeReaderListener`
// which overrides 5 methods - onScanned(), onScannedMultiple(), onBitmapScanned(), onScanError(), onCameraPermissionDenied()

public class QrReaderActivity extends AppCompatActivity implements BarcodeReader.BarcodeReaderListener {
    BarcodeReader barcodeReader;
    TextView qr_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_reader);

        qr_text_view = findViewById(R.id.qr_result);
        barcodeReader = (BarcodeReader) getSupportFragmentManager().findFragmentById(R.id.barcode_scanner);
    }

    //triggered when it scans a QR
    @Override
    public void onScanned(Barcode barcode) {
        barcodeReader.playBeep(); // makes a beep sound indicating there is actually QR on screen

        qr_text_view.setText(barcode.displayValue); // sets QR value to TextView
    }

    @Override
    public void onScannedMultiple(List<Barcode> barcodes) {

    }

    @Override
    public void onBitmapScanned(SparseArray<Barcode> sparseArray) {

    }

    //Shows Toast when there is unknown error happens during QR read process
    @Override
    public void onScanError(String s) {
        Toast.makeText(getApplicationContext(), "Error occurred while scanning " + s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCameraPermissionDenied() {
        finish();
    }
}