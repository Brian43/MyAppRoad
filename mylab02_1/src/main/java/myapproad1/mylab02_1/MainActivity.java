package myapproad1.mylab02_1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private Button button;
    private int count=0;
    private int number=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        button=(Button)findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "" + ++count;
                setTitle(str);
            }
        });
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.b2:

                display(++number);
                break;
            case R.id.b3:
                display(--number);
                break;
        }
    }
    public void display(int number){
        int price = 10;
        int total = price * number;
        String str = NumberFormat.getCurrencyInstance().format(total);

        TextView textView3 = (TextView)findViewById(R.id.t3);
        textView3.setText(String.valueOf(number));
        TextView textView4 = (TextView)findViewById(R.id.t4);
        textView4.setText(str);

    }
}
