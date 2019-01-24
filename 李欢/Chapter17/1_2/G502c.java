package chapter17;

public class G502c implements Music,MessageAndPhone{

	@Override
	public void music() {
		System.out.println("开始播放音乐《热雪》......");
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("开始语音通话......");
	}

	@Override
	public void mess() {
		// TODO Auto-generated method stub
		System.out.println("发送文字信息......");
	}
}
