package org.acm.nitsurat.digitalcanteen;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

public class BillDialogAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_dialog);

        // To test whether activity starts
        // Remove if not needed
        Intent intent = getIntent();
    }

    //Opens dialog on clicking button
    public void openDialog(View v) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.billdialog);
        dialog.setTitle("Bill");
        ListView finallist = (ListView) dialog.findViewById(R.id.finalList);

        //dummy data - populate before using
        BillRow billrow_data[] = new BillRow[]{
                new BillRow("Manchurian","2","40"),
                new BillRow("Vadapav","4","60"),
                new BillRow("Masala Dosa","1","60"),
                new BillRow("Paneer Chilli","2","80"),
                new BillRow("Onion Uttappam","2","40"),
                new BillRow("Samosa","3","70"),

        };

        //created a Custom adapter
        BillRowAdapter adapter = new BillRowAdapter(this, R.layout.rowlayout, billrow_data);

        //set adapter
        finallist.setAdapter(adapter);

        Button confirmButton = (Button) dialog.findViewById(R.id.billConfirm);

        //Makes a toast and closes dialog
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(BillDialogAct.this, "Order confirmed", Toast.LENGTH_SHORT).show();
            }
        });

        Button cancelButton = (Button) dialog.findViewById(R.id.billCancel);

        // if button is clicked, close the custom dialog
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
