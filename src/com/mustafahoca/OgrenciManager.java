package com.mustafahoca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.Scanner;

public class OgrenciManager {

	static Scanner scanner = new Scanner(System.in);

	public String isimKontrol() {

		System.out.println("Lutfen isminizi giriniz");
		String isim = scanner.nextLine();
		if (isim.length() < 3) {
			try {
				throw new IsımException("İsminizin  en az 3 karakterden olusmalidir");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return isim;
	}

	public LocalDate yasKontrol() {

		LocalDate date = Utils.stringToLocalDateKontol("LütfenYaşınızı giriniz");

		int yas = yasHesapla(date);

		if (yas < 8) {
			try {
				throw new YasException("Yasınız 8 den kucuk olmamalıdır.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		return date;
	}

	private int yasHesapla(LocalDate date) {

		return (int) date.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	public Double[] notKontrol(Double[] notlar) {
		int kontrol = 1;
		do {

			double not = Utils.doubleOku("Lutfen" + kontrol + ". notu giriniz");
			if (not < 0 || not > 100) {
				try {
					throw new NotlarException2(kontrol + ".not değeri 0 ile 100 arasında olmalıdır tekrar giriniz");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {

				notlar[kontrol - 1] = not;
				kontrol++;

			}

		} while (kontrol < 4);
		return notlar;
	}

	public Ogrenci ogrenciOlustur() {
		String isim = isimKontrol();
		LocalDate date = yasKontrol();
		Double[] notlar = new Double[3];
		Double[] grades = notKontrol(notlar);
		Ogrenci ogrenci = new Ogrenci(isim, notlar, date);
		Optional<Ogrenci> ogr = Optional.of(ogrenci);
		if (ogr.equals(null)) {
			throw new OgrenciException();
		} else
			return ogrenci;

	}

}
