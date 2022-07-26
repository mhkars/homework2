package com.mustafahoca;

import java.util.ArrayList;
import java.util.List;

public class Okul {
	static List<Ogrenci> ogrList = new ArrayList<Ogrenci>();

	public static void main(String[] args) {
		OgrenciManager om = new OgrenciManager();

		ogrList.add(om.ogrenciOlustur());
		ogrList.add(om.ogrenciOlustur());
		ogrList.add(om.ogrenciOlustur());
		printList();

	}

	public static void printList() {
		if (ogrList.isEmpty()) {
			try {
				throw new OgrenciException("Liste bos.");

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		ogrList.forEach(System.out::println);
	}

}
