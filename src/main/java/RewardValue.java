

public class RewardValue {
    public int getMilesValue() {
        return miles;
    }

    public int convertToMiles(){
        miles = (int) (cashValue / 0.0035);
        return getMilesValue();
    }

    public double convertToCashValue(){
        cashValue = miles * 0.0035;
        return getCashValue();
    }

    public double getCashValue() {
        return cashValue;
    }

    int miles;
    double cashValue;
    public RewardValue(double cashValue){ this.cashValue = cashValue;}
    public RewardValue(int miles){this.miles = miles;}

}
