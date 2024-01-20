package membersorting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zy
 */
public class Member{
    //https://data.humdata.org/dataset/wfp-food-prices-for-the-world
    //declare variables for the class
    String firstname, lastname, email, institute, link;
    
    public Member(String f, String l, String e, String i, String lk){
        //the commodity information, including country, market, year and price trend
        firstname = f;
        lastname = l;
        email = e;
        institute = i;
        link = lk;
    }

    public String toString(){
        //automatically convert the information into a readable while printing
        return firstname+";;"+lastname+";;"+email+";;"+institute+";;"+link;
    }
}
