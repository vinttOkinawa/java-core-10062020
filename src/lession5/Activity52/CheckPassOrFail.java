package lession5.Activity52;

public class CheckPassOrFail {
    private int numberOfPass;
    private int numberOfFail;

    public CheckPassOrFail(int numberOfPass, int numberOfFail) {
        this.numberOfPass = numberOfPass;
        this.numberOfFail = numberOfFail;
    }

    public CheckPassOrFail() {
    }

    public int getNumberOfPass() {
        return numberOfPass;
    }

    public void setNumberOfPass(int numberOfPass) {
        this.numberOfPass = numberOfPass;
    }

    public int getNumberOfFail() {
        return numberOfFail;
    }

    public void setNumberOfFail(int numberOfFail) {
        this.numberOfFail = numberOfFail;
    }
}
