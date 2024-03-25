package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    String a;
    Toast b;
    Button B;
    Spinner MyS;
    ImageView BackGr,Icon;
    Typeface L1,L2,L3,L4;
    TextView A1,A2,A3;
    Color Col;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyS = (Spinner) findViewById(R.id.spinner2);
        B = (Button)findViewById(R.id.button);
        BackGr = (ImageView) findViewById(R.id.imageView4);
        Icon = (ImageView) findViewById(R.id.imageView5);
        b = new Toast(getApplicationContext());
        A1 = (TextView)findViewById(R.id.textView);
        A2 = (TextView)findViewById(R.id.textView3);
        A3 = (TextView)findViewById(R.id.textView4);
        L1 = Typeface.create("cursive",Typeface.BOLD_ITALIC);
        L2 = Typeface.create("serif",Typeface.BOLD);
        L3 = Typeface.create("monospace",Typeface.BOLD);
        L4 = Typeface.create("monospace",Typeface.BOLD_ITALIC);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a  = MyS.getSelectedItem().toString();
                if (!a.isEmpty()) {
                    b.makeText(getApplicationContext(), a, Toast.LENGTH_SHORT).show();
                }else{
                    b.makeText(getApplicationContext(), "Nothing", Toast.LENGTH_SHORT).show();
                }
                switch (a){
                    case "South-Korea": BackGr.setImageDrawable(getResources().getDrawable(R.drawable.gemini_generated_image));
                    Icon.setImageDrawable(getDrawable(R.drawable.south_korea));
                    getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimaryDark));

                        A2.setTextColor(Color.parseColor("#FDD835"));
                        A2.setText(R.string.Gimn);
                        A3.setTextColor(Color.parseColor("#EDEDED"));
                        A3.setText(R.string.Gimn1);
                        A1.setTextColor(Color.parseColor("#FF9800"));

                    A1.setText("South Korea");
                    A1.setTypeface(L1);
                    break;
                    case "Australia": BackGr.setImageDrawable(getResources().getDrawable(R.drawable.australia_1621333850705));
                    Icon.setImageDrawable(getDrawable(R.drawable.download__3_));
                        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDarkAU  ));
                        A2.setTextColor(Color.parseColor("#3377f5"));
                        A2.setText(R.string.Gima);
                        A3.setTextColor(Color.parseColor("#ffffff"));
                        A3.setText(R.string.Gima1);
                        A1.setTextColor(Color.parseColor("#4b8bf2"));
                        A1.setText("Australia");
                        A1.setTypeface(L2);
                    break;
                    case "Kenya": BackGr.setImageDrawable(getResources().getDrawable(R.drawable.kenya_1));
                    Icon.setImageDrawable(getDrawable(R.drawable.download__2_));
                        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDarkKE  ));
                        A2.setTextColor(Color.parseColor("#ecff73"));
                        A2.setText(R.string.Gimke);
                        A3.setTextColor(Color.parseColor("#ffffff"));
                        A3.setText(R.string.Gimke1);
                        A1.setTextColor(Color.parseColor("#ffe373"));
                        A1.setText("Kenya");
                        A1.setTypeface(L4);
                    break;
                    case "France": BackGr.setImageDrawable(getResources().getDrawable(R.drawable.tal_eiffel_tower_bestfrance0323_dada0673f8764c099b68d01695ef8057));
                    Icon.setImageDrawable(getDrawable(R.drawable.download__1_));
                        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDarkFR  ));
                        A2.setTextColor(Color.parseColor("#b56bff"));
                        A2.setText(R.string.Gimf);
                        A3.setTextColor(Color.parseColor("#ffffff"));
                        A3.setText(R.string.Gimf1);
                        A1.setTextColor(Color.parseColor("#a11bfa"));
                        A1.setText("France");
                        A1.setTypeface(L1);
                    break;
                    case "Kuwait": BackGr.setImageDrawable(getResources().getDrawable(R.drawable.b9d212f92b2d308b19b9c6b8af5047ad));
                    Icon.setImageDrawable(getDrawable(R.drawable.download));
                        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDarkKW  ));
                        A2.setTextColor(Color.parseColor("#191a15"));
                        A2.setText(R.string.Gimkw);
                        A3.setTextColor(Color.parseColor("#ffffff"));
                        A3.setText(R.string.Gimkw1);
                        A1.setTextColor(Color.parseColor("#000000"));
                        A1.setText("Kuwait");
                        A1.setTypeface(L3);
                    break;
                    default: b.makeText(getApplicationContext(), "Uncorect spinner value", Toast.LENGTH_SHORT).show();

                }



            }
        });
    }
    public void on1() {
        if (!a.isEmpty()) {
            b.makeText(getApplicationContext(), a, Toast.LENGTH_SHORT).show();
        }else{
            b.makeText(getApplicationContext(), "Nothing", Toast.LENGTH_SHORT).show();
        }
    }
}