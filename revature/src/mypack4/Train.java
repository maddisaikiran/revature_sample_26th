package mypack4;

public class Train {
	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express (12213)\r\n");
		System.out.println("-----------------------------------------------");
		System.out.println("# code    station           Arr.       Dep.");
		System.out.println("-----------------------------------------------");
		TrainProblem[] transactions11 = {
				new TrainProblem(1,"YPR","Yasvantpur Jn","","23:40"),
				new TrainProblem(2,"GTL","Guntakal Jn","03:45","03:50"),
				new TrainProblem(3,"SC","Secundrabad Jn","08:55","9:10"),
				new TrainProblem(4,"BPQ","Balharshah Jn","13:30","13:35"),
				new TrainProblem(5,"HBJ","Habibganj Jn","21:20","21.25"),
				new TrainProblem(6,"JHS","Jhansi Jn","01:15","01:20"),
				new TrainProblem(7,"DEE","Delhi S Rohilla","07:00","")
				
				};
		for (TrainProblem transaction : transactions11) {
			transaction.printStatement11();
		}
		System.out.println("-----------------------------------------------");
	}

	}
