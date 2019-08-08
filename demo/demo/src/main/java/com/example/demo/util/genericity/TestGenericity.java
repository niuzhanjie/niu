package com.example.demo.util.genericity;

public class TestGenericity {

	public static void main(String[] ars) {

		Box<Jewelry> je=new Box<Jewelry>();
		je.setItem(new Jewelry());
		System.out.println(je.getItem());
		je.getItem().light();
		
		Box<Key> key=new Box<Key>();
		key.setItem(new Key());
		System.out.println(key.getItem());
		key.getItem().openDoor();
	}
}
	