package q2;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * eg: + 4 2 => (4 + 2) => 6
 * 	   * 8 (+ 7 12) => 8*(7 + 12)=> 8* 19 => 152
 */
public class Operation {

	int step=0;
	public void printExpressionResult(String text){
		String[] words = text.split(" ");
		System.out.println(eval(words));
	}
	
	public int eval(String[] words){
		ArrayList<Integer> vals = new ArrayList<Integer>();
		String opr = "";
		while(step<words.length){
			if(words[step].equals("+")||words[step].equals("-")||words[step].equals("*")||words[step].equals("/")){
				opr=words[step];
				step++;
			}
			else if(words[step].equals("(")){
				step++;
				vals.add(eval(words));
			}
			else if(words[step].equals(")"))
			{
				step++;
				break;
			}
			else{
				vals.add(Integer.parseInt(words[step]));
				step++;
			}
		}
		if(vals.size()==1)
			return vals.get(0);
		int res=0;
		if(opr.equals("+")){
			res=0;
			for(Integer num:vals)
				res+=num;
		}
		else if(opr.equals("*")){
			res=1;
			for(Integer num:vals)
				res*=num;
		}
		else if(opr.equals("-")){
			res=vals.get(0);
			for(int i=1;i<vals.size();i++)
				res-=vals.get(i);
		}
		else if(opr.equals("/")){
			res=vals.get(0);
			for(int i=1;i<vals.size();i++)
				res/=vals.get(i);
		}
		return res;
	}
}
