package org.acm.nitsurat.digitalcanteen;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kaano8 on 18/3/16.
 */
public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewHolder> {
    public String[] ItemName;
    public String[] Price;
    public int[] Icons;

    static Activity activity;

    public ItemsAdapter(Activity activity, String[] ItemName, String[] Price, int[] Icons) {
        this.ItemName = ItemName;
        this.Price = Price;
        this.Icons = Icons;
        this.activity = activity;
    }


    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //holder.info_textView.setText(NAMES_DATA[position]);
        holder.textView1.setText(ItemName[position]);
        holder.textView2.setText(Price[position]);
        holder.iv.setImageResource(Icons[position]);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return ItemName.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView2;
        ImageView iv;


        public ViewHolder(View view) {
            super(view);
            this.textView1 = (TextView) view.findViewById(R.id.textview1_id);
            this.textView2 = (TextView) view.findViewById(R.id.textview2_id);
            this.iv = (ImageView)view.findViewById(R.id.imageview_id);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Implement a function to handle onCLickListener
                }
            });

        }
    }
}
