package com.berkus.suatestoprakhava;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton hava,su,toprak,ates;
    TextView bilgisayar,kullanici,sonuc,bilsec;
    int bilscore=0;
    int kulscore=0;
    int bilgisayarSecimi;
    private Random rnd_bilgisayarSecimi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hava=findViewById(R.id.hava);
        su=findViewById(R.id.su);
        toprak=findViewById(R.id.toprak);
        ates=findViewById(R.id.ates);
        bilgisayar=findViewById(R.id.bilgisayar);
        kullanici=findViewById(R.id.kullanici);
        sonuc=findViewById(R.id.kazanan);
        bilsec=findViewById(R.id.bilsec);

    }

    public void bas(View v){
        int id=v.getId();
        if(id==R.id.hava){
            bilsecmetot(1);
        } else if (id==R.id.su) {
            bilsecmetot(2);
        } else if (id==R.id.toprak) {
            bilsecmetot(3);
        }else{
            bilsecmetot(4);
        }
    }

    public void bilsecmetot(int kulsec){
        rnd_bilgisayarSecimi = new Random();
        bilgisayarSecimi = rnd_bilgisayarSecimi.nextInt(4) + 1;
        String secim=null;
        if(bilgisayarSecimi==1)
            secim="Hava elementi";
        if(bilgisayarSecimi==2)
            secim="Su elementi";
        if(bilgisayarSecimi==3)
            secim="Toprak elementi";
        if(bilgisayarSecimi==4)
            secim="Ateş elementi";
        bilsec.setText("Bilgisayarın seçimi="+secim);
        if(bilgisayarSecimi==1 && kulsec==1 || bilgisayarSecimi==2 && kulsec==2 || bilgisayarSecimi==3 && kulsec==3 || bilgisayarSecimi==4 && kulsec==4){
            sonuc.setText("Beraberlik olmuştur");
        } else if (bilgisayarSecimi==1 && kulsec==2 ) {
            sonuc.setText("Bilgisayar kazanmıştır");
            bilscore++;
            bilgisayar.setText(String.valueOf(bilscore));
        } else if (bilgisayarSecimi==2 && kulsec==1) {
            sonuc.setText("Kullanıcı kazanmıştır");
            kulscore++;
            kullanici.setText(String.valueOf(kulscore));
        } else if (bilgisayarSecimi==1 && kulsec==3) {
            sonuc.setText("Kullanıcı kazanmıştır");
            kulscore++;
            kullanici.setText(String.valueOf(kulscore));
        } else if (bilgisayarSecimi==3 && kulsec==1) {
            sonuc.setText("Bilgisayar kazanmıştır");
            bilscore++;
            bilgisayar.setText(String.valueOf(bilscore));
        } else if (bilgisayarSecimi==2 && kulsec==4) {
            sonuc.setText("Bilgisayar kazanmıştır");
            bilscore++;
            bilgisayar.setText(String.valueOf(bilscore));
        }else if (bilgisayarSecimi==4 && kulsec==2) {
            sonuc.setText("Kullanıcı kazanmıştır");
            kulscore++;
            kullanici.setText(String.valueOf(kulscore));
        } else if (bilgisayarSecimi==4 && kulsec==1) {
            sonuc.setText("Bilgisayar kazanmıştır");
            bilscore++;
            bilgisayar.setText(String.valueOf(bilscore));
        }else if (bilgisayarSecimi==1 && kulsec==4) {
            sonuc.setText("Kullanıcı kazanmıştır");
            kulscore++;
            kullanici.setText(String.valueOf(kulscore));
        } else if (bilgisayarSecimi==4 && kulsec==3) {
            sonuc.setText("Bilgisayar kazanmıştır");
            bilscore++;
            bilgisayar.setText(String.valueOf(bilscore));
        }else if (bilgisayarSecimi==3 && kulsec==4) {
            sonuc.setText("kullanıcı kazanmıştır");
            kulscore++;
            kullanici.setText(String.valueOf(kulscore));
        }else if(bilgisayarSecimi==3 && kulsec==2){
            sonuc.setText("Bilgisayar kazanmıştır");
            bilscore++;
            bilgisayar.setText(String.valueOf(bilscore));
        }else if(bilgisayarSecimi==2 && kulsec==3){
            sonuc.setText("Kullanıcı kazanmıştır");
            kulscore++;
            kullanici.setText(String.valueOf(kulscore));
        }


    }

}