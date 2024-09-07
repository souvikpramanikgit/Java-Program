class cal {
    int length;
    int breadth;
    cal(int c1,int c2){
        length=c1;
        breadth=c2;
    }
    void display(){
        System.out.println("Length = " +length);
        System.out.println("Breadth = " +breadth);
    }
}

interface anotherval{
    int height=5;
}

class result extends cal implements anotherval{
    result(int c1,int c2){
        super(c1,c2);
    }
    public void calresult(){
        super.display();
        System.out.println("Height = " +height);
        int volume=length*breadth*height;
        System.out.println("Volume: " +volume);
    }
}

class program_6{
    public static void main(String args[]){
        result r1=new result(2,3);
        r1.calresult();
    }
}