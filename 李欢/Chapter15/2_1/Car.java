package chapter15;

public final class Car extends MotoVehicle{
	private String type;
	public Car(){
		
	}
	public Car(String no,String brand,String type){
		super(no,brand);
		this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type=type;
	}
	public int CalcRent(int days){
			if("550i".equals(type)){
					return 500*days;
			}else if("ÉÌÎñ²ÕGL8".equals(type)){
					return 600*days;
			}else{
					return 300*days;
			}
	}
}
