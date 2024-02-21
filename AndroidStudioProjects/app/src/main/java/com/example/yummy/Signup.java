package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yummy.data.UserData;

public class Signup extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7;
    EditText edit1,edit2,edit3,edit4;

    RadioButton radioBtn1,radioBtn2;
    Spinner spin;

    Button signupBtn;
    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        text1 = (TextView) findViewById(R.id.SignupTextView1);
        edit1 = (EditText)findViewById(R.id.SignupEditTextView1);

        text2 = (TextView) findViewById(R.id.SignupTextView2);
        edit2 = (EditText)findViewById(R.id.SignupEditTextView2);

        text3 = (TextView) findViewById(R.id.SignupTextView3);
        edit3 = (EditText)findViewById(R.id.SignupEditTextView3);

        text4 = (TextView) findViewById(R.id.SignupTextView4);
        edit4 = (EditText)findViewById(R.id.SignupEditTextView4);

        text5 = (TextView) findViewById(R.id.SignupTextView5);
        text6 = (TextView) findViewById(R.id.SignupTextView6);

        text7 = (TextView) findViewById(R.id.SignupTextView7);

        radioBtn1 = (RadioButton) findViewById(R.id.SignupRadioButton1);
        radioBtn2 = (RadioButton) findViewById(R.id.SignupRadioButton2);

        spin = findViewById(R.id.SignupSpinner);

       // String id,String name,String email,String password,int phone

        signupBtn = (Button) findViewById(R.id.SignUpButton);
        userData=new UserData(this);

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = userData.insertData1(edit1.getText().toString(),
                        edit2.getText().toString(), edit3.getText().toString(), edit4.getText().toString());

                //String s=userData.insertData1("aaa","ggg","dddd",123);
                Toast.makeText(Signup.this, s + "", Toast.LENGTH_SHORT).show();

                finish();
            }
        });

        radioBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                radioBtn2.setChecked(false);
            }
        });

        radioBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                radioBtn1.setChecked(false);
            }
        });


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this ,R.array.SpinnerItems, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spin.setAdapter(adapter);
        //spin.setOnItemSelectedListener( );
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


    }

   // @Override
    public void onNothingSelected(AdapterView<?> adapterView) {


    }
}