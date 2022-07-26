package com.mustafahoca;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;

public class Ogrenci implements Serializable {

	private String name;
	private Double[] notlar;
	private LocalDate dogumTarihi;

	public Ogrenci(String name, Double[] notlar, LocalDate dogumTarihi) {
		super();
		this.name = name;
		this.notlar = notlar;
		this.dogumTarihi = dogumTarihi;
	}

	public Ogrenci(String name, LocalDate dogumTarihi) {
		super();
		this.name = name;
		this.dogumTarihi = dogumTarihi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double[] getNotlar() {
		return notlar;
	}

	public void setNotlar(Double[] notlar) {
		this.notlar = notlar;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	@Override
	public String toString() {
		return "Ogrenci [name=" + name + ", notlar=" + Arrays.toString(notlar) + ", dogumTarihi=" + dogumTarihi + "]";
	}

}
