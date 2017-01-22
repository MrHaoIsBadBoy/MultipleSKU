package com.yifeng.multiplesku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.TextView;

import com.google.gson.Gson;

/**
 * Created by 胡逸枫 on 2017/1/16.
 */
public class MainActivity extends AppCompatActivity implements SKUInterface {

    private TextView tv_title;

    private RecyclerView rv_sku;

    private GoodsAttrsAdapter mAdapter;

    private GoodsAttrsBean dataBean;

    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        install();
    }

    private void install() {
        mAdapter = new GoodsAttrsAdapter(getApplicationContext(), dataBean.getAttributes(), dataBean.getStockGoods());
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv_sku.setLayoutManager(layoutManager);
        rv_sku.setFocusable(false);
        mAdapter.setSKUInterface(this);
        rv_sku.setAdapter(mAdapter);
    }

    private void init() {
        gson = new Gson();
        tv_title = (TextView) findViewById(R.id.tv_title);
        rv_sku = (RecyclerView) findViewById(R.id.rv_sku);
        dataBean = gson.fromJson(getResources().getString(R.string.jsonData), GoodsAttrsBean.class);
    }

    @Override
    public void selectedAttribute(String[] attr) {
        String str = "";
        String ss = "";
        for (int i = 0; i < attr.length; i++) {
            str += " " + dataBean.getAttributes().get(i).getTabName() + "：";
            ss = TextUtils.isEmpty(attr[i]) ? "无" : attr[i];
            str += ss + " ";
        }
        tv_title.setText(str);
    }

    @Override
    public void uncheckAttribute(String[] attr) {
        String str = "";
        String ss = "";
        for (int i = 0; i < attr.length; i++) {
            str += " " + dataBean.getAttributes().get(i).getTabName() + "：";
            ss = TextUtils.isEmpty(attr[i]) ? "无" : attr[i];
            str += ss + " ";
        }
        tv_title.setText(str);
    }
}
