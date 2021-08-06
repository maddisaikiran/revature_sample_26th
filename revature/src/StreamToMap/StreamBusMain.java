package StreamToMap;
import java.util.*;

public class StreamBusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<StreamBus> busList = new ArrayList<>();
		
		busList.add(new StreamBus(100, "Abc Travels", 1200.22, 2.3f));
		busList.add(new StreamBus(101, "Abc Travels", 1100.22, 2.4f));
		busList.add(new StreamBus(190, "Xyz Travels", 1100.22, 2.3f));
		busList.add(new StreamBus(200, "Jee Travels", 1000.22, 4.3f));
		busList.add(new StreamBus(104, "Java Travels", 900.22, 4.3f));
		busList.add(new StreamBus(111, "Xyz Travels", 1400.22, 4.3f));
		
	    Map<Integer, StreamBus> busMap = busList.stream().collect(Collectors.toMap(StreamBus::getId, Function.identity()) );
		Map<Integer, List<StreamBus>> busMapNew = busList.stream().collect(Collectors.groupingBy(StreamBus::getId));
		
		System.out.println("By using toMap()\n");
		for(StreamBus b: busMap.values()) {
			System.out.println(b);
		}
		System.out.println();
		
		System.out.println("By using .groupBy()\n");
		for(List<StreamBus> m: busMapNew.values()) {
			System.out.println(m);
		}

	}

}
