package sample.player;

public abstract class Player  {
    private String name;
    private int position;
    private int minHp;
    private int maxHp;
    private int minAtk;
    private int maxAtk;
    private int dudeHp;
    private int dudeAtk;

    public void setMinHp(int minHp) {
        this.minHp = minHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setMinAtk(int minAtk) {
        this.minAtk = minAtk;
    }

    public void setMaxAtk(int maxAtk) {
        this.maxAtk = maxAtk;
    }

    public int getDudeHp() {
        return dudeHp;
    }

    public void setDudeHp(int dudeHp) {
        this.dudeHp = dudeHp;
    }

    public int getDudeAtk() {
        return dudeAtk;
    }

    public void setDudeAtk(int dudeAtk) {
        this.dudeAtk = dudeAtk;
    }

    public int randomHp() {
        return (int) Math.floor(Math.random() * (maxHp - minHp) + minHp);
    }

    public int randomAtk() {
        return (int) Math.floor(Math.random() * (maxAtk - minAtk) + minAtk);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }



    public Player() {
    }
}

