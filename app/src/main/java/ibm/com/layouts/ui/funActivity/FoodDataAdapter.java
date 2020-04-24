package ibm.com.layouts.ui.funActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ibm.com.layouts.R;

public class FoodDataAdapter extends RecyclerView.Adapter<FoodDataAdapter.FoodDataViewHolder> {

    private String[] name;
    private int[] images;
    private Context c;

    FoodDataAdapter(Context context, String[] foodName, int[] imagesArray){
        c = context;
        name = foodName;
        images = imagesArray;
    }
    @NonNull
    @Override
    public FoodDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(c);
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new FoodDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodDataViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
        holder.textView.setText(name[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    static class FoodDataViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        FoodDataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.food_image);
            textView = itemView.findViewById(R.id.food_name);
        }
    }
}
