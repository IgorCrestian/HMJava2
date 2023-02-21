public class Box {

    int width;
    int height;
    int depth;

    public Box(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;

        int volume = width * height * depth;
        System.out.println("Volume = " + volume +" cm3"  );
    }

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
        depth = 50;
        int volume = width * height * depth;
        System.out.println("Volume = " + volume +" cm3"  );
    }

    public Box(int width) {
        this.width = width;
        depth = 50;
        height = 100;
        int volume = width * height * depth;
        System.out.println("Volume = " + volume +" cm3"  );
    }

    public Box(){
        width = 25;
        depth = 50;
        height = 100;
        int volume = width * height * depth;
        System.out.println("Volume = " + volume +" cm3"  );
    }
}
