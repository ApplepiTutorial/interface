package tripper.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CustomListAdapter.OnItemClickListener {
    CustomListAdapter mAdapter;
    ArrayList<Data> items = new ArrayList<>();
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        items.add(new Data("das","sad"));
        items.add(new Data("das","sad"));
        items.add(new Data("das","sad"));
        items.add(new Data("das","sad"));
        items.add(new Data("das","sad"));
        items.add(new Data("das","sad"));
        items.add(new Data("das","sad"));
        items.add(new Data("das","sad"));
        mAdapter = new CustomListAdapter(items, this);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        list.setAdapter(mAdapter);

    }

    @Override
    public void onItemClickListener(View view, int position, Data data) {
    }

    @Override
    public void onDeleteClickListener() {

    }

    @Override
    public void shangus() {

    }
}
