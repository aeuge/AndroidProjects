package com.example.eugenepc.viewsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int clicks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         setContentView(R.layout.second_layout);
/*
        // получаем элемент textView
        TextView textView = (TextView) findViewById(R.id.header);
        // переустанавливаем у него текст

        textView.setText("Hello Android 7!");
*/        View topButtonPanel = findViewById(R.id.top_button_panel);
        View bottomButtonPanel = findViewById(R.id.bottom_button_panel);
        final TextView clicksText = findViewById(R.id.clicksText);

        Button topButton = topButtonPanel.findViewById(R.id.clickBtn);
        Button bottomButton = bottomButtonPanel.findViewById(R.id.clickBtn);

        topButton.setText("+");
        bottomButton.setText("-");

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                clicksText.setText(clicks + " Clicks");
            }
        });
        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks--;
                clicksText.setText(clicks + " Clicks");
            }
        });
    }
    public void sendclick(View view){
        TextView textView = new TextView(this);
        // установка текста в TextView
        textView.setText("Hello Android!");
        // установка высоты текста
        textView.setTextSize(22);

        // установка визуального интерфейса для activity
        setContentView(textView);
    }
    public void onClick(View view){
        TextView clicksText = findViewById(R.id.clicksText);
        clicks++;
        clicksText.setText(clicks + " Clicks");
    }
}
