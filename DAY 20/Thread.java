/*
single thread ->  runs step by step execute one task at a time
advantages:
    - takes longer time to execute
    - it waits until bloacking task is completed
multi thread -> runs multiple task at a time
concurrency -> task1 - task2 - task3(switching between tasks)
parallelism -> task1 - task2 - task3 (running at the same time)
process -> program in execution

*/
public class Thread{
    public  static void main(String[] args){
        task1();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("task 1: "+i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("task 2: "+i);
        }
    }
}