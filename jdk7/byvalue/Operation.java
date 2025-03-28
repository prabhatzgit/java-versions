package jdk7.byvalue;

class Operation{
    int data=50;

    void change(int data){
        data=data+100;
        System.out.println(data);//changes will be in the local variable only
    }

    public static void main(String[] args){
        Operation op=new Operation();
// call a method passing a value, it is known as call by value.
// The changes being done in the called method, is not affected in the calling method.
        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);

    }
}
