package Strings;

import java.util.ArrayList;

public class MainFunction {
	
	static ArrayList findStringVowel(int input1 ,String []input2) {
		ArrayList<String> ans = new ArrayList<>();
		for(int i=0; i<input1 ;i++)
		   if(input2[i].charAt(0)== 'a' || input2[i].charAt(0)== 'e' || input2[i].charAt(0)== 'i'  || input2[i].charAt(0)== 'o'
				   || input2[i].charAt(0)== 'u')
		   {
			 ans.add(input2[i]);
		}
		return ans;
	}

	public static void main(String[] args) {
		
		String []input2 = {"oreo" , "sirish" , "apple"};
		int input1 = input2.length;
		System.out.println(findStringVowel(input1,input2));

	}

}
