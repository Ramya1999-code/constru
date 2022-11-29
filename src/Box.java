public class Box {

        public double width;
        public double height;
        public double depth;

        public Box(double width, double height, double depth) {
            System.out.println("parametrized constructor");
            this.width = width;
            this.depth = depth;
            this.height = height;
        }
        public Box(double width,double height) {
            this.width = width;
            this.height=height;
            depth=2;
        }
        Box( Box s){
            System.out.println("copy constructor");
            width=s.width;
            height=s.height;
            depth=s.depth;
        }

        Box(){
            System.out.println("default constructor");
            width=10;
            height=10;
            depth=10;

        }
        public double volume(){
            return (width*height*depth);

        }
    }

