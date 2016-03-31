package OOPHomeWeek2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input name of student:");
        String name = sc.next();
        System.out.println("Input address of student:");
        String address = sc.next();
        System.out.println("Input number of subjects for study:");
        int number = sc.nextInt();

        Subject[] studyList = new Subject[number];
        studyList = generateSubjects(studyList);

        Student student = new Student(name, address, studyList);

        System.out.println("\nStudent begin study:");
        student.study();

        //show studyList
        System.out.println("\n\nSubjects in course are:");
        for (int i = 0; i < studyList.length; i++){
            studyList[i].showInfoSubject();
        }

        if (testSubject(studyList) == true) {
            System.out.print("\nCongratulation! Test Subject was successful");
        } else {
            System.out.print("\nTest Subject: Look above for search mistakes");
        }
        System.out.print("\n*********************************************");

        if (testStudent(student, studyList) == true) {
            System.out.print("\nCongratulation! Test Student was successful");
        } else {
            System.out.print("\nTest Student: Look above for search mistakes");
        }
        System.out.print("\n*********************************************");


    }

    public static boolean testSubject(Subject[] studyList) {

        int[] resTrue = new int[studyList.length];
        int[] resFact = new int[studyList.length];
        int countTrue = 0;
        int countBig = 0;

        //show info about subject
        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput name of subject from list for getting info:");
        String nameSubj = sc.next();

        System.out.println("\n\nResult of test showInfo:\n");
        for (int i = 0; i < studyList.length; i++){
            if (nameSubj.equals(studyList[i].getName())) {
                studyList[i].showInfoSubject();
            }
        }

        //pass exam
        System.out.println("\n\nResult of test passExam:\n");
        for (int i = 0; i < studyList.length; i++) {

            //generate hoursWorked from 0 to hoursTotal
            studyList[i].setHoursWorked((int) (Math.random() * (studyList[i].getHoursTotal())));

            resTrue[i] = (studyList[i].getHoursWorked() >= (studyList[i].getHoursTotal() * 0.5) &&
                    studyList[i].getHoursWorked() <= (studyList[i].getHoursTotal())) ? 1 : 0;

            resFact[i] = studyList[i].passExamSubject(studyList[i].getHoursWorked()) == true ? 1 : 0;

            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    "passExam", resTrue[i], resFact[i], resFact[i] == resTrue[i]);

            if (resFact[i] == resTrue[i]) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }
        }

        countBig = countTrue == studyList.length ? countBig + 1 : countBig ;
        countTrue = 0;

        //get score
        System.out.println("\n\nResult of test getScore:\n");
        for (int i = 0; i < studyList.length; i++) {

            studyList[i].getScoreSubject();

            resTrue[i] = (studyList[i].getHoursWorked() >= (studyList[i].getHoursTotal() * 0.5) &&
                    studyList[i].getHoursWorked() <= (studyList[i].getHoursTotal())) ? 1 : 0;

            resFact[i] = (studyList[i].getScore() >= 1 &&
                    studyList[i].getScore() <= 10) ? 1 : 0;

            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    "getScore", resTrue[i], resFact[i], resFact[i] == resTrue[i]);

            if (resFact[i] == resTrue[i]) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }
        }

        countBig = countTrue == studyList.length ? countBig + 1 : countBig ;
        countTrue = 0;

        if (countBig == 2) {
            System.out.println("\n\nSubjects in course after testSubject are:");
            for (int i = 0; i < studyList.length; i++){
                studyList[i].showInfoSubject();
            }
            return true;
        }
        return false;
    }



    public static boolean testStudent(Student student, Subject[] studyList) {

        int[] resTrue = new int[studyList.length + 1];
        int[] resFact = new int[studyList.length + 1];
        int countTrue = 0;
        int countBig = 0;

        //add subject to studyList
        System.out.println("\n\nResult of test addSubject to studyList:\n");
        Subject[] list1 = new Subject[1];
        list1 = generateSubjects(list1);
        Subject[] newStudyList = student.addSubject(list1[0]);

        for (int i = 0; i < studyList.length; i++) {

            resFact[i] = (newStudyList[i].getName().equals(studyList[i].getName()) &&
                    newStudyList[i].getHoursTotal() == studyList[i].getHoursTotal() &&
                    newStudyList[i].getHoursWorked() == studyList[i].getHoursWorked() &&
                    newStudyList[i].getScore() == studyList[i].getScore()) ? 1 : 0;

            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    "addSubject", 1, resFact[i], resFact[i] == 1);

            if (resFact[i] == 1) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }
        }

        resFact[newStudyList.length - 1] =
                (newStudyList[newStudyList.length - 1].getName().equals(list1[0].getName()) &&
                        newStudyList[newStudyList.length - 1].getHoursTotal() == list1[0].getHoursTotal() &&
                        newStudyList[newStudyList.length - 1].getHoursWorked() == list1[0].getHoursWorked() &&
                        newStudyList[newStudyList.length - 1].getScore() == list1[0].getScore()) ? 1 : 0;

        System.out.printf("method %s, exp = %d, fact = %d, %s",
                "addSubject", 1, resFact[newStudyList.length - 1], resFact[newStudyList.length - 1] == 1);

        if (resFact[newStudyList.length - 1] == 1) {
            countTrue++;
            System.out.print(" ... OK\n");
        } else {
            System.out.print(" ... mistake!\n");
        }

        countBig = countTrue == newStudyList.length ? countBig + 1 : countBig ;
        countTrue = 0;

        //show info subject list
        System.out.println("\n\nResult of test showList after addSubject:");
        student.showInfoStudyList(newStudyList);

        //delete last subject from studyList
        System.out.println("\n\nResult of test delLastSubjectFromStudyList:\n");

        newStudyList = student.delLastSubject(newStudyList);

        for (int i = 0; i < newStudyList.length; i++) {

            resFact[i] = (newStudyList[i].getName().equals(studyList[i].getName()) &&
                    newStudyList[i].getHoursTotal() == studyList[i].getHoursTotal() &&
                    newStudyList[i].getHoursWorked() == studyList[i].getHoursWorked() &&
                    newStudyList[i].getScore() == studyList[i].getScore()) ? 1 : 0;

            resTrue[i] = 1;

            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    "delSubject", resTrue[i], resFact[i], resFact[i] == resTrue[i]);

            if (resFact[i] == resTrue[i]) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }

            countBig = countTrue == newStudyList.length ? countBig + 1 : countBig ;
            countTrue = 0;
        }



        //show info subject list
        System.out.println("\n\nResult of test showList after delLastSubject:");
        student.showInfoStudyList(newStudyList);


        //get average score
        System.out.println("\n\nResult of test getAverageScore:\n");

        int summScore = 0;
        int countScore = 0;

        double factAverageScore = student.getAverageScore();

        for (int i = 0; i < studyList.length; i++) {

            summScore = (studyList[i].getScore() != 0) ? summScore + studyList[i].getScore() : summScore ;
            countScore = (studyList[i].getScore() != 0) ? countScore + 1 : countScore ;
        }

        double expAverageScore = summScore / countScore;

        System.out.printf("method %s, exp = %.2f, fact = %.2f, %s",
                "getAverageScore", expAverageScore, factAverageScore, expAverageScore == factAverageScore);

        if (expAverageScore == factAverageScore) {
            countTrue++;
            System.out.print(" ... OK\n");
        } else {
            System.out.print(" ... mistake!\n");
        }

        countBig = countTrue == 1 ? countBig + 1 : countBig ;
        countTrue = 0;


        if (countBig == 2) {
            System.out.println("\n\nSubjects in course after testStudent are:");
            student.showInfoStudyList(studyList);
            return true;
        }
        return false;
    }



    //generate studyList
    public static Subject[] generateSubjects(Subject[] studyList) {

        String[] examples = {"PHP", "JavaScript", "C#", "C++", "Python", "Java", "Perl", "Ruby", "Delphi", "Scala"};

        for (int i = 0; i < studyList.length; i++) {
            studyList[i] = new Subject(examples[(int) (Math.random() * 9)],
                    (50 + (int) (Math.random() * 50)), 0, 0);
        }
        return studyList;
    }
}


