import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day_18{
    
    public static int countWords(String str){
        int count=0;
        boolean isWord=false;
        for(char c: str.toCharArray()){
            if(c==' ' || c=='\t' || c=='\n'){
                isWord=false;
            }else if(!isWord){
                count++;
                isWord=true;
            }
        }
        return count;
    }
    
    public static void bucketSort(ArrayList<String> arr){
        int maxWords=0;
        for(String title: arr){
            int words=countWords(title);
            if(words>maxWords){
                maxWords=words;
            }
        }
        
        ArrayList<ArrayList<String>> buckets= new ArrayList<>(maxWords+1);
        for(int i=0; i<=maxWords; i++){
            buckets.add(new ArrayList<String>());
        }
        
        for(String title: arr){
            int words=countWords(title);
            buckets.get(words).add(title);
        }
        
        for(ArrayList<String> bucket : buckets){
            if(!bucket.isEmpty()){
                Collections.sort(bucket);
            }
        }
        
        arr.clear();
        for(ArrayList<String> bucket: buckets){
            arr.addAll(bucket);
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        
        ArrayList<String> arr=new ArrayList<>(n);
        for(int i=0; i<n; i++){
            arr.add(sc.nextLine());
        }
        bucketSort(arr);
        System.out.println("Sorted book titles: ");
        for(String title: arr){
            System.out.println(title);
        }
        sc.close();
    }
}