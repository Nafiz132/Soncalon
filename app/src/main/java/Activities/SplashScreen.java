package Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.soncalon.R;

public class SplashScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler= new Handler();
        //long delayMillis;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
             startActivity(new Intent(SplashScreen.this, Register.class));
             finish();
            }
        }, 2500 );
    }
}