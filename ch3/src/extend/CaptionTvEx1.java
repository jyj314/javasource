package extend;

public class CaptionTvEx1 {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUP();
		System.out.println("현재채널 "+ctv.channel);
		
		ctv.display("Hello World");
		ctv.caption = true;
		ctv.display("Hello World");
		
		CaptionTv2 ctv2 = new CaptionTv2("blac",true,7,true);
		ctv2.setChannel(11);
		ctv2.channelUP();
		System.out.println("현재채널 "+ctv2.getChannel());

	}

}
