package com.rohankadkol.currencyconvertorapp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mEtEnteredAmount;
    TextView mTvConvertedAmount;

    Button mBtnCad;
    Button mBtnInr;
    Button mBtnEur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEtEnteredAmount = findViewById(R.id.et_entered_amount);
        mTvConvertedAmount = findViewById(R.id.tv_converted_amount);

        mBtnCad = findViewById(R.id.btn_cad);
        mBtnInr = findViewById(R.id.btn_inr);
        mBtnEur = findViewById(R.id.btn_eur);
    }

    public void btnCadClicked(View view) {
        double amount = getAmount();
        amount = amount * 1.36;
        mTvConvertedAmount.setText(String.format("= %.2f CAD", amount));
    }

    public void btnInrClicked(View view) {
        double amount = getAmount();
        amount = amount * 74.89;
        mTvConvertedAmount.setText(String.format("= %.2f INR", amount));
    }

    public void btnEurClicked(View view) {
        double amount = getAmount();
        amount = amount * 0.89;
        mTvConvertedAmount.setText(String.format("= %.2f EUR", amount));
    }

    private double getAmount() {
        String amountString = mEtEnteredAmount.getText().toString();
        double amount;
        if (amountString.equals("")) {
            amount = 0;
        } else {
            amount = Double.parseDouble(amountString);
        }
        return amount;
    }
}
