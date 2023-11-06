package ss4.bt;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Đang đếm thời gian...");
        for (int i = 1; i <= 1000000; i++) {
        }
        stopWatch.stop();
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Thời gian đã trôi qua: " + elapsedTime + " giây");
    }
}
