
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TUSI
 */
public class monthsal {
    
    public enum Month{
        JANUARY("January", 31), FEBRUARY("February", 28), MARCH("March", 31), APRIL("April", 30), 
        MAY("May", 31), JUNE("June", 30), JULY("July", 31), AUGUST("August", 31), SEPTEMBER("September", 30), OCTOBER("October", 31),
        NOVEMBER("November", 30), DECEMBER("December", 31);
        String title; 
        int daysInMonth;
  
        Month(String title, int days)
        {
            this.title=title;
            daysInMonth=days;
        }
        
        public int daysInMonth(){
            return this.daysInMonth;
        }
        public String getShortName(){
            return this.title.substring(0, 3);
        }
        public Month parse(String vals){
 
        if(vals==null) return null;
       // elseif(vals.toUpperCase()==value)
        else{
            vals= vals.toUpperCase();
           try{
                return valueOf(vals);}
                catch(Exception h){
                 for(Month item:values()){
                     if (vals.equals(item.name().substring(0, 2)))
                         return item;
                 }       
                }
        }
        
        return null;
    }
    
    }
    
    
    public static void main(String[] args){
      
        System.out.println(Month.MARCH.ordinal());
        String s= "January";
        Month months= Month.FEBRUARY;
        System.out.print("Short Name: "+months.getShortName());
        System.out.println(", Days in the month: "+months.daysInMonth());
        System.out.println(months.parse(s));

        
        
    }
}
