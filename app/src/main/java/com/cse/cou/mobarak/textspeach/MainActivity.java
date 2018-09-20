package com.cse.cou.mobarak.textspeach;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextToSpeech textToSpeech;
    Button s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s= (Button) findViewById(R.id.speak);
        textToSpeech=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                if(status==TextToSpeech.SUCCESS){
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });

s.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        textToSpeech.speak("hi, i am mobarak.",TextToSpeech.QUEUE_FLUSH,null);

    }
});

    }
}
