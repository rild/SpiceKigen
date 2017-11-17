package com.lifeistech.android.schoolseventeen.junjun.spicekigen;
import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/**
 * Created by junekelectric on 2017/09/09.
 */

public class Food extends RealmObject {
    public int foodid;
    public String mcontent;

    @Ignore
    public String mtitle;
    public String mdate;
    public long mdiff;

    public Food () {

    }
    public Food (String title, String date, String content, long diffday) {
        this.mtitle = title;
        this.mdate = date;
        this.mcontent = content;
        this.mdiff = diffday;
    }

    // Standard getters & setters generated by your IDE…
    public int getFoodid() { return foodid;}
    public void setFoodid(int foodid) {this.foodid = foodid; }

    public String getMtitle() { return mtitle; }
    public void   setMtitle(String mtitle) { this.mtitle = mtitle; }
    public String getMdate() { return mdate; }
    public void   setMdate(String mdate) { this.mdate = mdate; }
    public String getMcontent() { return mcontent; }
    public void   setMcontent(String mcontent) { this.mtitle = mcontent; }
    public long getMdiff() {
        return mdiff;
    }
    public void setMdiff(long mdiff) {
        this.mdiff = mdiff;
    }
}

