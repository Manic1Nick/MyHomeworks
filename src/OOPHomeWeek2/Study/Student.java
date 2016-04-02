package OOPHomeWeek2.Study;

public class Student {

    private String name;
    private String address;
    private Subject[] studyList;

    public Student(String name, String address, Subject[] studyList) {
        this.name = name;
        this.address = address;
        this.studyList = studyList;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Subject[] getStudyList() {
        return studyList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudyList(Subject[] studyList) {
        this.studyList = studyList;
    }

    //operations
    //student study
    public void study() {

        for (int i = 0; i < studyList.length; i++) {
            System.out.print(studyList[i].getName());
            studyList[i].study();
        }
    }

    //add subject to studyList
    public Subject[] addSubject(Subject newStudy) {

        Subject[] newStudyList = new Subject[studyList.length + 1];

        for (int i = 0; i < studyList.length; i++) {
            newStudyList[i] = studyList[i];
        }
        newStudyList[newStudyList.length - 1] = newStudy;

        return newStudyList;
    }


    //delLastSubjectFromList
    public Subject[] delLastSubject(Subject[] studyList) {

        Subject[] newStudyList = new Subject[studyList.length - 1];

        for (int i = 0; i < newStudyList.length; i++) {
            newStudyList[i] = studyList[i];
        }

        return newStudyList;
    }

    //show info subject list
    public void showInfoStudyList(Subject[] studyList) {

        for (int i = 0; i < studyList.length; i++){
            System.out.printf("Subject %s, Hours Total = %d, Hours Worked = %d, Score = %d\n",
                    studyList[i].getName(), studyList[i].getHoursTotal(),
                    studyList[i].getHoursWorked(), studyList[i].getScore());
        }
    }

    //get average score from subject list
    public double getAverageScore() {

        int summScore = 0;
        int count = 0;

        for (int i = 0; i < studyList.length; i++) {
            if (studyList[i].getScore() != 0) {
                summScore += studyList[i].getScore();
                count++;
            }
        }
        return summScore / count;
    }
}


