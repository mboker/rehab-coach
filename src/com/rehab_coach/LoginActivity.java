package com.rehab_coach;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }
    
    public void loginToApp(View view)
    {
    	Intent homescreen  = new Intent(this, HomeScreenActivity.class);
    	EditText user = (EditText) findViewById(R.id.username);
    	EditText pass = (EditText) findViewById(R.id.password);
    	String u_name = user.getText().toString();
    	String p_word = pass.getText().toString();
    	// If user and pass is a valid user to login
    	startActivity(homescreen);
    	
    	
    }
    
}
