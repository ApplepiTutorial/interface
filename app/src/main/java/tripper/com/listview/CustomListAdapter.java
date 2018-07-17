package tripper.com.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    ArrayList<Data> items;
    Button deleteBtn;
    OnItemClickListener listener;

    interface OnItemClickListener {
        void onItemClickListener(View view, int position, Data data);
        void onDeleteClickListener();
        void shangus();
    }

    public CustomListAdapter(ArrayList<Data> items, OnItemClickListener listener) {
        this.items = items;
        this.listener = listener;
    }

    public CustomListAdapter(ArrayList<Data> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, null);
        deleteBtn = v.findViewById(R.id.delete_btn);

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClickListener(view, i, items.get(i));
            }
        });
        return v;
    }
}
