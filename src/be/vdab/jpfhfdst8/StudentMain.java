package be.vdab.jpfhfdst8;

public class StudentMain {
    public static void main(String[] args) {
        var student1 = new Student("Piet");
        var student2 = new Student("Jef", 14);
        var naam = student1.getNaam();
        var score = student1.getScore();
        System.out.println("Student " + naam + " met score: " + score);
        naam = student2.getNaam();
        score = student2.getScore();
        System.out.println("Student " + naam + " met score: " + score);

        student1.setScore(9);
        naam = student1.getNaam();
        score = student1.getScore();
        System.out.println("Student " + naam + " met score: " + score);

        student2.setNaam("Jeff");
        student2.setScore(16);
        naam = student2.getNaam();
        score = student2.getScore();
        System.out.println("Student " + naam + " met score: " + score);
    }
}

