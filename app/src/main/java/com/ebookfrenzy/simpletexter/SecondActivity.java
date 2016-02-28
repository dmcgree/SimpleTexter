package com.ebookfrenzy.simpletexter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;


import java.util.GregorianCalendar;

public class SecondActivity extends AppCompatActivity {

    String textName;  // number of name to send text from MainActivity
    TextView tvName;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvName = (TextView) findViewById(R.id.txtName);

        // get the data passed from the main activity using extras
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // grab the event number as a string from the main activity using extras
            textName = extras.getString("textName");
        }
        //depending on the event number, display different information on this form
        if (textName.equals("1")) {
            tvName.setText(R.string.donaldDuck);
            // Spinner element
            spinner = (Spinner) findViewById(R.id.spinner);

            ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.textMessages_array, android.R.layout.simple_spinner_item);
            spinner.setAdapter(adapter);
        }
        if (textName.equals("2")) {
            tvName.setText(R.string.mickeyMouse);
            // Spinner element
            spinner = (Spinner) findViewById(R.id.spinner);

            ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.textMessages_array, android.R.layout.simple_spinner_item);
            spinner.setAdapter(adapter);
        }
        if (textName.equals("3")) {
            tvName.setText(R.string.minnieMouse);
            // Spinner element
            spinner = (Spinner) findViewById(R.id.spinner);

            ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.textMessages_array, android.R.layout.simple_spinner_item);
            spinner.setAdapter(adapter);
        }


    }

    public void onClickSendText (View v) {

        String messageChoice = spinner.getSelectedItem().toString();

        if (messageChoice.equals("None")){
            messageChoice = "";
        }

        if (messageChoice.equals("")){
            EditText message = (EditText) findViewById(R.id.txtMessage);
            messageChoice = message.getText().toString();
        }

        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:6512162297"));
        sendIntent.putExtra("sms_body", "messageChoice");
        startActivity(sendIntent);



    }

}
