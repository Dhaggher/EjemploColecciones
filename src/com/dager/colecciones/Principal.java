package com.dager.colecciones;

import java.util.ArrayList;
import java.util.Vector;

public class Principal {
	public static void main(String [] args){
		ArrayList<String> versionesAndroid = new ArrayList<String>();
		versionesAndroid.add("Cupcake");
		versionesAndroid.add("Donut");
		versionesAndroid.add("Eclair");
		versionesAndroid.add("Froyo");
		versionesAndroid.add("Gingerbread");
		versionesAndroid.add("Honeycomb");
		
		System.out.println("Tamaño del ArrayList: " + versionesAndroid.size());
		System.out.println("Versiones: " + versionesAndroid);
		
		versionesAndroid.remove(3);
		
		System.out.println("Tamaño del ArrayList: " + versionesAndroid.size());
		System.out.println("Versiones: " + versionesAndroid);
		
		Vector<String> versionesAndroid2 = new Vector<String>();
		versionesAndroid2.addElement("Ice Cream");
		versionesAndroid2.addElement("Jelly Bean");
		versionesAndroid2.addElement("Kit Kat");
		versionesAndroid2.addElement("Lollypop");
		versionesAndroid2.addElement("Marshmallow");
		versionesAndroid2.addElement("Nougat");
		
		System.out.println("Tamaño del ArrayList: " + versionesAndroid2.size());
		System.out.println("Versiones: " + versionesAndroid2);
		
		versionesAndroid2.remove(4);
		
		System.out.println("Tamaño del ArrayList: " + versionesAndroid2.size());
		System.out.println("Versiones: " + versionesAndroid2);
	}
}
