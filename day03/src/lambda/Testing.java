package lambda;

interface Study {
    void study();
}

public class Testing {
    public static void main(String[] args) {
        goStudy(() -> System.out.println("学习Java"));
    }

    public static void goStudy(Study study) {
        study.study();
    }
}
