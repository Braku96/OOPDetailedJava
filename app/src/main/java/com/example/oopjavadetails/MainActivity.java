package com.example.oopjavadetails;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Cat cat = new Cat("Maine Coon","Green","Black");
        System.out.println(cat.name);//getter atayarak isme ulaşabiliyoruz.

        Cat cat2 = new Cat();
        cat2.name="braku";
        //System.out.println(cat.TurIsmi);
        System.out.println(cat.TurIsmi);

        cat.meowCat();
        Kopek Kopek = new Kopek();
        Kopek.name = "Loki";
        Kopek kopek2 = new Kopek("Luigi","Black","Black");


    }
}