package D_220304;

class Computer
{
	String vga, ssd, ram, cpu;//멤버 변수
	
	void set_spec(String _vga, String _ssd, String _ram, String _cpu)
	{
		vga = _vga;
		ssd = _ssd;
		ram = _ram;
		cpu = _cpu;
	}
	
	void hardware_info()
	{
		System.out.println("cpu: " + cpu);
		System.out.println("ram: " + ram);
		System.out.println("vga: " + vga);
		System.out.println("ssd: " + ssd);
	}
}

public class ComputerSpec
{
	public static void main(String[] args)
	{
		Computer com1 = new Computer();
		Computer com2 = new Computer();
		
		com1.set_spec("1060", "256GB", "8GB", "i5");
		com2.set_spec("1080", "512GB", "16GB", "i7");
		
		com1.hardware_info();
		com2.hardware_info();
	}
}