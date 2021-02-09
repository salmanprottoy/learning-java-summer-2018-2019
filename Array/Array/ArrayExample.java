class ArrayExample{

	public static void arrayRecMethod(int []myArray){
		for(int item:myArray){
			System.out.println(item);
		}
	}

	public static int[] arrayRetMethod(){
		return new int[]{999,888,777};
	}
	public static void main(String[] args) {
		//Array
		//1.One-dimensional
		//2.Multi-dimensional

		//One-dimensional Array

		// int []arr=new int[2];
		// arr[0]=10;
		// arr[1]=20;
		//arr[2]=30;//Exception 
		//System.out.println(arr[1]);

		int []arr=new int[]{100,200};
		//int []arr={1000,2000};
		//System.out.println(arr);
		// for(int i=0;i<arr.length;i++){
		// 	System.out.println(arr[i]);
		// }

		//For-Each Loop
		// for(int item:arr){
		// 	System.out.println(item);
		// }

		//Passing array as arguement
		//arrayRecMethod(arr);
		//arrayRecMethod(new int[]{500,600,700});

		//Receive array from a method
		// int []arr2=arrayRetMethod();
		// for(int item:arr2){
		// 	System.out.println(item);
		// }


			//Multi-dimensional Array
			// int [][]myArray=new int[][]{{11,22,33},{44,55,66}};

			// for(int i=0;i<myArray.length;i++){
			// 	for(int j=0;j<myArray[i].length;j++){
			// 		System.out.print(myArray[i][j]+" ");
			// 	}
			// 	System.out.println();
			// }

			//Array of Objects
			Student []studentArray=new Student[2];
			Student s1=new Student("16-xxxxx-1","Shakib",3.4f);
			studentArray[0]=s1;
			studentArray[1]=new Student("16-yyyyy-2","Tamim",3.7f);
			//System.out.println(studentArray[1].getCgpa());
			for(Student obj:studentArray){
				obj.showInfo();
			}


		}
	}