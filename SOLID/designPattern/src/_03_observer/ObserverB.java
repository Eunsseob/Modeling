package _03_observer;

public class ObserverB implements Observer {
	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println("ObserverB한테 이벤트 알림이 왔습니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "ObserverB";
	}

}
