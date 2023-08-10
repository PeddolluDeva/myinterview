package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Ailen {
    private int id;
    private String name;
    private String tec;
    @Autowired
    private Laptop laptop;
	public Ailen() {
		super();
		System.out.println(" A good of every one");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTec() {
		return tec;
	}
	public void setTec(String tec) {
		this.tec = tec;
	}
	
    public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public  void show () {
    	System.out.println("Deva can be approved");
    	laptop.complie();
    }
	
}
