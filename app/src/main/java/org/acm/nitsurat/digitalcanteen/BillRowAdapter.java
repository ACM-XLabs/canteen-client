package org.acm.nitsurat.digitalcanteen;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by JV on 14-03-2016.
 */

//class for custom adapter
public class BillRowAdapter extends ArrayAdapter<BillRow>{

    Context context;
    int layoutResourceId;
    BillRow data[] = null;

    public BillRowAdapter(Context context, int layoutResourceId, BillRow[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        BillRowHolder holder = null;
        if (row == null)
        {
            LayoutInflater inflater = ((BillDialogAct) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new BillRowHolder();
            holder.txtitem = (TextView) row.findViewById(R.id.items);
            holder.txtquantity = (TextView) row.findViewById(R.id.quantity);
            holder.txtamount = (TextView) row.findViewById(R.id.amount);

            row.setTag(holder);
        } else {
            holder = (BillRowHolder) row.getTag();
        }

        BillRow billRow = data[position];
        holder.txtitem.setText(billRow.itemlist);
        holder.txtquantity.setText(billRow.quantitylist);
        holder.txtamount.setText(billRow.totallist);

        return row;
    }

    static class BillRowHolder {
        TextView txtitem, txtquantity, txtamount;
    }

}
