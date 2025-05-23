package Sesiunea17.SynchronizedExample;

public class Counter {

    // SYNCHORNIZED e folosit pentru thread safety
    // synchornized modifier poate fi aplicat la metode si blocks
    //

    int count;

    synchronized void increment() {
        count++;

    }
}
