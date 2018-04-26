package net.ozero.drugreminders;

import android.app.AlarmManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.AlarmManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import net.ozero.drugreminders.DataStructures.Person;
import net.ozero.drugreminders.adapters.MainActivityPersonsListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRV;
    private MainActivityPersonsListAdapter adapter;

    List<Person> persons;


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
        //((DrugRemindersApp) getApplication()).getPersons()
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
