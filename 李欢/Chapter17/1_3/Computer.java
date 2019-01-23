package chapter17;

public class Computer{
	CPU cpu;
	EMS ems;
	HardDisk hardDisk;
	public Computer(){}
	public Computer(CPU cpu, EMS ems, HardDisk hardDisk) {
		this.cpu = cpu;
		this.ems = ems;
		this.hardDisk = hardDisk;
	}
	public void showInfo(){
		System.out.println("���������Ϣ���£�");
		System.out.println("CPU��Ʒ���ǣ�"+cpu.getCPUBrand()+",��Ƶ�ǣ�"+cpu.getFrequency()+"GHz");
		System.out.println("Ӳ�������ǣ�"+ems.getSize()+"GB");
		System.out.println("�ڴ������ǣ�"+hardDisk.getCapacity()+"GB");
	}
	public static void main(String[] args) {
		CPU cpu=new IntelCPU();
		EMS ems=new JSD_EMS();
		HardDisk hardDisk=new XJ_HardDisk();	
		Computer com=new Computer(cpu,ems,hardDisk);
		com.showInfo();
	}
}
