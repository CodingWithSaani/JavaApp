package com.codingwithsaani.javaapp;

//These libs
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button clickBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //clickBtn=findViewById(R.id.clickBtnOne);
    }

    public void showMessage(View viewVar)
    {
        if(viewVar.getId()==R.id.clickBtnOne)
        {
            Toast.makeText(this, "Button one is clicked", Toast.LENGTH_LONG).show();
        }
        else if(viewVar.getId()==R.id.clickBtnTwo)
        {
            Toast.makeText(this, "Button two is clicked", Toast.LENGTH_SHORT).show();
        }
        else if(viewVar.getId()==R.id.clickBtnThree)
        {
            Toast.makeText(this, "Button three is clicked", Toast.LENGTH_SHORT).show();
        }
    }
}

