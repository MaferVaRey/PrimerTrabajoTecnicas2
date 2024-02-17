package modelo;

public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int sumar(){
        return 0;
    }
    public int restar(){
        return 0;
    }
    public int multiplicar(){
        return 0;
    }
    public int hallarModulo(){
        return 0;
    }
    public double dividir(){
        return 0;
    }
}
