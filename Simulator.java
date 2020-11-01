package lar3;

public class Simulator {
	public void playSound(Animal x) {
		System.out.print("正在播放"+x.getAnimalName()+"的声音；");
		x.cry();
	}

}
