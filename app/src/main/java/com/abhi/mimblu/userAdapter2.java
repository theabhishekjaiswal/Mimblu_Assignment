package com.abhi.mimblu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class userAdapter2 extends RecyclerView.Adapter<userAdapter2.userHolder> {
    SecondPage secondPage;
    ArrayList<userModel2> allDataList;



    public userAdapter2(SecondPage secondPage, ArrayList<userModel2> allDataList){
        this.secondPage=secondPage;
        this.allDataList=allDataList;

    }

    @NonNull
    @Override
    public userAdapter2.userHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new userAdapter2.userHolder(LayoutInflater.from(secondPage).inflate(R.layout.item_match_option,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull @NotNull userAdapter2.userHolder holder, int position) {
        holder.itemTxt.setText(allDataList.get(position).getTitle());
        holder.itemDesTxt.setText(allDataList.get(position).getDescription());
        holder.itemDurTxt.setText(allDataList.get(position).getDuration());
        holder.itemViDesTxt.setText(allDataList.get(position).getVideo_description());
        holder.itemPriceTxt.setText(allDataList.get(position).getTotal_price());
        holder.itemCurr.setText(allDataList.get(position).getCurrency_code());
        holder.itemTotalPrice.setText(allDataList.get(position).getDiscounted_price());

    }
    public int getItemCount(){
        return allDataList.size();
    }

    static class userHolder extends RecyclerView.ViewHolder{
        TextView itemTxt;
        TextView itemDesTxt;
        TextView itemDurTxt;
        TextView itemViDesTxt;
        TextView itemPriceTxt;
        TextView itemCurr;
        TextView itemTotalPrice;


        public userHolder (@NonNull @NotNull View itemView){
            super(itemView);
            itemTxt= itemView.findViewById(R.id.textViewTitle);
            itemDesTxt=itemView.findViewById(R.id.textViewDescription);
            itemDurTxt=itemView.findViewById(R.id.textViewDuration);
            itemViDesTxt=itemView.findViewById(R.id.textViewVideoDescription);
            itemPriceTxt=itemView.findViewById(R.id.textViewPrice);
            itemCurr=itemView.findViewById(R.id.textCurr);
            itemTotalPrice=itemView.findViewById(R.id.textTotalPrice);
        }
    }
}
