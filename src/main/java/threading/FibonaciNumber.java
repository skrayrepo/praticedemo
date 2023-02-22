package threading;


import java.util.concurrent.RecursiveTask;

public class FibonaciNumber extends RecursiveTask<Integer> {

        private int n;

        public FibonaciNumber(int n){
            this.n = n;
        }

        @Override
        protected Integer compute() {

            // F(0) = F(1) = 0
            if(n <= 1)
                return n;

            FibonaciNumber fib1 = new FibonaciNumber(n-1);
            FibonaciNumber fib2 = new FibonaciNumber(n-2);

            fib1.fork();
            fib2.fork();

            return fib1.join()+ fib2.join();
        }

}
