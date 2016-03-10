package myapproad1.myapp2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ImageView imageView;
    private Button button1,button2;
    private int[] images;
    private int idx;
    private Handler handler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        context=this;
        button1 = (Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        imageView=(ImageView)findViewById(R.id.imageView);
        images=new int[]{R.drawable.fight_0,R.drawable.fight_1,R.drawable.fight_2,
                R.drawable.fight_3,R.drawable.fight_4,R.drawable.fight_5};

        //handler.postDelayed(r,1200);
    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            imageView.setImageResource(images[idx++%images.length]);
            handler.postDelayed(r,50);
        }

    };
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
                handler.postDelayed(r,50);
                break;
            case R.id.button2:
                handler.removeCallbacks(r);
                break;
        }
    }
}
