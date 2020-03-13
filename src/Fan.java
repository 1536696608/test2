/*Three constants named SLOW, MEDIUM, and FAST with values 1, 2, and 3 to
   denote the fan speed.
A private int data field named speed that specifies the speed of the fan (default SLOW).
A private boolean data field named on that specifies whether the fan is on  (default false).
A private double data field named radius that specifies the radius of the fan (default 5).
A string data field named color that specifies the color of the fan (default blue).
The accessor and mutator methods for all four data fields.
A no-arg constructor that creates a default fan.
A method named toString() that returns a string description for the fan. If the fan is on, the method returns
the fan speed, color, and radius in one combined string. If the fan is not on, the method returns fan colorand
radius along with the string “fan is off” in one combined string.
Implement the class. Write a test program that creates two Fan objects. Assign maximum speed, radius 10, color
yellow, and turn it on to the first object. Assign medium speed, radius 5, color blue, and turn it off to the
second object. Display the objects by invoking their toString() method.
 */

public class Fan {
    final int SLOW = 1,MEDIUM = 2,FASR = 3;//定义速度常量，不可变
    private int speed;
    private boolean on;
    private double radius;
    private  String color;

    //无参构造
    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    //得到速度
    public int getSpeed() {
        return speed;
    }

    //是否开
    public boolean isOn() {
        return on;
    }

    //得到半径
    public double getRadius() {
        return radius;
    }


    //得到颜色
    public String getColor() {
        return color;
    }

    //设置速度
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //设置开关
    public void setOn(boolean on) {
        this.on = on;
    }

    //设置半径
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //设置颜色
    public void setColor(String color) {
        this.color = color;
    }

    //重新同string方法
    @Override
    public String toString() {
        if(on == false)
        {
            return
                    "fan is off, " +
                    "speed=" + speed +

                    ", radius=" + radius +
                    ", color=" + color;
        }
        else{
            return
                    "fan is on" +
                    " ,speed=" + speed +

                            ", radius=" + radius +
                            ", color=" + color;
        }

    }
    //调用主方法
    public static void main(String[] args) {
        Fan fan1 = new Fan();//创建新对象
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FASR);
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10.);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5.);
        fan2.setOn(false);
        fan2.setColor("blue");
        //输出两个对象
        System.out.println(fan1);
        System.out.println(fan2);

    }
}
