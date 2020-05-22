public class DynamicArray {

   int[] values;
   int count;

   public DynamicArray(int capacity){
      items= new int[capacity];
   }
   
   public void print(){
      for(int i=0; i<count; i++)
         System.out.println(items[i]);
   }

   public void add(int value){
      if(count==values.length){
         int[] temp= new int[count*2];
         for(int i=0; i<count; i++)
            temp[i]= values[i];
         values= temp;
      }
         
      values[count++]=value;
   }

   public void remove(int index){
      if(index< 0 || index >=count) 
         throw new IllegalArgumentException();
      for(int i=index; i<count-1; i++)
         values[i]= values[i+1];
      count--;
   }

}
