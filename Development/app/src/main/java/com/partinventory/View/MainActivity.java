package com.partinventory.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.partinventory.Controller.StorageController;
import com.partinventory.Model.Item;
import com.partinventory.R;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Item test = new Item("A", "A", 1);
        StorageController cont = new StorageController(this);
        try {
            cont.createDataBase();
        }
        catch(IOException e){
            e.printStackTrace();
            Log.d("CATCH", "Broken");
        }
        cont.addItem(test);
//        cont.getInventory();
    }
}
