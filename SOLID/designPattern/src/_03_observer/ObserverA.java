package _03_observer;

public class ObserverA implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub

		System.out.println("ObserverA한테 이벤트 알림이 왔습니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "ObserverA";
	}

}
