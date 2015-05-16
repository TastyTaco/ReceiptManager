package com.example.luke.receiptmanager;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnReceiptView = (Button)findViewById(R.id.button);
        btnReceiptView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tIntent = new Intent(HomeActivity.this, AddReceipt.class);
                startActivity(tIntent);
            }
        });

        ReceiptManager receiptManager = new ReceiptManager(getApplicationContext());
        receiptManager.loadReceipts();
        ArrayList<Receipt> receipts = receiptManager.GetReciepts();


        if (receipts != null && receipts.size() > 0) {
            TextView welcome = (TextView)findViewById(R.id.txtWelcome);
            welcome.setText("Title:" + receipts.get(1).Title + " AmountSpent:" + receipts.get(1).AmountSpent + " Category:" + receipts.get(1).Category);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
