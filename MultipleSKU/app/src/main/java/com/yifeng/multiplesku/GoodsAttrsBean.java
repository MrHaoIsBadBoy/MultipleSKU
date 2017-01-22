package com.yifeng.multiplesku;

import java.util.List;

/**
 * Created by 胡逸枫 on 2017/1/16.
 */

public class GoodsAttrsBean {

    private List<AttributesBean> attributes;
    private List<StockGoodsBean> stockGoods;

    public List<AttributesBean> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributesBean> attributes) {
        this.attributes = attributes;
    }

    public List<StockGoodsBean> getStockGoods() {
        return stockGoods;
    }

    public void setStockGoods(List<StockGoodsBean> stockGoods) {
        this.stockGoods = stockGoods;
    }

    public static class AttributesBean {
        /**
         * tabID : 0
         * tabName : 颜色
         * attributesItem : ["白","蓝","黑"]
         */

        private int tabID;
        private String tabName;
        private List<String> attributesItem;

        public int getTabID() {
            return tabID;
        }

        public void setTabID(int tabID) {
            this.tabID = tabID;
        }

        public String getTabName() {
            return tabName;
        }

        public void setTabName(String tabName) {
            this.tabName = tabName;
        }

        public List<String> getAttributesItem() {
            return attributesItem;
        }

        public void setAttributesItem(List<String> attributesItem) {
            this.attributesItem = attributesItem;
        }
    }

    public static class StockGoodsBean {
        /**
         * goodsID : 1
         * goodsInfo : [{"tabID":0,"tabName":"颜色","tabValue":"白"},{"tabID":1,"tabName":"型号","tabValue":"X"},{"tabID":2,"tabName":"衣服","tabValue":"羽绒服"},{"tabID":3,"tabName":"大小","tabValue":"中"}]
         */

        private int goodsID;
        private List<GoodsInfoBean> goodsInfo;

        public int getGoodsID() {
            return goodsID;
        }

        public void setGoodsID(int goodsID) {
            this.goodsID = goodsID;
        }

        public List<GoodsInfoBean> getGoodsInfo() {
            return goodsInfo;
        }

        public void setGoodsInfo(List<GoodsInfoBean> goodsInfo) {
            this.goodsInfo = goodsInfo;
        }

        public static class GoodsInfoBean {
            /**
             * tabID : 0
             * tabName : 颜色
             * tabValue : 白
             */

            private int tabID;
            private String tabName;
            private String tabValue;

            public int getTabID() {
                return tabID;
            }

            public void setTabID(int tabID) {
                this.tabID = tabID;
            }

            public String getTabName() {
                return tabName;
            }

            public void setTabName(String tabName) {
                this.tabName = tabName;
            }

            public String getTabValue() {
                return tabValue;
            }

            public void setTabValue(String tabValue) {
                this.tabValue = tabValue;
            }
        }
    }
}
