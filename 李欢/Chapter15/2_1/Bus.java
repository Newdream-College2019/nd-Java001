package chapter15;


public class Bus extends MotoVehicle{
	private int seatCount;
	public Bus(){
		
	}
	public Bus(String no,String brand,int seatCount){
		super(no,brand);
		this.seatCount=seatCount;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	public int CalcRent(int days) {
		if(seatCount>16){
			return 1500*days;
		}else{
			return 800*days;
		}
	}

}
