package com.yxj.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;

/**
 * Author:  Yxj
 * Time:    2018/6/25 下午4:43
 * -----------------------------------------
 * Description:
 */
public class ShareDialog extends BaseDialog {

    protected ShareDialog(@NonNull Context context) {
        super(context);
    }

    public static class Builder extends BaseDialog.Builder{

        public Builder(Context context) {
            super(context);
        }

        private BaseAdapter adapter;

        @Override
        public int setContentView() {
            return R.layout.dialog_share;
        }

        @Override
        public void initView(View layout) {
            GridView gd = layout.findViewById(R.id.gd);
            if(adapter!=null){
                gd.setAdapter(adapter);
            }
        }

        public Builder setAdapter(BaseAdapter adapter){
            this.adapter = adapter;
            return this;
        }

    }
}
