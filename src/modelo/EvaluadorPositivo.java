package modelo;

public class EvaluadorPositivo {
    private int num;

    public EvaluadorPositivo() {
    }

    public EvaluadorPositivo(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "EvaluadorPositivo{" +
                "num=" + num +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    private String evaluarPositivo(){
        return "";
    }
}
