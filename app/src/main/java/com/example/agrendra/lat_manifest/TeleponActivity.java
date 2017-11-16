package com.example.agrendra.lat_manifest;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class TeleponActivity extends AppCompatActivity {

    private static final int RQS_PICK_CONTACT = 0;
    Intent intent;
    EditText editText;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telepon);

        editText = (EditText)findViewById(R.id.txt);

        /*imageView = (ImageView)findViewById(R.id.logocon);
        imageView.setOnClickListener(new ImageView.OnClickListener(){
            @Override
            public void onClick(View arg0){
                intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType(ContactsContract.CommonDataKinds.Phone.CONTENT_ITEM_TYPE);
                startActivityForResult(intent, 1);
            }
        });*/
    }

    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RQS_PICK_CONTACT){
            if(resultCode == RESULT_OK){
                Uri contactData = data.getData();
                Cursor cursor = managedQuery(contactData, null, null, null, null);
                cursor.moveToFirst();

                String number = cursor.getString(cursor.getColumnIndexOrThrow(ContactsContract.CommonDataKinds.Phone.NUMBER));

                editText.setText(number);
            }
        }
    }*/

    private void telepon(String no){
        intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+no));
        startActivity(intent);
    }


    public void telp(View view) {
        String oke = editText.toString();
        telepon(oke);
    }
}
