package Evaluaciones.E2_2_OtraOportunidad;
public class TuplePrime<NumA, NumB> {

    protected NumA num_A;
    protected NumB num_B;

    public String toString() {
        return "< " + num_A + " , " + num_B + " >";
    }

    public NumA getA() {
        return num_A;
    }

    public TuplePrime(NumA num_A, NumB num_B){
        this.num_A=num_A;
        this.num_B=num_B;
    }

    public NumB getB() {
        return num_B;
    }

    public void setB(NumB num_B) {
        this.num_B = num_B;
    }

    public void setA(NumA num_A) {
        this.num_A = num_A;
    }
}
