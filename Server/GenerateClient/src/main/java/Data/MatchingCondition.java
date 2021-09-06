package Data;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatchingCondition {

    
    String condition; // "premium"
    String minAge;
    String maxAge;
    String gender;
    String univ;
    String major;
    String userId;

    public MatchingCondition() {
        condition = "random"; // "premium"
        minAge = "-1";
        maxAge = "100";
        gender = "";
        univ = "";
        major = "";
        userId = "";
    }
    public MatchingCondition(String condition){
        this();
        this.condition = condition;
    }
    
    public MatchingCondition(String condition, String minAge, String maxAge){
        this(condition);
        this.minAge = minAge;
        this.maxAge = maxAge;
    }
    
        public MatchingCondition(String condition, String gender){
        this(condition);
        this.gender = gender;
    }
    
    public MatchingCondition(String condition, String minAge, String maxAge, String gender, String univ, String major, String userId) {
        this.condition = condition;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.gender = gender;
        this.univ = univ;
        this.major = major;
        this.userId = userId;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition() {
        System.out.println("조건을 입력하세요 (random, premium)");
        this.condition = getString();
    }

    public String getMinAge() {
        return minAge;
    }

    public void setMinAge() {
        this.minAge = getString();
    }

    public String getMaxAge() {
        return maxAge;
    }

    public void setMaxAge() {
        this.maxAge = getString();
    }

    public String getGender() {
        return gender;
    }

    public void setGender() {
        this.gender = getString();
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv() {
        this.univ = getString();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor() {
        this.major = getString();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId() {
        this.userId = getUserId();
    }

    private String getString() {
        String input = "";
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextLine();
                break;
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return input;
    }

    public static int getInteger() {
        int input = 0;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("정수만 입력 가능합니다..");
            }
        }
        return input;
    }
}
