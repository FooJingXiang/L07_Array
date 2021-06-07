package sg.edu.rp.c346.id20011262.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv2;
    String[] fruits;
    ArrayList<String> fruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        String strText = "Fruits\n=====\n";
        for(int i = 0; i<fruits.length; i++ ) {
            strText += fruits[i] + "\n";
        }
        tv.setText(strText);


        fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("cherry");
        fruit.add("durian");
        String strText2 = "Fruits ArrayList\n============\n";
        for(int i = 0; i<fruit.size(); i++ ) {
            strText2 += fruit.get(i) + "\n";
        }
        String theFruit = fruit.get(1);
        fruit.remove(0);
        fruit.set(2,"dragon fruit");
        tv2.setText(strText2);
    }
}