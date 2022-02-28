public class whileDoLoopDemo{
    public static void main(String[] args){
        String [] friends = new String[20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Sean";
        friends[15] = "Natasha";
        friends[17] = "Rosa";
        friends[19] = "Sergio";

        int i = 0;
        int totalElements = friends.length;
         do{
             System.out.println("Hello!!!" );
             if  (friends[i] == null){
                 i++;
                 continue;
             }
             System.out.println("I love " + friends[i]);
             i++;
         } while (i< totalElements);
    }
}