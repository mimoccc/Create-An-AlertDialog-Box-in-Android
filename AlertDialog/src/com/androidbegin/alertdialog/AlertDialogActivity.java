package com.androidbegin.alertdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends Activity {
	private Button one_button, two_button, new_activity_button; 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Alert Dialog");
        setContentView(R.layout.alert_dialog);
        
        // Find the Buttons in alert_dialog.xml
        one_button = (Button)findViewById(R.id.one_button);
        two_button = (Button)findViewById(R.id.two_button);
        new_activity_button = (Button)findViewById(R.id.new_activity_button);
        
        // Listening to the first Button click
        one_button.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
            	AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
            	
            	// Set Alert Dialog Title
            	builder.setTitle("Alert Dialog Tutorial");
            	
            	// Set an Icon for this Alert Dialog
            	builder.setIcon(R.drawable.androidhappy);
            	
            	// Set Alert Dialog Message
            	builder.setMessage("An AlertDialog Tutorial from AndroidBegin.com")
            	
            		   	// Neautral button functionality 
     		           .setNeutralButton("OK", new DialogInterface.OnClickListener() {
     		               public void onClick(DialogInterface dialog, int arg0) {
     		            	  Toast.makeText(AlertDialogActivity.this, "You clicked on OK", Toast.LENGTH_SHORT).show();    		            	   
     		            	  //Do more stuffs
     		               }
     		           });
     		        
            	// Create the Alert Dialog
     		    AlertDialog alertdialog = builder.create();
     		    
     		    // Show Alert Dialog
     		    alertdialog.show();
     		}  
        });
        
        // Listening to the second Button click
        two_button.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
            	AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
            	
            	// Set Alert Dialog Title
            	builder.setTitle("Alert Dialog Tutorial");
            	
            	// Set an Icon for this Alert Dialog
            	builder.setIcon(R.drawable.androidhappy);
            	
            	// Set Alert Dialog Message
            	builder.setMessage("Do you want to exit?")
            	
            		   	// Positive button functionality 
     		           .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
     		               public void onClick(DialogInterface dialog, int arg0) {
     		            	 Toast.makeText(AlertDialogActivity.this, "You clicked on Yes", Toast.LENGTH_SHORT).show();    		            	   
     		            	 //Do more stuffs
     		            	 //finish();
     		               }
     		           })
     		           	// Negative button functionality 
     		           .setNegativeButton("No", new DialogInterface.OnClickListener() {
     		               public void onClick(DialogInterface dialog, int arg0) {
     		            	 Toast.makeText(AlertDialogActivity.this, "You clicked on No", Toast.LENGTH_SHORT).show();
     		            	 //Do more stuffs
     		            	 //dialog.cancel();
     		               }
     		           });
            	
            	// Create the Alert Dialog
     		    AlertDialog alertdialog = builder.create();
     		    
     		    // Show Alert Dialog
     		    alertdialog.show();
     		}  
        });
        
        // Listening to the third Button click
        new_activity_button.setOnClickListener(new OnClickListener() {

            public void onClick(View arg0) {
            	AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
            	
            	// Set Alert Dialog Title
            	builder.setTitle("Alert Dialog Tutorial");
            	
            	// Set an Icon for this Alert Dialog
            	builder.setIcon(R.drawable.androidhappy);
            	
            	// Set Alert Dialog Message
            	builder.setMessage("Do you want to open a new Activity?")
            	
            		   	// Positive button functionality 
     		           .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
     		               public void onClick(DialogInterface dialog, int arg0) {
     		            	  Toast.makeText(AlertDialogActivity.this, "You clicked on Yes", Toast.LENGTH_SHORT).show();    		            	   
     		            	  Intent i = new Intent(AlertDialogActivity.this, NewActivity.class);
     		            	  startActivity(i); 
     		               }
     		           })
     		           	// Negative button functionality 
     		           .setNegativeButton("No", new DialogInterface.OnClickListener() {
     		               public void onClick(DialogInterface dialog, int arg0) {
     		            	  Toast.makeText(AlertDialogActivity.this, "You clicked on No", Toast.LENGTH_SHORT).show();
     		            	  dialog.cancel();
     		            	  //Do more stuffs
     		               }
     		           });
            	
            	// Create the Alert Dialog
     		    AlertDialog alertdialog = builder.create();
     		    
     		    // Show Alert Dialog
     		    alertdialog.show();
     		}  
        });
    }
    
    // Not using options menu for this tutorial
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_alert_dialog, menu);
        return true;
    }
}
