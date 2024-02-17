package modelo;

public class EvaluadorPar {
    private int num;

    public EvaluadorPar() {
    }

    public EvaluadorPar(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "evaluadorPar{" +
                "num=" + num +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    private String evaluarPar(){
        return "";
    }
}
