package modelo;

public class Invertirdor {
    private String num;

    public Invertirdor() {
    }

    public Invertirdor(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Invertirdor{" +
                "num='" + num + '\'' +
                '}';
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public String invertir(){
        return "";
    }
}
