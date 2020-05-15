
public class Tv implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
	    System.out.println("tv를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다. ");
	}

	@Override
	public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {//볼륨이 10보다 크면 
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume < RemoteControl.MIN_VOLUME) {
        	this.volume = RemoteControl.MIN_VOLUME; //0
        } else {
        	this.volume = volume;
        }
        System.out.println("현재 Tv 볼륨 크기: " + this.volume);
	} //setVolume() 

}
