public class Dog {

    String color;
    String eyeColor;
    double height;
    double length;
    double weight;

    Dog(String color, String eyeColor, double height, double length, double weight) {

        this.color = color;
        this.eyeColor = eyeColor;
        this.height = height;
        this.length = length;
        this.weight = weight;

    }

        void sit() {
            System.out.println ("The dog is sitting") ;
        }

        void layDown(){
            System.out.println ("The dog is laying down");
        }

        void shake(){
            System.out.println ("The dog is shaking hands");
        }

        void come(){
            System.out.println ("The dog is coming");
        }

        void checkWeight(){

            if(weight>20.0){
                System.out.println ("The dog is overweight");
            }
            else{
                System.out.println ("The dog is healthy");
            }

        }

        void checkHeight(){

            if(height>0.6){
                System.out.println ("The dog is tall");
            }
            else{
                System.out.println ("The dog is of average height");
            }
        }

        public static void main(String[] args){
            Dog Bobby = new Dog("Yellow", "brown", 17.0, 35.0, 24.0);

            Bobby.sit();
            Bobby.come();
            Bobby.layDown();
            Bobby.shake();
            Bobby.checkWeight();
            Bobby.checkHeight();

        }



}
