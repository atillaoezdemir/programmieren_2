package de.thws.lektion16aa.muenzautomat;

public class AdvancedChangeClaculator implements ChangeCalculator{
    
    public int[] getChange(int euros, int cent){
        SimpleChangeCalculator s = new SimpleChangeCalculator();
        int[] cents = s.getChange(euros, cent);
        int totalCent = cents[7];
        cents[7] = totalCent / 200;
        cents[6] = (totalCent - (cents[7] * 200)) / 100;
        cents[5] = (totalCent - (cents[7] * 200) - (cents[6] * 100)) / 50;
        cents[4] = (totalCent - (cents[7] * 200) - (cents[6] * 100) - (cents[5] * 50)) / 20;
        cents[3] = (totalCent - (cents[7] * 200) - (cents[6] * 100) - (cents[5] * 50) - (cents[4] * 20)) / 10;
        cents[2] = (totalCent - (cents[7] * 200) - (cents[6] * 100) - (cents[5] * 50) - (cents[4] * 20) - (cents[3] * 10)) / 5;
        cents[1] = (totalCent - (cents[7] * 200) - (cents[6] * 100) - (cents[5] * 50) - (cents[4] * 20) - (cents[3] * 10) - (cents[2] * 5)) / 2;
        cents[0] = (totalCent - (cents[7] * 200) - (cents[6] * 100) - (cents[5] * 50) - (cents[4] * 20) - (cents[3] * 10) - (cents[2] * 5) - (cents[1] * 2));
        return cents;
    }

}
