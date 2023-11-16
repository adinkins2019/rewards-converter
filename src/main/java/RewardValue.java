

public class RewardValue {
    public Double getMilesValue() {
        return cashValue /0.0035;
    }

    public double getCashValue() {
        return miles*0.0035;
    }

    Long miles;
    Double cashValue;
    public RewardValue(Double cashValue){ this.cashValue = cashValue;}
    public RewardValue(Long miles){this.miles = miles;}

}
