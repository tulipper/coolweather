package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/4/1.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public Carwash carwash;
    public Sport sport;
    public class Comfort {
        @SerializedName("txt")
        public String info;
    }
    public class Carwash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("brf")
        public String summary;
        @SerializedName("txt")
        public String info;
    }
}
