package com.abhi.mimblu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userHolder> {
    MainActivity mainActivity;
    List<userModel> allUsersList;



    public userAdapter(MainActivity mainActivity,List<userModel> allUsersList){
        this.mainActivity=mainActivity;
        this.allUsersList=allUsersList;

    }

    @NonNull
    @Override
    public userHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new userHolder(LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item_file,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull userHolder holder, int position) {
        holder.itemTxt.setText(allUsersList.get(position).getTitle());
    }
    public int getItemCount(){
        return allUsersList.size();
    }

    static class userHolder extends RecyclerView.ViewHolder{
        TextView itemTxt;
        RelativeLayout oneTab;
        CheckBox checkBox;

        public userHolder(@NonNull @NotNull View itemView){
            super(itemView);
            itemTxt= itemView.findViewById(R.id.adapterTxt);
            oneTab=itemView.findViewById(R.id.oneTab);
            checkBox=itemView.findViewById(R.id.checkBox);

        }
    }
}
