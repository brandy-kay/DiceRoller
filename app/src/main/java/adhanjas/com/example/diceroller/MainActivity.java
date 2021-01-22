package adhanjas.com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView img;
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
       // dice.roll();
       img=findViewById(R.id.image);
      // String text=textView.getText().toString();
        // textView.setText(text);
        switch (dice.roll()){
            case 1:
                img.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                img.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                img.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                img.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                img.setImageResource(R.drawable.dice_5);
                break;
            case 6:
                img.setImageResource(R.drawable.dice_6);
                break;
            default:
                // img.setImageResource(R.drawable.dice_1);
                //
        }
    }


}

class Dice{
    public int number;
    public Dice(int number){
        this.number=number;
    }
    public int roll() {
        Random random = new Random();
        return random.nextInt(number);

    }
}