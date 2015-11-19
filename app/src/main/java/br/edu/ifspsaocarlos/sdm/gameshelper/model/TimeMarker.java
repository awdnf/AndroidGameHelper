package br.edu.ifspsaocarlos.sdm.gameshelper.model;

import android.widget.Chronometer;

/**
 * Created by alexandrewiggert on 15/11/15.
 */
public class TimeMarker {

    private Long time;
    private boolean regressive;
    private Long targetTime;

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public boolean isRegressive() {
        return regressive;
    }

    public void setRegressive(boolean regressive) {
        this.regressive = regressive;
    }

    public Long getTargetTime() {
        return targetTime;
    }

    public void setTargetTime(Long targetTime) {
        this.targetTime = targetTime;
    }

}
