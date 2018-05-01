package net.ozero.drugreminders;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

public class PersonActivity extends AppCompatActivity {

    RecyclerView mRV;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_person);
        mRV = findViewById(R.id.RVdrugListPersonActivity);
        
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
