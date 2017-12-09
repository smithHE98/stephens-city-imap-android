package han.svuspiral.phonetoad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by han on 12/7/2017.
 */

public class CustomAdapter extends BaseAdapter {

    private List<Response.DataBean> mLocationItem;
    private Context mContext;
    private LayoutInflater Inflator;

    public CustomAdapter(List<Response.DataBean> mLocationItem, Context mContext) {
        this.mLocationItem = mLocationItem;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mLocationItem.size();
    }

    @Override
    public Object getItem(int position) {
        return mLocationItem.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.fragment_info_page, parent, false);


        return null;
    }
}
