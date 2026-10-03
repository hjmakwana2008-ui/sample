import java.util.Scanner;

class bhavy {
    bhavy() {
        System.out.println("my name is hardik");
    }

    bhavy(String f,int z) {
        System.out.println("my name and roll no is:"+f+z);
    }

     bhavy(float g) {
        System.out.println(g); 
    }

     void  bhavy() {
        Scanner sc=new Scanner(System.in);
           int h=sc.nextInt();

           System.out.println("enter a num:"+h);
           int H=sc.nextInt();
            System.out.println("enter a num:"+H);
           
        System.out.println(h+H);
    }

    bhavy(String b) {
        if (b.equals("kabir")) {
             System.out.println("welcome,kabir");
        }
        else if (b.equals("hardik")) {
             System.out.println("welcome,hardik");
        }
        else if(b.equals("bhavy")) {
             System.out.println("welcome,bhavy");
        }
        else {
             System.out.println("no welcome");
        }
    }

    
}

class demo {
    public static void main(String a[]) {
        
        bhavy A=new bhavy();
        bhavy B=new bhavy("hardik",1001);
        bhavy C=new bhavy(10.25f);
           bhavy d=new bhavy();
            Scanner sc = new Scanner(System.in);
        
            System.out.print("enter a num: ");
            int first = sc.nextInt();
            System.out.print("enter a num: ");
            int second = sc.nextInt();
        
            System.out.println(first + second);
            sc.close();
        bhavy E=new bhavy("bhavy");
    }
}