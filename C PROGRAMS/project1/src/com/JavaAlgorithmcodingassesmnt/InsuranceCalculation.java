package com.JavaAlgorithmcodingassesmnt;


import java.util.Scanner;


class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getAmountCovered() {
        return amountCovered;
    }

    public void setAmountCovered(double amountCovered) {
        this.amountCovered = amountCovered;
    }
}
class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public double getIdv() {
        return idv;
    }

    public void setIdv(double idv) {
        this.idv = idv;
    }

    public float getDepPercent() {
        return depPercent;
    }

    public void setDepPercent(float depPercent) {
        this.depPercent = depPercent;
    }


    public double calculatePremium() {
        double amountCovered = getAmountCovered();
        idv = amountCovered - ((amountCovered * depPercent) / 100);
        return (idv * 3) / 100;
    }
}

class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public float getBenefitPercent() {
        return benefitPercent;
    }

    public void setBenefitPercent(float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }

    public double calculatePremium() {
        double amountCovered = getAmountCovered();
        double benefitAmount = amountCovered - ((amountCovered * benefitPercent) / 100);
        return benefitAmount / policyTerm;
    }
}


public class InsuranceCalculation {

    public static double addPolicy(Insurance ins, int opt) {
        if (opt == 1) {
            LifeInsurance lifeInsurance = (LifeInsurance) ins;
            return lifeInsurance.calculatePremium();
        } else if (opt == 2) {
            MotorInsurance motorInsurance = (MotorInsurance) ins;
            return motorInsurance.calculatePremium();
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Insurance Number: ");
        String insNo = scanner.nextLine();
        System.out.print("Insurance Name: ");
        String insName = scanner.nextLine();
        System.out.print("Amount Covered: ");
        double amtCovered = scanner.nextDouble();


        System.out.println("Select \n 1.Life Insurance \n 2.Motor Insurance");
        int option = scanner.nextInt();

        double calculatedPremium = 0;

        if (option == 1) {

            System.out.print("Policy Term: ");
            int policyTerm = scanner.nextInt();
            System.out.print("Benefit Percent: ");
            float benefitPercent = scanner.nextFloat();

            LifeInsurance lI = new LifeInsurance();
            lI.setInsuranceNo(insNo);
            lI.setInsuranceName(insName);
            lI.setAmountCovered(amtCovered);
            lI.setPolicyTerm(policyTerm);
            lI.setBenefitPercent(benefitPercent);


            calculatedPremium = addPolicy(lI, option);

        } else if (option == 2) {

            System.out.print("Depreciation Percent: ");
            float depPercent = scanner.nextFloat();


            MotorInsurance mI = new MotorInsurance();
            mI.setInsuranceNo(insNo);
            mI.setInsuranceName(insName);
            mI.setAmountCovered(amtCovered);
            mI.setDepPercent(depPercent);


            calculatedPremium =  addPolicy(mI, option);
        }


        System.out.println("Calculated Premium: "+(int) calculatedPremium);


        scanner.close();
    }
}