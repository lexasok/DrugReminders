package net.ozero.drugreminders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPersonActivity extends AppCompatActivity {

    private EditText editTextPersonNameInput;
    private Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person);

        buttonAdd = findViewById(R.id.buttonAdd);
        editTextPersonNameInput = (EditText) findViewById(R.id.editTextPersonName);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextPersonNameInput.getText().toString();
                if (name != "") {
                    ((DrugRemindersApp) getApplication()).addPerson(name);
                }
            }
        });
    }
}
