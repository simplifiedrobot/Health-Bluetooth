package com.bluetooth.rmmit.eartemperaturebluetooth.bean;

/**
 * Created by Administrator on 2016/6/28.
 * 体重秤bean
 */
public class WeightBean {
    /**
     * 体重
     */
    private float weightData;

    /**
     * 体重单位
     */
    private String weightUnitText = "公斤";

    /**
     * 是否测量中数据
     */
    private boolean isTestingData = true;

    public float getWeightData() {
        return weightData;
    }

    public void setWeightData(float weightData) {
        this.weightData = weightData;
    }

    public String getWeightUnitText() {
        return weightUnitText;
    }

    public void setWeightUnitText(String weightUnitText) {
        this.weightUnitText = weightUnitText;
    }

    public boolean isTestingData() {
        return isTestingData;
    }

    public void setTestingData(boolean isTestingData) {
        this.isTestingData = isTestingData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Weight,");
        sb.append("isTestingData : ");
        sb.append(this.isTestingData);

        sb.append(" ,weightData:");
        sb.append(this.weightData);
        sb.append(this.weightUnitText);

        return sb.toString();
    }
}
