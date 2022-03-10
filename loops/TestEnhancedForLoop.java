class TestEnhancedForLoop{
    public static void main(String args []){

        int a[] = {1,2,3,4};

        // regular for loop
        // for(int i=0; i<a.length; i++){
        //     System.out.println(a[i]);
        // }
        
        // enhanced for loop
        for(int k : a){
            System.out.println(k);
        }

    }
}