package net.ozero.drugreminders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import net.ozero.drugreminders.DataStructures.Person;
import net.ozero.drugreminders.adapters.MainActivityPersonsListAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRV;
    private MainActivityPersonsListAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRV = findViewById(R.id.RVmainActivityPersonsList);


    }

    @Override
    protected void onResume() {
        super.onResume();

        //RV
        LinearLayoutManager lMM = new LinearLayoutManager(this);
        mRV.setLayoutManager(lMM);
        adapter = new MainActivityPersonsListAdapter(((DrugRemindersApp) getApplication()).getPersons());
        mRV.setAdapter(adapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
