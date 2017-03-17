package _2_;

public class Task {

	public int timeTrafic(int lengde, int[][] lyskryss) {
		int tid = 0;
		int tempList[][] = lyskryss;
		
		for (int i = 0; i < lyskryss.length; i++) {
			System.out.println("LYSKRYSS NR: " + (i+1));
			if (tid == 0) {
				tid += lyskryss[i][0];				
			}
			else{
				tid += lyskryss[i][0] - lyskryss[i-1][0];
			}
			System.out.println("Tid ved ankomst lyskryss:  " + tid);
			tid += checkRedLight(tid, lyskryss[i][1], lyskryss[i][2]);
			System.out.println("Tid etter ventet på rødt lys: " + tid);
			System.out.println("");
		}
		
		tid += lengde - lyskryss[lyskryss.length-1][0];
		System.out.println("tid til slutt: " + tid);
		return tid;
	}
	
	public int checkRedLight(int tidBrukt, int rod, int gronn){
		int tid 		= 7;
		int temp 		= 0;
		boolean red 	= true;
		int rodtemp 	= 2;
		int gronntemp 	= 2;
		
		while (temp < tidBrukt){
			System.out.println("Rød:   " + temp + " til " + (temp + rod));
			red = true;
			temp += rod;
			red = false;
			System.out.println("Grønn: " + temp + " til " + (temp + gronn));
			for (int i = 1; i < gronn +1; i++) {
				if(temp < tidBrukt){
					temp +=1;					
				}
			}
		}
		System.out.println("Tid ventet totalt: " + (temp-tidBrukt));
		return temp-tidBrukt;
	}
	
	public static void main(String args[]){
		Task task = new Task();
		
		int liste[][] = {{3,5,5},
						{5,2,2},
						{8,3,3},
						{9,2,4},
						{13,3,7},
						{14,3,7},
						{17,17,17},
						{25,12,13},
						{30,11,13},
						{32,5,23},
						{36,6,12},
						{40,13,13},
						{45,5,15},
						{55,12,13},
						{62,13,37},
						{68,14,12}};
		System.out.println(task.timeTrafic(75, liste));
		
	}

}
