/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author ssy02
 */
public class User {
    private String id;
    private String nickname;
    private String univ;
    private String major;
    private String gender;
    private int age;

    private boolean isOnline = false;
    //--------------------------------------------------------------------------------------------//
    // constructor
    //--------------------------------------------------------------------------------------------//
    public User(){
        this.id = "ssy";
        this.nickname = "sangyun";
        this.univ = "계명대";
        this.major = "컴퓨터공학";
        this.gender = "남";
        this.age = 27;
    }
    public User(String id){
        this();
        this.id = id;
    }

    public User(String id, String nickname){
        this(id);
        this.nickname = nickname;
    }

    public User(String id, String nickname, String univ){
        this(id, nickname);
        this.univ = univ;
    }

    public User(String id, String nickname, String univ, String major){
        this(id, nickname, univ);
        this.major = major;
    }

    public User(String id, String nickname, String univ, String major, String gender){
        this(id, nickname, univ, major);
        this.gender = gender;
    }

    public User(String id, String nickname, String univ, String major, String gender, int age){
        this(id, nickname, univ, major, gender);
        this.age = age;
    }
    //--------------------------------------------------------------------------------------------//
    // 메서드
    //--------------------------------------------------------------------------------------------//
    @Override
    public String toString(){
        return id + "/" + nickname + "/" + univ + "/" + major + "/" + gender + "/" + age + "/" ;
    }
    //--------------------------------------------------------------------------------------------//
    // getter and setter
    //--------------------------------------------------------------------------------------------//
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniv() {
        return this.univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }
    
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
