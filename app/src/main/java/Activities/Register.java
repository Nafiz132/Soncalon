package Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.soncalon.R;

public class Register extends AppCompatActivity {
    private EditText nameEt, cityEt, bloodGroupEt,mobileEt, passwordEt;
    private Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nameEt = findViewById(R.id.name);
        cityEt= findViewById(R.id.city);
        bloodGroupEt= findViewById(R.id.blood_group);
        mobileEt=findViewById(R.id.mobile);
        passwordEt = findViewById(R.id.password);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name,city,password,mobile,blood_group;
                name= nameEt.getText().toString();
                city=cityEt.getText().toString();
                password=passwordEt.getText().toString();
                mobile=mobileEt.getText().toString();
                blood_group=bloodGroupEt.getText().toString();
                showMessage(name+"\n"+city+"\n"+password+"\n"+mobile+"\n"+blood_group);
            }
        });
    }
    private void showMessage(String msg){
        Toast.makeText(Register.this,msg, Toast.LENGTH_SHORT).show();
    }
}