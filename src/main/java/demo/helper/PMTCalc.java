package demo.helper;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.apache.poi.ss.formula.functions.FinanceLib.pmt;

public class PMTCalc {

    public static long calculatePMT(double initialInvestment, double targetAmount, int targetMonth, int targetYear, String riskScore) {
        double monthsToInvest = getMonthsToInvest(targetMonth, targetYear);
        double annualReturnPercentage = getAnnualReturnPercentageFromScore(riskScore);
        double monthlyReturnPercentage = getMonthlyReturnPercentage(annualReturnPercentage);

        long calculatedPMT = roundUpAmount(pmt(monthlyReturnPercentage, monthsToInvest, initialInvestment, -targetAmount, false));
        if (calculatedPMT < 100000) calculatedPMT = 100000;
        return calculatedPMT;
    }

    private static long roundUpAmount(double amount) {
        System.out.println("Unrounded: " + amount);
        if (amount <= 1000000)
            return Math.round(amount / 10000) * 10000;

        if (amount > 1000000 && amount <= 5000000)
            return Math.round(amount / 50000) * 50000;

        if (amount > 5000000 && amount <= 30000000)
            return Math.round(amount / 100000) * 100000;

        return Math.round(amount / 500000) * 500000;
    }

    private static double getMonthsToInvest(int monthTarget, int yearTarget) {
        LocalDate now = LocalDate.now();

        LocalDate startDate = LocalDate.of(now.getYear(), now.getMonthValue(), 1);
        LocalDate targetDate = LocalDate.of(yearTarget, monthTarget, 1);
        double daysBetween = ChronoUnit.DAYS.between(startDate, targetDate);

        return Math.round(daysBetween / 365 * 12);
    }

    private static double getAnnualReturnPercentageFromScore(String score) {
        double percentage;
        switch (score) {
            case "1.5":
                percentage = 7.23;
                break;
            case "2":
                percentage = 8.27;
                break;
            case "2.5":
                percentage = 9.14;
                break;
            case "3":
                percentage = 10;
                break;
            case "3.5":
                percentage = 10.87;
                break;
            case "4":
                percentage = 11.73;
                break;
            case "4.5":
                percentage = 12.60;
                break;
            case "5":
                percentage = 13.46;
                break;
            case "5.5":
                percentage = 14.29;
                break;
            case "6":
                percentage = 15.05;
                break;
            case "6.5":
                percentage = 15.64;
                break;
            case "7":
                percentage = 16.16;
                break;
            case "7.5":
                percentage = 16.63;
                break;
            case "8":
                percentage = 17.09;
                break;
            case "8.5":
                percentage = 17.52;
                break;
            case "9":
                percentage = 17.94;
                break;
            case "9.5":
                percentage = 18.03;
                break;
            default:
                percentage = 0;
        }
        return percentage / 100;
    }

    private static double getMonthlyReturnPercentage(double annualReturnPercentage) {
        double monthly = Math.pow(1 + annualReturnPercentage, 1.0 / 12) - 1;

        BigDecimal bd = new BigDecimal(Double.toString(monthly));
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
