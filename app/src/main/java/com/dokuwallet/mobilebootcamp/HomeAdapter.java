package com.dokuwallet.mobilebootcamp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    private List<HomeModel> dataList;

    public HomeAdapter(List<HomeModel> transactionList) {
        this.dataList = transactionList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        View mView;
        TextView textviewDataTitle;
        TextView textviewDataContent;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setTag(itemView);
            mView = itemView;

            textviewDataTitle = itemView.findViewById(R.id.textview_data_title);
            textviewDataContent = itemView.findViewById(R.id.textview_data_content);
        }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_list_data, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        HomeModel item = dataList.get(position);
        MyViewHolder viewHolder = holder;

        viewHolder.textviewDataTitle.setText(item.getdataTitle());
        viewHolder.textviewDataContent.setText(item.getdataContent());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}