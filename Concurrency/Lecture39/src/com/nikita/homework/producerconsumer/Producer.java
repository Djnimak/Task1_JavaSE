package com.nikita.homework.producerconsumer;

import java.util.List;

public class Producer implements Runnable{

    List<Integer> questionList = null;
    final int LIMIT = 5;
    private int questionNumber;

//    Object myObject = new Object();

    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestion(int questionNumber) throws InterruptedException {
        synchronized (questionList) {
            while (questionList.size() == LIMIT) {
                System.out.println("Questions have piled up.. wait for answers");
                questionList.wait();
            }
        }

        synchronized (questionList) {
            System.out.println("New Question: " + questionNumber);
            questionList.add(questionNumber);
            Thread.sleep(100);
            questionList.notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                readQuestion(questionNumber++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
