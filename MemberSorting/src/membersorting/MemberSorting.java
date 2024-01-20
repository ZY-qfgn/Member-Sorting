/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membersorting;

import java.io.*;
import java.util.*;

/**
 *
 * @author Zy
 */
public class MemberSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //store the searching items into an array
        String[] list;
        String line, fromFile = "", delimit = ";;";
        //grab all the staffs in the csv file and put them into an array
        try {
            //declare scanner and open file 
            File fr = new File("C:\\Users\\Zy\\Documents\\WeChat Files\\wxid_9n840gqgb4ou22\\FileStorage\\File\\2022-05\\1-Member-of-IEEE-RAS-TC-2022-05-25.csv");
            Scanner input = new Scanner(fr);
            //store every line from the file into the string
            input.nextLine();
            while(input.hasNext()){
                fromFile += input.nextLine()+delimit;
            }
            input.close();
	}
	catch(Exception e){
            //prompt the user about the error
            System.out.println("Something goes wrong with your file.");
            e.printStackTrace();
	}
        //System.out.print(fromFile);

        //store the information into array
        list = fromFile.split(delimit);   
        
        //declare an array, which is going to hold the specific object FoodPrice
        //since each object has six figures in its constructor, the array has a length of list/6
        Member[] m = new Member[list.length];
        for (int i = 0; i<list.length; i++){
            //System.out.println(list[i]);
            String f, l, e, in, lk;
            int a = list[i].indexOf(">");
            int b = list[i].indexOf(" ", a);
            int c = list[i].indexOf("<", b), d = list[i].indexOf(":");
            int g = list[i].indexOf(">", c+10), k = list[i].indexOf("=", c);
            int h = list[i].indexOf("<", g);
            //System.out.println(a+" "+b+" "+c+" "+d+" "+g+" "+k+" "+h);
            f = list[i].substring(a+1, b);
            l = list[i].substring(b+1, c);
            e = list[i].substring(d+1, a-2);
            in = list[i].substring(g+1, h);
            lk = list[i].substring(k+3, g-2); 
            //assign figures to every object in the array by specifying their parameters, which can be found in the list
            m[i] = new Member(f, l, e, in, lk);
            System.out.println(m[i]);            
        }
/*
        try {       
            //load the Sorted Big Data file
            File f = new File("Sorted Big Data.txt");
            //FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(f);
            //write the sorted data to the file
            for (int i = 0; i<m.length; i++){
                pw.println(m[i]);
            }
            //close the file
            pw.close();
	}
	catch(Exception e){
            System.out.println("Something goes wrong with your file.");
            e.printStackTrace();
	}
*/
        
    }
    
}
