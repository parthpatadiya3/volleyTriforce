package com.example.volleytriforce;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.ViewHolder>
{

    List<personlist>personlist;

    public recyclerviewAdapter(List<personlist>personlists)

    {
        this.personlist=personlists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.list,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.admin.setText(personlist.get(position).getAdminId());
        holder.mobile.setText(personlist.get(position).getMobileNo());
        holder.adminname.setText(personlist.get(position).getAdminname());
        holder.location.setText(personlist.get(position).getLocation());
        holder.imagename.setText(personlist.get(position).getImageName());
        holder.shop_status.setText(personlist.get(position).getShop_status());
        holder.shoptime1.setText(personlist.get(position).getShopTime1());
        holder.shoptime2.setText(personlist.get(position).getShopTime2());
        holder.latitute.setText(personlist.get(position).getLatitude());
        holder.longitute.setText(personlist.get(position).getLongitude());
    }


    @Override
    public int getItemCount()
    {
        return personlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView admin,mobile,adminname,location,imagename,shop_status,shoptime1,shoptime2,latitute,longitute;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            admin=itemView.findViewById(R.id.adminId);
            mobile=itemView.findViewById(R.id.MobileNo);
            adminname=itemView.findViewById(R.id.adminname);
            location=itemView.findViewById(R.id.location);
            imagename=itemView.findViewById(R.id.imageName);
            shop_status=itemView.findViewById(R.id.shop_status);
            shoptime1=itemView.findViewById(R.id.shopTime1);
            shoptime2= itemView.findViewById(R.id.shopTime2);
            latitute=itemView.findViewById(R.id.latitude);
            longitute=itemView.findViewById(R.id.longitude);
        }
    }
}
