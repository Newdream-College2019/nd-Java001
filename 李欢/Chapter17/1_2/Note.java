package chapter17;

public class Note implements Internet,Video,Photo,MessageAndPhone {

	@Override
	public void surf() {
		// TODO Auto-generated method stub
		System.out.println("�Ѿ������ƶ�����......");
	}

	@Override
	public void video() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ������Ƶ��Сʱ����......");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("�ǲ�......���ճɹ�");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("���ʹ�ͼƬ�����ֵ���Ϣ......");
	}

	@Override
	public void mess() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��Ƶͨ��......");
	}

}
