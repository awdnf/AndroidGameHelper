package br.edu.ifspsaocarlos.sdm.gameshelper.model;

/**
 * Created by alexandrewiggert on 15/11/15.
 */
public class Player {

    private Integer number;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (!getNumber().equals(player.getNumber())) return false;
        return getName().equals(player.getName());

    }

    @Override
    public int hashCode() {
        int result = getNumber().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
