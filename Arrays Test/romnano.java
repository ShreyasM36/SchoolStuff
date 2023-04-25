/*
 * romnano.java
 * 
 * Copyright 2023 Guest User <Guest@OFS-C02VN0DEH7VF.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class romnano {
	
	public static void main (String[] args) {
        int [] array = {1,5,10,50,100,500,1000};
        String [] arr = {"I","V","X","L","C","D","M"};
        String [] ori = {"IIV"};
        int f = 0;
        int total = 0;

        for (int i = 0; i <= ori.length; f++){
           if (ori[i] == arr[f]){
               total = total + array[f];
           }
           i++;
        }
        System.out.println(total);
    }
		
	}
