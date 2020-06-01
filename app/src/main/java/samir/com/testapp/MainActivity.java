package samir.com.testapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import samir.com.testapp.Fragments.Items;

public class MainActivity extends AppCompatActivity {

    private   String myEmail="sam@gmail.com";
    private   String myPassword="12345";
    EditText textEmail,textPassword;
    Button  login;
    LinearLayout content;
    LinearLayout swap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textEmail=findViewById(R.id.login_email);
        textPassword=findViewById(R.id.login_password);
        login=findViewById(R.id.login_btn);
        content=findViewById(R.id.login_layout);
        swap=findViewById(R.id.main);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doLogin(textEmail.getText().toString(),textPassword.getText().toString());
            }
        });

    }


   private void doLogin(String email,String password){

        if(email.equals(myEmail)&&password.equals(myPassword)){
            content.setVisibility(View.GONE);
            swap.setVisibility(View.VISIBLE);
          getSupportFragmentManager().beginTransaction().replace(R.id.main,new Items()).commit();

        }else{

            Toast.makeText(MainActivity.this,"incorrect Email or password ",Toast.LENGTH_LONG).show();
        }


   }


}
