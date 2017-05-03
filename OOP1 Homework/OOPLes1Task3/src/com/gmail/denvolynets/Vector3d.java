package com.gmail.denvolynets;

public class Vector3d {
	private String name;
	private double x;
	private double y;
	private double z;
	
	public Vector3d(String name, double x, double y, double z) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3d(){
		
	}
	public void sumVector(Vector3d a){
		double x = this.x + a.x;
		double y = this.y + a.y;
		double z = this.z + a.z;
		System.out.println("Sum of " + this.toString() + " and " + a.toString() + " is Vector " + "("+ x + ";" + y + ";" + z + ")." );
	}
	
	public void scalarMul(Vector3d a){
		double x = this.x * a.x;
		double y = this.y * a.y;
		double z = this.z * a.z;
		System.out.println("Scalar multiplication of " + this.toString() + " and " + a.toString() + " is Vector " + "("+ x + ";" + y + ";" + z + ")." );
	}
	
	public void vectorMul(Vector3d a){
		double x = this.y * a.z - this.z * a.y;
		double y = this.z * a.x - this.x * a.z;
		double z = this.x * a.y - this.y * a.x;
		System.out.println("Vector multiplication of " + this.toString() + " and " + a.toString() + " is Vector " + "("+ x + ";" + y + ";" + z + ")." );
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString(){
		return "Vector " + name +"("+ getX() + ";" + getY() + ";" + getZ() + ")";
	}
	
}
