package com.javaex.ex10;

public class Tv {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public Tv() {
		super();
	}

	public Tv(int channel) {
		super();
		this.channel = channel;
	}

	public Tv(boolean power) {
		super();
		this.power = power;
	}

	public Tv(int channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}

	public Tv(int channel, boolean power) {
		super();
		this.channel = channel;
		this.power = power;
	}

	public Tv(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 - getter
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	// 메소드 - 일반
	public void power(boolean on) {
		if (on == true) {
			System.out.println("파워: " + on + ", 채널: " + channel + ", 볼륨: " + volume);
			this.power = on;
		} else {
			System.out.println("파워: " + on + ", 채널: " + channel + ", 볼륨: " + volume);
			this.power = on;
		}
	}
	
	public void channel(int channel) {
		if (channel >= 1 && channel <= 255) {
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
			this.channel = channel;
		}else {
			channel = getChannel();
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if (up == true) {
			++channel;
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
			this.channel = getChannel();
		} else {
			--channel;
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
		}
	}

	public void volume(int volume) {
		if (volume >= 0 && volume <= 100) {
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
			this.volume = volume;
		} else {
			volume = 100;
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if (up == true) {
			++volume;
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
		} else {
			--volume;
			System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
		}
	}

	public void status() {
		System.out.println("파워: " + power + ", 채널: " + channel + ", 볼륨: " + volume);
	}

}
