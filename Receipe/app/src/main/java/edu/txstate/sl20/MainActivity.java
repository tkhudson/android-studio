package edu.txstate.sl20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Person me = new Person();
        //me.setName("Sam");

        //Instructor me = new Instructor();
        //me.setName("Sam");
        //me.setTitle("Dr");
        //welcome(me);

        //Instructor me = new Instructor();
        //me.setName("Sam");
        //me.setTitle("Dr");
        //welcomePeople(me);
         //Dog d = new Dog();
         //welcomePeople(d);


        welcomePeople(new Sound() {
            @Override
            public String welcome() {
                return "Hi";
            }
        });


    }

    private void welcome(Person p ){
        Toast.makeText(this, p.welcome(),Toast.LENGTH_LONG).show();

    }

    private void welcomePeople(Sound s){
        Toast.makeText(this, s.welcome(),Toast.LENGTH_LONG).show();

    }

}