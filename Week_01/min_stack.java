package com.jyh.deliver.app.week;


import java.util.Stack;

public class min_stack {

    class MinStack {
        private Stack<Integer> mStack;
        private Stack<Integer> mStack2;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            mStack = new Stack<>();
            mStack2 = new Stack<>();
        }

        public void push(int x) {
            int min;
            if (mStack2.isEmpty()) {
                min = x;
            } else {
                min = Math.min(mStack2.peek(), x);
            }
            mStack.push(x);

            mStack2.push(min);
        }

        public void pop() {
            if (!mStack.isEmpty()) {
                mStack.pop();
                mStack2.pop();
            }


        }

        public int top() {
            return mStack.peek();
        }

        public int getMin() {
            return mStack2.peek();
        }
    }
}
