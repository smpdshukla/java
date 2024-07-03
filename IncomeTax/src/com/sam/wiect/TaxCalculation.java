package com.sam.wiect;


public class TaxCalculation {

    public void calculateTax(Person person) {
    		if(person.getAge()>65 || (person.getGender().equalsIgnoreCase("Female"))) {
    			person.setTax(0);
    			System.out.println("Tax is not applicable");
    		}
    		else {
    			if(person.getIncome()<150000) {
    				person.setTax(0);
    				System.out.println("No tax due to less income");
    			}
    			else {
    				if((person.getIncome()>=15000 )&&(person.getIncome()<500000)) {
    					person.setTax((person.getIncome()-150000)*10/100);
    					System.out.println("10% tax to be paid");
    					}
    				else if(person.getIncome()>=500000 && person.getIncome()<=800000) {
    					person.setTax((person.getIncome()-500000)*20/100+35000);
    					System.out.println("20% tax to be paid");
    				}
    				else {
    					person.setTax((person.getIncome()-800000)*30/100+95000);
    					System.out.println("30% tax to be paid");
    					
    				}
    			}
    		
    	}
    }
    	
    	
    	
        
    }

