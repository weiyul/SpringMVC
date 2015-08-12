package com.packt.chpt5.mydistance.util;

public class ConversionUtil {
	public double convertKMToMile(double distance){
		  return (distance*0.62137);
		}
		public double convertkmToYard(double distance){
		  return distance*1093.6;
		}


		public double convertMToMile(double distance){
		  return (distance/1000)*0.62137 ;
		}
		public double convertMtoYard(double distance){
		  return (distance/1000)*1093.6;
		}

}
