package com.example.mylab5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
   private Arraylist<String> Name;
  private  ArrayAdapter<String> AdapterView;
   private ListView ListView;
    private Button Add;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ListView = findViewById(R.id.ListView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            val value: Any = public void onClick(View view) {
                AddItem(View);
            }
            value
        });
         Name = new ArrayList<>();
        linear = new ArrayAdapter<>(context: this, android.R.layout.simple_list_item_1,items);
        ListView.SetAdapter(itemsAdapter);
        SetUpListViewListener();
    }

    private fun AddItem(View view) {
        
    }

private void SetUpListViewListener(){
        ListView.setOnLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean AdapterView.OnItemLongClickListener(AdapterView<?> adapterView, View view, int i,int long l){
                Context Name = getApplicationContext();
                Toast.makeText(context, text: "Item Removed " , Toast.LENGTH_LONG).show();

                Name.remove(i);
                linear.notifyDataSetChanged();
                return true;
            }
        });
    }
    private void AddItem(View view) {
        EditText input = findViewId(R.id.editText2);
        String itemText = input.getText().toString();

        if(!(itemText.equals(" "))){
            Name.add(itemText);
            input.setText(" ");
        }
        else {
            Toast.makeText(getApplicationContext(), text: "Please enter text..", Toast.LENGTH_LONG).show();
        }
            }
}


