package br.edu.ifspsaocarlos.sdm.gameshelper.model;

/**
 * Created by alexandrewiggert on 15/11/15.
 */
public class Marker {

    private Integer points;
    private boolean regressive;
    private Integer targetPoints;

    public void mark() {
        if (!points.equals(targetPoints)) {
            if (this.regressive) {
                this.points = this.getPoints() - 1;
            } else {
                this.points = this.getPoints() + 1;
            }
        }
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public boolean isRegressive() {
        return regressive;
    }

    public void setRegressive(boolean regressive) {
        this.regressive = regressive;
    }

    public Integer getTargetPoints() {
        return targetPoints;
    }

    public void setTargetPoints(Integer targetPoints) {
        this.targetPoints = targetPoints;
    }
}
