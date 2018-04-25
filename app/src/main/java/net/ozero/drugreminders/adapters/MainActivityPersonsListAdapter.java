package net.ozero.drugreminders.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.ozero.drugreminders.DataStructures.Person;
import net.ozero.drugreminders.R;

import java.util.List;

public class MainActivityPersonsListAdapter extends RecyclerView.Adapter<MainActivityPersonsListAdapter.PersonsViewHolder>{
    List<Person> persons;

    MainActivityPersonsListAdapter(List<Person> persons) {
        this.persons = persons;
    }

    @NonNull
    @Override
    public PersonsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.rv_row_persons, parent,false
        );
        PersonsViewHolder personsViewHolder = new PersonsViewHolder(view);
        return personsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonsViewHolder holder, int position) {
        holder.name.setText(persons.get(position).getName());
        holder.drugsCount.setText(persons.get(position).getDrugsCount());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }


    //?????
    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class PersonsViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView drugsCount;

        public PersonsViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.personsNameActivityMain);
            drugsCount = itemView.findViewById(R.id.personsDrugsCountActivityMain);

        }
    }
}
