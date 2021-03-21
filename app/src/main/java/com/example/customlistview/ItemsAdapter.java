package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemsAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> names;

    public ItemsAdapter(Context context, int layout, List<String> names) {
        this.context = context;
        this.layout = layout;
        this.names = names;
    }

    // f() = cantidad de items
    @Override
    public int getCount() {
        return this.names.size();
    }

    // f(position) = item
    @Override
    public Object getItem(int position) {
        return this.names.get(position);
    }

    // f(position) = id del item
    @Override
    public long getItemId(int position) {
        return position;
    }

    // f(position, view, viewgroup) = view del item
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Creamos una instancia de la vista recibida
        View view = convertView;
        // Cargamos o inflamos la vista con nuestro layout personalizado
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        view = layoutInflater.inflate(R.layout.list_view_item, null);
        // Capturamos el valor del item actual
        String currentName = names.get(position);
        // Cargamos los datos en los widgets del layout
        TextView textViewItemName = view.findViewById(R.id.textViewItemName);
        textViewItemName.setText(currentName);
        // Retornamos la vista con los datos y en el layout personalizado
        return view;
    }
}
