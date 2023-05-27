package inner.test1;

public class Test {
    public static void main(String[] args) {
        //创建外部类对象
        Person p = new Person();
        //创建内部类对象
        Person.Heart heart = p.new Heart();

        //调用内部类方法
        heart.jump();

        //调用外部类方法
        p.setLive(false);
        //调用内部类方法
        heart.jump();
    }


}

class Person {
    private boolean live = true;

    class Heart {
        public void jump() {
            //直接访问外部类成员
            if (isLive()) {  //isLive
                System.out.println("心脏在跳动💓");
            } else {
                System.out.println("心脏不跳了\uD83D\uDC94");
            }
        }
    }

    public boolean isLive() {
        System.out.println(live);
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}