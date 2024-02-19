import java.util.*;
public class duplicate{

public static void main(String args[]){

int ar[]={5,4,2,6,7,8,4,3,2,6};
List<Integer>a=new ArrayList<>();
for(int i=0;i<ar.length;i++){
    for(int j=i+1;j<ar.length;j++){

        if(ar[i]==ar[j]){

          a.add(ar[i]);

        }


    }
}
System.out.print(a+ " ");
}

}