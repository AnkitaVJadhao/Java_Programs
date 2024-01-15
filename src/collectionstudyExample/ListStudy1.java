package collectionstudyExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListStudy1 {

	public static void main(String[] args)
	{
		int [] a=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=399;
        a[3]=55;
        a[4]=100;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
//        a[5]=600;
        ArrayList<String> name1=new ArrayList<String>();   //10
        name1.add("Ankita1");
        name1.add("Ankita2");
        name1.add("Ankita3");
        name1.add("Ankita4");
        name1.add("Ankita5");
        name1.add("Ankita6");
        name1.add("Ankita7");
        name1.add("Ankita8");
        name1.add("Ankita9");
        name1.add("Ankita10");
        name1.add("Ankita11");
       System.out.println(name1); 
        
       System.out.println("================================");
       
       ArrayList<Object> a1=new ArrayList<Object>();
       a1.add("Ankita");
       a1.add(12);
       a1.add(10.2);
       a1.add(true);
       a1.add(null);
       a1.add(10.34f);
       System.out.println(a1);
        ArrayList<Boolean> bool=new ArrayList<>();  //10(10*1.5+1)
        ArrayList<Float> flot=new ArrayList<>();
        ArrayList<String>name=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        //10 = n n/2+1=6 8+1
        list.add(1);//to insert the element into the arraylist
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(19);
        list.add(18);
        System.out.println(list);
        list.add(35);
        System.out.println(list);
        System.out.println(list.size());// to find the size of arraylist
        System.out.println(list.get(4));//to find the element at respective index

        System.out.println("==================================");
//      // traversing of arraylist
        System.out.println("convention");
        for(int i=0;i<list.size();i++){

            System.out.println(list.get(i));
        }
        System.out.println("==================================");
        System.out.println("foreach");
        for(int ele:list){
            System.out.println(ele);
        }

        java.util.Iterator<Integer> itr=list.iterator();
        System.out.println("using iterator");

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
//        if(itr.hasNext())
//        {
//        	System.out.println(itr.next());
//        }
        
        
        
        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(200);

        list1.add(300);
//        list.addAll(list1);
        System.out.println(list);
        list.addAll(2,list1);
        System.out.println(list);
        list.add(1,1000);
        System.out.println(list);
        list.set(0,99);//updating perticular index value
        System.out.println(list);
        //for deleting
        list.remove(0);
        System.out.println(list);
        boolean result = list.contains(999);
        System.out.println(result);
        Collections.sort(list);
        System.out.println(list);

        /* add()-2,addAll(),set(index,value),remove(index),get(index),size(),contains()
        Collections.sort(object)
         */
        list.clear();
        System.out.println(list);

	}

}
