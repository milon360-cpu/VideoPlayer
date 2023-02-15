package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout music1,music2,music3,music4,music5;
    WebView music;
    String url = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = findViewById(R.id.music);
        music.getSettings().setJavaScriptEnabled(true);
        url = "https://www.youtube.com/embed/wnfUpOch510";
        music.loadUrl(url);


        music1 = findViewById(R.id.music1);
        music2 = findViewById(R.id.music2);
        music3 = findViewById(R.id.music3);
        music4 = findViewById(R.id.music4);
        music5 = findViewById(R.id.music5);

        music1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                music.loadUrl(url);
            }
        });
        music2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                url = "https://www.youtube.com/embed/iJaq-BYKK-4";
                music.loadUrl(url);
            }
        });
        music3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                url = "https://www.youtube.com/embed/A46hFrKw5CE";
                music.loadUrl(url);
            }
        });
        music4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                url = "https://www.youtube.com/watch?v=kix29pNavqM";
                music.loadUrl(url);
            }
        });
        music5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                url = "https://www.youtube.com/embed/zZhFKxA8opM";
                music.loadUrl(url);
            }
        });
    }
}