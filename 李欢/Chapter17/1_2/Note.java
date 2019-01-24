package chapter17;

public class Note implements Internet,Video,Photo,MessageAndPhone {

	@Override
	public void surf() {
		// TODO Auto-generated method stub
		System.out.println("已经启动移动网络......");
	}

	@Override
	public void video() {
		// TODO Auto-generated method stub
		System.out.println("开始播放视频《小时代》......");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub
		System.out.println("咔擦......拍照成功");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("发送带图片与文字的信息......");
	}

	@Override
	public void mess() {
		// TODO Auto-generated method stub
		System.out.println("开始视频通话......");
	}

}
