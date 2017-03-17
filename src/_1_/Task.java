package _1_;

import javax.xml.transform.Templates;

public class Task {
	
	public int numberIn(int x, int y){
		
		int temp = 0;
		
		for (int i = x; i < y+1; i++) {
			String yolo = "" + i;
			
			if (yolo.contains("000000")){
				temp +=6;
			}
			else if (yolo.contains("00000")){
				temp += 5;
			}
			else if (yolo.contains("0000")){
				temp +=4;
			}
			else if (yolo.contains("000")){
				temp +=3;
			}
			else if (yolo.contains("00")){
				temp +=2;
			}
			else if (yolo.contains("0")) {
				temp ++;
			}
			
		}
		
		System.out.println(temp);
		return temp;
	}
	
	public static void main(String args[]){
		Task task = new Task();
		
		System.out.println(task.numberIn(0, 133337));
	}
	
}
