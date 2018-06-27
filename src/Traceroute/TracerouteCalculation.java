package Traceroute;

import java.util.ArrayList;
import java.util.TreeMap;

public class TracerouteCalculation {
	Traceroute tre = new Traceroute();
	ComponentofTraceroute com = new ComponentofTraceroute();
	private double responsetime1,responsetime2,responsetime3;
	private double sum=0;
	private double ave=0;
	
	public void setValue(TreeMap map,double hop){
		responsetime1 = (double) ((ArrayList) map.get(hop)).get(2);
		responsetime2 = (double) ((ArrayList) map.get(hop)).get(3);
		responsetime3 = (double) ((ArrayList) map.get(hop)).get(4);
		
		averageResponsetime();
	}
	
	public void averageResponsetime(){
		sum = responsetime1+responsetime2+responsetime3;
		if(responsetime2==0 && responsetime3==0){
			ave = sum;
		}else if(responsetime3==0){
			ave = sum/2;
		}else{
			ave = sum/3;
		}
		System.out.println("平均" + ave);
	}
	
}
