package chapter17;

public class G502c implements Music,MessageAndPhone{

	@Override
	public void music() {
		System.out.println("��ʼ�������֡���ѩ��......");
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����ͨ��......");
	}

	@Override
	public void mess() {
		// TODO Auto-generated method stub
		System.out.println("����������Ϣ......");
	}
}
