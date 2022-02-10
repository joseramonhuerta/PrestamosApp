package com.servfix.prestamosapp;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class ListViewAdapterPrestamos extends BaseAdapter {
    Context context;
    SweetAlertDialog pDialogo;
    String FinalJSonObject;
    List<Prestamo> TempPrestamoList;
    View mView;

    Dialog customDialog = null;

    private AdapterCallback adapterCallback;

    public interface AdapterCallback {
        void onMethodCallback(View mView);

    }

    public ListViewAdapterPrestamos(List<Prestamo> listValue, Context context, View view)
    {
        this.context = context;
        this.TempPrestamoList = listValue;
        this.mView = view;
        try {
            adapterCallback = ((AdapterCallback) context);
        } catch (ClassCastException e) {
            throw new ClassCastException("Activity must implement AdapterCallback.");
        }

        //this.TempGastosListFilter = new ArrayList<Gasto>();
        //this.TempGastosListFilter.addAll(TempGastosList);


    }

    @Override
    public int getCount()
    {
        return this.TempPrestamoList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return this.TempPrestamoList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        ViewItemPrestamo viewItem = null;

        if(convertView == null)
        {
            viewItem = new ViewItemPrestamo();

            LayoutInflater layoutInfiater = LayoutInflater.from(context);//(LayoutInflater)this.context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInfiater.inflate(R.layout.listview_item_prestamo, parent, false);

            viewItem.txtNombre_manual = (TextView)convertView.findViewById(R.id.txtNombreManualCarrito);
            viewItem.txtPrecio_manual = (TextView)convertView.findViewById(R.id.txtPrecioManualCarrito);
            viewItem.ivImagenManual = (ImageView) convertView.findViewById(R.id.ivImagenManualCarrito);
            viewItem.btnEliminar = (Button) convertView.findViewById(R.id.btnEliminarManualCarrito);


            convertView.setTag(viewItem);
        }
        else
        {
            viewItem = (ViewItemPrestamo) convertView.getTag();
        }

        viewItem.txtNombre_manual.setText(String.valueOf(TempPrestamoList.get(position).getFecha_prestamo()));
        viewItem.txtPrecio_manual.setText("$ " + String.valueOf(TempPrestamoList.get(position).getFecha_prestamo()));



        return convertView;
    }

}

class ViewItemPrestamo
{
    TextView txtNombre_manual;
    TextView txtPrecio_manual;
    ImageView ivImagenManual;
    Button btnEliminar;


}
