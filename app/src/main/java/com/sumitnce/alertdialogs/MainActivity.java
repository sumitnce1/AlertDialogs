package com.sumitnce.alertdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button mShowDialogBtn;
    private CharSequence[] mAlertItems;
    private  boolean[] mSelectedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowDialogBtn = findViewById(R.id.show_dialog_btn);

        mAlertItems = new CharSequence[]{
                "C",
                "C++",
                "Java",
                "Python"

        };

        mSelectedItems  = new boolean[]{
                false,
                true,
                true,
                false
        };

        mShowDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(MainActivity.this);
                builder.setTitle("View Option");
                builder.setMultiChoiceItems(mAlertItems, mSelectedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        //Do some thing here
                    }
                });

            /*    builder.setSingleChoiceItems(mAlertItems, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Do some thing here

                        Snackbar.make(mShowDialogBtn, "You have Selected !" + which, Snackbar.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                });           */



                //builder.setMessage("This is a simple Alert Dialog");
                //builder.setIcon(R.drawable.ic_backup_black_24dp);
                builder.setBackground(getResources().getDrawable(R.drawable.alert_dialog_bg,null));

                builder.setPositiveButton("Okey", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Do something when clicked
                    }
                });
                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Do something when clicked
                    }
                });
                builder.show();

            }
        });
    }
}
