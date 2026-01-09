package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");

        ArrayList<Pet> petList = new ArrayList<>();


        petList.add(cat);
        petList.add(dog);

        Scorpion scorpion = new Scorpion("Scorponok");
        petList.add(scorpion);


        for (Pet p : petList) {
            System.out.println(p.speak());
            System.out.println(cat.speak());
        }

        ArrayList<Pettable> pettablePets = new ArrayList<Pettable>();
        pettablePets.add(cat);
        pettablePets.add(dog);

        Scorpion Scorpion = new Scorpion("Scorponok");


        Mood mood1 = new HappyMood();

        Mood mood2 = new SadMood(new Date());

        ArrayList<Mood> moodList = new ArrayList<>();
        moodList.add(mood1);
        moodList.add(mood2);

        for (Mood m : moodList) {
            System.out.println(m.getMoodString() + " at " + m.getDate());
        }

        mood1.setDate(new Date());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}