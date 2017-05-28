public class ThreadSafetyDemo{

	public static void main(String[] args){
		BusReservation br = new BusReservation();
		PassengerThread pt1 = new PassengerThread(2,br,”ABC”);
		PassengerThread pt2 = new PassengerThread(2,br,“XYZ”);
		pt1.start();
		pt2.start();
	}
}
