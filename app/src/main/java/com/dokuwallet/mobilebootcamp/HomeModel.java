package com.dokuwallet.mobilebootcamp;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HomeModel implements Serializable {

    @SerializedName("dataTitle")
    @Expose
    private String dataTitle;
    @SerializedName("dataContent")
    @Expose
    private String dataContent;
    private final static long serialVersionUID = -3204730714717221413L;

    public String getdataTitle() {
        return dataTitle;
    }

    public void setdataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }

    public String getdataContent() {
        return dataContent;
    }

    public void setdataContent(String dataContent) {
        this.dataContent = dataContent;
    }

}