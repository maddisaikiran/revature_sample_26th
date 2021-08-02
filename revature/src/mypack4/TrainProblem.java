package mypack4;

public class TrainProblem {
	private int trainno;
	private String traincode;
	private String station;
	private String Arrival;
	private String Departure;
	
	public TrainProblem(int trainno, String traincode, String station, String arrival, String departure) {
		this.trainno = trainno;
		this.traincode = traincode;
		this.station = station;
		this.Arrival = arrival;
		this.Departure = departure;
	}
public void printStatement11() {
		
		System.out.printf("%d %1s %17s %8s %11s\n", trainno,traincode,station,Arrival,Departure);

	}
     
	public static void main(String[] args) {
		  System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");
	       System.out.println("-----------------------------------------------");
	        System.out.println("# Code    Station           Arr.       Dep.");
	        System.out.println("-----------------------------------------------");
	        
	        TrainProblem[] transactions = {
	        		new TrainProblem(1,"YPR","Yasvantpur Jn","","23:40"),
					new TrainProblem(2,"GTL","Guntakal Jn","03:45","03:50"),
					new TrainProblem(3,"SC","Secundrabad Jn","08:55","9:10"),
					new TrainProblem(4,"BPQ","Balharshah Jn","13:30","13:35"),
					new TrainProblem(5,"HBJ","Habibganj Jn","21:20","21:25"),
					new TrainProblem(6,"JHS","Jhansi Jn","01:15","01.20"),
					new TrainProblem(7,"DEE","Delhi S Rohilla","07.00","")
					};
	        for (TrainProblem transaction : transactions) {
				transaction.printStatement11();
			}
	        System.out.println("-----------------------------------------------");
	        }

	}
