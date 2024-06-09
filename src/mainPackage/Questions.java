/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainPackage;


/**
 *
 * @author avih2
 */
public class Questions {
    private String title = "";
    private String question = "";
    private String[] answers = new String[4];
    private int correctAnswer = 0;
    
    public Questions(String title, String question, String[] answers, int correctAnswer){
        this.title = title;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }
    
    public String getTitle(){
        return title;
    }
    public String getQuestion(){
        return question;
    }
    public String getAnswers(int index){
        return answers[index];
    }
    public int getCorrectAnswer(){
        return correctAnswer;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswers(int index, String answer) {
        this.answers[index] = answer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
