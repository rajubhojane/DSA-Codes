public class findlargestnum {
    public static void main(String args[])
    {
        int[] array={3,5,6,7,1,4,9};
        int largest=findlarge(array);
        System.out.println("Largest : "+largest); 

    }

    public static int findlarge(int[] array)
    {
        if(array==null||array.length==0)
        {
            throw new IllegalArgumentException("Array is empty");

        }
        int largest=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }
        }
        return largest;

    }
    
}
