package com.android.acadgild.sharedprefformdetails122;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eName;
    EditText eAge;
    EditText ePhone;
    EditText eCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get reference of all EditText to store values in SharedPreferences
        eName = (EditText) findViewById(R.id.etName);
        eAge = (EditText) findViewById(R.id.etAge);
        ePhone = (EditText) findViewById(R.id.etPhone);
        eCity = (EditText) findViewById(R.id.etCity);
    }

    //To Save details inside shared preferences
    public void saveDetails(View v){
        SharedPrefManager.setStringPrefVal(MainActivity.this, "name", eName.getText().toString());
        SharedPrefManager.setIntPrefVal(MainActivity.this, "age", Integer.parseInt(eAge.getText().toString()));
        SharedPrefManager.setStringPrefVal(MainActivity.this, "phone", ePhone.getText().toString());
        SharedPrefManager.setStringPrefVal(MainActivity.this, "city", eCity.getText().toString());

        eName.setText("");
        eAge.setText("");
        ePhone.setText("");
        eCity.setText("");
    }

    //To Show details saved inside shared preferences
    public void showDetails(View v){
        String toastString =
                "Name:"+ SharedPrefManager.getPrefVal(MainActivity.this,"name") +"\n"
                        + "Age:"+SharedPrefManager.getIntPrefVal(MainActivity.this,"age") + "\n"
                        + "Phone:"+SharedPrefManager.getPrefVal(MainActivity.this,"phone") + "\n"
                        + "City:"+SharedPrefManager.getPrefVal(MainActivity.this,"city");



        Toast.makeText(MainActivity.this, toastString, Toast.LENGTH_LONG).show();
    }
}
