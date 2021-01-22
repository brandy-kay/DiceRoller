package adhanjas.com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               rollDice();
            }
        });
    }

    private void rollDice() {
        Dice dice =new Dice(6);
        dice.roll();
       textView=findViewById(R.id.txt);
      // String text=textView.getText().toString();
        // textView.setText(text);
        switch (dice.roll()){
            case 1:
                textView.setText("1");
                break;
            case 2:
                textView.setText("2");
                break;
            case 3:
                textView.setText("3");
                break;
            case 4:
                textView.setText("4");
                break;
            case 5:
                textView.setText("5");
                break;
            case 6:
                textView.setText("6");
                break;
            default:
                textView.setText("empty dice");
        }
    }


}

class Dice{
    public int number;
    public Dice(int number){
        this.number=number;
    }
    public int roll(){
        Random random=new Random();
        return random.nextInt(number);

    }
}