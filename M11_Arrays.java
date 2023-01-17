class Student{
    String subject;
    int marks;
}

class M11_Arrays{
    public static void main(String [] args){
        
        // single dimensional array
        System.out.println("Single dimensional array");
        int arr1[] = {4,5,6,7,8,9};
        int arr2[] = new int[4];
        arr2[0] = 5;
        arr2[1] = 9;
        arr2[2] = 8;
        arr2[3] = 2;
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        // Multi dimensional Array
        System.out.println("Multi dimensional array");
        int Marray[][] = new int[3][4];
        for( int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                Marray[i][j] = (int)(Math.random()*10);
            }
        }
        // for-each loop
        for( int n[] : Marray){
            for(int m : n){
                System.out.print(m +" ");
            }
            System.out.println();
        }

        // jagged array
        System.out.println("Jagged Array");
        int Jarray[][] = new int[3][];
        Jarray[0] = new int[3];
        Jarray[1] = new int[4];
        Jarray[2] = new int[2];
        for(int i=0;i<Jarray.length;i++){
            for(int j=0;j<Jarray[i].length;j++){
                Jarray[i][j] = (int)(Math.random()*10);
            }
        }
        // for-each loop
        for(int ar1[] : Jarray){
            for(int ar2 : ar1){
                System.out.print(ar2+" ");
            }
            System.out.println();
        }
        
        // array of objects
        System.out.println("Array of objects");
        Student s1 = new Student();
        s1.subject = "java";
        s1.marks = 98;

        Student s2 = new Student();
        s2.subject = "cpp";
        s2.marks = 97;

        Student s3 = new Student();
        s3.subject = "python";
        s3.marks = 95;

        Student std[] = new Student[3];
        std[0] = s1;
        std[1] = s2;
        std[2] = s3;

        // for loop
        for(int i=0;i<std.length;i++){
            System.out.println(std[i].subject+" : "+std[i].marks);
        }
        // for-each loop
        for(Student s : std){
            System.out.println(s.subject+" : "+s.marks);
        }
    }
}
