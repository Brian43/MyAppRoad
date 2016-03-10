package myapproad1.myapp2;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ImageView imageView;
    private int[] images;
    private int idx;
    private Handler handler;
    private EditText editText,editText2,editText3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab01_7);
        handler = new Handler();
        context=this;
        editText = (EditText)findViewById(R.id.textView);
        editText2=(EditText)findViewById(R.id.textView2);
        editText3=(EditText)findViewById(R.id.textView3);
        button = (Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.imageView2);
        images=new int[]{R.drawable.p5,
                R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9};

        //handler.postDelayed(r,1200);
    }
    Runnable r = new Runnable() {
        @Override
        public void run() {
            imageView.setImageResource(images[idx++ % images.length]);
            handler.postDelayed(r,5000);
        }
    };
}
