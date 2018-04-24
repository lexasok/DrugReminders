package net.ozero.drugreminders.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MainActivityPersonsListAdapter extends RecyclerView.Adapter<MainActivityPersonsListAdapter.PersonsViewHolder>{
    @NonNull
    @Override
    public PersonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PersonsViewHolder extends RecyclerView.ViewHolder{
        public PersonsViewHolder(View itemView) {
            super(itemView);

        }
    }
}
